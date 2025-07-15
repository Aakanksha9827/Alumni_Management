package com.pravin.alumnirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.alumnientity.AlumniEntity;

public interface AlumniRepo extends JpaRepository<AlumniEntity, Integer> {

	AlumniEntity findByEmailAndPassword(String email, String password);

	AlumniEntity findByEmail(String email);

}
