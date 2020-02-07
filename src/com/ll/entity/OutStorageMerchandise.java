/***********************************************************************
 * Module:  OutStorageMerchandise.java
 * Author:  CY
 * Purpose: Defines the Class OutStorageMerchandise
 ***********************************************************************/

package com.ll.entity;

import java.sql.Date;
import java.sql.Time;

public class OutStorageMerchandise {
	private Integer id;
	private String name;
	private String manufacturer;
	private String model;

	private String specification;
	private int quantity;
	private java.sql.Date date;
	private java.sql.Time time;
	private String tounit;
	private String zl;

	public OutStorageMerchandise() {
		super();
	}

	public OutStorageMerchandise(String name, String manufacturer, String model, String specification, int quantity,
			Date date, Time time, String tounit, String zl) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.model = model;
		this.specification = specification;
		this.quantity = quantity;
		this.date = date;
		this.time = time;
		this.tounit = tounit;
		this.zl = zl;
	}

	public OutStorageMerchandise(Integer id, String name, String manufacturer, String model, String specification,
			int quantity, Date date, Time time, String tounit, String zl) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.model = model;
		this.specification = specification;
		this.quantity = quantity;
		this.date = date;
		this.time = time;
		this.tounit = tounit;
		this.zl = zl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public java.sql.Time getTime() {
		return time;
	}

	public void setTime(java.sql.Time time) {
		this.time = time;
	}

	public String getTounit() {
		return tounit;
	}

	public void setTounit(String tounit) {
		this.tounit = tounit;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

}