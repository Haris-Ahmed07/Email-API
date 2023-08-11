package com.emailapi.services;

import java.util.Properties;

import org.springframework.stereotype.Service;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	public void sendEmail(String to, String from,  String subject, String message)
	{
		
//		Variable for gmail host
		String host = "smtp.gmail.com";
		
//		VariableElement for port
		String port = "465";
		
		
//		1) Getting the System properties
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		
//		2) Settings theSettings important information information the properties object
		
//		a) Settings host
		properties.put("mail.smtp.host", host);
		
//		b) Setting port
		properties.put("mail.smtp.port", port);
		
//		c) Setting security ssl
		properties.put("mail.smtp.ssl.enable", "true");
		
//		d) Settings the Authenticator
		properties.put("mail.smtp.auth", "true");
		
//		3) Getting the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
//				Authenticating the Sender Gmail Account
				return new PasswordAuthentication("from@gmail.com","pass");
			}
			
		});
		
//		Settings the setDebug true to get error messages
		session.setDebug(true);
		
//		4) Creating the message object and passing the session to send email
		MimeMessage m = new MimeMessage(session);
		
		
		try 
		{
//			From email
			m.setFrom(from);
			
//			Adding recipent
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
//			Adding subject to message
			m.setSubject(message);
			
//			Adding the message
			m.setText(message);
			
//			5) Sending the message using the Transport Class
			Transport.send(m);
			
			System.out.println("Message Sent Successfully..................");
		}
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		
		
	}
	
}
