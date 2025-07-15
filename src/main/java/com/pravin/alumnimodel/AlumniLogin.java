package com.pravin.alumnimodel;

public class AlumniLogin {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AlumniLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public AlumniLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlumniLogin [email=" + email + ", password=" + password + "]";
	}
	

}
