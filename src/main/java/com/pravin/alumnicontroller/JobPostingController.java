package com.pravin.alumnicontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.pravin.alumnientity.JobPostingEntity;
import com.pravin.alumniservice.JobPostingService;

@Controller 
public class JobPostingController {
	@Autowired
	public JobPostingService jobpostingservice;
	@GetMapping("/job")
	public String jobposting() {
		return "job";
	}
	
	@PostMapping("/savejob")
	public String addPostToDb(@RequestParam("name")String name,@RequestParam("mobilenumber")String mobilenumber,@RequestParam("postingdate")String postingdate
			,@RequestParam("imageData") MultipartFile imageData) throws IOException {
		jobpostingservice.addjobToDb(name,mobilenumber,postingdate, imageData);
		return "redirect:/ls";	
	}
	@GetMapping(value = "/alljob")
	public String getHomePage(ModelMap modelmap) {
		modelmap.addAttribute("enquiry",new JobPostingEntity());
		modelmap.addAttribute("all",jobpostingservice.showAllJobPost());
		modelmap.addAttribute("title","Job Posting By Alumni ");
        return "all";		
	}	
	

}
