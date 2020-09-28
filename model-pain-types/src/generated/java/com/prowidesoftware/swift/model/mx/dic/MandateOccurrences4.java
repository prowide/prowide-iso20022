
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateOccurrences4", propOrder = {
    "seqTp",
    "frqcy",
    "drtn",
    "frstColltnDt",
    "fnlColltnDt"
})
public class MandateOccurrences4 {

    @XmlElement(name = "SeqTp", required = true)
    @XmlSchemaType(name = "string")
    protected SequenceType2Code seqTp;
    @XmlElement(name = "Frqcy")
    protected Frequency36Choice frqcy;
    @XmlElement(name = "Drtn")
    protected DatePeriodDetails1 drtn;
    @XmlElement(name = "FrstColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstColltnDt;
    @XmlElement(name = "FnlColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fnlColltnDt;

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType2Code }
     *     
     */
    public SequenceType2Code getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType2Code }
     *     
     */
    public MandateOccurrences4 setSeqTp(SequenceType2Code value) {
        this.seqTp = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency36Choice }
     *     
     */
    public Frequency36Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency36Choice }
     *     
     */
    public MandateOccurrences4 setFrqcy(Frequency36Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public DatePeriodDetails1 getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public MandateOccurrences4 setDrtn(DatePeriodDetails1 value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the frstColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstColltnDt() {
        return frstColltnDt;
    }

    /**
     * Sets the value of the frstColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MandateOccurrences4 setFrstColltnDt(XMLGregorianCalendar value) {
        this.frstColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the fnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFnlColltnDt() {
        return fnlColltnDt;
    }

    /**
     * Sets the value of the fnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MandateOccurrences4 setFnlColltnDt(XMLGregorianCalendar value) {
        this.fnlColltnDt = value;
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
