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
public class IBAN {

    public IBAN(String number, Bank bank){
        this.number = number;
        this.bank = bank;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String number;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
}

