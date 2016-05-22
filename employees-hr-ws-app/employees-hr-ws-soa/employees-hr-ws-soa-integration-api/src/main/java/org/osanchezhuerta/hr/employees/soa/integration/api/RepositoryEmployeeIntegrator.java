package org.osanchezhuerta.hr.employees.soa.integration.api;

import java.util.List;

import org.osanchezhuerta.hr.employees.soa.integration.api.dto.DepartmentDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.TitleDTO;

public interface RepositoryEmployeeIntegrator {
	
	int insertarDepartment(DepartmentDTO departmentDTO);
	int bajaEmployeePorNo(int empNo);
	List<SalaryDTO> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize);
	List<TitleDTO> obtenerTitlePorEmpNo(int empNo);

}
