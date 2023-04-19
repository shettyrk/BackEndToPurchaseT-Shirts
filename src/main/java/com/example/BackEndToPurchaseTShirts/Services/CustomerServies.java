package com.example.BackEndToPurchaseTShirts.Services;

import com.example.BackEndToPurchaseTShirts.Beans.Customer;
import com.example.BackEndToPurchaseTShirts.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class CustomerServies {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServies(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public List getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerRepo.findById(id).get();
    }

    public Customer addCustomer(Customer customer) {
        customerRepo.save(customer);
        return customer;
    }


    public Customer updateCustomer(Customer existingCustomer) {
        customerRepo.save(existingCustomer);
        return existingCustomer;
    }

    public void deleteCountry(int id) {
        customerRepo.deleteById(id);
    }
}
