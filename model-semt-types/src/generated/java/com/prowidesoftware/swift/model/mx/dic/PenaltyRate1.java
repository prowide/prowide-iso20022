
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
 * Specifies the penalty rate data if the securities is subject to penalties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyRate1", propOrder = {
    "mktId",
    "smeGrwthMkt",
    "rate"
})
public class PenaltyRate1 {

    @XmlElement(name = "MktId")
    protected MarketIdentification1Choice mktId;
    @XmlElement(name = "SMEGrwthMkt")
    protected boolean smeGrwthMkt;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1Choice }
     *     
     */
    public MarketIdentification1Choice getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1Choice }
     *     
     */
    public PenaltyRate1 setMktId(MarketIdentification1Choice value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the smeGrwthMkt property.
     * 
     */
    public boolean isSMEGrwthMkt() {
        return smeGrwthMkt;
    }

    /**
     * Sets the value of the smeGrwthMkt property.
     * 
     */
    public PenaltyRate1 setSMEGrwthMkt(boolean value) {
        this.smeGrwthMkt = value;
        return this;
    }

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
    public PenaltyRate1 setRate(BigDecimal value) {
        this.rate = value;
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
