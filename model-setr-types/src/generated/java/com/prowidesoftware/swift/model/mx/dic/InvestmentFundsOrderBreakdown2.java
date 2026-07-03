
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
 * An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example, other assets, into or out of an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundsOrderBreakdown2", propOrder = {
    "ordrBrkdwnTp",
    "amt"
})
public class InvestmentFundsOrderBreakdown2 {

    @XmlElement(name = "OrdrBrkdwnTp", required = true)
    protected OrderBreakdownType1Choice ordrBrkdwnTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the ordrBrkdwnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBreakdownType1Choice }
     *     
     */
    public OrderBreakdownType1Choice getOrdrBrkdwnTp() {
        return ordrBrkdwnTp;
    }

    /**
     * Sets the value of the ordrBrkdwnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBreakdownType1Choice }
     *     
     */
    public InvestmentFundsOrderBreakdown2 setOrdrBrkdwnTp(OrderBreakdownType1Choice value) {
        this.ordrBrkdwnTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentFundsOrderBreakdown2 setAmt(ActiveCurrencyAndAmount value) {
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
