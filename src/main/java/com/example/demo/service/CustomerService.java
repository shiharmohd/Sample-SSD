package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int id, Customer customer) {
        Customer updatedTourRide = customerRepository.findById(id).orElse(null);
        updatedTourRide.setName(customer.getName());
        // updatedTourRide.setEmail(tourRide.getEmail());
        // updatedTourRide.setCountry(tourRide.getCountry());
        return customerRepository.save(updatedTourRide);
    }

    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

}
