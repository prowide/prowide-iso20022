
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Other parties' information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties35", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "brkr"
})
public class OtherParties35 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount179> invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount180 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount181 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount181 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount180 trptyAgt;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount180 brkr;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstr property.
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
     * {@link PartyIdentificationAndAccount179 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount179> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount179>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public PartyIdentificationAndAccount180 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public OtherParties35 setQlfdFrgnIntrmy(PartyIdentificationAndAccount180 value) {
        this.qlfdFrgnIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public PartyIdentificationAndAccount181 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public OtherParties35 setStockXchg(PartyIdentificationAndAccount181 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public PartyIdentificationAndAccount181 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public OtherParties35 setTradRgltr(PartyIdentificationAndAccount181 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public PartyIdentificationAndAccount180 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public OtherParties35 setTrptyAgt(PartyIdentificationAndAccount180 value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public PartyIdentificationAndAccount180 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount180 }
     *     
     */
    public OtherParties35 setBrkr(PartyIdentificationAndAccount180 value) {
        this.brkr = value;
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
    public OtherParties35 addInvstr(PartyIdentificationAndAccount179 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
