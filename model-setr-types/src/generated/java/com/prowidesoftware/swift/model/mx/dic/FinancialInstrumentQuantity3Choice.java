
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
 * Choice between ways to express the quantity of the financial instrument to be redeemed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity3Choice", propOrder = {
    "unitsNb",
    "pctgOfTtlSbcptAmt",
    "netAmt",
    "grssAmt",
    "hldgsRedRate"
})
public class FinancialInstrumentQuantity3Choice {

    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "PctgOfTtlSbcptAmt")
    protected BigDecimal pctgOfTtlSbcptAmt;
    @XmlElement(name = "NetAmt")
    protected CurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "HldgsRedRate")
    protected BigDecimal hldgsRedRate;

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
    public FinancialInstrumentQuantity3Choice setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfTtlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfTtlSbcptAmt() {
        return pctgOfTtlSbcptAmt;
    }

    /**
     * Sets the value of the pctgOfTtlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity3Choice setPctgOfTtlSbcptAmt(BigDecimal value) {
        this.pctgOfTtlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public FinancialInstrumentQuantity3Choice setNetAmt(CurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentQuantity3Choice setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the hldgsRedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsRedRate() {
        return hldgsRedRate;
    }

    /**
     * Sets the value of the hldgsRedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity3Choice setHldgsRedRate(BigDecimal value) {
        this.hldgsRedRate = value;
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
