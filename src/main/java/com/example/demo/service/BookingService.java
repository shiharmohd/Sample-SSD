package com.example.demo.service;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findById(int id) {
        return bookingRepository.findById(id);
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(int id, Booking booking) {
        Booking updatedTourRide = bookingRepository.findById(id).orElse(null);
        // updatedTourRide.setName(tourRide.getName());
        // updatedTourRide.setEmail(tourRide.getEmail());
        // updatedTourRide.setCountry(tourRide.getCountry());
        return bookingRepository.save(updatedTourRide);
    }

    public void deleteById(int id) {
        bookingRepository.deleteById(id);
    }

}
