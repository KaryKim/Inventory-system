/***********************************************************************
 * Module:  Admin.java
 * Author:  CY
 * Purpose: Defines the Class Admin
 ***********************************************************************/

package com.ll.entity;

public class Admin {
	private Integer id;

	private String username;
	private String password;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


}