
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * New standing order values.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderDetails1", propOrder = {
    "amt",
    "cdtAcct",
    "dbtAcct",
    "frqcy",
    "vldtyPrd"
})
public class StandingOrderDetails1 {

    @XmlElement(name = "Amt")
    protected AmountChoice amt;
    @XmlElement(name = "CdtAcct")
    protected AccountIdentificationDetails cdtAcct;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentificationDetails dbtAcct;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency2Code frqcy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriodDetails2Choice vldtyPrd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public StandingOrderDetails1 setAmt(AmountChoice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public AccountIdentificationDetails getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public StandingOrderDetails1 setCdtAcct(AccountIdentificationDetails value) {
        this.cdtAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public AccountIdentificationDetails getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public StandingOrderDetails1 setDbtAcct(AccountIdentificationDetails value) {
        this.dbtAcct = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency2Code }
     *     
     */
    public Frequency2Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency2Code }
     *     
     */
    public StandingOrderDetails1 setFrqcy(Frequency2Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails2Choice }
     *     
     */
    public DatePeriodDetails2Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails2Choice }
     *     
     */
    public StandingOrderDetails1 setVldtyPrd(DatePeriodDetails2Choice value) {
        this.vldtyPrd = value;
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
