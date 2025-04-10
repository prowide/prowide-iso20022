
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the amount in the reporting currency and optionally in the original currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount2", propOrder = {
    "orgnlCcyAmt",
    "rptgAmt"
})
public class Amount2 {

    @XmlElement(name = "OrgnlCcyAmt")
    protected ActiveCurrencyAndAmount orgnlCcyAmt;
    @XmlElement(name = "RptgAmt", required = true)
    protected BigDecimal rptgAmt;

    /**
     * Gets the value of the orgnlCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlCcyAmt() {
        return orgnlCcyAmt;
    }

    /**
     * Sets the value of the orgnlCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Amount2 setOrgnlCcyAmt(ActiveCurrencyAndAmount value) {
        this.orgnlCcyAmt = value;
        return this;
    }

    /**
     * Gets the value of the rptgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptgAmt() {
        return rptgAmt;
    }

    /**
     * Sets the value of the rptgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Amount2 setRptgAmt(BigDecimal value) {
        this.rptgAmt = value;
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
