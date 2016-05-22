package org.osanchezhuerta.hr.employees.soa.services;

import javax.ejb.Local;

@Local
public interface EmployeeService {
	int bajaEmployeePorNo(int empNo);
}
