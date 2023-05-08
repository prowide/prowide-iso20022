
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
@XmlType(name = "OtherParties4", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr"
})
public class OtherParties4 {

    @XmlElement(name = "Invstr")
    protected PartyIdentification14Choice invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentification10Choice stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification10Choice tradRgltr;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification14Choice }
     *     
     */
    public PartyIdentification14Choice getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification14Choice }
     *     
     */
    public OtherParties4 setInvstr(PartyIdentification14Choice value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public OtherParties4 setStockXchg(PartyIdentification10Choice value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public OtherParties4 setTradRgltr(PartyIdentification10Choice value) {
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
