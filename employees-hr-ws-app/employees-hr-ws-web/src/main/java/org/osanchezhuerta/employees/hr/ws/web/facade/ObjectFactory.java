
package org.osanchezhuerta.employees.hr.ws.web.facade;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.osanchezhuerta.employees.hr.ws.web.facade package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExceptionError_QNAME = new QName("http://facade.web.ws.hr.employees.osanchezhuerta.org/", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.osanchezhuerta.employees.hr.ws.web.facade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link InsertarDepartments }
     * 
     */
    public InsertarDepartments createInsertarDepartments() {
        return new InsertarDepartments();
    }

    /**
     * Create an instance of {@link InsertarDepartmentInput }
     * 
     */
    public InsertarDepartmentInput createInsertarDepartmentInput() {
        return new InsertarDepartmentInput();
    }

    /**
     * Create an instance of {@link BajaEmployee }
     * 
     */
    public BajaEmployee createBajaEmployee() {
        return new BajaEmployee();
    }

    /**
     * Create an instance of {@link BajaEmployeeInput }
     * 
     */
    public BajaEmployeeInput createBajaEmployeeInput() {
        return new BajaEmployeeInput();
    }

    /**
     * Create an instance of {@link ConsultarTitlesPorEmpNo }
     * 
     */
    public ConsultarTitlesPorEmpNo createConsultarTitlesPorEmpNo() {
        return new ConsultarTitlesPorEmpNo();
    }

    /**
     * Create an instance of {@link InsertarDepartmentsResponse }
     * 
     */
    public InsertarDepartmentsResponse createInsertarDepartmentsResponse() {
        return new InsertarDepartmentsResponse();
    }

    /**
     * Create an instance of {@link BajaEmployeeResponse }
     * 
     */
    public BajaEmployeeResponse createBajaEmployeeResponse() {
        return new BajaEmployeeResponse();
    }

    /**
     * Create an instance of {@link ConsultarTitlesPorEmpNoResponse }
     * 
     */
    public ConsultarTitlesPorEmpNoResponse createConsultarTitlesPorEmpNoResponse() {
        return new ConsultarTitlesPorEmpNoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTitlesPorEmpNoOutput }
     * 
     */
    public ConsultarTitlesPorEmpNoOutput createConsultarTitlesPorEmpNoOutput() {
        return new ConsultarTitlesPorEmpNoOutput();
    }

    /**
     * Create an instance of {@link ConsultarSalariesPorRangoResponse }
     * 
     */
    public ConsultarSalariesPorRangoResponse createConsultarSalariesPorRangoResponse() {
        return new ConsultarSalariesPorRangoResponse();
    }

    /**
     * Create an instance of {@link ConsultarSalariesPorRangoOutput }
     * 
     */
    public ConsultarSalariesPorRangoOutput createConsultarSalariesPorRangoOutput() {
        return new ConsultarSalariesPorRangoOutput();
    }

    /**
     * Create an instance of {@link ConsultarSalariesPorRango }
     * 
     */
    public ConsultarSalariesPorRango createConsultarSalariesPorRango() {
        return new ConsultarSalariesPorRango();
    }

    /**
     * Create an instance of {@link ConsultarSalariesPorRangoInput }
     * 
     */
    public ConsultarSalariesPorRangoInput createConsultarSalariesPorRangoInput() {
        return new ConsultarSalariesPorRangoInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/", name = "error", scope = Exception.class)
    public JAXBElement<Object> createExceptionError(Object value) {
        return new JAXBElement<Object>(_ExceptionError_QNAME, Object.class, Exception.class, value);
    }

}
