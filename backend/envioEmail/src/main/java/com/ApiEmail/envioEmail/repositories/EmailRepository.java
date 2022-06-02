package com.ApiEmail.envioEmail.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiEmail.envioEmail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
	
}
