package com.example.demo.repository;

import com.example.demo.model.Rideout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideoutRepository extends JpaRepository<Rideout, Integer> {
}
