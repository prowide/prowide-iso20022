
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
 * Card payment transaction choice between cancellation, authorisation request and authorisation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSetTransaction14Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction14Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction55 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction54 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction56 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction57 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent6 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent6 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction55 }
     *     
     */
    public CardPaymentDataSetTransaction55 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction55 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setCmpltn(CardPaymentDataSetTransaction55 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction54 }
     *     
     */
    public CardPaymentDataSetTransaction54 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction54 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setCxl(CardPaymentDataSetTransaction54 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction56 }
     *     
     */
    public CardPaymentDataSetTransaction56 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction56 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setAuthstnReq(CardPaymentDataSetTransaction56 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction57 }
     *     
     */
    public CardPaymentDataSetTransaction57 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction57 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setAuthstnRspn(CardPaymentDataSetTransaction57 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent6 }
     *     
     */
    public TokenRequestComponent6 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent6 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setTknReq(TokenRequestComponent6 value) {
        this.tknReq = value;
        return this;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent6 }
     *     
     */
    public TokenRequestComponent6 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent6 }
     *     
     */
    public CardPaymentDataSetTransaction14Choice setTknRspn(TokenRequestComponent6 value) {
        this.tknRspn = value;
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
