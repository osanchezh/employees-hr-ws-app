package org.osanchezhuerta.hr.employees.soa.persistence.dao;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.model.Department;

@Local
public interface DepartmentsDAO {	
	
	void create(Department department);

	void edit(Department department);
	
	void flush();
	
}
