package com.pravin.alumnirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.alumnientity.AlumniFeedbackEntity;

public interface AlumniFeedbackRepo extends JpaRepository<AlumniFeedbackEntity, Integer>{

}
