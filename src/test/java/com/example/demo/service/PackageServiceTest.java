package com.example.demo.service;

import com.example.demo.model.Package;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PackageServiceTest {
    @Autowired
    PackageService packageService;

    @BeforeAll
    void setup() {
        Package aPackage = new Package();
        aPackage.setName("Europe Trip");
        aPackage.setDescription("For this winter");
        aPackage.setPrice(150000);
        aPackage.setStart_date("2021-08-28");
        aPackage.setEnd_date("2021-09-06");
        aPackage.setStart_location("Srilanka");
        aPackage.setEnd_location("England");
        aPackage.setNumber_of_nights(9);
        aPackage.setNumber_of_days(10);
        aPackage.setNotes("Best trip");
        packageService.savePackage(aPackage);
    }

    @Test
    void findAll(){
        Assertions.assertFalse(packageService.findAll().isEmpty());
    }

    @Test
    void findById(){
        Package aPackage = packageService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("Srilanka", aPackage.getStart_location());
    }

    @Test
    void updatePackage(){
        Package aPackage = packageService.findById(1).orElseThrow(EntityNotFoundException::new);
        aPackage.setStart_location("India");
        Package updatedPackage = packageService.updatePackage(1, aPackage);
        Assertions.assertEquals("India", updatedPackage.getStart_location());
    }

    @AfterAll
    void tearDown() {
        this.packageService.deleteById(1);
    }
}
