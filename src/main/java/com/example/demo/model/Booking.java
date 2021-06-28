package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity


public class Booking {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer package_id;

    @Column
    private Integer customer_id;

    @Column
    private Date booking_date;

    @Column
    private String payment_reference;
}
