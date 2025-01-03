
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Balances of units and cash derived from investment fund orders.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundBalance1", propOrder = {
    "ttlUnitsFrUnitOrdrs",
    "ttlUnitsFrCshOrdrs",
    "ttlCshFrUnitOrdrs",
    "ttlCshFrCshOrdrs"
})
public class FundBalance1 {

    @XmlElement(name = "TtlUnitsFrUnitOrdrs")
    protected FinancialInstrumentQuantity1 ttlUnitsFrUnitOrdrs;
    @XmlElement(name = "TtlUnitsFrCshOrdrs")
    protected FinancialInstrumentQuantity1 ttlUnitsFrCshOrdrs;
    @XmlElement(name = "TtlCshFrUnitOrdrs")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFrUnitOrdrs;
    @XmlElement(name = "TtlCshFrCshOrdrs")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFrCshOrdrs;

    /**
     * Gets the value of the ttlUnitsFrUnitOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsFrUnitOrdrs() {
        return ttlUnitsFrUnitOrdrs;
    }

    /**
     * Sets the value of the ttlUnitsFrUnitOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FundBalance1 setTtlUnitsFrUnitOrdrs(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsFrUnitOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsFrCshOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsFrCshOrdrs() {
        return ttlUnitsFrCshOrdrs;
    }

    /**
     * Sets the value of the ttlUnitsFrCshOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FundBalance1 setTtlUnitsFrCshOrdrs(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsFrCshOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the ttlCshFrUnitOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFrUnitOrdrs() {
        return ttlCshFrUnitOrdrs;
    }

    /**
     * Sets the value of the ttlCshFrUnitOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FundBalance1 setTtlCshFrUnitOrdrs(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFrUnitOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the ttlCshFrCshOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFrCshOrdrs() {
        return ttlCshFrCshOrdrs;
    }

    /**
     * Sets the value of the ttlCshFrCshOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FundBalance1 setTtlCshFrCshOrdrs(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFrCshOrdrs = value;
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
