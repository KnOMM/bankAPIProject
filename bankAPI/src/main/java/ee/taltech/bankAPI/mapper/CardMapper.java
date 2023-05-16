package ee.taltech.bankAPI.mapper;

import ee.taltech.bankAPI.dto.CardDetailedDto;
import ee.taltech.bankAPI.dto.CardGeneralDto;
import ee.taltech.bankAPI.dto.CustomerDetailedDto;
import ee.taltech.bankAPI.dto.CustomerGeneralDto;
import ee.taltech.bankAPI.entity.Card;
import ee.taltech.bankAPI.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {

    public CardGeneralDto cardGeneralDto(Card card){
        CardGeneralDto cardDto = new CardGeneralDto();
        cardDto.setId(card.getId());
        cardDto.setIban(card.getIban());
        cardDto.setBank(card.getBank().getName());
        return cardDto;
    }

    public CardDetailedDto cardDetailedDto(Card card){
        CardDetailedDto cardDto = new CardDetailedDto();
        cardDto.setOwner(card.getOwner().getName() + " " + card.getOwner().getSurname());
        cardDto.setIban(card.getIban());
        cardDto.setBank(card.getBank().getName());
        cardDto.setExpDate(card.getExpDate());
        cardDto.setCsv(card.getCsv());
        cardDto.setBalance(card.getBalance());
        return cardDto;
    }
}
