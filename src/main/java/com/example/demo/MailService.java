package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	private JavaMailSender javaMailSender; 
	
	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		
		this.javaMailSender=javaMailSender;
		
	}
	
	
	public void sendMail(User user) {
		
		//send mail
		SimpleMailMessage mail = new SimpleMailMessage();
		
		
		mail.setTo(user.getEmailAddress());
		mail.setFrom("jjungk0926@gmail.com");
		mail.setSubject("hello");
		mail.setText("mail succeed");
		
		
		javaMailSender.send(mail);
		
	}
	
}
