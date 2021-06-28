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
        Booking updatedBooking = bookingRepository.findById(id).orElse(null);
        updatedBooking.setPackage_id(booking.getPackage_id());
        updatedBooking.setCustomer_id(booking.getCustomer_id());
        updatedBooking.setBooking_date(booking.getBooking_date());
        updatedBooking.setPayment_reference(booking.getPayment_reference());
        return bookingRepository.save(updatedBooking);
    }

    public void deleteById(int id) {
        bookingRepository.deleteById(id);
    }

}
