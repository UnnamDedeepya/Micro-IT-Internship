package com.unnam.dedeepya.portfolio_backend.controller;

import com.unnam.dedeepya.portfolio_backend.model.ContactForm;
import com.unnam.dedeepya.portfolio_backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import com.unnam.dedeepya.portfolio_backend.model.ContactForm;
import org.springframework.web.bind.annotation.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


@RestController
@CrossOrigin(origins = "*") // Allow requests from all origins (frontend)
public class ContactController {

     @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
public String submitForm(@RequestBody ContactForm form) {
    emailService.sendContactEmail(form.getName(), form.getEmail(), form.getMessage());
    return "Thank you, " + form.getName() + "! Your message has been sent to our email.";
}
}
