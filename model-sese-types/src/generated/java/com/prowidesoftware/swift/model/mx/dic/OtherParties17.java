
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
 * Other parties information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties17", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "brkr"
})
public class OtherParties17 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount73> invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount74 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount74 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount74 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount74 trptyAgt;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount67 brkr;

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
     * {@link PartyIdentificationAndAccount73 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount73> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount73>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public PartyIdentificationAndAccount74 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public OtherParties17 setQlfdFrgnIntrmy(PartyIdentificationAndAccount74 value) {
        this.qlfdFrgnIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public PartyIdentificationAndAccount74 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public OtherParties17 setStockXchg(PartyIdentificationAndAccount74 value) {
        this.stockXchg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public PartyIdentificationAndAccount74 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public OtherParties17 setTradRgltr(PartyIdentificationAndAccount74 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public PartyIdentificationAndAccount74 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount74 }
     *     
     */
    public OtherParties17 setTrptyAgt(PartyIdentificationAndAccount74 value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount67 }
     *     
     */
    public PartyIdentificationAndAccount67 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount67 }
     *     
     */
    public OtherParties17 setBrkr(PartyIdentificationAndAccount67 value) {
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
    public OtherParties17 addInvstr(PartyIdentificationAndAccount73 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
