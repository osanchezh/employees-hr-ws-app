package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.osanchezhuerta.hr.employees.soa.model.Employee;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.EmployeesDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name  = "employeesDAO", mappedName = "employeesDAO")
public class EmployeesDAOImpl  extends AbstractBaseDAO<Employee> implements EmployeesDAO  {
	private final Logger LOGGER = LoggerFactory.getLogger(EmployeesDAOImpl.class);

	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;
	


	public EmployeesDAOImpl() {
		super(Employee.class);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Integer bajaEmployeePorNo(int empNo) {
		LOGGER.info("empNo="+empNo);
		Query updateQuery = entityManager.createQuery("UPDATE Employee n SET n.active=0 , n.updateDate=:updateDate  WHERE n.empNo=:empNo");
		updateQuery.setParameter("updateDate", new Date());
		updateQuery.setParameter("empNo", empNo);
		return updateQuery.executeUpdate();
	}
	
	
}
