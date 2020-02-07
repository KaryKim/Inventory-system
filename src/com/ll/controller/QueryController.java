/***********************************************************************
 * Module:  QueryController.java
 * Author:  CY
 * Purpose: Defines the Class QueryController
 ***********************************************************************/

package com.ll.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ll.service.QueryService;

@Controller
public class QueryController {
	@Autowired
	QueryService queryService;

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}

	@RequestMapping("search/queryByName.do")
	public String queryByName(HttpServletRequest request, ModelMap map) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String strName = request.getParameter("name");
		Map<String, List> recordMap = queryService.queryByName(strName);
		map.put("data", recordMap);
		return "byNameResult.jsp";

	}
	@RequestMapping("search/queryByzhonglei.do")
	public String queryzhonglei(HttpServletRequest request, ModelMap map) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String strZl = request.getParameter("zl");
		Map<String, List> recordMap = queryService.queryByzhonglei(strZl);
		map.put("data", recordMap);
		return "byzhongleiResult.jsp";

	}

	@RequestMapping("search/queryByDate.do")
	public String queryByDate(HttpServletRequest request, String date, ModelMap map) {
		String strDate = request.getParameter("date");
		Map<String, List> recordMap = queryService.queryByDate(strDate);
		map.put("data", recordMap);
		return "byDateResult.jsp";

	}

}