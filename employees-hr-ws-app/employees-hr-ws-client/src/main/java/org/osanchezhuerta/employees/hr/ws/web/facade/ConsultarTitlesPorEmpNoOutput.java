
package org.osanchezhuerta.employees.hr.ws.web.facade;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.TitleVO;


/**
 * <p>Java class for consultarTitlesPorEmpNoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarTitlesPorEmpNoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstTitle" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}TitleVO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarTitlesPorEmpNoOutput", propOrder = {
    "lstTitle"
})
public class ConsultarTitlesPorEmpNoOutput {

    @XmlElement(required = true)
    protected List<TitleVO> lstTitle;

    /**
     * Gets the value of the lstTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleVO }
     * 
     * 
     */
    public List<TitleVO> getLstTitle() {
        if (lstTitle == null) {
            lstTitle = new ArrayList<TitleVO>();
        }
        return this.lstTitle;
    }

}
