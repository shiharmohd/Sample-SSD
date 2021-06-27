package com.example.demo.service;
import com.example.demo.model.Activity;
import com.example.demo.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {
    
    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    public Optional<Activity> findById(int id) {
        return activityRepository.findById(id);
    }

    public Activity saveActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public Activity updateActivity(int id, Activity activity) {
        Activity updatedActivity = activityRepository.findById(id).orElse(null);
        //updatedActivity.setName(activity.getName());
        //updatedTourRide.setEmail(tourRide.getEmail());
        //updatedTourRide.setCountry(tourRide.getCountry());
        return activityRepository.save(updatedActivity);
    }

    public void deleteById(int id) {
        activityRepository.deleteById(id);
    }
}
