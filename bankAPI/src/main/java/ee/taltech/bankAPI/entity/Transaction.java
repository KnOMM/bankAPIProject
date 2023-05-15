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
public class Transaction {

    public Transaction(Card sender, Card receiver, Integer amount){
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Card sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Card receiver;
    private Integer amount;

}
