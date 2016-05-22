
package org.osanchezhuerta.employees.hr.ws.web.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.GovernanceHeaderRequest;


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
 *         &lt;element name="governanceHeaderRequest" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}governanceHeaderRequest"/>
 *         &lt;element name="bajaEmployeeInput" type="{http://facade.web.ws.hr.employees.osanchezhuerta.org/}bajaEmployeeInput"/>
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
    "governanceHeaderRequest",
    "bajaEmployeeInput"
})
@XmlRootElement(name = "bajaEmployee")
public class BajaEmployee {

    @XmlElement(required = true)
    protected GovernanceHeaderRequest governanceHeaderRequest;
    @XmlElement(required = true)
    protected BajaEmployeeInput bajaEmployeeInput;

    /**
     * Gets the value of the governanceHeaderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceHeaderRequest }
     *     
     */
    public GovernanceHeaderRequest getGovernanceHeaderRequest() {
        return governanceHeaderRequest;
    }

    /**
     * Sets the value of the governanceHeaderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceHeaderRequest }
     *     
     */
    public void setGovernanceHeaderRequest(GovernanceHeaderRequest value) {
        this.governanceHeaderRequest = value;
    }

    /**
     * Gets the value of the bajaEmployeeInput property.
     * 
     * @return
     *     possible object is
     *     {@link BajaEmployeeInput }
     *     
     */
    public BajaEmployeeInput getBajaEmployeeInput() {
        return bajaEmployeeInput;
    }

    /**
     * Sets the value of the bajaEmployeeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link BajaEmployeeInput }
     *     
     */
    public void setBajaEmployeeInput(BajaEmployeeInput value) {
        this.bajaEmployeeInput = value;
    }

}
