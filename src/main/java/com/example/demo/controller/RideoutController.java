package com.example.demo.controller;

import com.example.demo.model.Rideout;
import com.example.demo.service.RideoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RideoutController {

    @Autowired
    private RideoutService rideoutService;

    @RequestMapping("/create-rideout")
    public String showCreateRideoutPage(Model model) {
        model.addAttribute("command", new Rideout());
        return "createrideout";
    }

}
