package com.exemple.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Admin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty @Size(min = 4, max = 20)
	private String UserName ;
	@NotEmpty @Size(min = 4, max = 100)
	@Column(unique = true)
	private String Email;
	@NotEmpty @Size(min = 8, max = 15)
	private String Password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Admin(Long id, String userName, String email, String password) {
		super();
		this.id = id;
		UserName = userName;
		Email = email;
		Password = password;
	}
	public Admin() {
		super();
		
	}
	

}
