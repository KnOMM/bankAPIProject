package ee.taltech.bankAPI.repository;

import ee.taltech.bankAPI.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
    Optional<Card> findByIban(String iban);
}
