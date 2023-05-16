package ee.taltech.bankAPI.dto;

import ee.taltech.bankAPI.entity.Bank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardGeneralDto {
    private UUID id;
    private String iban;
    private String bank;
}
