package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.osanchezhuerta.hr.employees.soa.model.Department;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.DepartmentsDAO;

@Stateless(name  = "departmentsDAO", mappedName = "departmentsDAO")
public class DepartmentsDAOImpl extends AbstractBaseDAO<Department> implements DepartmentsDAO{


	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;
	
	public DepartmentsDAOImpl() {
		super(Department.class);
	}
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}



	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
