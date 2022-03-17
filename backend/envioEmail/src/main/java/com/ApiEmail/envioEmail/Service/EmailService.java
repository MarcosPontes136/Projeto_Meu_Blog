package com.ApiEmail.envioEmail.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ApiEmail.envioEmail.dto.Email;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(Email email) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("marcospontes136@gmail.com");
        mail.setFrom(email.getEmail());
        mail.setSubject("Contato: "+ email.getNome());
        mail.setText(email.getMensagem());

        javaMailSender.send(mail);
    }

}

