
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
 * Specifies the aggregated penalties amounts per party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedPenaltyAmount2", propOrder = {
    "ptyId",
    "aggtdDbtAmt",
    "aggtdCdtAmt"
})
public class AggregatedPenaltyAmount2 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "AggtdDbtAmt")
    protected ActiveCurrencyAndAmount aggtdDbtAmt;
    @XmlElement(name = "AggtdCdtAmt")
    protected ActiveCurrencyAndAmount aggtdCdtAmt;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public AggregatedPenaltyAmount2 setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the aggtdDbtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdDbtAmt() {
        return aggtdDbtAmt;
    }

    /**
     * Sets the value of the aggtdDbtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AggregatedPenaltyAmount2 setAggtdDbtAmt(ActiveCurrencyAndAmount value) {
        this.aggtdDbtAmt = value;
        return this;
    }

    /**
     * Gets the value of the aggtdCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdCdtAmt() {
        return aggtdCdtAmt;
    }

    /**
     * Sets the value of the aggtdCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AggregatedPenaltyAmount2 setAggtdCdtAmt(ActiveCurrencyAndAmount value) {
        this.aggtdCdtAmt = value;
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
