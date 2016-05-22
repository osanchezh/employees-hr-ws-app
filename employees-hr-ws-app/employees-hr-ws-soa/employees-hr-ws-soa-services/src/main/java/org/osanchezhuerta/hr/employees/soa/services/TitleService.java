package org.osanchezhuerta.hr.employees.soa.services;

import java.util.List;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.commons.to.TitleTO;

@Local
public interface TitleService {
	  List<TitleTO> obtenerTitlePorEmpNo(int empNo);
}
