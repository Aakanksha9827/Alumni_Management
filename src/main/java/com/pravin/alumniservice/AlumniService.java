package com.pravin.alumniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.alumnientity.AlumniEntity;
import com.pravin.alumnimodel.AlumniLogin;
import com.pravin.alumnimodel.AlumniModel;
import com.pravin.alumnirepo.AlumniRepo;

@Service
public class AlumniService {
	@Autowired
	public AlumniRepo alumnirepo;

	public void addAlumniToDb(AlumniModel alumnimodel) {
		AlumniEntity entity = new AlumniEntity();
		entity.setFirstname(alumnimodel.getFirstname());
		entity.setLastname(alumnimodel.getLastname());
		entity.setGender(alumnimodel.getGender());
		entity.setDob(alumnimodel.getDob());
		entity.setEmail(alumnimodel.getEmail());
		entity.setPassword(alumnimodel.getPassword());
		entity.setMobilenumber(alumnimodel.getMobilenumber());
		entity.setPassoutyear(alumnimodel.getPassoutyear());
		entity.setDepartment(alumnimodel.getDepartment());
		entity.setCompanyname(alumnimodel.getCompanyname());
		entity.setDomain(alumnimodel.getDomain());
		entity.setAddress(alumnimodel.getAddress());
		entity.setExperience(alumnimodel.getExperience());
		 alumnirepo.save(entity);	
	}
	public AlumniModel userlogin(AlumniLogin alumnilogin) {
		AlumniEntity userdata  = alumnirepo.findByEmailAndPassword(alumnilogin.getEmail(), alumnilogin.getPassword());
		AlumniModel alumnidto=null;
		if(userdata != null) {
			 alumnidto = new AlumniModel();
			alumnidto.setEmail(userdata.getEmail());
			alumnidto.setPassword(userdata.getPassword());	
		}
		return alumnidto;	
	}
	public List<AlumniEntity> showAllEnquires() {
		return alumnirepo.findAll();
	}
	public AlumniEntity getUserByUsername(String email) {
		
		 return alumnirepo.findByEmail(email); 
	}
	
	public AlumniEntity saveupdateddata(AlumniEntity alumnientity) {
		AlumniEntity saved= alumnirepo.save(alumnientity);
		return saved;
	}

}
