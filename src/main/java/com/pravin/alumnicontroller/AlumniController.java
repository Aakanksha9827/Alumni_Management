package com.pravin.alumnicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pravin.alumnientity.AlumniEntity;
import com.pravin.alumnimodel.AlumniLogin;
import com.pravin.alumnimodel.AlumniModel;
import com.pravin.alumniservice.AlumniService;


@Controller
public class AlumniController {
	@Autowired
	public AlumniService alumniservice;
	
	@GetMapping("/")
	public String homePage() {
	return "Welcome";	
	}
	
	@GetMapping("/register")
	public String home() {
	return "registrationpage";	
	}
	
	@GetMapping("/logout")
	public String homePageone() {
	return "Welcome";	
	}
	
	
	@PostMapping("/savedata")
	public String addAlumniToDb(@ModelAttribute AlumniModel alumnimodel) {
		alumniservice.addAlumniToDb(alumnimodel);
		return "redirect:/";	
	}
	@GetMapping("/loginpage")
	public String  homePage1() {
		return "login";
	}
	
	@PostMapping("/checkvaliduser")
	public String  userlogin(@ModelAttribute AlumniLogin alumnilogin) {
		
		AlumniModel userdata = alumniservice.userlogin(alumnilogin);
		if(userdata !=null) {	
		
			return "redirect:/ls";	
		}else
			
		return "redirect:/lns";
	}
	@GetMapping("/ls")
	public String  homePage2() {
		return "ls";
	}
	
	@GetMapping("/lns")
	public String  homePage3() {
		return "lns";
	}
	
	@GetMapping(value = "/allalumni")
	public String getHomePage(ModelMap modelmap) {
		modelmap.addAttribute("enquiry",new AlumniEntity());
		modelmap.addAttribute("all",alumniservice.showAllEnquires());
		modelmap.addAttribute("title","Welcome to Alumni Portal of JJMCOE ");
        return "allalumni";		
	}	
	@GetMapping("/edit")
	public String homeEdit() {
	return "Edit";
	}
	
	@PostMapping("/update/{uname}") 
	public String updateUser(@RequestParam("email") String email ,ModelMap modelmap) { 
		AlumniEntity updatedUser = alumniservice.getUserByUsername(email);
		modelmap.addAttribute("user", updatedUser); 
	   return "edit_alumni"; 
	} 
	@PostMapping("/update")
	public String updatedetails(@ModelAttribute("user") AlumniEntity alumnientity) {
		AlumniEntity status = alumniservice.saveupdateddata(alumnientity);
		return"redirect:/ls";
	}
	
	@GetMapping("/admin")
	public String homeAdmin() {
	return "admin";
	}
	
	
}
