package ee.taltech.bankAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {
    private UUID id;
    private String name;
    private Double commission;
}
