package com.example.api;

public class UserRequest{
	private String name;
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
