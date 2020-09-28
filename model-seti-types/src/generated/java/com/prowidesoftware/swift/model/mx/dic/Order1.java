
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "Order1", propOrder = {
    "tp",
    "tradgCpcty",
    "cstmrCpcty",
    "sd",
    "plcOfExctn",
    "xpryDtTm",
    "qtyDtls",
    "comssnDtls"
})
public class Order1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected OrderType1Code tp;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity3Code tradgCpcty;
    @XmlElement(name = "CstmrCpcty")
    @XmlSchemaType(name = "string")
    protected CustomerOrderCapacity1Code cstmrCpcty;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "PlcOfExctn")
    protected MarketIdentification1 plcOfExctn;
    @XmlElement(name = "XpryDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtTm;
    @XmlElement(name = "QtyDtls")
    protected OrderQuantity1 qtyDtls;
    @XmlElement(name = "ComssnDtls")
    protected Commission2 comssnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType1Code }
     *     
     */
    public OrderType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType1Code }
     *     
     */
    public Order1 setTp(OrderType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TradingCapacity3Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public Order1 setTradgCpcty(TradingCapacity3Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public CustomerOrderCapacity1Code getCstmrCpcty() {
        return cstmrCpcty;
    }

    /**
     * Sets the value of the cstmrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public Order1 setCstmrCpcty(CustomerOrderCapacity1Code value) {
        this.cstmrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public Order1 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the plcOfExctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1 }
     *     
     */
    public MarketIdentification1 getPlcOfExctn() {
        return plcOfExctn;
    }

    /**
     * Sets the value of the plcOfExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1 }
     *     
     */
    public Order1 setPlcOfExctn(MarketIdentification1 value) {
        this.plcOfExctn = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Order1 setXpryDtTm(XMLGregorianCalendar value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getQtyDtls() {
        return qtyDtls;
    }

    /**
     * Sets the value of the qtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public Order1 setQtyDtls(OrderQuantity1 value) {
        this.qtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Commission2 }
     *     
     */
    public Commission2 getComssnDtls() {
        return comssnDtls;
    }

    /**
     * Sets the value of the comssnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission2 }
     *     
     */
    public Order1 setComssnDtls(Commission2 value) {
        this.comssnDtls = value;
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
