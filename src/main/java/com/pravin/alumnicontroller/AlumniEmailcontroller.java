package com.pravin.alumnicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pravin.alumniservice.AlumniEmailService;
@Controller
public class AlumniEmailcontroller {

	@Autowired
	public AlumniEmailService alumniemailservice;
	
	@GetMapping("/mail")
	public String sendmail() throws Exception {
alumniemailservice.sendEmail("Invitation for Alumni Meet", "An Alumnimeet is scheduled on 28/12/2026",new String[] {
				"aakankshapatil9280@gmail.com","pravin.ambupe@jjmcoe.ac.in","vaishnavimore2475@gmail.com","namdevsalunkhe8055@gmail.com","jaywantmuktapure01@gmail.com"});
		return "redirect:/";
	}
	
}

