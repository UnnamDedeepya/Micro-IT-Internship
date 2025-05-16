package com.unnam.dedeepya.portfolio_backend.controller;

import com.unnam.dedeepya.portfolio_backend.model.ContactForm;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // Allow requests from all origins (frontend)
public class ContactController {

    @PostMapping("/contact")
    public String submitForm(@RequestBody ContactForm form) {
        System.out.println("New contact form submission:");
        System.out.println("Name: " + form.getName());
        System.out.println("Email: " + form.getEmail());
        System.out.println("Message: " + form.getMessage());

        return "Message received. Thank you, " + form.getName() + "!";
    }
}
