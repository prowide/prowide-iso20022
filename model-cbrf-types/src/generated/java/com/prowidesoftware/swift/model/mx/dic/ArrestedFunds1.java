
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
 * Information about funds that have been arrested. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrestedFunds1", propOrder = {
    "arrstId",
    "ttlAmt",
    "rmngUnpdAmt",
    "arrstdAmt"
})
public class ArrestedFunds1 {

    @XmlElement(name = "ArrstId")
    protected String arrstId;
    @XmlElement(name = "TtlAmt")
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "RmngUnpdAmt", required = true)
    protected ActiveCurrencyAndAmount rmngUnpdAmt;
    @XmlElement(name = "ArrstdAmt")
    protected ActiveCurrencyAndAmount arrstdAmt;

    /**
     * Gets the value of the arrstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrstId() {
        return arrstId;
    }

    /**
     * Sets the value of the arrstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ArrestedFunds1 setArrstId(String value) {
        this.arrstId = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ArrestedFunds1 setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngUnpdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRmngUnpdAmt() {
        return rmngUnpdAmt;
    }

    /**
     * Sets the value of the rmngUnpdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ArrestedFunds1 setRmngUnpdAmt(ActiveCurrencyAndAmount value) {
        this.rmngUnpdAmt = value;
        return this;
    }

    /**
     * Gets the value of the arrstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getArrstdAmt() {
        return arrstdAmt;
    }

    /**
     * Sets the value of the arrstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ArrestedFunds1 setArrstdAmt(ActiveCurrencyAndAmount value) {
        this.arrstdAmt = value;
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
