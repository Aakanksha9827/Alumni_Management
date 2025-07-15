package com.pravin.alumniservice;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pravin.alumnientity.JobPostingEntity;
import com.pravin.alumnirepo.JobPostingRepo;



@Service
public class JobPostingService {
	@Autowired 
	public JobPostingRepo jobpostingrepo;

	public void addjobToDb(String name, String mobilenumber, String postingdate, MultipartFile image) throws IOException {
	
		JobPostingEntity jpe= new JobPostingEntity();
		jpe.setName(name);
		jpe.setMobilenumber(mobilenumber);
		jpe.setPostingdate(postingdate);
		jpe.setImageData(image.getBytes());
		jobpostingrepo.save(jpe);
	}

	public List<JobPostingEntity> showAllJobPost() {
		return jobpostingrepo.findAll();
	}

}
