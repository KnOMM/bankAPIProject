package ee.taltech.bankAPI.controller;

import ee.taltech.bankAPI.dto.CustomerDetailedDto;
import ee.taltech.bankAPI.dto.CustomerGeneralDto;
import ee.taltech.bankAPI.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<CustomerGeneralDto> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDetailedDto getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }
}
