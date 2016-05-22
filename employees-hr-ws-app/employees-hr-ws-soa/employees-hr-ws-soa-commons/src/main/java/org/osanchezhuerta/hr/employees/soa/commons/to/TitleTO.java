package org.osanchezhuerta.hr.employees.soa.commons.to;

import java.io.Serializable;

public class TitleTO implements Serializable {


	private static final long serialVersionUID = -7113476093433003959L;
	
	private int empNo;
	private String title;
	private java.util.Date fromDate;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public java.util.Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	
	@Override
	public String toString() {
		return "TitleDTO [empNo=" + empNo + ", " + (title != null ? "title=" + title + ", " : "")
				+ (fromDate != null ? "fromDate=" + fromDate : "") + "]";
	}

	
}
