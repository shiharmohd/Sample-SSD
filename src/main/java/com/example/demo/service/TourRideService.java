package com.example.demo.service;

import com.example.demo.model.TourRide;
import com.example.demo.repository.TourRideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourRideService {
    
    @Autowired
    private TourRideRepository tourRideRepository;

    public List<TourRide> findAll() {
        return tourRideRepository.findAll();
    }

    public Optional<TourRide> findById(int id) {
        return tourRideRepository.findById(id);
    }

    public TourRide saveTourRide(TourRide tourRide) {
        return tourRideRepository.save(tourRide);
    }

    public TourRide updateTourRide(int id, TourRide tourRide) {
        TourRide updatedTourRide = tourRideRepository.findById(id).orElse(null);
        //updatedTourRide.setName(tourRide.getName());
        //updatedTourRide.setEmail(tourRide.getEmail());
        //updatedTourRide.setCountry(tourRide.getCountry());
        return tourRideRepository.save(updatedTourRide);
    }

    public void deleteById(int id) {
        tourRideRepository.deleteById(id);
    }

}
