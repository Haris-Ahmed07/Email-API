package com.emailapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailapi.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@RequestMapping("/send-email")
	public String welcome()
	{
		emailService.sendEmail("to@gmail.com","from@gmail.com", "subject", "message");
		
		return "Mail Sent Successfully";
	}
	
}
