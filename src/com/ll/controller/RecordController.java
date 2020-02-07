/***********************************************************************
 * Module:  RecordController.java
 * Author:  CY
 * Purpose: Defines the Class RecordController
 ***********************************************************************/

package com.ll.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;
import com.ll.service.RecordService;

/** @pdOid 8d17ddc0-cce1-4e84-9ef1-f9487fb48442 */
@Controller
public class RecordController {
	@Autowired
	RecordService recordService;

	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	@RequestMapping("record/outStorage.do")
	public String outStorage(HttpServletRequest request, HttpServletResponse resp) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String strDate = request.getParameter("date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate;
		java.sql.Date sqlDate = null;
		try {
			utilDate = sdf.parse(strDate);
			sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// String时间转java.sql.Time
		String time = request.getParameter("time");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
		java.util.Date utilDate2;
		java.sql.Time sqlTime = null;
		try {
			utilDate2 = sdf2.parse(time);
			sqlTime = new java.sql.Time(utilDate2.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
String zl =request.getParameter("zl");
		         OutStorageMerchandise outStorageMerchandise = new OutStorageMerchandise(request.getParameter("name"),
				request.getParameter("manufacturer"), request.getParameter("model"),
				request.getParameter("specification"), Integer.parseInt(request.getParameter("quantity")), sqlDate,
				sqlTime, request.getParameter("tounit"), request.getParameter("zl"));
		boolean flag = recordService.outStorage(outStorageMerchandise);
		if (flag == true) {
			return "succeed.jsp";
		} else {
			return "fail.jsp";
		}

	}
	@RequestMapping("record/inStorage.do")
	public String inStorage(HttpServletRequest request, HttpServletResponse resp) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String strDate = request.getParameter("date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate;
		java.sql.Date sqlDate = null;
		try {
			utilDate = sdf.parse(strDate);
			sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// String时间转java.sql.Time
		String time = request.getParameter("time");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
		java.util.Date utilDate2;
		java.sql.Time sqlTime = null;
		try {
			utilDate2 = sdf2.parse(time);
			sqlTime = new java.sql.Time(utilDate2.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String zl =request.getParameter("zl");
		InStorageMerchandise inStorageMerchandise = new InStorageMerchandise(request.getParameter("name"),
				request.getParameter("manufacturer"), request.getParameter("model"),
				request.getParameter("specification"), Integer.parseInt(request.getParameter("quantity")), sqlDate,
				sqlTime, request.getParameter("fromunit"), request.getParameter("zl"));
		boolean flag = recordService.inStorage(inStorageMerchandise);
		if (flag == true) {
			return "succeed.jsp";
		} else {
			return "fail.jsp";
		}
	}

}