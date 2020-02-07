/***********************************************************************
 * Module:  QuantityStatisticsService.java
 * Author:  CY
 * Purpose: Defines the Class QuantityStatisticsService
 ***********************************************************************/

package com.ll.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.QuantityStatisticsDao;
import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
import com.ll.service.QuantityStatisticsService;

@Service("quantityStatisticsService")
public class QuantityStatisticsServiceImpl implements QuantityStatisticsService {
	@Autowired
	QuantityStatisticsDao quantityStatisticsDao;

	public void setQuantityStatisticsDao(QuantityStatisticsDao quantityStatisticsDao) {
		this.quantityStatisticsDao = quantityStatisticsDao;
	}

	public Map countByDay(String date) {
		Map map = quantityStatisticsDao.countByDay(date);
		int inStorageNumber = 0;
		int outStorageNumber = 0;
		List<InStorageMerchandise> inStorage = (List) map.get("in");
		List<OutStorageMerchandise> outStorage = (List) map.get("out");
		for (InStorageMerchandise ism : inStorage) {
			inStorageNumber += ism.getQuantity();
		}
		for (OutStorageMerchandise osm : outStorage) {
			outStorageNumber += osm.getQuantity();
		}
		Map countResult = new HashMap<>();
		countResult.put("inStorage", inStorage);
		countResult.put("outStorage", outStorage);
		countResult.put("inStorageNumber", inStorageNumber);
		countResult.put("outStorageNumber", outStorageNumber);
		return countResult;
	}

	public Map countByMonth(String month) {
		Map map = quantityStatisticsDao.countByMonth(month);
		int inStorageNumber = 0;
		int outStorageNumber = 0;
		List<InStorageMerchandise> inStorage = (List) map.get("in");
		List<OutStorageMerchandise> outStorage = (List) map.get("out");
		for (InStorageMerchandise ism : inStorage) {
			inStorageNumber += ism.getQuantity();
		}
		for (OutStorageMerchandise osm : outStorage) {
			outStorageNumber += osm.getQuantity();
		}
		Map countResult = new HashMap<>();
		countResult.put("inStorage", inStorage);
		countResult.put("outStorage", outStorage);
		countResult.put("inStorageNumber", inStorageNumber);
		countResult.put("outStorageNumber", outStorageNumber);
		return countResult;
	}

	public Map countByYear(String year) {
		Map map = quantityStatisticsDao.countByYear(year);
		int inStorageNumber = 0;
		int outStorageNumber = 0;
		List<InStorageMerchandise> inStorage = (List) map.get("in");
		List<OutStorageMerchandise> outStorage = (List) map.get("out");
		for (InStorageMerchandise ism : inStorage) {
			inStorageNumber += ism.getQuantity();
		}
		for (OutStorageMerchandise osm : outStorage) {
			outStorageNumber += osm.getQuantity();
		}
		Map countResult = new HashMap<>();
		countResult.put("inStorage", inStorage);
		countResult.put("outStorage", outStorage);
		countResult.put("inStorageNumber", inStorageNumber);
		countResult.put("outStorageNumber", outStorageNumber);
		return countResult;
	}

}