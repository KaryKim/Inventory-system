package com.ll.service;

import java.util.List;
import java.util.Map;

public interface QueryService {
	  
	   public Map<String,List> queryByName(String merchandiseName) ;

	   public Map<String,List> queryByzhonglei(String zl) ;
	   public Map<String,List> queryByDate(String date) ;

}
