/***********************************************************************
 * Module:  QueryDao.java
 * Author:  CY
 * Purpose: Defines the Class QueryDao
 ***********************************************************************/

package com.ll.dao.impl;

import java.util.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ll.dao.InStorageMerchandiseInterface;
import com.ll.dao.OutStorageMerchandiseInterface;
import com.ll.dao.QueryDao;
import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
@Repository("queryDao")
public class QueryDaoImpl extends SqlSessionDaoSupport implements QueryDao{
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public Map<String, List> queryByName(String merchandiseName) {
		InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
		String searchText = new StringBuilder("%").append(merchandiseName).append("%").toString();
		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByName(searchText);
		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByName(searchText);
		Map<String,List> queryResult = new HashMap<>();
		queryResult.put("in", inStorageList);
		queryResult.put("out", outStorageList);
		return queryResult;
	}

	@Override
	public Map<String, List> queryByzhonglei(String zl) {
		InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
		String searchText = new StringBuilder("%").append(zl).append("%").toString();
		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByzhonglei(searchText);
		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByzhonglei(searchText);
		Map<String,List> queryResult = new HashMap<>();
		queryResult.put("in", inStorageList);
		queryResult.put("out", outStorageList);
		return queryResult;
	}
	@Override
	public Map<String, List> queryByDate(String date) {
		InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByDate(date);
		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByDate(date);
		Map<String,List> queryResult = new HashMap<>();
		queryResult.put("in", inStorageList);
		queryResult.put("out", outStorageList);
		return queryResult;
	}



}