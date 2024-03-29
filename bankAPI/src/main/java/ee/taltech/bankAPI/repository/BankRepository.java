package ee.taltech.bankAPI.repository;

import ee.taltech.bankAPI.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankRepository extends JpaRepository<Bank, UUID> {
}
