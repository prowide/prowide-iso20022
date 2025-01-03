
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
 * Provides details about business parties involved in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties1", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr",
    "trptyAgt"
})
public class OtherParties1 {

    @XmlElement(name = "Invstr")
    protected PartyIdentificationAndAccount9 invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount8 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount8 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount8 trptyAgt;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount9 }
     *     
     */
    public PartyIdentificationAndAccount9 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount9 }
     *     
     */
    public OtherParties1 setInvstr(PartyIdentificationAndAccount9 value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public PartyIdentificationAndAccount8 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public OtherParties1 setStockXchg(PartyIdentificationAndAccount8 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public PartyIdentificationAndAccount8 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public OtherParties1 setTradRgltr(PartyIdentificationAndAccount8 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public PartyIdentificationAndAccount8 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount8 }
     *     
     */
    public OtherParties1 setTrptyAgt(PartyIdentificationAndAccount8 value) {
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
