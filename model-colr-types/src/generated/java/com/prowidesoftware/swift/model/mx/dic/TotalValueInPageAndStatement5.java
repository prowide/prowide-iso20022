
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
 * Totals for the value of the holdings reported in the statement or page.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalValueInPageAndStatement5", propOrder = {
    "ttlXpsrValOfPg",
    "ttlCollHeldValOfPg"
})
public class TotalValueInPageAndStatement5 {

    @XmlElement(name = "TtlXpsrValOfPg")
    protected ActiveOrHistoricCurrencyAndAmount ttlXpsrValOfPg;
    @XmlElement(name = "TtlCollHeldValOfPg")
    protected ActiveOrHistoricCurrencyAndAmount ttlCollHeldValOfPg;

    /**
     * Gets the value of the ttlXpsrValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlXpsrValOfPg() {
        return ttlXpsrValOfPg;
    }

    /**
     * Sets the value of the ttlXpsrValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public TotalValueInPageAndStatement5 setTtlXpsrValOfPg(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlXpsrValOfPg = value;
        return this;
    }

    /**
     * Gets the value of the ttlCollHeldValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCollHeldValOfPg() {
        return ttlCollHeldValOfPg;
    }

    /**
     * Sets the value of the ttlCollHeldValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public TotalValueInPageAndStatement5 setTtlCollHeldValOfPg(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCollHeldValOfPg = value;
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
