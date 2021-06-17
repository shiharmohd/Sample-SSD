package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/read-customers")
    public String showReadTourRidePage(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "readcustomers";
    }

    @RequestMapping("/create-customer")
    public String showTourRideContactPage(Model model) {
        model.addAttribute("command", new Customer());
        return "createtours";
    }

    @RequestMapping(value = "/create-customer", method = RequestMethod.POST)
    public String createTourRide(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/read-customers";
    }

    @RequestMapping(value = "/update-customer/{id}")
    public String showUpdateTourRidePage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", customerService.findById(id).orElse(null));
        return "updatecontact";
    }

    @RequestMapping(value = "/update-customer/{id}", method = RequestMethod.POST)
    public String updateCustomer(@PathVariable int id, @ModelAttribute("customer") Customer customer) {
        customerService.updateCustomer(id, customer);
        return "redirect:/read-customers";
    }

    @RequestMapping(value = "/delete-customer/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteById(id);
        return "redirect:/read-customers";
    }
}
