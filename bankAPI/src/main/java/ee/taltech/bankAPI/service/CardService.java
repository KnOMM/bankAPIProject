package ee.taltech.bankAPI.service;

import ee.taltech.bankAPI.dto.CardDetailedDto;
import ee.taltech.bankAPI.dto.CardGeneralDto;
import ee.taltech.bankAPI.dto.CardStatusDto;
import ee.taltech.bankAPI.entity.Card;
import ee.taltech.bankAPI.mapper.CardMapper;
import ee.taltech.bankAPI.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    public List<CardGeneralDto> getAllCards() {
        return cardRepository.findAll()
                .stream()
                .map(cardMapper::cardGeneralDto)
                .toList();
    }

    public CardDetailedDto getDetailedCard(String iban) {
        return cardRepository.findByIban(iban)
                .map(cardMapper::cardDetailedDto)
                .orElse(null);
    }

    public CardStatusDto sendMoney(String ibanSender, String ibanReceiver, String amount) {
        Optional<Card> sender = cardRepository.findByIban(ibanSender);
        Optional<Card> receiver = cardRepository.findByIban(ibanReceiver);
        double amountD = Math.round(Double.parseDouble(amount) * 100) / 100.0;
        if (sender.isPresent() && receiver.isPresent()) {
            if (sender.get().getBalance() >= amountD) {
                if (!sender.get().getBank().getName().equals(receiver.get().getBank().getName())) {
                    amountD -= Math.round(amountD * sender.get().getBank().getCommission() * 100) / 100.0;
                }
                sender.get().setBalance(sender.get().getBalance() - Double.parseDouble(amount));
                receiver.get().setBalance(receiver.get().getBalance() + amountD);
                cardRepository.save(sender.get());
                if (!sender.get().getBank().getName().equals(receiver.get().getBank().getName())) {
                    return cardMapper.cardStatusDto(sender.get(), sender.get().getBank().getCommission(), "successful");
                } return cardMapper.cardStatusDto(sender.get(), 0d, "successful");
            }
        }
        return cardMapper.cardStatusDto(sender.get(), 0d, "error - not enough money or card is invalid");
    }
}
