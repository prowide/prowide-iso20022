
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
 * The quantities, amount or price of a financial instrument to be ordered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQuantity3", propOrder = {
    "minQty",
    "pric",
    "mtchIncrmt",
    "mxPricLvls",
    "prvsClsgPric"
})
public class OrderQuantity3 {

    @XmlElement(name = "MinQty")
    protected FinancialInstrumentQuantityChoice minQty;
    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "MtchIncrmt")
    protected FinancialInstrumentQuantityChoice mtchIncrmt;
    @XmlElement(name = "MxPricLvls")
    protected BigDecimal mxPricLvls;
    @XmlElement(name = "PrvsClsgPric")
    protected Price1 prvsClsgPric;

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public OrderQuantity3 setMinQty(FinancialInstrumentQuantityChoice value) {
        this.minQty = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public OrderQuantity3 setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the mtchIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMtchIncrmt() {
        return mtchIncrmt;
    }

    /**
     * Sets the value of the mtchIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public OrderQuantity3 setMtchIncrmt(FinancialInstrumentQuantityChoice value) {
        this.mtchIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the mxPricLvls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMxPricLvls() {
        return mxPricLvls;
    }

    /**
     * Sets the value of the mxPricLvls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderQuantity3 setMxPricLvls(BigDecimal value) {
        this.mxPricLvls = value;
        return this;
    }

    /**
     * Gets the value of the prvsClsgPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPrvsClsgPric() {
        return prvsClsgPric;
    }

    /**
     * Sets the value of the prvsClsgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public OrderQuantity3 setPrvsClsgPric(Price1 value) {
        this.prvsClsgPric = value;
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
