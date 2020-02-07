/***********************************************************************
 * Module:  InStorageMerchandise.java
 * Author:  CY
 * Purpose: Defines the Class InStorageMerchandise
 ***********************************************************************/

package com.ll.entity;

import java.sql.Date;
import java.sql.Time;

/** @pdOid 1acf0da2-00b6-4083-a7f5-87244a384c3f */
public class InStorageMerchandise {
	private Integer id;
  
   private String name;
   private String manufacturer;
   private String model;
   private String specification;
   private int quantity;
   private java.sql.Date date;
   private java.sql.Time time;
   private String fromunit;
   private String zl;
   
   
   public InStorageMerchandise() {
	super();
}





	public InStorageMerchandise(String name, String manufacturer, String model, String specification, int quantity,
		Date date, Time time, String fromunit, String zl) {
	super();
	this.name = name;
	this.manufacturer = manufacturer;
	this.model = model;
	this.specification = specification;
	this.quantity = quantity;
	this.date = date;
	this.time = time;
	this.fromunit = fromunit;
	this.zl = zl;
}





	public InStorageMerchandise(Integer id, String name, String manufacturer, String model, String specification,
		int quantity, Date date, Time time, String fromunit, String zl) {
	super();
	this.id = id;
	this.name = name;
	this.manufacturer = manufacturer;
	this.model = model;
	this.specification = specification;
	this.quantity = quantity;
	this.date = date;
	this.time = time;
	this.fromunit = fromunit;
	this.zl = zl;
}





	public String getFromunit() {
	return fromunit;
}





public void setFromunit(String fromunit) {
	this.fromunit = fromunit;
}





public String getZl() {
	return zl;
}





public void setZl(String zl) {
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

}