
package org.osanchezhuerta.employees.hr.ws.web.domain.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for governanceHeaderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="governanceHeaderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hrHeaderResponse" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}headerResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "governanceHeaderResponse", propOrder = {
    "hrHeaderResponse"
})
public class GovernanceHeaderResponse {

    @XmlElement(required = true)
    protected HeaderResponse hrHeaderResponse;

    /**
     * Gets the value of the hrHeaderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponse }
     *     
     */
    public HeaderResponse getHrHeaderResponse() {
        return hrHeaderResponse;
    }

    /**
     * Sets the value of the hrHeaderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponse }
     *     
     */
    public void setHrHeaderResponse(HeaderResponse value) {
        this.hrHeaderResponse = value;
    }

}
