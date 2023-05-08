
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Measure of the current stock of a financial instrument that has been traded on an exchange or cleared via a central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenInterest1", propOrder = {
    "grssNtnlAmt",
    "nbOfLots"
})
public class OpenInterest1 {

    @XmlElement(name = "GrssNtnlAmt", required = true)
    protected ActiveCurrencyAnd24Amount grssNtnlAmt;
    @XmlElement(name = "NbOfLots")
    protected BigDecimal nbOfLots;

    /**
     * Gets the value of the grssNtnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getGrssNtnlAmt() {
        return grssNtnlAmt;
    }

    /**
     * Sets the value of the grssNtnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public OpenInterest1 setGrssNtnlAmt(ActiveCurrencyAnd24Amount value) {
        this.grssNtnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the nbOfLots property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLots() {
        return nbOfLots;
    }

    /**
     * Sets the value of the nbOfLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OpenInterest1 setNbOfLots(BigDecimal value) {
        this.nbOfLots = value;
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
