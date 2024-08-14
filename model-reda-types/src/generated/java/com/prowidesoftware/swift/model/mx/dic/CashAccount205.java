
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount205", propOrder = {
    "ccy",
    "pmryAcct",
    "scndryAcct"
})
public class CashAccount205 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "PmryAcct")
    protected CashAccount206 pmryAcct;
    @XmlElement(name = "ScndryAcct")
    protected CashAccount206 scndryAcct;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount205 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the pmryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount206 getPmryAcct() {
        return pmryAcct;
    }

    /**
     * Sets the value of the pmryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount205 setPmryAcct(CashAccount206 value) {
        this.pmryAcct = value;
        return this;
    }

    /**
     * Gets the value of the scndryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount206 getScndryAcct() {
        return scndryAcct;
    }

    /**
     * Sets the value of the scndryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount205 setScndryAcct(CashAccount206 value) {
        this.scndryAcct = value;
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
