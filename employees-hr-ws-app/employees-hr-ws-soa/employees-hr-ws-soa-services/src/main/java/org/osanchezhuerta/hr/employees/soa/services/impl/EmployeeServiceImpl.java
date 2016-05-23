package org.osanchezhuerta.hr.employees.soa.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.osanchezhuerta.hr.employees.soa.persistence.dao.EmployeesDAO;
import org.osanchezhuerta.hr.employees.soa.services.EmployeeService;

@Stateless(name  = "employeeService", mappedName = "employeeService")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EmployeeServiceImpl implements EmployeeService {

	@EJB
	private EmployeesDAO employeesDAO;

	@Override
	public int bajaEmployeePorNo(int empNo) {
		return employeesDAO.bajaEmployeePorNo(empNo);
	}
	
	public EmployeesDAO getEmployeesDAO() {
		return employeesDAO;
	}

	public void setEmployeesDAO(EmployeesDAO employeesDAO) {
		this.employeesDAO = employeesDAO;
	}


}
