package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class TourRide {
  
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String tourLeader;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private String startLocation;

    @Column
    private String endLocation;

    @Column
    private String route;
}
