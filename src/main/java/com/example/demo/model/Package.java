package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity

public class Package {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private Date start_date;

    @Column
    private Date end_date;

    @Column
    private String start_location;

    @Column
    private String end_location;
    
    @Column
    private int number_of_nights;

    @Column
    private int number_of_days;

    @Column
    private String notes;
}
