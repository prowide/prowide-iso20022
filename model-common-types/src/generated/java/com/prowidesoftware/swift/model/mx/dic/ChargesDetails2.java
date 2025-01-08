
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesDetails2", propOrder = {
    "tp",
    "othrChrgsTp",
    "amt"
})
public class ChargesDetails2 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ChargeType8Code tp;
    @XmlElement(name = "OthrChrgsTp")
    protected String othrChrgsTp;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType8Code }
     *     
     */
    public ChargeType8Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType8Code }
     *     
     */
    public ChargesDetails2 setTp(ChargeType8Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrChrgsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrChrgsTp() {
        return othrChrgsTp;
    }

    /**
     * Sets the value of the othrChrgsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesDetails2 setOthrChrgsTp(String value) {
        this.othrChrgsTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ChargesDetails2 setAmt(CurrencyAndAmount value) {
        this.amt = value;
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
