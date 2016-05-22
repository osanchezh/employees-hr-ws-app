package org.osanchezhuerta.hr.employees.soa.commons.to;

import java.io.Serializable;
import java.util.Date;

public class SalaryTO implements Serializable {
	
	private static final long serialVersionUID = -721030528741537944L;
	
	private int salary;
	private int empNo;
	private Date fromDate;
	private Date toDate;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	@Override
	public String toString() {
		return "SalaryDTO [salary=" + salary + ", empNo=" + empNo + ", "
				+ (fromDate != null ? "fromDate=" + fromDate + ", " : "") + (toDate != null ? "toDate=" + toDate : "")
				+ "]";
	}


}
