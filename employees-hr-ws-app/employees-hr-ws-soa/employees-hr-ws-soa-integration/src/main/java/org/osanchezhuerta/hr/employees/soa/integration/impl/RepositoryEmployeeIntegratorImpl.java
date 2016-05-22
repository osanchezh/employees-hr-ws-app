package org.osanchezhuerta.hr.employees.soa.integration.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.osanchezhuerta.hr.employees.soa.integration.api.RepositoryEmployeeIntegrator;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.DepartmentDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.TitleDTO;
import org.osanchezhuerta.hr.employees.soa.services.DepartmentService;
import org.osanchezhuerta.hr.employees.soa.services.EmployeeService;
import org.osanchezhuerta.hr.employees.soa.services.SalaryService;
import org.osanchezhuerta.hr.employees.soa.services.TitleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "repositoryEmployeeIntegrator", mappedName = "repositoryEmployeeIntegrator")
@Remote({RepositoryEmployeeIntegrator.class})
public class RepositoryEmployeeIntegratorImpl implements RepositoryEmployeeIntegrator {

	private final static Logger LOGGER = LoggerFactory.getLogger(RepositoryEmployeeIntegratorImpl.class);
	
	
	@EJB(name = "departmentService", mappedName = "departmentService")
	private DepartmentService departmentService;
	
	@EJB(name = "employeeService", mappedName = "employeeService")
	private EmployeeService employeeService;

	@EJB(name = "salaryService", mappedName = "salaryService")
	private SalaryService salaryService;
	
	@EJB(name = "titleService", mappedName = "titleService")
	private TitleService titleService;

	@Override
	public int insertarDepartment(DepartmentDTO departmentDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bajaEmployeePorNo(int empNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SalaryDTO> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TitleDTO> obtenerTitlePorEmpNo(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public SalaryService getSalaryService() {
		return salaryService;
	}

	public void setSalaryService(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public TitleService getTitleService() {
		return titleService;
	}

	public void setTitleService(TitleService titleService) {
		this.titleService = titleService;
	}


}
