package com.user;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String rePassword;
	private String phone;
	private String role;
	
	public User(int id, String name, String email, String password, String rePassword, String phone, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.role= role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String getrePassword() {
		return rePassword;
	}

	public void setrePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
