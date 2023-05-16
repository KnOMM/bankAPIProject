package ee.taltech.bankAPI.service;

import ee.taltech.bankAPI.dto.BankDto;
import ee.taltech.bankAPI.mapper.BankMapper;
import ee.taltech.bankAPI.repository.BankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository bankRepository;
    private final BankMapper bankMapper;

    public List<BankDto> getAllBanks(){
        return bankRepository.findAll()
                .stream()
                .map(bankMapper::mapBankToBankDto)
                .toList();
    }
}
