package com.pravin.alumnimodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AlumniDonationDto {
	private Integer sn;
	private String fullname;
	private String emailid;
	private String contactno;
	private String donationtype;
	public Integer getSn() {
		return sn;
	}
	public void setSn(Integer sn) {
		this.sn = sn;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getDonationtype() {
		return donationtype;
	}
	public void setDonationtype(String donationtype) {
		this.donationtype = donationtype;
	}
	public AlumniDonationDto(Integer sn, String fullname, String emailid, String contactno, String donationtype) {
		super();
		this.sn = sn;
		this.fullname = fullname;
		this.emailid = emailid;
		this.contactno = contactno;
		this.donationtype = donationtype;
	}
	public AlumniDonationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlumniDonationDto [sn=" + sn + ", fullname=" + fullname + ", emailid=" + emailid + ", contactno="
				+ contactno + ", donationtype=" + donationtype + "]";
	}
	
	
}
