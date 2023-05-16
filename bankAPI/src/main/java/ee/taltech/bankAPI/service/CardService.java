package ee.taltech.bankAPI.service;

import ee.taltech.bankAPI.dto.CardDetailedDto;
import ee.taltech.bankAPI.dto.CardGeneralDto;
import ee.taltech.bankAPI.mapper.CardMapper;
import ee.taltech.bankAPI.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    public List<CardGeneralDto> getAllCards(){
        return cardRepository.findAll()
                .stream()
                .map(cardMapper::cardGeneralDto)
                .toList();
    }

    public CardDetailedDto getDetailedCard(String id){
        return cardRepository.findById(UUID.fromString(id))
                .map(cardMapper::cardDetailedDto)
                .orElse(null);
    }
}
