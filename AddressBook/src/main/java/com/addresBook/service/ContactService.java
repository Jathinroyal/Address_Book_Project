package com.addresBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addresBook.model.Contact;
import com.addresBook.repository.ContactRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact updateContact(Long id, Contact contact) {
        contact.setId(id);
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
