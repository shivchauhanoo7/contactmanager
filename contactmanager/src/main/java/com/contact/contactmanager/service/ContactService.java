package com.contact.contactmanager.service;

import com.contact.contactmanager.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactService{
    Contact createContact(Contact contact);// save new contact in database

    List<Contact> getAllContact();//get all contacts from database

    List<Contact> getContactbyZipCode(String zipCode);// show contact byu provide zip code from database
}
