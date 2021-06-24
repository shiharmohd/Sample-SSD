package com.example.demo.controller;
import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeedbackController {
    
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping("/read-feedback")
    public String showReadBookingPage(Model model) {
        model.addAttribute("feedbacks", feedbackService.findAll());
        return "readfeedback";
    }

    @RequestMapping("/create-feedback")
    public String showFeedbackCreatePage(Model model) {
        model.addAttribute("command", new Feedback());
        return "createfeedback"; 
    }

    @RequestMapping(value = "/create-feedback", method = RequestMethod.POST)
    public String createFeedback(@ModelAttribute("feedback") Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/read-feedback";
    }

    @RequestMapping(value = "/update-feedback/{id}")
    public String showUpdateFeedbackPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", feedbackService.findById(id).orElse(null));
        return "updatefeedback"; 
    }

    @RequestMapping(value = "/update-feedback/{id}", method = RequestMethod.POST)
    public String updateFeedback(@PathVariable int id, @ModelAttribute("feedback") Feedback feedback) {
        feedbackService.updateFeedback(id, feedback);
        return "redirect:/read-feedback";
    }

    @RequestMapping(value = "/delete-feedback/{id}")
    public String deleteFeedback(@PathVariable int id) {
        feedbackService.deleteById(id);
        return "redirect:/read-feedback"; 
    }
}
