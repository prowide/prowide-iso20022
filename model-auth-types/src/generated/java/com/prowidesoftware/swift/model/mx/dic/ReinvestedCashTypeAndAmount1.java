
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
 * Provides details on the type and amount of the cash reinvestment in a given currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReinvestedCashTypeAndAmount1", propOrder = {
    "tp",
    "rinvstdCshAmt"
})
public class ReinvestedCashTypeAndAmount1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ReinvestmentType1Code tp;
    @XmlElement(name = "RinvstdCshAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount rinvstdCshAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public ReinvestmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public ReinvestedCashTypeAndAmount1 setTp(ReinvestmentType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rinvstdCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRinvstdCshAmt() {
        return rinvstdCshAmt;
    }

    /**
     * Sets the value of the rinvstdCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReinvestedCashTypeAndAmount1 setRinvstdCshAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rinvstdCshAmt = value;
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
