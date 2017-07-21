package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@Autowired
	private MailService mailService;
	
	
	@RequestMapping("/send")
	public String sendmail()  {
		
		User user = new User();
		user.setFirstName("jjung");
		user.setLastName("kim");
		user.setEmailAddress("kugawon@daum.net");
		
		try {
			
			mailService.sendMail(user);
			
		}catch(MailException e) {
			//catch error
			
			
		}
		return "thank you";
		
	}
	
	
}
