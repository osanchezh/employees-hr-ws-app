package org.osanchezhuerta.hr.employees.soa.persistence.dao;

import javax.ejb.Local;

@Local
public interface EmployeesDAO {
	Integer bajaEmployeePorNo(int empNo);
	
}
