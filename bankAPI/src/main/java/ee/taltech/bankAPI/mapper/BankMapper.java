package ee.taltech.bankAPI.mapper;

import ee.taltech.bankAPI.dto.BankDto;
import ee.taltech.bankAPI.entity.Bank;
import org.springframework.stereotype.Component;

@Component
public class BankMapper {

    public BankDto mapBankToBankDto(Bank bank){
        BankDto bankDto = new BankDto();
        bankDto.setId(bank.getId());
        bankDto.setName(bank.getName());
        bankDto.setCommission(bank.getCommission());

        return bankDto;
    }

}
