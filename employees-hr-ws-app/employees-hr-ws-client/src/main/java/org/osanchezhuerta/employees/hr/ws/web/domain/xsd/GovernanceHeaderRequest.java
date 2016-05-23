
package org.osanchezhuerta.employees.hr.ws.web.domain.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for governanceHeaderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="governanceHeaderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hrHeader" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}header" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "governanceHeaderRequest", propOrder = {
    "hrHeader"
})
public class GovernanceHeaderRequest {

    protected Header hrHeader;

    /**
     * Gets the value of the hrHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHrHeader() {
        return hrHeader;
    }

    /**
     * Sets the value of the hrHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHrHeader(Header value) {
        this.hrHeader = value;
    }

}
