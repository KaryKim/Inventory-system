package com.ll.dao;

import java.util.List;
import java.util.Map;

public interface QuantityStatisticsDao {
	   public Map<String,List> countByDay(String date);
	   public Map<String,List> countByMonth(String month);
	   public Map<String,List> countByYear(String year);
}
