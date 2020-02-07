/***********************************************************************
 * Module:  RecordDao.java
 * Author:  CY
 * Purpose: Defines the Class RecordDao
 ***********************************************************************/

package com.ll.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ll.dao.InStorageMerchandiseInterface;
import com.ll.dao.OutStorageMerchandiseInterface;
import com.ll.dao.RecordDao;
import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
@Repository("recordDao")
public class RecordDaoImpl extends SqlSessionDaoSupport implements RecordDao {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public boolean outStorage(OutStorageMerchandise outStorageMerchandise) {
		OutStorageMerchandiseInterface mapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
		 boolean flag = mapper.outStorage(outStorageMerchandise);
		return flag;
	}

	@Override
	public boolean inStorage(InStorageMerchandise inStorageMerchandise) {
		InStorageMerchandiseInterface mapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
		 boolean flag = mapper.inStorage(inStorageMerchandise);
		return flag;
	}


}