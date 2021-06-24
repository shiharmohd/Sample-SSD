package com.example.demo.controller;
import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @RequestMapping("/read-booking")
    public String showReadBookingPage(Model model) {
        model.addAttribute("bookings", bookingService.findAll());
        return "readbooking";
    }

    @RequestMapping("/create-booking")
    public String showBookingCreatePage(Model model) {
        model.addAttribute("command", new Booking());
        return "createbooking";
    }

    @RequestMapping(value = "/create-customer", method = RequestMethod.POST)
    public String createBooking(@ModelAttribute("booking") Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:/read-booking";
    }

    @RequestMapping(value = "/update-booking/{id}")
    public String showUpdateBookingPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", bookingService.findById(id).orElse(null));
        return "updatebooking";
    }

    @RequestMapping(value = "/update-booking/{id}", method = RequestMethod.POST)
    public String updateBooking(@PathVariable int id, @ModelAttribute("booking") Booking booking) {
        bookingService.updateBooking(id, booking);
        return "redirect:/read-booking";
    }

    @RequestMapping(value = "/delete-booking/{id}")
    public String deleteBooking(@PathVariable int id) {
        bookingService.deleteById(id);
        return "redirect:/read-booking";
    }
}
