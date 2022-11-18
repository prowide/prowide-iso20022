
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CardPaymentDataSetTransaction10Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction10Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction41 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction39 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction40 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction38 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent2 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent2 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction41 }
     *     
     */
    public CardPaymentDataSetTransaction41 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction41 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setCmpltn(CardPaymentDataSetTransaction41 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction39 }
     *     
     */
    public CardPaymentDataSetTransaction39 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction39 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setCxl(CardPaymentDataSetTransaction39 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction40 }
     *     
     */
    public CardPaymentDataSetTransaction40 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction40 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setAuthstnReq(CardPaymentDataSetTransaction40 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction38 }
     *     
     */
    public CardPaymentDataSetTransaction38 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction38 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setAuthstnRspn(CardPaymentDataSetTransaction38 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent2 }
     *     
     */
    public TokenRequestComponent2 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent2 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setTknReq(TokenRequestComponent2 value) {
        this.tknReq = value;
        return this;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent2 }
     *     
     */
    public TokenRequestComponent2 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent2 }
     *     
     */
    public CardPaymentDataSetTransaction10Choice setTknRspn(TokenRequestComponent2 value) {
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
