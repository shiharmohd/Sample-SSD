package com.example.demo.service;

import com.example.demo.model.Feedback;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FeedbackServiceTest {

    @Autowired
    FeedbackService feedbackService;

    @BeforeAll
    void setup() {
        Feedback feedback = new Feedback();
        feedback.setBooking_id(1);
        feedback.setDescription("updated description");
        feedback.setRating(2);
        feedbackService.saveFeedback(feedback);
    }

    @Test
    void findAll(){
        Assertions.assertFalse(feedbackService.findAll().isEmpty());
    }

    @Test
    void findById(){
        Feedback feedback = feedbackService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("updated description", feedback.getDescription());
    }

    @Test
    void updateFeedback(){
        Feedback feedback = feedbackService.findById(1).orElseThrow(EntityNotFoundException::new);
        feedback.setDescription("new description added");
        Feedback updatedFeedback = feedbackService.updateFeedback(1,feedback);
        Assertions.assertEquals("new description added", updatedFeedback.getDescription());
    }

    @AfterAll
    void tearDown() {
        this.feedbackService.deleteById(1);
    }
}
