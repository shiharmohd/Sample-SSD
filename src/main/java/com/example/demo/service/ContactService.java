package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContactList() {
        // INSERT INTO contact (name, email, country)
        // VALUES ('Bimsara imalka','bimsarabandara02@gmail.com', 'Sri lanka')
        Contact contact = new Contact();
        contact.setName("Bimsara imalka");
        contact.setEmail("bimsarabandara02@gmail.com");
        contact.setCountry("Sri Lanka");
        contactRepository.save(contact);

        // UPDATE contact SET email ='imalka@gmail.com' WHERE id = 1;
       Contact updatedContact = contactRepository.findById(1).orElse(null);
       updatedContact.setEmail("imalka@gmail.com");
       contactRepository.save(updatedContact);

       // DELETE FROM contact WHERE id = 1
        contactRepository.deleteById(1);

       // SELECT * FROM contact
        return contactRepository.findAll();

    }
}
