package com.pravin.alumnirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.alumnientity.JobPostingEntity;

public interface JobPostingRepo  extends JpaRepository<JobPostingEntity, Integer>{

}
