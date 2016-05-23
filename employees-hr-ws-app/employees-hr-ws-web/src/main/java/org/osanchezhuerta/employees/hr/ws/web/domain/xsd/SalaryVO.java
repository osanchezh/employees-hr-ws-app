
package org.osanchezhuerta.employees.hr.ws.web.domain.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalaryVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalaryVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="empNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryVO", propOrder = {
    "salary",
    "empNo",
    "fromDate",
    "toDate"
})
public class SalaryVO {

    protected int salary;
    protected int empNo;
    @XmlElementRef(name = "fromDate", namespace = "http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fromDate;
    @XmlElementRef(name = "toDate", namespace = "http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> toDate;

    /**
     * Gets the value of the salary property.
     * 
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(int value) {
        this.salary = value;
    }

    /**
     * Gets the value of the empNo property.
     * 
     */
    public int getEmpNo() {
        return empNo;
    }

    /**
     * Sets the value of the empNo property.
     * 
     */
    public void setEmpNo(int value) {
        this.empNo = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFromDate(JAXBElement<XMLGregorianCalendar> value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setToDate(JAXBElement<XMLGregorianCalendar> value) {
        this.toDate = value;
    }

}
