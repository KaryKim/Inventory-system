package com.ll.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ll.dao.AdminInterface;
import com.ll.dao.LoginDao;
import com.ll.entity.Admin;

@Repository("userDao")
public class LoginDaoImpl extends SqlSessionDaoSupport implements LoginDao {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public Admin login(String username) {
		AdminInterface mapper = getSqlSession().getMapper(AdminInterface.class);
		Admin admin = mapper.login(username);
		return admin;
	}


}
