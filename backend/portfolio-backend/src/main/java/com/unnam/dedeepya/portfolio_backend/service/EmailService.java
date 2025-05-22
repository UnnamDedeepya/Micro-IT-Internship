package com.unnam.dedeepya.portfolio_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactEmail(String name, String email, String messageText) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("dedeepyaunnam123@gmail.com"); // <-- your email
        message.setSubject("New Portfolio Contact Form Submission");
        message.setText(
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Message: " + messageText);

        mailSender.send(message);
    }
}
