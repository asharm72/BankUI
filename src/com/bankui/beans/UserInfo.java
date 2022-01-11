package com.bankui.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {
	private Long id;
	private String userName;
	private String password;
	private Role roles;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public Role getRoles() {
		return roles;
	}
	public void setRoles(Role roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}

}
