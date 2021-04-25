package com.example.demo.repository;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ContactRepository extends JpaRepository<Contact, Integer>{

    // SELECT * FROM CONTACT
    List<Contact> findAll();

}
