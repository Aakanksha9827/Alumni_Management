package com.pravin.alumniservice;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pravin.alumnientity.AlumniDonationEntity;
import com.pravin.alumnimodel.AlumniDonationDto;
import com.pravin.alumnirepo.AlumniDonationRepository;
import java.util.List;
@Service
public class AlumniDonationService {
	@Autowired
	public AlumniDonationRepository alumnidonationrepository;
	@Autowired
	public AlumniDonationEmailService alumniemailservice;

	public String addDonationToDb(AlumniDonationDto alumnidonationdto)  throws Exception{
		AlumniDonationEntity ade= new AlumniDonationEntity();
		
		ade.setFullname(alumnidonationdto.getFullname());
		ade.setEmailid(alumnidonationdto.getEmailid());
		ade.setContactno(alumnidonationdto.getContactno());
		ade.setDonationtype(alumnidonationdto.getDonationtype());
		
		alumnidonationrepository.save(ade);
		System.out.println(ade);
		alumniemailservice.sendEmail("Alumni is interested for donation", "I am interested in"+" "+alumnidonationdto.getDonationtype(),new String[] {"aakankshapatil9280@gmail.com","pravin.ambupe@jjmcoe.ac.in","vaishnavimore2475@gmail.com","namdevsalunkhe8055@gmail.com"});
		
		return"Donation Details added to database";
		
		
	}

	public List<AlumniDonationEntity> showAllDonation() {
		
		return alumnidonationrepository.findAll();
	}
	

}
