
package org.osanchezhuerta.employees.hr.ws.web.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governanceHeaderResponse" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}governanceHeaderResponse"/>
 *         &lt;element name="consultarTitlesPorEmpNoOutput" type="{http://facade.web.ws.hr.employees.osanchezhuerta.org/}consultarTitlesPorEmpNoOutput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "governanceHeaderResponse",
    "consultarTitlesPorEmpNoOutput"
})
@XmlRootElement(name = "consultarTitlesPorEmpNoResponse")
public class ConsultarTitlesPorEmpNoResponse {

    @XmlElement(required = true)
    protected GovernanceHeaderResponse governanceHeaderResponse;
    @XmlElement(required = true)
    protected ConsultarTitlesPorEmpNoOutput consultarTitlesPorEmpNoOutput;

    /**
     * Gets the value of the governanceHeaderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceHeaderResponse }
     *     
     */
    public GovernanceHeaderResponse getGovernanceHeaderResponse() {
        return governanceHeaderResponse;
    }

    /**
     * Sets the value of the governanceHeaderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceHeaderResponse }
     *     
     */
    public void setGovernanceHeaderResponse(GovernanceHeaderResponse value) {
        this.governanceHeaderResponse = value;
    }

    /**
     * Gets the value of the consultarTitlesPorEmpNoOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarTitlesPorEmpNoOutput }
     *     
     */
    public ConsultarTitlesPorEmpNoOutput getConsultarTitlesPorEmpNoOutput() {
        return consultarTitlesPorEmpNoOutput;
    }

    /**
     * Sets the value of the consultarTitlesPorEmpNoOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarTitlesPorEmpNoOutput }
     *     
     */
    public void setConsultarTitlesPorEmpNoOutput(ConsultarTitlesPorEmpNoOutput value) {
        this.consultarTitlesPorEmpNoOutput = value;
    }

}
