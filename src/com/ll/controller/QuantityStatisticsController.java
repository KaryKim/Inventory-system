/***********************************************************************
 * Module:  QuantityStatisticsController.java
 * Author:  CY
 * Purpose: Defines the Class QuantityStatisticsController
 ***********************************************************************/

package com.ll.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ll.service.impl.QuantityStatisticsServiceImpl;
@Controller
public class QuantityStatisticsController {
	@Autowired
	QuantityStatisticsServiceImpl quantityStatisticsService;
	public void setQuantityStatisticsService(QuantityStatisticsServiceImpl quantityStatisticsService) {
		this.quantityStatisticsService = quantityStatisticsService;
	}
	@RequestMapping("count/countByDay.do")
   public String countByDay(HttpServletRequest request, String date, ModelMap map) {
		String strDate = request.getParameter("date");
		Map countResult = quantityStatisticsService.countByDay(strDate);
		map.put("countResult", countResult);
		return "byDayResult.jsp";
   }
	@RequestMapping("count/countByMonth.do")
   public String countByMonth(HttpServletRequest request, String month, ModelMap map) {
		String strMonth = request.getParameter("month");
		Map countResult = quantityStatisticsService.countByMonth(strMonth);
		map.put("countResult", countResult);
		return "byMonthResult.jsp";
   }
   
	@RequestMapping("count/countByYear.do")
   public String countByYear(HttpServletRequest request, String year, ModelMap map) {
		String strMonth = request.getParameter("year");
		Map countResult = quantityStatisticsService.countByYear(year);
		map.put("countResult", countResult);
		return "byYearResult.jsp";
   }

}