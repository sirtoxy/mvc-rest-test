package com.ia.trafficanalyser.struts.actions;

import java.util.Date;

public class DateValuePair {
	
	private Date date;
	private float value;

	public DateValuePair(Date date, float value) {
		super();
		this.date = date;
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public int getDateYear() {
		return date.getYear();
	}

	public int getDateMonth() {
		return date.getMonth();
	}

	public int getDateDay() {
		return date.getDay();
	}

	public int getDateHour() {
		return date.getHours();
	}

	public int getDateMinutes() {
		return date.getMinutes();
	}

	public int getDateSeconds() {
		return date.getSeconds();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}
