
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
@XmlType(name = "ServiceStartEnd3", propOrder = {
    "lctn",
    "lctnCd",
    "adr",
    "ctct",
    "dtAndTm",
    "tmSgmt",
    "jrnyTp",
    "jrnyData",
    "jrnyDtAndTm"
})
public class ServiceStartEnd3 {

    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "LctnCd")
    protected String lctnCd;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Ctct")
    protected ContactBusiness1 ctct;
    @XmlElement(name = "DtAndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;
    @XmlElement(name = "TmSgmt")
    @XmlSchemaType(name = "string")
    protected TimeSegment1Code tmSgmt;
    @XmlElement(name = "JrnyTp")
    @XmlSchemaType(name = "string")
    protected JourneyType1Code jrnyTp;
    @XmlElement(name = "JrnyData")
    protected String jrnyData;
    @XmlElement(name = "JrnyDtAndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jrnyDtAndTm;

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
    public ServiceStartEnd3 setLctn(String value) {
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
    public ServiceStartEnd3 setLctnCd(String value) {
        this.lctnCd = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public ServiceStartEnd3 setAdr(Address2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ServiceStartEnd3 setCtct(ContactBusiness1 value) {
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
    public ServiceStartEnd3 setDtAndTm(XMLGregorianCalendar value) {
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
    public ServiceStartEnd3 setTmSgmt(TimeSegment1Code value) {
        this.tmSgmt = value;
        return this;
    }

    /**
     * Gets the value of the jrnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyType1Code }
     *     
     */
    public JourneyType1Code getJrnyTp() {
        return jrnyTp;
    }

    /**
     * Sets the value of the jrnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyType1Code }
     *     
     */
    public ServiceStartEnd3 setJrnyTp(JourneyType1Code value) {
        this.jrnyTp = value;
        return this;
    }

    /**
     * Gets the value of the jrnyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnyData() {
        return jrnyData;
    }

    /**
     * Sets the value of the jrnyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceStartEnd3 setJrnyData(String value) {
        this.jrnyData = value;
        return this;
    }

    /**
     * Gets the value of the jrnyDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getJrnyDtAndTm() {
        return jrnyDtAndTm;
    }

    /**
     * Sets the value of the jrnyDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceStartEnd3 setJrnyDtAndTm(XMLGregorianCalendar value) {
        this.jrnyDtAndTm = value;
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
