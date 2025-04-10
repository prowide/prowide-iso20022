
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of a non-received card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardNotReceivedDetails1", propOrder = {
    "dtOfCardMld",
    "mlngAdr",
    "mlngAdrUstrd",
    "mldFrPstlCd",
    "vldFr",
    "cardSctyCdInd",
    "cardSctyCpblty"
})
public class CardNotReceivedDetails1 {

    @XmlElement(name = "DtOfCardMld", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfCardMld;
    @XmlElement(name = "MlngAdr")
    protected Address1 mlngAdr;
    @XmlElement(name = "MlngAdrUstrd")
    protected String mlngAdrUstrd;
    @XmlElement(name = "MldFrPstlCd", required = true)
    protected String mldFrPstlCd;
    @XmlElement(name = "VldFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldFr;
    @XmlElement(name = "CardSctyCdInd")
    protected Boolean cardSctyCdInd;
    @XmlElement(name = "CardSctyCpblty")
    protected List<CardSecurityCapability1> cardSctyCpblty;

    /**
     * Gets the value of the dtOfCardMld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfCardMld() {
        return dtOfCardMld;
    }

    /**
     * Sets the value of the dtOfCardMld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails1 setDtOfCardMld(LocalDate value) {
        this.dtOfCardMld = value;
        return this;
    }

    /**
     * Gets the value of the mlngAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getMlngAdr() {
        return mlngAdr;
    }

    /**
     * Sets the value of the mlngAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public CardNotReceivedDetails1 setMlngAdr(Address1 value) {
        this.mlngAdr = value;
        return this;
    }

    /**
     * Gets the value of the mlngAdrUstrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlngAdrUstrd() {
        return mlngAdrUstrd;
    }

    /**
     * Sets the value of the mlngAdrUstrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails1 setMlngAdrUstrd(String value) {
        this.mlngAdrUstrd = value;
        return this;
    }

    /**
     * Gets the value of the mldFrPstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMldFrPstlCd() {
        return mldFrPstlCd;
    }

    /**
     * Sets the value of the mldFrPstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails1 setMldFrPstlCd(String value) {
        this.mldFrPstlCd = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails1 setVldFr(LocalDate value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the cardSctyCdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardSctyCdInd() {
        return cardSctyCdInd;
    }

    /**
     * Sets the value of the cardSctyCdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardNotReceivedDetails1 setCardSctyCdInd(Boolean value) {
        this.cardSctyCdInd = value;
        return this;
    }

    /**
     * Gets the value of the cardSctyCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardSctyCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSctyCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardSecurityCapability1 }
     * 
     * 
     * @return
     *     The value of the cardSctyCpblty property.
     */
    public List<CardSecurityCapability1> getCardSctyCpblty() {
        if (cardSctyCpblty == null) {
            cardSctyCpblty = new ArrayList<>();
        }
        return this.cardSctyCpblty;
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
     * Adds a new item to the cardSctyCpblty list.
     * @see #getCardSctyCpblty()
     * 
     */
    public CardNotReceivedDetails1 addCardSctyCpblty(CardSecurityCapability1 cardSctyCpblty) {
        getCardSctyCpblty().add(cardSctyCpblty);
        return this;
    }

}
