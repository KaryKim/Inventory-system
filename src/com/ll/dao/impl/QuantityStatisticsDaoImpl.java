/***********************************************************************
 * Module:  QuantityStatisticsDao.java
 * Author:  CY
 * Purpose: Defines the Class QuantityStatisticsDao
 ***********************************************************************/

package com.ll.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ll.dao.InStorageMerchandiseInterface;
import com.ll.dao.OutStorageMerchandiseInterface;
import com.ll.dao.QuantityStatisticsDao;
import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
@Repository("quantityStatisticsDao")
public class QuantityStatisticsDaoImpl extends SqlSessionDaoSupport implements QuantityStatisticsDao{
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
   public Map countByDay(String date) {
	   InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByDate(date);
		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByDate(date);
		Map<String,List> queryResult = new HashMap<>();
		queryResult.put("in", inStorageList);
		queryResult.put("out", outStorageList);
      return queryResult;
   }
   
   public Map countByMonth(String month) {
	   
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
	   java.util.Date date=null;
	   try {
		   //得到的日期为该年月的第一天的0时0分0秒
		 date = sdf.parse(month);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println(date);
	Calendar c =Calendar.getInstance();
	c.setTime(date);
	//目地为了得到该年月的最后一天的23时59分59秒
	//将月份加一，变成下个月的第一天
	c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
	c.add(Calendar.DAY_OF_MONTH,-1);/*将本月天数-1,7月1号，变成6月30号了，这样就不必考虑最后一天是几号了,变成上个月的最后一天*/
	//设置时分秒
	c.set(Calendar.HOUR, 23);
	c.set(Calendar.MINUTE, 59);
	c.set(Calendar.SECOND, 59);
	java.util.Date date2 = c.getTime();
	//目的达到
	java.sql.Date sqlDate1 = new java.sql.Date(date.getTime());
	java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());
	   InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
	 		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
	 		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByMonth(sqlDate1,sqlDate2);
	 		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByMonth(sqlDate1,sqlDate2);
	 		Map queryResult = new HashMap<>();
	 		queryResult.put("in", inStorageList);
	 		queryResult.put("out", outStorageList);
	       return queryResult;
   }
   
   public Map countByYear(String year) {
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	   java.util.Date date=null;
	   try {
		   //得到的日期为该年月的第一天的0时0分0秒
		 date = sdf.parse(year);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println(date);
	Calendar c =Calendar.getInstance();
	c.setTime(date);
	//目地为了得到该年的最后一天的23时59分59秒
	//将年份加一，变成下一年的第一天的00：00：00
	c.set(Calendar.YEAR, c.get(Calendar.YEAR)+1);
	c.add(Calendar.DAY_OF_MONTH,-1);/*将本月天数-1,1月1号，变成12月31号了，变成上一年的最后一天00:00:00*/
	//设置时分秒
	c.set(Calendar.HOUR, 23);
	c.set(Calendar.MINUTE, 59);
	c.set(Calendar.SECOND, 59);
	java.util.Date date2 = c.getTime();
	//目的达到
	java.sql.Date sqlDate1 = new java.sql.Date(date.getTime());
	java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());
	   InStorageMerchandiseInterface inMapper = getSqlSession().getMapper(InStorageMerchandiseInterface.class);
	 		OutStorageMerchandiseInterface outMapper = getSqlSession().getMapper(OutStorageMerchandiseInterface.class);
	 		List<InStorageMerchandise> inStorageList = inMapper.queryInStorageByMonth(sqlDate1,sqlDate2);
	 		List<OutStorageMerchandise> outStorageList = outMapper.queryOutStorageByMonth(sqlDate1,sqlDate2);
	 		Map queryResult = new HashMap<>();
	 		queryResult.put("in", inStorageList);
	 		queryResult.put("out", outStorageList);
	       return queryResult;
   }

}