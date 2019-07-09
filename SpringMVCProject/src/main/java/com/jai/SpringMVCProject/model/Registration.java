package com.jai.SpringMVCProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="user_registration")
public class Registration {
	
	@Id
	@Column(name = "id", length=5)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name" ,length = 20, nullable = false)
	private String name;
	
	@Column(name="Email_Id" ,length = 40, nullable = false, unique=true)
	private String email;
	
	@Column(name="Mobile_No" ,length = 10, nullable = false, unique=true)
	private String mobileNumber;
	
	@Column(name="User_Name" ,length = 10, nullable = false, unique=true)
	private String userName;
	
	@Column(name="Password" ,length = 12, nullable = false)
	private String password;
	
	@Column(name="Cnfrm_Password" ,length = 12, nullable = false)
	private String cnfrmPassword;
	
	@Column(name="DOB", nullable = false)
	private String dob;
	
	@Column(name="Gender" ,length = 12, nullable = false)
	private String gender;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getCnfrmPassword() {
		return cnfrmPassword;
	}

	public String getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCnfrmPassword(String cnfrmPassword) {
		this.cnfrmPassword = cnfrmPassword;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", userName=" + userName + ", password=" + password + ", cnfrmPassword=" + cnfrmPassword + ", dob="
				+ dob + ", gender=" + gender + "]";
	}
	
	

}
