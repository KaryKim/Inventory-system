package com.ll.dao;

import java.util.List;

import com.ll.entity.InStorageMerchandise;

public interface InStorageMerchandiseInterface {
	public boolean inStorage(InStorageMerchandise inStorageMerchandise);
	public List<InStorageMerchandise> queryInStorageByName(String merchandiseName);
	public List<InStorageMerchandise> queryInStorageByzhonglei(String zl);
	public List<InStorageMerchandise> queryInStorageByDate(String date);
	public List<InStorageMerchandise> queryInStorageByMonth(java.sql.Date month,java.sql.Date nextMonth);
}
