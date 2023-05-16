package ee.taltech.bankAPI.mapper;

import ee.taltech.bankAPI.dto.CustomerDetailedDto;
import ee.taltech.bankAPI.dto.CustomerGeneralDto;
import ee.taltech.bankAPI.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerGeneralDto mapCustomerToGeneralDto(Customer customer){
        CustomerGeneralDto customerDto = new CustomerGeneralDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        return customerDto;
    }

    public CustomerDetailedDto mapCustomerToDetailedDto(Customer customer){
        CustomerDetailedDto customerDto = new CustomerDetailedDto();
        customerDto.setFullName(customer.getName() + " " + customer.getSurname());
        customerDto.setEmail(customer.getEmail());
        customerDto.setAddress(customer.getAddress());
        customerDto.setPhoneNumber(customer.getPhoneNumber());
        customerDto.setAge(customer.getAge());
        return customerDto;
    }
}
