/***********************************************************************
 * Module:  QueryService.java
 * Author:  CY
 * Purpose: Defines the Class QueryService
 ***********************************************************************/

package com.ll.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.QueryDao;
import com.ll.service.QueryService;

@Service("queryService")
public class QueryServiceImpl implements QueryService {
	@Autowired
	QueryDao queryDao;

	public void setQueryDao(QueryDao queryDao) {
		this.queryDao = queryDao;
	}

	@Override
	public Map<String, List> queryByName(String merchandiseName) {
		Map<String, List> queryByName = queryDao.queryByName(merchandiseName);
		return queryByName;
	}

	@Override
	public Map<String, List> queryByzhonglei(String zl) {
		Map<String, List> queryByzhonglei = queryDao.queryByzhonglei(zl);
		return queryByzhonglei;
	}
	@Override
	public Map<String, List> queryByDate(String date) {
		Map<String, List> queryByDate = queryDao.queryByDate(date);
		return queryByDate;
	}

}