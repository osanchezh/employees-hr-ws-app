package org.osanchezhuerta.hr.employees.soa.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.osanchezhuerta.hr.employees.soa.commons.to.SalaryTO;
import org.osanchezhuerta.hr.employees.soa.model.Salary;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.SalariesDAO;
import org.osanchezhuerta.hr.employees.soa.services.SalaryService;
import org.osanchezhuerta.hr.employees.soa.services.transformer.SalaryTransformer;

@Stateless(name  = "salaryService", mappedName = "salaryService")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SalaryServiceImpl implements SalaryService {

	@EJB
	private SalariesDAO salariesDAO;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<SalaryTO> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize) {
		List<SalaryTO> lstSalaryTO = new ArrayList<SalaryTO>(0);
		List<Salary> lstSalary = salariesDAO.consultarSalariesPorRango(lstEmpNo, pageNumber, pageSize);
		for(Salary salary:lstSalary){
			lstSalaryTO.add(SalaryTransformer.toTransferObject(salary));
		}
		return lstSalaryTO;
	}
	
	public SalariesDAO getSalariesDAO() {
		return salariesDAO;
	}

	public void setSalariesDAO(SalariesDAO salariesDAO) {
		this.salariesDAO = salariesDAO;
	}

}
