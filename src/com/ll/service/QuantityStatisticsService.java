package com.ll.service;

import java.util.Map;

public interface QuantityStatisticsService {
	
	   public Map countByDay(String date);
	   
	   public Map countByMonth(String month);
	   
	   public Map countByYear(String year);
}
