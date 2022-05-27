package com.ApiEmail.envioEmail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiEmail.envioEmail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
	
}
