
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
 * Other parties information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties28", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt"
})
public class OtherParties28 {

    @XmlElement(name = "Invstr")
    protected PartyIdentification99 invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentification100 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentification100 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification100 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification100 trptyAgt;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification99 }
     *     
     */
    public PartyIdentification99 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification99 }
     *     
     */
    public OtherParties28 setInvstr(PartyIdentification99 value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public OtherParties28 setQlfdFrgnIntrmy(PartyIdentification100 value) {
        this.qlfdFrgnIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public OtherParties28 setStockXchg(PartyIdentification100 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public OtherParties28 setTradRgltr(PartyIdentification100 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public OtherParties28 setTrptyAgt(PartyIdentification100 value) {
        this.trptyAgt = value;
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
