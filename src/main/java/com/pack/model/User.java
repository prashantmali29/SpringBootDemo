package com.pack.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User
{

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer	id;

	@Column(name = "firstName", length = 50)
	String	firstName;

	@Column(name = "lastName", length = 50)
	String	lastName;
	
	@Column(name = "city", length = 50)
	String	city;
	
	@Column(name = "mobileNumber", length = 50)
	String	mobileNumber;
	
	@Column(name = "userName", length = 50)
	String	userName;
	
	@Column(name = "password", length = 50)
	String	password;
	
	@Column(name = "userType", length = 50)
	String	userType;
	
	public User() {
		super();
	}

	
	
	public User(Integer id, String firstName, String lastName, String city, String mobileNumber, String userName,
			String password, String userType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



}