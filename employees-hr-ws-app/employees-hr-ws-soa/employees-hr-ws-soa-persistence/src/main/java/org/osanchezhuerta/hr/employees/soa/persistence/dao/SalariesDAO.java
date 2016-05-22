package org.osanchezhuerta.hr.employees.soa.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.model.Salary;

@Local
public interface SalariesDAO {
  List<Salary> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize);
}
