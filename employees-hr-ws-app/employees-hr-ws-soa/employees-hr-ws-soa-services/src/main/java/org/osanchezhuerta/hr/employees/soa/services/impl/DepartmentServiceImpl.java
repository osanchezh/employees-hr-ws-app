package org.osanchezhuerta.hr.employees.soa.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.osanchezhuerta.hr.employees.soa.commons.to.DepartmentTO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.DepartmentsDAO;
import org.osanchezhuerta.hr.employees.soa.services.DepartmentService;
<<<<<<< HEAD
import org.osanchezhuerta.hr.employees.soa.services.transformer.DeparmentTransformer;

@Stateless(name  = "departmentService", mappedName = "departmentService")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DepartmentServiceImpl implements DepartmentService {
	
    @EJB
	private DepartmentsDAO departmentsDAO;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public int insertarDepartment(DepartmentTO departmentTO) {
		return departmentsDAO.insertarDepartment(DeparmentTransformer.toEntity(departmentTO));
=======
import org.osanchezhuerta.hr.employees.soa.services.transformer.DepartmentTransformer;

@Stateless(name  = "departmentService", mappedName = "departmentService")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DepartmentServiceImpl implements DepartmentService {
	
    @EJB
	private DepartmentsDAO departmentsDAO;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public int insertarDepartment(DepartmentTO departmentTO) {
		return departmentsDAO.insertarDepartment(DepartmentTransformer.toEntity(departmentTO));
>>>>>>> branch 'master' of https://github.com/osanchezhuerta/employees-hr-ws-app.git
	
	}

	public DepartmentsDAO getDepartmentsDAO() {
		return departmentsDAO;
	}

	public void setDepartmentsDAO(DepartmentsDAO departmentsDAO) {
		this.departmentsDAO = departmentsDAO;
	}
}
