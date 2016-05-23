
package org.osanchezhuerta.employees.hr.ws.web.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.ConsultarSalariesPorRango;


/**
 * <p>Java class for consultarSalariesPorRangoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarSalariesPorRangoInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstEmpNo" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}ConsultarSalariesPorRango"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSalariesPorRangoInput", propOrder = {
    "lstEmpNo",
    "pageNumber",
    "pageSize"
})
public class ConsultarSalariesPorRangoInput {

    @XmlElement(required = true)
    protected ConsultarSalariesPorRango lstEmpNo;
    protected int pageNumber;
    protected int pageSize;

    /**
     * Gets the value of the lstEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarSalariesPorRango }
     *     
     */
    public ConsultarSalariesPorRango getLstEmpNo() {
        return lstEmpNo;
    }

    /**
     * Sets the value of the lstEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarSalariesPorRango }
     *     
     */
    public void setLstEmpNo(ConsultarSalariesPorRango value) {
        this.lstEmpNo = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
