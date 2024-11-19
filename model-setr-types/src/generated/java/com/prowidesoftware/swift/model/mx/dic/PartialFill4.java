
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
@XmlType(name = "PartialFill4", propOrder = {
    "confQty",
    "dealPric",
    "tradDt",
    "plcOfTrad",
    "orgnlOrdrdQty",
    "prevslyExctdQty",
    "rmngQty",
    "mtchIncrmtQty"
})
public class PartialFill4 {

    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price14 dealPric;
    @XmlElement(name = "TradDt")
    protected TradeDate7Choice tradDt;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification97 plcOfTrad;
    @XmlElement(name = "OrgnlOrdrdQty", required = true)
    protected QuantityOrAmount2Choice orgnlOrdrdQty;
    @XmlElement(name = "PrevslyExctdQty", required = true)
    protected QuantityOrAmount2Choice prevslyExctdQty;
    @XmlElement(name = "RmngQty", required = true)
    protected QuantityOrAmount2Choice rmngQty;
    @XmlElement(name = "MtchIncrmtQty")
    protected QuantityOrAmount2Choice mtchIncrmtQty;

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
    public PartialFill4 setConfQty(Quantity6Choice value) {
        this.confQty = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public PartialFill4 setDealPric(Price14 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public PartialFill4 setTradDt(TradeDate7Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification97 }
     *     
     */
    public MarketIdentification97 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification97 }
     *     
     */
    public PartialFill4 setPlcOfTrad(MarketIdentification97 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getOrgnlOrdrdQty() {
        return orgnlOrdrdQty;
    }

    /**
     * Sets the value of the orgnlOrdrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public PartialFill4 setOrgnlOrdrdQty(QuantityOrAmount2Choice value) {
        this.orgnlOrdrdQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslyExctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getPrevslyExctdQty() {
        return prevslyExctdQty;
    }

    /**
     * Sets the value of the prevslyExctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public PartialFill4 setPrevslyExctdQty(QuantityOrAmount2Choice value) {
        this.prevslyExctdQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public PartialFill4 setRmngQty(QuantityOrAmount2Choice value) {
        this.rmngQty = value;
        return this;
    }

    /**
     * Gets the value of the mtchIncrmtQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getMtchIncrmtQty() {
        return mtchIncrmtQty;
    }

    /**
     * Sets the value of the mtchIncrmtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public PartialFill4 setMtchIncrmtQty(QuantityOrAmount2Choice value) {
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
