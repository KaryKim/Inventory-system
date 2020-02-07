package com.ll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.LoginDao;
import com.ll.entity.Admin;
import com.ll.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public boolean login(Admin admin) {
		Admin adm = loginDao.login(admin.getUsername());
		if (adm!=null&&admin.getPassword().equals(adm.getPassword())) {
			return true;
		}
		return false;
	}

}
