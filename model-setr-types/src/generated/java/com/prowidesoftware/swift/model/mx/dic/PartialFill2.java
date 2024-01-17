
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
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialFill2", propOrder = {
    "confQty",
    "dealPric",
    "tradDt",
    "plcOfTrad",
    "orgnlOrdrdQty",
    "prevslyExctdQty",
    "rmngQty",
    "mtchIncrmtQty"
})
public class PartialFill2 {

    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price4 dealPric;
    @XmlElement(name = "TradDt")
    protected TradeDate4Choice tradDt;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification80 plcOfTrad;
    @XmlElement(name = "OrgnlOrdrdQty", required = true)
    protected QuantityOrAmount1Choice orgnlOrdrdQty;
    @XmlElement(name = "PrevslyExctdQty", required = true)
    protected QuantityOrAmount1Choice prevslyExctdQty;
    @XmlElement(name = "RmngQty", required = true)
    protected QuantityOrAmount1Choice rmngQty;
    @XmlElement(name = "MtchIncrmtQty")
    protected QuantityOrAmount1Choice mtchIncrmtQty;

    /**
     * Gets the value of the confQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getConfQty() {
        return confQty;
    }

    /**
     * Sets the value of the confQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public PartialFill2 setConfQty(Quantity6Choice value) {
        this.confQty = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public PartialFill2 setDealPric(Price4 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate4Choice }
     *     
     */
    public TradeDate4Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate4Choice }
     *     
     */
    public PartialFill2 setTradDt(TradeDate4Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification80 }
     *     
     */
    public MarketIdentification80 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification80 }
     *     
     */
    public PartialFill2 setPlcOfTrad(MarketIdentification80 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public QuantityOrAmount1Choice getOrgnlOrdrdQty() {
        return orgnlOrdrdQty;
    }

    /**
     * Sets the value of the orgnlOrdrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public PartialFill2 setOrgnlOrdrdQty(QuantityOrAmount1Choice value) {
        this.orgnlOrdrdQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslyExctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public QuantityOrAmount1Choice getPrevslyExctdQty() {
        return prevslyExctdQty;
    }

    /**
     * Sets the value of the prevslyExctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public PartialFill2 setPrevslyExctdQty(QuantityOrAmount1Choice value) {
        this.prevslyExctdQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public QuantityOrAmount1Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public PartialFill2 setRmngQty(QuantityOrAmount1Choice value) {
        this.rmngQty = value;
        return this;
    }

    /**
     * Gets the value of the mtchIncrmtQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public QuantityOrAmount1Choice getMtchIncrmtQty() {
        return mtchIncrmtQty;
    }

    /**
     * Sets the value of the mtchIncrmtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public PartialFill2 setMtchIncrmtQty(QuantityOrAmount1Choice value) {
        this.mtchIncrmtQty = value;
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
