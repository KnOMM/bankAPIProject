package ee.taltech.bankAPI.controller;

import ee.taltech.bankAPI.dto.BankDto;
import ee.taltech.bankAPI.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/banks")
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @GetMapping
    public List<BankDto> getBank() {
        return bankService.getAllBanks();
    }
}
