package com.example.BackEndToPurchaseTShirts.Controllers;

import com.example.BackEndToPurchaseTShirts.Beans.Customer;
import com.example.BackEndToPurchaseTShirts.Services.CustomerServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerServies customerServies;

    @GetMapping("/getCustomer")
    public List getCustomers(){
       return customerServies.getAllCustomers();
    }
    @GetMapping("/getCustomerById/{Id}")
    public ResponseEntity<Customer> getCustomers(@PathVariable(value = "Id") Integer id){
        try{
            Customer customer = customerServies.getCustomerById(id);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServies.addCustomer(customer);
    }

    @PutMapping("/updateCustomer/{Id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "Id")Integer id , @RequestBody Customer customer){
        try{
            var existingCustomer = customerServies.getCustomerById(id);
            existingCustomer.setName(customer.getName());
            existingCustomer.setPhone(customer.getPhone());
            existingCustomer.setAddress(customer.getAddress());
            var updatedCustomer = customerServies.updateCustomer(existingCustomer);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable(value = "id") int id){
        customerServies.deleteCountry(id);
    }
}
