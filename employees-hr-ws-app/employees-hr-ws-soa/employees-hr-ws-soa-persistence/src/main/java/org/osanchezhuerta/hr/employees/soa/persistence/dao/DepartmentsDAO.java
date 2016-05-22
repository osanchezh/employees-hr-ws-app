package org.osanchezhuerta.hr.employees.soa.persistence.dao;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.model.Department;

@Local
public interface DepartmentsDAO {
	int insertarDepartment(Department departamento);
}
