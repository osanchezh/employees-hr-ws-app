
package org.osanchezhuerta.employees.hr.ws.web.facade;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://facade.web.ws.hr.employees.osanchezhuerta.org/")
public class DictamenElectronicoBdtuServiceException
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private org.osanchezhuerta.employees.hr.ws.web.facade.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DictamenElectronicoBdtuServiceException(String message, org.osanchezhuerta.employees.hr.ws.web.facade.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DictamenElectronicoBdtuServiceException(String message, org.osanchezhuerta.employees.hr.ws.web.facade.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.osanchezhuerta.employees.hr.ws.web.facade.Exception
     */
    public org.osanchezhuerta.employees.hr.ws.web.facade.Exception getFaultInfo() {
        return faultInfo;
    }

}