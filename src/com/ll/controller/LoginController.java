/***********************************************************************
 * Module:  LoginController.java
 * Author:  CY
 * Purpose: Defines the Class LoginController
 ***********************************************************************/

package com.ll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ll.entity.Admin;
import com.ll.service.LoginService;

/** @pdOid 66a26ced-e770-4716-8248-c403b38b1c01 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping("login.do")
	public String login(Admin admin,ModelMap map) {
		boolean flag = loginService.login(admin);
		if(flag==true)
		 return "main.jsp";
		else 
			map.addAttribute("login", "fail");
			return "login.jsp";
	}

}