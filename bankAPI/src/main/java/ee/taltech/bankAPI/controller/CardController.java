package ee.taltech.bankAPI.controller;

import ee.taltech.bankAPI.dto.CardDetailedDto;
import ee.taltech.bankAPI.dto.CardGeneralDto;
import ee.taltech.bankAPI.dto.CardStatusDto;
import ee.taltech.bankAPI.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping
    public List<CardGeneralDto> getCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{iban}")
    public CardDetailedDto getCard(@PathVariable String iban) {
        return cardService.getDetailedCard(iban);
    }

    @GetMapping("/{iban}/transaction")
    public CardStatusDto sendMoney(
            @PathVariable(value = "iban") String ibanSender,
            @RequestParam String amount,
            @RequestParam(value = "iban") String ibanReceiver) {
        return cardService.sendMoney(ibanSender, ibanReceiver, amount);
    }

    @GetMapping("/{iban}/deposit")
    public CardStatusDto depositMoney(
            @PathVariable(value = "iban") String iban,
            @RequestParam String amount
    ){
        return cardService.depositMoney(iban, amount);
    }

    @GetMapping("/{iban}/withdraw")
    public  CardStatusDto withdrawMoney(
            @PathVariable(value = "iban") String iban,
            @RequestParam String amount
    ){
        return cardService.withdrawMoney(iban, amount);
    }
}
