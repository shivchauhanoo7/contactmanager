package com.contact.contactmanager.service.impl;

import com.contact.contactmanager.entities.Contact;
import com.contact.contactmanager.repository.ContactRepository;
import com.contact.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public List<Contact> getContactbyZipCode(String zipCode) {
        return contactRepository.findByAddressZipCode(zipCode);
    }
}
