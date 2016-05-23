package org.osanchezhuerta.employees.hr.ws.web.facade.impl;

import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderRequest;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderResponse;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.ObjectFactory;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.SalaryVO;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.TitleVO;
import org.osanchezhuerta.employees.hr.ws.web.facade.BajaEmployeeInput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRangoInput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRangoOutput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarTitlesPorEmpNoOutput;
import org.osanchezhuerta.employees.hr.ws.web.facade.EmployeesHRServiceException;
import org.osanchezhuerta.employees.hr.ws.web.facade.EmployeesHRServicePortType;
import org.osanchezhuerta.employees.hr.ws.web.facade.InsertarDepartmentInput;
import org.osanchezhuerta.employees.hr.ws.web.util.DateUtils;
import org.osanchezhuerta.hr.employees.soa.integration.api.RepositoryEmployeeIntegrator;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.DepartmentDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.TitleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

@LocalBean
@Stateless(name = "EmployeesHRService", mappedName = "EmployeesHRService")
@WebService(serviceName = "employees-hr-ws-web", name = "EmployeesHRServiceHttpSoap11Endpoint", 
portName = "EmployeesHRServiceHttpSoap11Endpoint",  
endpointInterface = "org.osanchezhuerta.employees.hr.ws.web.facade.EmployeesHRServicePortType")
public class EmployeesHRServicePortTypeImpl implements EmployeesHRServicePortType {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesHRServicePortTypeImpl.class);
	
	
	@EJB(lookup = "repositoryEmployeeIntegrator", mappedName = "repositoryEmployeeIntegrator")
	private RepositoryEmployeeIntegrator repositoryEmployeeIntegrator;
	

	
	public RepositoryEmployeeIntegrator getRepositoryEmployeeIntegrator() {
		return repositoryEmployeeIntegrator;
	}

	public void setRepositoryEmployeeIntegrator(RepositoryEmployeeIntegrator repositoryEmployeeIntegrator) {
		this.repositoryEmployeeIntegrator = repositoryEmployeeIntegrator;
	}

	@Override
	public void bajaEmployee(GovernanceHeaderRequest governanceHeaderRequest, BajaEmployeeInput bajaEmployeeInput,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse, Holder<Integer> bajaEmployee)
			throws EmployeesHRServiceException {
		int empNo = bajaEmployeeInput.getEmpNo();
		int respuesta = repositoryEmployeeIntegrator.bajaEmployeePorNo(empNo);
		bajaEmployee.value= new Integer(respuesta);
	}

	@Override
	public void insertarDepartments(GovernanceHeaderRequest governanceHeaderRequest,
			InsertarDepartmentInput insertarDepartmentInput, Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<Integer> insertarDepartments) throws EmployeesHRServiceException {
		DepartmentDTO departmentDTO =new DepartmentDTO();
		departmentDTO.setDeptName(insertarDepartmentInput.getDeptName());
		departmentDTO.setDeptNo(insertarDepartmentInput.getDeptNo());
		int respuesta =repositoryEmployeeIntegrator.insertarDepartment(departmentDTO);
		insertarDepartments.value = new Integer(respuesta);
		
	}

	@Override
	public void consultarSalariesPorRango(GovernanceHeaderRequest governanceHeaderRequest,
			ConsultarSalariesPorRangoInput consultarSalariesPorRangoInput,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<ConsultarSalariesPorRangoOutput> consultarSalariesPorRangoOutput)
			throws EmployeesHRServiceException {
		

		List<Integer> lstEmpNo= consultarSalariesPorRangoInput.getLstEmpNo().getEmpNo();

		int pageNumber = consultarSalariesPorRangoInput.getPageNumber();
		int pageSize= consultarSalariesPorRangoInput.getPageSize();
		LOGGER.debug("pageNumber="+pageNumber);
		LOGGER.debug("pageSize="+pageSize);
		LOGGER.debug("lstIEmpNo="+lstEmpNo.toString());
		ObjectFactory objHR = new ObjectFactory();
		List<SalaryDTO> lstSalaryDTO= repositoryEmployeeIntegrator.consultarSalariesPorRango(lstEmpNo, pageNumber, pageSize);
		List<SalaryVO> lstSalaryVO = new ArrayList<SalaryVO>(0);
		for(SalaryDTO salaryDTO:lstSalaryDTO){
			SalaryVO salaryVO = new SalaryVO();

			salaryVO.setEmpNo(salaryDTO.getEmpNo());
			salaryVO.setSalary(salaryDTO.getSalary());
			DateUtils.convertirDateToXMLGregorianCalendar(salaryDTO.getToDate());
			salaryVO.setFromDate(objHR.createSalaryVOFromDate(DateUtils.convertirDateToXMLGregorianCalendar(salaryDTO.getFromDate())));
			salaryVO.setToDate(objHR.createSalaryVOToDate(DateUtils.convertirDateToXMLGregorianCalendar(salaryDTO.getToDate())));

			lstSalaryVO.add(salaryVO);
		}
		ConsultarSalariesPorRangoOutput consultarSalariesPorRangoOutput1 = new ConsultarSalariesPorRangoOutput();
		consultarSalariesPorRangoOutput1.getLstEmpNo().addAll(lstSalaryVO);
		consultarSalariesPorRangoOutput.value = consultarSalariesPorRangoOutput1;
		
	}

	@Override
	public void consultarTitlesPorEmpNo(GovernanceHeaderRequest governanceHeaderRequest, int empNo,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<ConsultarTitlesPorEmpNoOutput> consultarTitlesPorEmpNoOutput) throws EmployeesHRServiceException {
		ObjectFactory objHR = new ObjectFactory();
		List<TitleDTO> lstTitleDTO= repositoryEmployeeIntegrator.obtenerTitlePorEmpNo(empNo);
		List<TitleVO> lstTitleVO = new ArrayList<TitleVO>(0);
		for(TitleDTO titleDTO:lstTitleDTO){
			TitleVO titleVO = new TitleVO();
			titleVO.setEmpNo(titleDTO.getEmpNo());
			titleVO.setFromDate(objHR.createTitleVOFromDate(DateUtils.convertirDateToXMLGregorianCalendar(titleDTO.getFromDate())));
			titleVO.setTitle(titleDTO.getTitle());
			lstTitleVO.add(titleVO);
		}
		
		ConsultarTitlesPorEmpNoOutput consultarTitlesPorEmpNo = new ConsultarTitlesPorEmpNoOutput();
		consultarTitlesPorEmpNo.getLstTitle().addAll(lstTitleVO);
		consultarTitlesPorEmpNoOutput.value=consultarTitlesPorEmpNo;
		
	}
	
}
