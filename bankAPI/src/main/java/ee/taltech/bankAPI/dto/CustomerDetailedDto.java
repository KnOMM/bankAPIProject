package ee.taltech.bankAPI.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailedDto {

    private String fullName;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer age;
}
