package com.pravin.alumnientity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AlumniFeedbackEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sn;
	private String name;
	private String feedback;
	public Integer getSn() {
		return sn;
	}
	public void setSn(Integer sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public AlumniFeedbackEntity(Integer sn, String name, String feedback) {
		super();
		this.sn = sn;
		this.name = name;
		this.feedback = feedback;
	}
	public AlumniFeedbackEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlumniFeedbackEntity [sn=" + sn + ", name=" + name + ", feedback=" + feedback + "]";
	}
	
	
}
