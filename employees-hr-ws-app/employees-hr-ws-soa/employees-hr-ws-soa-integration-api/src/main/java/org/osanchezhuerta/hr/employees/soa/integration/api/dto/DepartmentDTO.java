package org.osanchezhuerta.hr.employees.soa.integration.api.dto;

import java.io.Serializable;

public class DepartmentDTO implements Serializable {

	private static final long serialVersionUID = 5708344973301806755L;
	
	private String deptNo;
	private String deptName;
	
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
}
