
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
 *         &lt;element name="consultarSalariesPorRangoOutput" type="{http://facade.web.ws.hr.employees.osanchezhuerta.org/}consultarSalariesPorRangoOutput"/>
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
    "consultarSalariesPorRangoOutput"
})
@XmlRootElement(name = "consultarSalariesPorRangoResponse")
public class ConsultarSalariesPorRangoResponse {

    @XmlElement(required = true)
    protected GovernanceHeaderResponse governanceHeaderResponse;
    @XmlElement(required = true, nillable = true)
    protected ConsultarSalariesPorRangoOutput consultarSalariesPorRangoOutput;

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
     * Gets the value of the consultarSalariesPorRangoOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarSalariesPorRangoOutput }
     *     
     */
    public ConsultarSalariesPorRangoOutput getConsultarSalariesPorRangoOutput() {
        return consultarSalariesPorRangoOutput;
    }

    /**
     * Sets the value of the consultarSalariesPorRangoOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarSalariesPorRangoOutput }
     *     
     */
    public void setConsultarSalariesPorRangoOutput(ConsultarSalariesPorRangoOutput value) {
        this.consultarSalariesPorRangoOutput = value;
    }

}
