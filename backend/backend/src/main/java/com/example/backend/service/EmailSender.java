package com.example.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EmailSender {
    final private JavaMailSender emailSender;

    public void SendVerificationMailForCustomer(String to, String id) {
        SimpleMailMessage smm = new SimpleMailMessage();
        String body = "http://localhost:8080/api/customer/activate/" + id;
        smm.setTo(to);
        smm.setText(body);
        emailSender.send(smm);
    }
}
