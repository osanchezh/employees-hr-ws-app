package org.osanchezhuerta.hr.employees.soa.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.osanchezhuerta.hr.employees.soa.commons.to.SalaryTO;
import org.osanchezhuerta.hr.employees.soa.commons.to.TitleTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.RepositoryEmployeeIntegrator;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.DepartmentDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.TitleDTO;
import org.osanchezhuerta.hr.employees.soa.integration.transformer.DeparmentTransformer;
import org.osanchezhuerta.hr.employees.soa.integration.transformer.SalaryTransformer;
import org.osanchezhuerta.hr.employees.soa.integration.transformer.TitleTransformer;
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
		return departmentService.insertarDepartment(DeparmentTransformer.toDataTransferObject(departmentDTO));
		
	}

	@Override
	public int bajaEmployeePorNo(int empNo) {
		return employeeService.bajaEmployeePorNo(empNo);
	}

	@Override
	public List<SalaryDTO> consultarSalariesPorRango(List<Integer> lstEmpNo, int pageNumber, int pageSize) {
		List<SalaryDTO> lstSalaryDTO = new ArrayList<SalaryDTO>(0);
		List<SalaryTO> lstSalaryTO = salaryService.consultarSalariesPorRango(lstEmpNo, pageNumber, pageSize);
		for(SalaryTO salaryTO:lstSalaryTO){
			lstSalaryDTO.add(SalaryTransformer.toDataTransferObject(salaryTO));
		}
		return lstSalaryDTO;
	}

	@Override
	public List<TitleDTO> obtenerTitlePorEmpNo(int empNo) {
		List<TitleDTO>  lstTitleDTO = new  ArrayList<TitleDTO>(0);
		List<TitleTO> lstTitleTO= titleService.obtenerTitlePorEmpNo(empNo);
		for(TitleTO titleTO:lstTitleTO){
			lstTitleDTO.add(TitleTransformer.toDataTransferObject(titleTO));
		}
		return lstTitleDTO;
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
