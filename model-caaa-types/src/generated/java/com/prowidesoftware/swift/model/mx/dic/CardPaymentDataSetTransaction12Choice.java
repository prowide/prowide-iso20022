
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
@XmlType(name = "CardPaymentDataSetTransaction12Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction12Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction47 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction46 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction48 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction49 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent4 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent4 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction47 }
     *     
     */
    public CardPaymentDataSetTransaction47 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction47 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setCmpltn(CardPaymentDataSetTransaction47 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction46 }
     *     
     */
    public CardPaymentDataSetTransaction46 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction46 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setCxl(CardPaymentDataSetTransaction46 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction48 }
     *     
     */
    public CardPaymentDataSetTransaction48 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction48 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setAuthstnReq(CardPaymentDataSetTransaction48 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction49 }
     *     
     */
    public CardPaymentDataSetTransaction49 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction49 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setAuthstnRspn(CardPaymentDataSetTransaction49 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent4 }
     *     
     */
    public TokenRequestComponent4 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent4 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setTknReq(TokenRequestComponent4 value) {
        this.tknReq = value;
        return this;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent4 }
     *     
     */
    public TokenRequestComponent4 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent4 }
     *     
     */
    public CardPaymentDataSetTransaction12Choice setTknRspn(TokenRequestComponent4 value) {
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
