package com.pravin.alumniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.alumnientity.AlumniFeedbackEntity;
import com.pravin.alumnimodel.AlumniFeedbackModel;
import com.pravin.alumnirepo.AlumniFeedbackRepo;

@Service
public class AlumniFeedbackService {
	@Autowired
	public AlumniFeedbackRepo alumnifeedbackrepo;

	public void addAlumniToDb(AlumniFeedbackModel alumnifeedbackmodel) {
		AlumniFeedbackEntity afe=new AlumniFeedbackEntity();
		afe.setName(alumnifeedbackmodel.getName());
		afe.setFeedback(alumnifeedbackmodel.getFeedback());
		alumnifeedbackrepo.save(afe);
	}

	public List<AlumniFeedbackEntity> showAllFeedback() {
		
		return alumnifeedbackrepo.findAll();
	}

}
