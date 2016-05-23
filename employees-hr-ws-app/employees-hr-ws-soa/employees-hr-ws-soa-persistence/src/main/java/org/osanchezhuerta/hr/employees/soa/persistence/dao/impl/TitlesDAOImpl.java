package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.osanchezhuerta.hr.employees.soa.model.Title;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.TitlesDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Stateless(name  = "titlesDAO", mappedName = "titlesDAO")
public class TitlesDAOImpl  extends AbstractBaseDAO<Title> implements TitlesDAO{
	private static final Logger LOGGER = LoggerFactory.getLogger(TitlesDAOImpl.class);

	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;
	
	public TitlesDAOImpl() {
		super(Title.class);
	}
	@Override
	public List<Title> obtenerTitlePorEmpNo(int empNo) {
		List<Title> rst = new ArrayList<Title>(0);

		Query query = null;
		query = entityManager.createQuery(
				"SELECT n from Title n where n.id.empNo = :empNo order by n.toDate desc");
		query.setParameter("empNo", empNo);
		try {
			rst.addAll(query.getResultList());

		} catch (NoResultException noResultException) {
			LOGGER.error("No hay titles con empNo=" + empNo);

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
