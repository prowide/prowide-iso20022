
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "OtherParties32", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "qlfdFrgnIntrmy"
})
public class OtherParties32 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount150> invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount152 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount152 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount154 trptyAgt;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount151 qlfdFrgnIntrmy;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount150 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount150> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public PartyIdentificationAndAccount152 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public OtherParties32 setStockXchg(PartyIdentificationAndAccount152 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public PartyIdentificationAndAccount152 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public OtherParties32 setTradRgltr(PartyIdentificationAndAccount152 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount154 }
     *     
     */
    public PartyIdentificationAndAccount154 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount154 }
     *     
     */
    public OtherParties32 setTrptyAgt(PartyIdentificationAndAccount154 value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount151 }
     *     
     */
    public PartyIdentificationAndAccount151 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount151 }
     *     
     */
    public OtherParties32 setQlfdFrgnIntrmy(PartyIdentificationAndAccount151 value) {
        this.qlfdFrgnIntrmy = value;
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

    /**
     * Adds a new item to the invstr list.
     * @see #getInvstr()
     * 
     */
    public OtherParties32 addInvstr(PartyIdentificationAndAccount150 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
