
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Further detailed information on the exchange rate that has been used in or is related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation2", propOrder = {
    "prvdr",
    "id",
    "dt",
    "tm",
    "xchgRateDtl",
    "rateLck"
})
public class ExchangeRateInformation2 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;
    @XmlElement(name = "XchgRateDtl")
    protected ExchangeRateDetail1 xchgRateDtl;
    @XmlElement(name = "RateLck")
    protected RateLock1 rateLck;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation2 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation2 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation2 setTm(XMLGregorianCalendar value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetail1 }
     *     
     */
    public ExchangeRateDetail1 getXchgRateDtl() {
        return xchgRateDtl;
    }

    /**
     * Sets the value of the xchgRateDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetail1 }
     *     
     */
    public ExchangeRateInformation2 setXchgRateDtl(ExchangeRateDetail1 value) {
        this.xchgRateDtl = value;
        return this;
    }

    /**
     * Gets the value of the rateLck property.
     * 
     * @return
     *     possible object is
     *     {@link RateLock1 }
     *     
     */
    public RateLock1 getRateLck() {
        return rateLck;
    }

    /**
     * Sets the value of the rateLck property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLock1 }
     *     
     */
    public ExchangeRateInformation2 setRateLck(RateLock1 value) {
        this.rateLck = value;
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
