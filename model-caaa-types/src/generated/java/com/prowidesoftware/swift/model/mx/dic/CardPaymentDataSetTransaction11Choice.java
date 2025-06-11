
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
@XmlType(name = "CardPaymentDataSetTransaction11Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction11Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction42 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction43 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction44 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction45 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent3 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent3 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction42 }
     *     
     */
    public CardPaymentDataSetTransaction42 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction42 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setCmpltn(CardPaymentDataSetTransaction42 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction43 }
     *     
     */
    public CardPaymentDataSetTransaction43 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction43 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setCxl(CardPaymentDataSetTransaction43 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction44 }
     *     
     */
    public CardPaymentDataSetTransaction44 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction44 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setAuthstnReq(CardPaymentDataSetTransaction44 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction45 }
     *     
     */
    public CardPaymentDataSetTransaction45 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction45 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setAuthstnRspn(CardPaymentDataSetTransaction45 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public TokenRequestComponent3 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setTknReq(TokenRequestComponent3 value) {
        this.tknReq = value;
        return this;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public TokenRequestComponent3 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public CardPaymentDataSetTransaction11Choice setTknRspn(TokenRequestComponent3 value) {
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
