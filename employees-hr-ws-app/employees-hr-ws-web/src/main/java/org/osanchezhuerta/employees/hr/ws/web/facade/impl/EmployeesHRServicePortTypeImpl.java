package org.osanchezhuerta.employees.hr.ws.web.facade.impl;

import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderRequest;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderResponse;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.SalaryVO;
import org.osanchezhuerta.employees.hr.ws.web.facade.BajaEmployeeInput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRangoInput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRangoOutput;
import org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarTitlesPorEmpNoOutput;
import org.osanchezhuerta.employees.hr.ws.web.facade.DictamenElectronicoBdtuServiceException;
import org.osanchezhuerta.employees.hr.ws.web.facade.EmployeesHRServicePortType;
import org.osanchezhuerta.employees.hr.ws.web.facade.InsertarDepartmentInput;
import org.osanchezhuerta.hr.employees.soa.integration.api.RepositoryEmployeeIntegrator;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;
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
@WebService(serviceName = "hr-employees-ws", name = "EmployeesHRService", portName = "EmployeesHRServiceHttpSoap11Endpoint", 
endpointInterface = "org.osanchezhuerta.employees.hr.ws.web.facade.EmployeesHRServicePortType")
public class EmployeesHRServicePortTypeImpl implements EmployeesHRServicePortType {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesHRServicePortTypeImpl.class);
	
	
	@EJB(lookup = "repositoryEmployeeIntegrator", mappedName = "repositoryEmployeeIntegrator")
	private RepositoryEmployeeIntegrator repositoryEmployeeIntegrator;
	


	@Override
	public void bajaEmployee(GovernanceHeaderRequest governanceHeaderRequest, BajaEmployeeInput bajaEmployeeInput,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse, Holder<Integer> bajaEmployee)
			throws DictamenElectronicoBdtuServiceException {
		
		
		BigInteger empno = bajaEmployeeInput.getEmpNo();
		Integer iempno =empno.intValue();
		int resultado =repositoryEmployeeIntegrator.bajaEmployeePorNo(iempno);
		bajaEmployee = new Holder<Integer>();
		bajaEmployee.value =resultado;
		
	}

	@Override
	public void insertarDepartments(GovernanceHeaderRequest governanceHeaderRequest,
			InsertarDepartmentInput insertarDepartmentInput, Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<Integer> insertarDepartments) throws DictamenElectronicoBdtuServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarSalariesPorRango(GovernanceHeaderRequest governanceHeaderRequest,
			ConsultarSalariesPorRangoInput consultarSalariesPorRangoInput,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<ConsultarSalariesPorRangoOutput> consultarSalariesPorRangoOutput)
			throws DictamenElectronicoBdtuServiceException {
		List<BigInteger> lstEmpNo= consultarSalariesPorRangoInput.getLstEmpNo().getEmpNo();
		List<Integer> lstIEmpNo = new ArrayList<Integer>();
		for(BigInteger bi :lstEmpNo){
			lstIEmpNo.add(bi.intValue());
		}
		int pageNumber = consultarSalariesPorRangoInput.getPageNumber();
		int pageSize= consultarSalariesPorRangoInput.getPageSize();
		List<SalaryDTO> lstSalaryDTO= repositoryEmployeeIntegrator.consultarSalariesPorRango(lstIEmpNo, pageNumber, pageSize);
		List<SalaryVO> lstSalaryVO = new ArrayList<SalaryVO>(0);
		for(SalaryDTO salaryDTO:lstSalaryDTO){
			SalaryVO salaryVO = new SalaryVO();

			salaryVO.setEmpNo(new BigInteger(""+salaryDTO.getEmpNo()));
			
			lstSalaryVO.add(salaryVO);
		}
		consultarSalariesPorRangoOutput.value.getLstEmpNo().addAll(lstSalaryVO);
	}

	@Override
	public void consultarTitlesPorEmpNo(GovernanceHeaderRequest governanceHeaderRequest, BigInteger empNo,
			Holder<GovernanceHeaderResponse> governanceHeaderResponse,
			Holder<ConsultarTitlesPorEmpNoOutput> consultarTitlesPorEmpNoOutput)
			throws DictamenElectronicoBdtuServiceException {
		// TODO Auto-generated method stub
		
	}

	
	public RepositoryEmployeeIntegrator getRepositoryEmployeeIntegrator() {
		return repositoryEmployeeIntegrator;
	}

	public void setRepositoryEmployeeIntegrator(RepositoryEmployeeIntegrator repositoryEmployeeIntegrator) {
		this.repositoryEmployeeIntegrator = repositoryEmployeeIntegrator;
	}
	
}
