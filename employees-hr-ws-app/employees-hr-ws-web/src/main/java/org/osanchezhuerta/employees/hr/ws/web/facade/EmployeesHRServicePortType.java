
package org.osanchezhuerta.employees.hr.ws.web.facade;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderRequest;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeesHRServicePortType", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
@XmlSeeAlso({
    org.osanchezhuerta.employees.hr.ws.web.domain.xsd.ObjectFactory.class,
    org.osanchezhuerta.employees.hr.ws.web.facade.ObjectFactory.class
})
public interface EmployeesHRServicePortType {


    /**
     * 
     * @param governanceHeaderResponse
     * @param governanceHeaderRequest
     * @param bajaEmployeeInput
     * @param bajaEmployee
     * @throws DictamenElectronicoBdtuServiceException
     */
    @WebMethod(action = "urn:bajaEmployee")
    @RequestWrapper(localName = "bajaEmployee", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.BajaEmployee")
    @ResponseWrapper(localName = "bajaEmployeeResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.BajaEmployeeResponse")
    public void bajaEmployee(
        @WebParam(name = "governanceHeaderRequest", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        GovernanceHeaderRequest governanceHeaderRequest,
        @WebParam(name = "bajaEmployeeInput", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        BajaEmployeeInput bajaEmployeeInput,
        @WebParam(name = "governanceHeaderResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<GovernanceHeaderResponse> governanceHeaderResponse,
        @WebParam(name = "bajaEmployee", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<Integer> bajaEmployee)
        throws DictamenElectronicoBdtuServiceException
    ;

    /**
     * 
     * @param governanceHeaderResponse
     * @param insertarDepartments
     * @param governanceHeaderRequest
     * @param insertarDepartmentInput
     * @throws DictamenElectronicoBdtuServiceException
     */
    @WebMethod(action = "urn:insertarDepartments")
    @RequestWrapper(localName = "insertarDepartments", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.InsertarDepartments")
    @ResponseWrapper(localName = "insertarDepartmentsResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.InsertarDepartmentsResponse")
    public void insertarDepartments(
        @WebParam(name = "governanceHeaderRequest", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        GovernanceHeaderRequest governanceHeaderRequest,
        @WebParam(name = "insertarDepartmentInput", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        InsertarDepartmentInput insertarDepartmentInput,
        @WebParam(name = "governanceHeaderResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<GovernanceHeaderResponse> governanceHeaderResponse,
        @WebParam(name = "insertarDepartments", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<Integer> insertarDepartments)
        throws DictamenElectronicoBdtuServiceException
    ;

    /**
     * 
     * @param governanceHeaderResponse
     * @param consultarSalariesPorRangoOutput
     * @param governanceHeaderRequest
     * @param consultarSalariesPorRangoInput
     * @throws DictamenElectronicoBdtuServiceException
     */
    @WebMethod(action = "urn:consultarSalariesPorRango")
    @RequestWrapper(localName = "consultarSalariesPorRango", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRango")
    @ResponseWrapper(localName = "consultarSalariesPorRangoResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarSalariesPorRangoResponse")
    public void consultarSalariesPorRango(
        @WebParam(name = "governanceHeaderRequest", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        GovernanceHeaderRequest governanceHeaderRequest,
        @WebParam(name = "consultarSalariesPorRangoInput", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        ConsultarSalariesPorRangoInput consultarSalariesPorRangoInput,
        @WebParam(name = "governanceHeaderResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<GovernanceHeaderResponse> governanceHeaderResponse,
        @WebParam(name = "consultarSalariesPorRangoOutput", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<ConsultarSalariesPorRangoOutput> consultarSalariesPorRangoOutput)
        throws DictamenElectronicoBdtuServiceException
    ;

    /**
     * 
     * @param governanceHeaderResponse
     * @param governanceHeaderRequest
     * @param empNo
     * @param consultarTitlesPorEmpNoOutput
     * @throws DictamenElectronicoBdtuServiceException
     */
    @WebMethod(action = "urn:consultarTitlesPorEmpNo")
    @RequestWrapper(localName = "consultarTitlesPorEmpNo", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarTitlesPorEmpNo")
    @ResponseWrapper(localName = "consultarTitlesPorEmpNoResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", className = "org.osanchezhuerta.employees.hr.ws.web.facade.ConsultarTitlesPorEmpNoResponse")
    public void consultarTitlesPorEmpNo(
        @WebParam(name = "governanceHeaderRequest", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        GovernanceHeaderRequest governanceHeaderRequest,
        @WebParam(name = "empNo", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
        BigInteger empNo,
        @WebParam(name = "governanceHeaderResponse", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<GovernanceHeaderResponse> governanceHeaderResponse,
        @WebParam(name = "consultarTitlesPorEmpNoOutput", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", mode = WebParam.Mode.OUT)
        Holder<ConsultarTitlesPorEmpNoOutput> consultarTitlesPorEmpNoOutput)
        throws DictamenElectronicoBdtuServiceException
    ;

}
