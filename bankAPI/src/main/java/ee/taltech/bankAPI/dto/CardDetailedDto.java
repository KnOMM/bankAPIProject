package ee.taltech.bankAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDetailedDto {

    private String owner;
    private String iban;
    private Integer expDate;
    private Double balance;
    private Integer csv;
    private String bank;
}
