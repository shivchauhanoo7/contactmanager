package com.contact.contactmanager.repository;

import com.contact.contactmanager.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Long> {

    List<Contact> findByAddressZipCode(String zipCode);
}
