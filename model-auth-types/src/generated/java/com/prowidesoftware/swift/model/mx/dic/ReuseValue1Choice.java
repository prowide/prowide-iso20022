
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
 * Indication whether reused value is actual or estimated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseValue1Choice", propOrder = {
    "actl",
    "estmtd"
})
public class ReuseValue1Choice {

    @XmlElement(name = "Actl")
    protected ActiveOrHistoricCurrencyAndAmount actl;
    @XmlElement(name = "Estmtd")
    protected ActiveOrHistoricCurrencyAndAmount estmtd;

    /**
     * Gets the value of the actl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActl() {
        return actl;
    }

    /**
     * Sets the value of the actl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReuseValue1Choice setActl(ActiveOrHistoricCurrencyAndAmount value) {
        this.actl = value;
        return this;
    }

    /**
     * Gets the value of the estmtd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEstmtd() {
        return estmtd;
    }

    /**
     * Sets the value of the estmtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReuseValue1Choice setEstmtd(ActiveOrHistoricCurrencyAndAmount value) {
        this.estmtd = value;
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
