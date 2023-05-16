package ee.taltech.bankAPI.service;

import ee.taltech.bankAPI.entity.Customer;
import ee.taltech.bankAPI.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitializationService {

    private final CustomerRepository customerRepository;

    @PostConstruct
    private void initAppData(){
//        initial users
        Customer customer1 = new Customer("Nazar","Zhuhan", "test.email1@gmail.com", "Tallinn", "+11111111", 17);
        Customer customer2 = new Customer("Vladyslav","Davydenko", "test.email2@gmail.com", "Tallinn", "+2222222", 18);
        Customer customer3 = new Customer("John","Smith", "something@gmail.com", "Narva", "+1213546", 34);
        Customer customer4 = new Customer("Sarah","Wilson", "my.email@gmail.com", "Tartu", "+12121212", 27);
        Customer customer5 = new Customer("Jack","Samurai", "5.test.email@gmail.com", "Tartu", "+123456789", 65);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
    }

}
