package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;
import org.osanchezhuerta.hr.employees.soa.model.Salary;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.SalariesDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "salariesDAO", mappedName = "salariesDAO")
public class SalariesDAOImpl extends AbstractBaseDAO<Salary> implements SalariesDAO {
	private static final Logger LOGGER = LoggerFactory.getLogger(SalariesDAOImpl.class);

	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;

	public SalariesDAOImpl() {
		super(Salary.class);
	}

	@Override
	public List<Salary> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize) {

		List<Salary> rst = new ArrayList<Salary>(0);
		Query query = null;
		query = entityManager.createQuery(
				"SELECT n from Salary n where n.id.empNo  in :lstEmpNo order by n.toDate desc");
		query.setParameter("lstEmpNo", lstEmpNo);

		query.setFirstResult((pageNumber - 1) * pageSize);
		query.setMaxResults(pageSize);

		try {
			rst.addAll(query.getResultList());

		} catch (NoResultException noResultException) {
			LOGGER.error("No hay salaries con lstEmpNo=" + StringUtils.join(lstEmpNo,","));

		}
		return rst;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
