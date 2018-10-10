package com.jesse.chapter10;

public class Spitter {
	
	@Override
	public String toString() {
		return "Spitter [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", email=" + email + ", updateByEmail=" + updateByEmail + "]";
	}
	private Long id;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private boolean updateByEmail;
	public Spitter(Long id, String username, String password, String fullname, String email, boolean updateByEmail) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.updateByEmail = updateByEmail;
	}
	public Spitter(String username, String password, String fullname, String email, boolean updateByEmail) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.updateByEmail = updateByEmail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isUpdateByEmail() {
		return updateByEmail;
	}
	public void setUpdateByEmail(boolean updateByEmail) {
		this.updateByEmail = updateByEmail;
	}
	

}
