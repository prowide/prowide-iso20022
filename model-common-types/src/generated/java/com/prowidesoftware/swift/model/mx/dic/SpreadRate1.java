
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
 * Margin over or under an index that determines the repurchase rate expressed as a rate or an amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadRate1", propOrder = {
    "sgn",
    "rateOrAmt"
})
public class SpreadRate1 {

    @XmlElement(name = "Sgn")
    protected boolean sgn;
    @XmlElement(name = "RateOrAmt", required = true)
    protected AmountOrRate1Choice rateOrAmt;

    /**
     * Gets the value of the sgn property.
     * 
     */
    public boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     */
    public SpreadRate1 setSgn(boolean value) {
        this.sgn = value;
        return this;
    }

    /**
     * Gets the value of the rateOrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public AmountOrRate1Choice getRateOrAmt() {
        return rateOrAmt;
    }

    /**
     * Sets the value of the rateOrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public SpreadRate1 setRateOrAmt(AmountOrRate1Choice value) {
        this.rateOrAmt = value;
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
