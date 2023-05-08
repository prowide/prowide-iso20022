
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "RecordTechnicalData4", propOrder = {
    "incnsstncyInd",
    "lastUpd",
    "submissnDtTm",
    "rlvntCmptntAuthrty",
    "pblctnPrd",
    "nvrPblshd",
    "rlvntTradgVn"
})
public class RecordTechnicalData4 {

    @XmlElement(name = "IncnsstncyInd")
    protected Boolean incnsstncyInd;
    @XmlElement(name = "LastUpd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpd;
    @XmlElement(name = "SubmissnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar submissnDtTm;
    @XmlElement(name = "RlvntCmptntAuthrty")
    protected String rlvntCmptntAuthrty;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;
    @XmlElement(name = "NvrPblshd")
    protected Boolean nvrPblshd;
    @XmlElement(name = "RlvntTradgVn")
    protected String rlvntTradgVn;

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
    public RecordTechnicalData4 setIncnsstncyInd(Boolean value) {
        this.incnsstncyInd = value;
        return this;
    }

    /**
     * Gets the value of the lastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUpd() {
        return lastUpd;
    }

    /**
     * Sets the value of the lastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecordTechnicalData4 setLastUpd(Calendar value) {
        this.lastUpd = value;
        return this;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecordTechnicalData4 setSubmissnDtTm(Calendar value) {
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
    public RecordTechnicalData4 setRlvntCmptntAuthrty(String value) {
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
    public RecordTechnicalData4 setPblctnPrd(Period4Choice value) {
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
    public RecordTechnicalData4 setNvrPblshd(Boolean value) {
        this.nvrPblshd = value;
        return this;
    }

    /**
     * Gets the value of the rlvntTradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRlvntTradgVn() {
        return rlvntTradgVn;
    }

    /**
     * Sets the value of the rlvntTradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecordTechnicalData4 setRlvntTradgVn(String value) {
        this.rlvntTradgVn = value;
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
