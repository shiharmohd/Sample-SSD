package com.example.demo.service;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> findById(int id) {
        return feedbackRepository.findById(id);
    }

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public Feedback updateFeedback(int id, Feedback feedback) {
        Feedback updatedFeedback = feedbackRepository.findById(id).orElse(null);
        updatedFeedback.setBooking_id(feedback.getBooking_id());
        updatedFeedback.setDescription(feedback.getDescription());
        updatedFeedback.setRating(feedback.getRating());
        return feedbackRepository.save(updatedFeedback);
    }

    public void deleteById(int id) {
        feedbackRepository.deleteById(id);
    }
}
