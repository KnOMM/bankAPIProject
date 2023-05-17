package ee.taltech.bankAPI.controller;

import ee.taltech.bankAPI.dto.CardGeneralDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class HomeController {

    @GetMapping
    public String getCards() {
        return """
Map of api requests
Everything is in GET

api/ - home page

Costumers
api/costumers - get a list of all costumers
api/costumers/{id} - get a detailed info of customers

Bank
api/banks - get a list of all banks

Card
api/cards - get a list of all cards
api/cards/{iban} - get a detailed info on card
api/cards/{iban}/deposit?amount={amount} - deposit a certain amount into this card
api/cards/{iban}/withdraw?amount={amount} - withdraw a certain amount from this card
api/cards/{iban}/transaction?amount={amount}&iban={receiver's iban} - send a certain amount into another card
""";
    }
}
