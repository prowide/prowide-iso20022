
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
 * Fixed rate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRate7", propOrder = {
    "rate",
    "dayCntBsis",
    "mrgnLnAmt"
})
public class FixedRate7 {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "DayCntBsis", required = true)
    protected InterestComputationMethodFormat6Choice dayCntBsis;
    @XmlElement(name = "MrgnLnAmt")
    protected ActiveOrHistoricCurrencyAndAmount mrgnLnAmt;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FixedRate7 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public InterestComputationMethodFormat6Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public FixedRate7 setDayCntBsis(InterestComputationMethodFormat6Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMrgnLnAmt() {
        return mrgnLnAmt;
    }

    /**
     * Sets the value of the mrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FixedRate7 setMrgnLnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.mrgnLnAmt = value;
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
