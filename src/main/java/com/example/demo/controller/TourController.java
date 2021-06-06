package com.example.demo.controller;


import com.example.demo.model.TourRide;
import com.example.demo.service.TourRideService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TourController {
  
    @Autowired
    private TourRideService tourRideService;

    @RequestMapping("/read-tour-ride")
    public String showReadTourRidePage(Model model) {
        model.addAttribute("tourrides", tourRideService.findAll());
        return "readtours";
    }

    @RequestMapping("/create-tour-ride")
    public String showTourRideContactPage(Model model) {
        model.addAttribute("command", new TourRide());
        return "createtours";
    }

    @RequestMapping(value = "/create-tour-ride", method = RequestMethod.POST)
    public String createTourRide(@ModelAttribute("tourride") TourRide tourRide) {
        tourRideService.saveTourRide(tourRide);
        return "redirect:/read-tour-ride";
    }

    @RequestMapping(value = "/update-tour-ride/{id}")
    public String showUpdateTourRidePage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", tourRideService.findById(id).orElse(null));
        return "updatecontact";
    }

    @RequestMapping(value = "/update-tour-ride/{id}", method = RequestMethod.POST)
    public String updateTourRide(@PathVariable int id, @ModelAttribute("tourride") TourRide tourRide) {
        tourRideService.updateTourRide(id, tourRide);
        return "redirect:/read-tour-ride";
    }

    @RequestMapping(value = "/delete-tour-ride/{id}")
    public String deleteTourRide(@PathVariable int id) {
        tourRideService.deleteById(id);
        return "redirect:/read-tour-ride";
    }

}
