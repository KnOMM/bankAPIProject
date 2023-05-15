package ee.taltech.bankAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    public Card(Integer expDate, Integer balance, Integer csv, IBAN iban){
        this.expDate = expDate;
        this.balance = balance;
        this.csv = csv;
        this.iban = iban;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Integer expDate;
    private Integer balance;
    private Integer csv;
    @OneToOne
    @JoinColumn(name = "iban_id")
    private IBAN iban;
}
