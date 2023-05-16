package ee.taltech.bankAPI.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "sender_card_id")
    private Card cardSender;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "receiver_card_id")
    private Card cardReceiver;
    @NonNull
    private Float amount;
}
