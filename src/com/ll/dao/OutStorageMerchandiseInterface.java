package com.ll.dao;

import java.util.List;

import com.ll.entity.OutStorageMerchandise;

public interface OutStorageMerchandiseInterface {
	public boolean outStorage(OutStorageMerchandise outStorageMerchandise);

	public List<OutStorageMerchandise> queryOutStorageByName(String merchandiseName);

	public List<OutStorageMerchandise> queryOutStorageByzhonglei(String zl);
	public List<OutStorageMerchandise> queryOutStorageByDate(String date);
	public List<OutStorageMerchandise> queryOutStorageByMonth(java.sql.Date month,java.sql.Date nextMonth);
}
