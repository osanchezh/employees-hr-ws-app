package org.osanchezhuerta.hr.employees.soa.services;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.commons.to.DepartmentTO;

@Local
public interface DepartmentService {
	int insertarDepartment(DepartmentTO departamento);

}
