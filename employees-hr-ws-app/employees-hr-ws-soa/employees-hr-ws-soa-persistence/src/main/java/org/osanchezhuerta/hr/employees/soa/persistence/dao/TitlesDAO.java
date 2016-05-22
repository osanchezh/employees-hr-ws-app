package org.osanchezhuerta.hr.employees.soa.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import org.osanchezhuerta.hr.employees.soa.model.Title;

@Local
public interface TitlesDAO {
  List<Title> obtenerTitlePorEmpNo(int empNo);
}
