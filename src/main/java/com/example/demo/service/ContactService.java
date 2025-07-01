package com.example.demo.service;

import com.example.demo.model.ContactForm;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<ContactForm> getAllContacts() {
        return contactRepository.findAll();
    }

    public void saveContact(ContactForm contact) {
        contactRepository.save(contact);
    }

   
    public ContactForm getById(Long id) {
        Optional<ContactForm> optional = contactRepository.findById(id);
        ContactForm ContactForm = null;
        if (optional.isPresent())
            ContactForm = optional.get();
        else
            throw new RuntimeException(
                    "ContactForm not found for id : " + id);
        return ContactForm;
    }


    
    public void deleteViaId(long id) {
        contactRepository.deleteById(id);
    }
}
