
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
 * An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundsOrderBreakdown1", propOrder = {
    "ordrBrkdwnTp",
    "xtndedOrdrBrkdwnTp",
    "amt"
})
public class InvestmentFundsOrderBreakdown1 {

    @XmlElement(name = "OrdrBrkdwnTp")
    @XmlSchemaType(name = "string")
    protected FundOrderType5Code ordrBrkdwnTp;
    @XmlElement(name = "XtndedOrdrBrkdwnTp")
    protected String xtndedOrdrBrkdwnTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the ordrBrkdwnTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderType5Code }
     *     
     */
    public FundOrderType5Code getOrdrBrkdwnTp() {
        return ordrBrkdwnTp;
    }

    /**
     * Sets the value of the ordrBrkdwnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderType5Code }
     *     
     */
    public InvestmentFundsOrderBreakdown1 setOrdrBrkdwnTp(FundOrderType5Code value) {
        this.ordrBrkdwnTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOrdrBrkdwnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedOrdrBrkdwnTp() {
        return xtndedOrdrBrkdwnTp;
    }

    /**
     * Sets the value of the xtndedOrdrBrkdwnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundsOrderBreakdown1 setXtndedOrdrBrkdwnTp(String value) {
        this.xtndedOrdrBrkdwnTp = value;
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
    public InvestmentFundsOrderBreakdown1 setAmt(ActiveCurrencyAndAmount value) {
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
