
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Restrictions, remarks or notes that may be applied to an account or investment plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditiononalInformation12", propOrder = {
    "lmttn",
    "addtlInf",
    "acctVldtn",
    "tp",
    "rgltr",
    "sts",
    "prd"
})
public class AdditiononalInformation12 {

    @XmlElement(name = "Lmttn")
    protected String lmttn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "AcctVldtn")
    protected String acctVldtn;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Rgltr")
    protected PartyIdentification70Choice rgltr;
    @XmlElement(name = "Sts")
    protected RestrictionStatus1Choice sts;
    @XmlElement(name = "Prd")
    protected DateTimePeriodDetails1 prd;

    /**
     * Gets the value of the lmttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmttn() {
        return lmttn;
    }

    /**
     * Sets the value of the lmttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditiononalInformation12 setLmttn(String value) {
        this.lmttn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditiononalInformation12 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctVldtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctVldtn() {
        return acctVldtn;
    }

    /**
     * Sets the value of the acctVldtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditiononalInformation12 setAcctVldtn(String value) {
        this.acctVldtn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditiononalInformation12 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getRgltr() {
        return rgltr;
    }

    /**
     * Sets the value of the rgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public AdditiononalInformation12 setRgltr(PartyIdentification70Choice value) {
        this.rgltr = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionStatus1Choice }
     *     
     */
    public RestrictionStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionStatus1Choice }
     *     
     */
    public AdditiononalInformation12 setSts(RestrictionStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public DateTimePeriodDetails1 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public AdditiononalInformation12 setPrd(DateTimePeriodDetails1 value) {
        this.prd = value;
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
