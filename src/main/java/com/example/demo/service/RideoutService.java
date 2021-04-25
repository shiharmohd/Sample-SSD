package com.example.demo.service;

import com.example.demo.model.Rideout;
import com.example.demo.repository.RideoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideoutService {

    @Autowired
    private RideoutRepository rideoutRepository;

    public Rideout saveRideout(Rideout rideout) {
        return rideoutRepository.save(rideout);
    }

}
