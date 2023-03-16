package com.example.emailVerificationSystem.service;

import com.example.emailVerificationSystem.pojo.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);
}
