package com.contact.contactmanager.controller;

import com.contact.contactmanager.entities.Contact;
import com.contact.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact){
        return ResponseEntity.status(HttpStatus.CREATED).body(contactService.createContact(contact));
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContact(){
        return ResponseEntity.ok(contactService.getAllContact());

    }

    @GetMapping("/{zipCode}")
    public ResponseEntity<List<Contact>> getContactbyZipCode(@PathVariable String zipCode){
        return ResponseEntity.ok(contactService.getContactbyZipCode(zipCode));
    }
}
