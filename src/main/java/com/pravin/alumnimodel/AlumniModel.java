package com.pravin.alumnimodel;

public class AlumniModel {
	private Integer Sn;
	private String firstname;
	private String lastname;
	private String gender;
	private String dob;
	private String email;
	private String password;
	private String mobilenumber;
	private String passoutyear;
	private String department;
	private String companyname;
	private String domain;
	private String address;
	private Integer experience;
	public Integer getSn() {
		return Sn;
	}
	public void setSn(Integer sn) {
		Sn = sn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassoutyear() {
		return passoutyear;
	}
	public void setPassoutyear(String passoutyear) {
		this.passoutyear = passoutyear;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public AlumniModel(Integer sn, String firstname, String lastname, String gender, String dob, String email,
			String password, String mobilenumber, String passoutyear, String department, String companyname,
			String domain, String address, Integer experience) {
		super();
		Sn = sn;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.passoutyear = passoutyear;
		this.department = department;
		this.companyname = companyname;
		this.domain = domain;
		this.address = address;
		this.experience = experience;
	}
	public AlumniModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlumniModel [Sn=" + Sn + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", dob=" + dob + ", email=" + email + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", passoutyear=" + passoutyear + ", department=" + department + ", companyname=" + companyname
				+ ", domain=" + domain + ", address=" + address + ", experience=" + experience + "]";
	}

}
