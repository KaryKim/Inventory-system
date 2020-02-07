package com.ll.dao;

import java.util.List;
import java.util.Map;

import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;

public interface QueryDao {
	public Map<String, List> queryByName(String merchandiseName);
	public Map<String, List> queryByDate(String date);
	public Map<String, List> queryByzhonglei(String zl);

}
