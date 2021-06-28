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
        updatedActivity.setPackage_id(activity.getPackage_id());
        updatedActivity.setName(activity.getName());
        updatedActivity.setDescription(activity.getDescription());
        updatedActivity.setType(activity.getType());
        updatedActivity.setActivity_date(activity.getActivity_date());
        updatedActivity.setOptional(activity.getOptional());
        updatedActivity.setPrice(activity.getPrice());
        updatedActivity.setNotes(activity.getNotes());
        updatedActivity.setLocation(activity.getLocation());
        return activityRepository.save(updatedActivity);
    }

    public void deleteById(int id) {
        activityRepository.deleteById(id);
    }
}
