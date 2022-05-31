package com.ApiEmail.envioEmail.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ApiEmail.envioEmail.enums.StatusEmail;
import com.ApiEmail.envioEmail.models.EmailModel;
import com.ApiEmail.envioEmail.repositories.EmailRepository;

@Service
public class EmailService {
	
    @Autowired
    EmailRepository emailRepository;
    
    @Autowired
    private JavaMailSender emailSender;

    public EmailModel sendEmail(EmailModel emailModel) {
    	emailModel.setSendDateEmail(LocalDateTime.now());
    	 try{
             SimpleMailMessage message = new SimpleMailMessage();
             message.setFrom(emailModel.getEmailFrom());
             message.setTo(emailModel.getEmailTo());
             message.setSubject(emailModel.getSubject());
             message.setText(emailModel.getText());
             emailSender.send(message);

             emailModel.setStatusEmail(StatusEmail.SENT);
         } catch (MailException e){
             emailModel.setStatusEmail(StatusEmail.ERROR);
         } finally {
             return emailRepository.save(emailModel);
         }
    }
}