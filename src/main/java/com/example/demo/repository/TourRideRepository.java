package com.example.demo.repository;

import com.example.demo.model.TourRide;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRideRepository extends JpaRepository<TourRide, Integer> {
    
}
