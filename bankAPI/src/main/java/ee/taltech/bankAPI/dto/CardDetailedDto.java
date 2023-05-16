package ee.taltech.bankAPI.dto;

import ee.taltech.bankAPI.entity.Bank;
import ee.taltech.bankAPI.entity.Customer;
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
    private Integer balance;
    private Integer csv;
    private String bank;
}
