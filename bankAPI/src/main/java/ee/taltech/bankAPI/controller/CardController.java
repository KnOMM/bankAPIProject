package ee.taltech.bankAPI.controller;

import ee.taltech.bankAPI.dto.CardDetailedDto;
import ee.taltech.bankAPI.dto.CardGeneralDto;
import ee.taltech.bankAPI.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping
    public List<CardGeneralDto> getCards(){
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public CardDetailedDto getCard(@PathVariable String id){
        return cardService.getDetailedCard(id);
    }
}
