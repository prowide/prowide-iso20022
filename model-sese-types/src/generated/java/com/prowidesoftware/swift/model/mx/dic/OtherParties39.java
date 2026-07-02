
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
 * Other parties information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties39", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr"
})
public class OtherParties39 {

    @XmlElement(name = "Invstr")
    protected PartyIdentification149 invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentification136 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification136 tradRgltr;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification149 }
     *     
     */
    public PartyIdentification149 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification149 }
     *     
     */
    public OtherParties39 setInvstr(PartyIdentification149 value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public OtherParties39 setStockXchg(PartyIdentification136 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public OtherParties39 setTradRgltr(PartyIdentification136 value) {
        this.tradRgltr = value;
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
