package com.example.demo.service;

import com.example.demo.model.Activity;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ActivityServiceTest {

    @Autowired
    ActivityService activityService;

    @BeforeAll
    void setup() {
        Activity activity = new Activity();
        activity.setName("Roller Coaster");
        activity.setDescription("Dubai Mall");
        activity.setType("Single");
        activity.setActivity_date("2021-06-06");
        activity.setOptional("Single");
        activity.setPrice(15000);
        activity.setNotes("1 hour drive");
        activity.setLocation("Dubai");
        activityService.saveActivity(activity);
    }

    @Test
    void findAll(){
        Assertions.assertFalse(activityService.findAll().isEmpty());
    }

    @Test
    void findById(){
        Activity activity = activityService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("Water Games", activity.getName());
    }

    @Test
    void updateActivity(){
        Activity activity = activityService.findById(1).orElseThrow(EntityNotFoundException::new);
        activity.setName("Water Games");
        Activity updatedActivity = activityService.updateActivity(1, activity);
        Assertions.assertEquals("Water Games", updatedActivity.getName());
    }

    @AfterAll
    void tearDown() {
        this.activityService.deleteById(1);
    }
}
