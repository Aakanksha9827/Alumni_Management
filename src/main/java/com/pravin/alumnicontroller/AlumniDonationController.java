package com.pravin.alumnicontroller;
import com.pravin.alumnientity.AlumniDonationEntity;
import com.pravin.alumnientity.JobPostingEntity;

import java.io.IOException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.pravin.alumnimodel.AlumniDonationDto;
import com.pravin.alumniservice.AlumniDonationService;
@Controller
public class AlumniDonationController {
	@Autowired
	AlumniDonationService alumnidonationservice;

	@GetMapping("/donation")
	public String homePageDonation() {
	return "Donation";
	}
	@PostMapping("/donationdata")
	public String addDonationToDb(@ModelAttribute AlumniDonationDto alumnidonationdto) throws Exception {
		System.out.println(alumnidonationdto.getFullname());
		alumnidonationservice.addDonationToDb(alumnidonationdto);
		return "redirect:/ls";	
	}
	
	@GetMapping(value = "/alldonation")
	public String getHomePage(ModelMap modelmap) {
		modelmap.addAttribute("enquiry",new AlumniDonationEntity ());
		modelmap.addAttribute("all",alumnidonationservice.showAllDonation());
		modelmap.addAttribute("title","Donation By Alumni ");
        return "all_Donation";	
	}
}
