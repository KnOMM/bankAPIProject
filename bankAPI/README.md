# Bank API
## API that provides a simple functionality with available cards
## 3 Tables exists: Costumer Bank Card
### Created by Nazar Zhuhan and Vladyslav Davydenko

Map of api requests.
Everything is in GET

Costumers
```
api/costumers - get a list of all costumers
api/costumers/{id} - get a detailed info of customers
```

Bank
```
api/banks - get a list of all banks
```

Card
```
api/cards - get a list of all cards
api/cards/{iban} - get a detailed info on card
api/cards/{iban}/deposit?amount={amount} - deposit a certain amount into this card
api/cards/{iban}/withdraw?amount={amount} - withdraw a certain amount from this card
api/cards/{iban}/transaction?amount={amount}&iban={receiver's iban} - send a certain amount into another card
```