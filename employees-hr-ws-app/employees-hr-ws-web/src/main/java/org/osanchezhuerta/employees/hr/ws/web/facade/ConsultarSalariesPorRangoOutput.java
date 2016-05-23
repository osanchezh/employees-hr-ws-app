
package org.osanchezhuerta.employees.hr.ws.web.facade;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.osanchezhuerta.employees.hr.ws.web.domain.xsd.SalaryVO;


/**
 * <p>Java class for consultarSalariesPorRangoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarSalariesPorRangoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstEmpNo" type="{http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/}SalaryVO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSalariesPorRangoOutput", propOrder = {
    "lstEmpNo"
})
public class ConsultarSalariesPorRangoOutput {

    @XmlElement(required = true)
    protected List<SalaryVO> lstEmpNo;

    /**
     * Gets the value of the lstEmpNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstEmpNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstEmpNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalaryVO }
     * 
     * 
     */
    public List<SalaryVO> getLstEmpNo() {
        if (lstEmpNo == null) {
            lstEmpNo = new ArrayList<SalaryVO>();
        }
        return this.lstEmpNo;
    }

}
