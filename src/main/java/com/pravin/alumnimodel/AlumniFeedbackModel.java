package com.pravin.alumnimodel;

public class AlumniFeedbackModel {
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
	@Override
	public String toString() {
		return "AlumniFeedback [sn=" + sn + ", name=" + name + ", feedback=" + feedback + "]";
	}
	public AlumniFeedbackModel(Integer sn, String name, String feedback) {
		super();
		this.sn = sn;
		this.name = name;
		this.feedback = feedback;
	}
	public AlumniFeedbackModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
