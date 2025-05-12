package com.yourname.portfolio.controller;

import com.yourname.portfolio.model.ContactForm;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // allow frontend requests from any origin
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
