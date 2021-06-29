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
public class Activity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer package_id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String type;

    @Column
    private Date activity_date;

    @Column
    private String optional;

    @Column
    private double price;

    @Column
    private String notes;

    @Column
    private String location;
}
