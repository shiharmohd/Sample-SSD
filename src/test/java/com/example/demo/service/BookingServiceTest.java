package com.example.demo.service;

import com.example.demo.model.Booking;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookingServiceTest {

    @Autowired
    BookingService bookingService;

    @BeforeAll
    void setup() {
        Booking booking = new Booking();
        booking.setPackage_id(1);
        booking.setCustomer_id(15);
        booking.setBooking_date("2021-10-23");
        booking.setPayment_reference("Cash");
        bookingService.saveBooking(booking);
    }

    @Test
    void findAll(){
        Assertions.assertFalse(bookingService.findAll().isEmpty());
    }

    @Test
    void findById(){
        Booking booking = bookingService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals(20, booking.getCustomer_id());
    }

    @Test
    void updateBooking(){
        Booking booking = bookingService.findById(1).orElseThrow(EntityNotFoundException::new);
        booking.setCustomer_id(20);
        Booking updatedBooking = bookingService.updateBooking(1, booking);
        Assertions.assertEquals(20, updatedBooking.getCustomer_id());
    }

    @AfterAll
    void tearDown() {
        this.bookingService.deleteById(1);
    }
}
