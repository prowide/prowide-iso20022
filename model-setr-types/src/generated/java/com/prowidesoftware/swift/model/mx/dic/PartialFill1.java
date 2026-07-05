
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
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialFill1", propOrder = {
    "confQty",
    "dealPric",
    "tradDt",
    "plcOfTrad",
    "orgnlOrdrdQty",
    "prevslyExctdQty",
    "rmngQty",
    "mtchIncrmtQty"
})
public class PartialFill1 {

    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price4 dealPric;
    @XmlElement(name = "TradDt")
    protected TradeDate4Choice tradDt;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification13 plcOfTrad;
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
    public PartialFill1 setConfQty(Quantity6Choice value) {
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
    public PartialFill1 setDealPric(Price4 value) {
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
    public PartialFill1 setTradDt(TradeDate4Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification13 }
     *     
     */
    public MarketIdentification13 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification13 }
     *     
     */
    public PartialFill1 setPlcOfTrad(MarketIdentification13 value) {
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
    public PartialFill1 setOrgnlOrdrdQty(QuantityOrAmount1Choice value) {
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
    public PartialFill1 setPrevslyExctdQty(QuantityOrAmount1Choice value) {
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
    public PartialFill1 setRmngQty(QuantityOrAmount1Choice value) {
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
    public PartialFill1 setMtchIncrmtQty(QuantityOrAmount1Choice value) {
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
