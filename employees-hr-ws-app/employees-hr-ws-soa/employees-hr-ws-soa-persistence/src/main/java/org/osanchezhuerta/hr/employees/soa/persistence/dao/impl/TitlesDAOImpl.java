package org.osanchezhuerta.hr.employees.soa.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.osanchezhuerta.hr.employees.soa.model.Title;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.AbstractBaseDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.TitlesDAO;


@Stateless(name  = "titlesDAO", mappedName = "titlesDAO")
public class TitlesDAOImpl  extends AbstractBaseDAO<Title> implements TitlesDAO{

	@PersistenceContext(unitName = "EmployeesHRPU")
	private EntityManager entityManager;
	
	public TitlesDAOImpl() {
		super(Title.class);
	}
	@Override
	public List<Title> obtenerTitlePorEmpNo(int empNo) {

		return null;
	}
	

	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
