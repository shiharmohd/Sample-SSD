package com.example.demo.service;

import com.example.demo.model.Customer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @BeforeAll
    void setup() {
        Customer customer = new Customer();
        customer.setCustomer_name("John");
        customer.setEmail("abc@gmail.com");
        customer.setGender("Male");
        customer.setContact_number("0777123456");
        customerService.saveCustomer(customer);
    }

    @Test
    void findAll(){
        Assertions.assertFalse(customerService.findAll().isEmpty());
    }

    @Test
    void findById(){
        Customer customer = customerService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("abc@gmail.com", customer.getEmail());
    }

    @Test
    void updateCustomer(){
        Customer customer = customerService.findById(1).orElseThrow(EntityNotFoundException::new);
        customer.setEmail("xyz@gmail.com");
        Customer updatedCustomer = customerService.updateCustomer(1, customer);
        Assertions.assertEquals("xyz@gmail.com", updatedCustomer.getEmail());
    }

    @AfterAll
    void tearDown() {
        this.customerService.deleteById(1);
    }
}
