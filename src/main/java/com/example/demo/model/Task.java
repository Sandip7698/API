package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class Task {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@GeneratedValue(generator ="UUID")
	@GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenrator")
	private Long randomId;
	private String fullName;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNo;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRandomId() {
		return randomId;
	}
	public void setRandomId(Long randomId) {
		this.randomId = randomId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
