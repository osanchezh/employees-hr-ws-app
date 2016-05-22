package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.osanchezhuerta.hr.employees.soa.model.Department;
import org.osanchezhuerta.hr.employees.soa.model.Salary;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.DepartmentsDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.SalariesDAO;

@Stateless(name  = "salariesDAO", mappedName = "salariesDAO")
public class SalariesDAOImpl  extends AbstractBaseDAO<Salary> implements SalariesDAO{

	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;
	
	public SalariesDAOImpl() {
		super(Salary.class);
	}
	


	@Override
	public List<Salary> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
