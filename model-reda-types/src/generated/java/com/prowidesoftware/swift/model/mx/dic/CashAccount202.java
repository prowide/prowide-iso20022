
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount202", propOrder = {
    "ccy",
    "pmryAcct",
    "scndryAcct"
})
public class CashAccount202 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "PmryAcct")
    protected CashAccount203 pmryAcct;
    @XmlElement(name = "ScndryAcct")
    protected CashAccount203 scndryAcct;

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
    public CashAccount202 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the pmryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount203 }
     *     
     */
    public CashAccount203 getPmryAcct() {
        return pmryAcct;
    }

    /**
     * Sets the value of the pmryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount203 }
     *     
     */
    public CashAccount202 setPmryAcct(CashAccount203 value) {
        this.pmryAcct = value;
        return this;
    }

    /**
     * Gets the value of the scndryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount203 }
     *     
     */
    public CashAccount203 getScndryAcct() {
        return scndryAcct;
    }

    /**
     * Sets the value of the scndryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount203 }
     *     
     */
    public CashAccount202 setScndryAcct(CashAccount203 value) {
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
