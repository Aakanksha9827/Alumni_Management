package com.pravin.alumniservice;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class AlumniDonationEmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String fromEmailId;
	
	public String sendEmail(String emailSubject,String emailBody,String[] toEmails) throws Exception{
		
		//Create MimeMessage Object
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		//creating object for MimeMessageHelper class
		MimeMessageHelper mimehelper = new MimeMessageHelper(mimeMessage, true);
		//setting the properties
		mimehelper.setFrom(fromEmailId);
		mimehelper.setTo(toEmails);
		mimehelper.setSubject(emailSubject);
		mimehelper.setSentDate(new Date());
		mimehelper.setText(emailBody);
		
		
		//sending email
		javaMailSender.send(mimeMessage);
		
		return "redirect:/";
	}

}
