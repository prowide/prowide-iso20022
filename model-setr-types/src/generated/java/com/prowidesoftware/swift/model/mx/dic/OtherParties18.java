
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
 * Provides details about business parties involved in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties18", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "qlfdFrgnIntrmy"
})
public class OtherParties18 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount79> invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount87 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount87 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount83 trptyAgt;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount77 qlfdFrgnIntrmy;

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
     * {@link PartyIdentificationAndAccount79 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount79> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount79>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount87 }
     *     
     */
    public PartyIdentificationAndAccount87 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount87 }
     *     
     */
    public OtherParties18 setStockXchg(PartyIdentificationAndAccount87 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount87 }
     *     
     */
    public PartyIdentificationAndAccount87 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount87 }
     *     
     */
    public OtherParties18 setTradRgltr(PartyIdentificationAndAccount87 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount83 }
     *     
     */
    public PartyIdentificationAndAccount83 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount83 }
     *     
     */
    public OtherParties18 setTrptyAgt(PartyIdentificationAndAccount83 value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount77 }
     *     
     */
    public PartyIdentificationAndAccount77 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount77 }
     *     
     */
    public OtherParties18 setQlfdFrgnIntrmy(PartyIdentificationAndAccount77 value) {
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
    public OtherParties18 addInvstr(PartyIdentificationAndAccount79 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
