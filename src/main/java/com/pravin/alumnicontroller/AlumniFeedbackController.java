package com.pravin.alumnicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pravin.alumnientity.AlumniFeedbackEntity;
import com.pravin.alumnimodel.AlumniFeedbackModel;
import com.pravin.alumniservice.AlumniFeedbackService;

@Controller
public class AlumniFeedbackController {
	@Autowired
	public AlumniFeedbackService alumnifeedbackservice;
	@GetMapping("/feedback")
	public String feedbackHomePage() {
		return "feedback";	
	}
	
	@PostMapping("/savefeedback")
	public String addFeedbackToDb(@ModelAttribute AlumniFeedbackModel alumnifeedbackmodel) {
		alumnifeedbackservice.addAlumniToDb(alumnifeedbackmodel);
		return "ls";	
	}
	
	@GetMapping(value = "/allfeedback")
	public String getHomePage(ModelMap modelmap) {
		modelmap.addAttribute("enquiry",new AlumniFeedbackEntity());
		modelmap.addAttribute("all",alumnifeedbackservice.showAllFeedback());
		modelmap.addAttribute("title","Feedbacks Submitted By Alumni");
        return "all_feedback";		
	}	

}
