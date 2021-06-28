package com.example.demo.controller;
import com.example.demo.model.Activity;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActivityController {
  
    @Autowired
    private ActivityService activityService;

    @RequestMapping("/read-activity")
    public String showReadActivityPage(Model model) {
        model.addAttribute("activitys", activityService.findAll());
        return "readactivity";
    }

    @RequestMapping("/create-activity")
    public String showActivityCreatePage(Model model) {
        model.addAttribute("command", new Activity());
        return "createactivity";
    }

    @RequestMapping(value = "/create-activity", method = RequestMethod.POST)
    public String createActivity(@ModelAttribute("activity") Activity activity) {
        activityService.saveActivity(activity);
        return "redirect:/read-activity";
    }

    @RequestMapping(value = "/update-activity/{id}")
    public String showUpdateActivityPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", activityService.findById(id).orElse(null));
        return "updateactivity";
    }

    @RequestMapping(value = "/update-activity/{id}", method = RequestMethod.POST)
    public String updateActivity(@PathVariable int id, @ModelAttribute("activity") Activity activity) {
        activityService.updateActivity(id, activity);
        return "redirect:/read-activity";
    }

    @RequestMapping(value = "/delete-activity/{id}")
    public String deleteActivity(@PathVariable int id) {
        activityService.deleteById(id);
        return "redirect:/read-activity";
    }
}
