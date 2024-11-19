
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
@XmlType(name = "OtherParties5", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt"
})
public class OtherParties5 {

    @XmlElement(name = "Invstr")
    protected PartyIdentification15Choice invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentification16Choice qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentification16Choice stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification16Choice tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification16Choice trptyAgt;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification15Choice }
     *     
     */
    public PartyIdentification15Choice getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification15Choice }
     *     
     */
    public OtherParties5 setInvstr(PartyIdentification15Choice value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public OtherParties5 setQlfdFrgnIntrmy(PartyIdentification16Choice value) {
        this.qlfdFrgnIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public OtherParties5 setStockXchg(PartyIdentification16Choice value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public OtherParties5 setTradRgltr(PartyIdentification16Choice value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public OtherParties5 setTrptyAgt(PartyIdentification16Choice value) {
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
