package org.osanchezhuerta.hr.employees.soa.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.osanchezhuerta.hr.employees.soa.commons.to.TitleTO;
import org.osanchezhuerta.hr.employees.soa.model.Title;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.TitlesDAO;
import org.osanchezhuerta.hr.employees.soa.services.TitleService;
import org.osanchezhuerta.hr.employees.soa.services.transformer.TitleTransformer;

@Stateless(name  = "titleService", mappedName = "titleService")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TitleServiceImpl implements TitleService {

	@EJB
	private TitlesDAO titlesDAO;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<TitleTO> obtenerTitlePorEmpNo(int empNo) {
		List<TitleTO> lstTitleTO = new ArrayList<TitleTO>(0);
		List<Title> lstTitle= titlesDAO.obtenerTitlePorEmpNo(empNo);
		for(Title title :lstTitle){
			TitleTO titleTO= TitleTransformer.toTransferObject(title);
			lstTitleTO.add(titleTO);
		}
		return lstTitleTO;
	}
	
	public TitlesDAO getTitlesDAO() {
		return titlesDAO;
	}

	public void setTitlesDAO(TitlesDAO titlesDAO) {
		this.titlesDAO = titlesDAO;
	}

}
