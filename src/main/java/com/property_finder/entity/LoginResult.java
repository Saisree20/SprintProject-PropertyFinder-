package com.property_finder.entity;

import com.property_finder.enums.Role;

public class LoginResult {
	
private String loginMessage;
private Role role;

public String getLoginMessage() {
	return loginMessage;
}
public void setLoginMessage(String loginMessage) {
	this.loginMessage = loginMessage;
}
public Role getRole() {
	return role;
}
public LoginResult(String loginMessage, Role role) {
	super();
	this.loginMessage = loginMessage;
	this.role = role;
}
public void setRole(Role role) {
	this.role = role;
}
public LoginResult() {
	super();
	// TODO Auto-generated constructor stub
}

}
