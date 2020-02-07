/***********************************************************************
 * Module:  RecordService.java
 * Author:  CY
 * Purpose: Defines the Class RecordService
 ***********************************************************************/

package com.ll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.RecordDao;
import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
@Service("recordService")
public class RecordService implements com.ll.service.RecordService {
	@Autowired
	RecordDao recordDao;
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}
	@Override
	public boolean outStorage(OutStorageMerchandise outStorageMerchandise) {
		return recordDao.outStorage(outStorageMerchandise);
	
	}

	@Override
	public boolean inStorage(InStorageMerchandise inStorageMerchandise) {
		return recordDao.inStorage(inStorageMerchandise);
	}


}