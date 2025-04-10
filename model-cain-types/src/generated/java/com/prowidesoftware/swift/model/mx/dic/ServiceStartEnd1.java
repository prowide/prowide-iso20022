
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Start or end of service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStartEnd1", propOrder = {
    "lctn",
    "lctnCd",
    "adr",
    "ctct",
    "dtAndTm",
    "tmSgmt",
    "jrnyInf"
})
public class ServiceStartEnd1 {

    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "LctnCd")
    protected String lctnCd;
    @XmlElement(name = "Adr")
    protected Address1 adr;
    @XmlElement(name = "Ctct")
    protected Contact2 ctct;
    @XmlElement(name = "DtAndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;
    @XmlElement(name = "TmSgmt")
    @XmlSchemaType(name = "string")
    protected TimeSegment1Code tmSgmt;
    @XmlElement(name = "JrnyInf")
    protected JourneyInformation1 jrnyInf;

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceStartEnd1 setLctn(String value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceStartEnd1 setLctnCd(String value) {
        this.lctnCd = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public ServiceStartEnd1 setAdr(Address1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact2 }
     *     
     */
    public Contact2 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact2 }
     *     
     */
    public ServiceStartEnd1 setCtct(Contact2 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceStartEnd1 setDtAndTm(XMLGregorianCalendar value) {
        this.dtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the tmSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSegment1Code }
     *     
     */
    public TimeSegment1Code getTmSgmt() {
        return tmSgmt;
    }

    /**
     * Sets the value of the tmSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSegment1Code }
     *     
     */
    public ServiceStartEnd1 setTmSgmt(TimeSegment1Code value) {
        this.tmSgmt = value;
        return this;
    }

    /**
     * Gets the value of the jrnyInf property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInformation1 }
     *     
     */
    public JourneyInformation1 getJrnyInf() {
        return jrnyInf;
    }

    /**
     * Sets the value of the jrnyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInformation1 }
     *     
     */
    public ServiceStartEnd1 setJrnyInf(JourneyInformation1 value) {
        this.jrnyInf = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
