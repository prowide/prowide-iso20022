
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
 * Choice between ways to express the quantity of the financial instrument to be redeemed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity8Choice", propOrder = {
    "unitsNb",
    "ordrdAmt",
    "netAmt",
    "grssAmt",
    "hldgsRate"
})
public class FinancialInstrumentQuantity8Choice {

    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "OrdrdAmt")
    protected ActiveOrHistoricCurrencyAndAmount ordrdAmt;
    @XmlElement(name = "NetAmt")
    protected ActiveOrHistoricCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveOrHistoricCurrencyAndAmount grssAmt;
    @XmlElement(name = "HldgsRate")
    protected BigDecimal hldgsRate;

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity8Choice setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the ordrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrdrdAmt() {
        return ordrdAmt;
    }

    /**
     * Sets the value of the ordrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentQuantity8Choice setOrdrdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ordrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentQuantity8Choice setNetAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentQuantity8Choice setGrssAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the hldgsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsRate() {
        return hldgsRate;
    }

    /**
     * Sets the value of the hldgsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity8Choice setHldgsRate(BigDecimal value) {
        this.hldgsRate = value;
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
