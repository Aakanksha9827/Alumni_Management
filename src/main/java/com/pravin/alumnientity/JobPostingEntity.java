package com.pravin.alumnientity;

import java.util.Arrays;

import org.apache.tomcat.util.codec.binary.Base64;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class JobPostingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sn;
	private String name;
	private String mobilenumber;
	private String postingdate;
	@Lob
    private byte[] imageData;
    
    public String generateBase64Image() {
        return Base64.encodeBase64String(imageData);
    	
    }

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

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPostingdate() {
		return postingdate;
	}

	public void setPostingdate(String postingdate) {
		this.postingdate = postingdate;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public JobPostingEntity(Integer sn, String name, String mobilenumber, String postingdate, byte[] imageData) {
		super();
		this.sn = sn;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.postingdate = postingdate;
		this.imageData = imageData;
	}

	public JobPostingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JobPostingEntity [sn=" + sn + ", name=" + name + ", mobilenumber=" + mobilenumber + ", postingdate="
				+ postingdate + ", imageData=" + Arrays.toString(imageData) + "]";
	}
    

}
