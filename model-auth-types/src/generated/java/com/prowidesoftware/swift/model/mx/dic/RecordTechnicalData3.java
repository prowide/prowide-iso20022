
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
 * Instrument specific technical data to support identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData3", propOrder = {
    "incnsstncyInd",
    "lastUpd",
    "submissnDtTm",
    "rlvntCmptntAuthrty",
    "pblctnPrd",
    "nvrPblshd"
})
public class RecordTechnicalData3 {

    @XmlElement(name = "IncnsstncyInd")
    protected Boolean incnsstncyInd;
    @XmlElement(name = "LastUpd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpd;
    @XmlElement(name = "SubmissnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissnDtTm;
    @XmlElement(name = "RlvntCmptntAuthrty")
    protected String rlvntCmptntAuthrty;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;
    @XmlElement(name = "NvrPblshd")
    protected Boolean nvrPblshd;

    /**
     * Gets the value of the incnsstncyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncnsstncyInd() {
        return incnsstncyInd;
    }

    /**
     * Sets the value of the incnsstncyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RecordTechnicalData3 setIncnsstncyInd(Boolean value) {
        this.incnsstncyInd = value;
        return this;
    }

    /**
     * Gets the value of the lastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpd() {
        return lastUpd;
    }

    /**
     * Sets the value of the lastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RecordTechnicalData3 setLastUpd(XMLGregorianCalendar value) {
        this.lastUpd = value;
        return this;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RecordTechnicalData3 setSubmissnDtTm(XMLGregorianCalendar value) {
        this.submissnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rlvntCmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRlvntCmptntAuthrty() {
        return rlvntCmptntAuthrty;
    }

    /**
     * Sets the value of the rlvntCmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecordTechnicalData3 setRlvntCmptntAuthrty(String value) {
        this.rlvntCmptntAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the pblctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getPblctnPrd() {
        return pblctnPrd;
    }

    /**
     * Sets the value of the pblctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public RecordTechnicalData3 setPblctnPrd(Period4Choice value) {
        this.pblctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the nvrPblshd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvrPblshd() {
        return nvrPblshd;
    }

    /**
     * Sets the value of the nvrPblshd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RecordTechnicalData3 setNvrPblshd(Boolean value) {
        this.nvrPblshd = value;
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
