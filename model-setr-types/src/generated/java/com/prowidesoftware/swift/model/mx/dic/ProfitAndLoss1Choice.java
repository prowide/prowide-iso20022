
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
 * Choice between profit and loss.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitAndLoss1Choice", propOrder = {
    "prft",
    "loss"
})
public class ProfitAndLoss1Choice {

    @XmlElement(name = "Prft")
    protected ActiveCurrencyAnd13DecimalAmount prft;
    @XmlElement(name = "Loss")
    protected ActiveCurrencyAnd13DecimalAmount loss;

    /**
     * Gets the value of the prft property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrft() {
        return prft;
    }

    /**
     * Sets the value of the prft property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ProfitAndLoss1Choice setPrft(ActiveCurrencyAnd13DecimalAmount value) {
        this.prft = value;
        return this;
    }

    /**
     * Gets the value of the loss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getLoss() {
        return loss;
    }

    /**
     * Sets the value of the loss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ProfitAndLoss1Choice setLoss(ActiveCurrencyAnd13DecimalAmount value) {
        this.loss = value;
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
