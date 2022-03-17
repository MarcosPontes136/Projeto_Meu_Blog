package com.ApiEmail.envioEmail.Controller;

import com.ApiEmail.envioEmail.Service.EmailService;
import com.ApiEmail.envioEmail.dto.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmailSender {	

	@Autowired
	private EmailService emailService;

	@PostMapping(value = "/contato")
	public ResponseEntity<Email> enviarEmail(@RequestBody Email email){
	  try {
		emailService.sendEmail(email);
		return new ResponseEntity<>(email,  HttpStatus.OK);
	  } catch( MailException e){
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	  }

	}
  }

