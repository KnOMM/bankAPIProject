package ee.taltech.bankAPI.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NonNull
    private String iban;
    @NonNull
    private Integer expDate;
    @NonNull
    private Double balance;
    @NonNull
    private Integer csv;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer owner;
}
