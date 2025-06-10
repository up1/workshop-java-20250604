package com.example.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserRequest{

	@NotBlank(message = "Username is required")
	private String name;

	@NotBlank(message = "Email is required")
	@Email(message = "Email should be valid 1")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Email should be valid 2")
	private String email;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
	public String toString() {
		return "UserRequest{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
