
package org.osanchezhuerta.employees.hr.ws.web.domain.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.osanchezhuerta.employees.hr.ws.web.domain.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TitleVOFromDate_QNAME = new QName("http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", "fromDate");
    private final static QName _SalaryVOToDate_QNAME = new QName("http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", "toDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.osanchezhuerta.employees.hr.ws.web.domain.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GovernanceHeaderRequest }
     * 
     */
    public GovernanceHeaderRequest createGovernanceHeaderRequest() {
        return new GovernanceHeaderRequest();
    }

    /**
     * Create an instance of {@link GovernanceHeaderResponse }
     * 
     */
    public GovernanceHeaderResponse createGovernanceHeaderResponse() {
        return new GovernanceHeaderResponse();
    }

    /**
     * Create an instance of {@link ConsultarSalariesPorRango }
     * 
     */
    public ConsultarSalariesPorRango createConsultarSalariesPorRango() {
        return new ConsultarSalariesPorRango();
    }

    /**
     * Create an instance of {@link TitleVO }
     * 
     */
    public TitleVO createTitleVO() {
        return new TitleVO();
    }

    /**
     * Create an instance of {@link SalaryVO }
     * 
     */
    public SalaryVO createSalaryVO() {
        return new SalaryVO();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link HeaderResponse }
     * 
     */
    public HeaderResponse createHeaderResponse() {
        return new HeaderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", name = "fromDate", scope = TitleVO.class)
    public JAXBElement<XMLGregorianCalendar> createTitleVOFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TitleVOFromDate_QNAME, XMLGregorianCalendar.class, TitleVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", name = "fromDate", scope = SalaryVO.class)
    public JAXBElement<XMLGregorianCalendar> createSalaryVOFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TitleVOFromDate_QNAME, XMLGregorianCalendar.class, SalaryVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.web.ws.hr.employees.osanchezhuerta.org/xsd/", name = "toDate", scope = SalaryVO.class)
    public JAXBElement<XMLGregorianCalendar> createSalaryVOToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalaryVOToDate_QNAME, XMLGregorianCalendar.class, SalaryVO.class, value);
    }

}
