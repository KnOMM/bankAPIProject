package ee.taltech.bankAPI.service;

import ee.taltech.bankAPI.dto.CustomerDetailedDto;
import ee.taltech.bankAPI.dto.CustomerGeneralDto;
import ee.taltech.bankAPI.mapper.CustomerMapper;
import ee.taltech.bankAPI.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public List<CustomerGeneralDto> getAllCustomers(){
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::mapCustomerToGeneralDto)
                .toList();
    }

    public CustomerDetailedDto getCustomer(String id){
//        System.out.println(id);
        return customerRepository.findById(UUID.fromString(id)).map(customerMapper::mapCustomerToDetailedDto).orElse(null);
    }
}
