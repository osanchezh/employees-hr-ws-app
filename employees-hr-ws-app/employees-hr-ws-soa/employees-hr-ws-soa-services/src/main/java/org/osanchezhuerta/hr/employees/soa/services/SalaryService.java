package org.osanchezhuerta.hr.employees.soa.services;

import java.util.List;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.commons.to.SalaryTO;

@Local
public interface SalaryService {
	  List<SalaryTO> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize);

}
