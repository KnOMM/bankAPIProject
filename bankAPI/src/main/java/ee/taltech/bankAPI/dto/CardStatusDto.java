package ee.taltech.bankAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CardStatusDto {

    private String owner;
    private String iban;
    private Double balance;
    private String status;
}
