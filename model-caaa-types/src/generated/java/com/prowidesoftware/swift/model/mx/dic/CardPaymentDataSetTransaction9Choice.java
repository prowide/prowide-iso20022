
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
@XmlType(name = "CardPaymentDataSetTransaction9Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction9Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction34 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction35 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction36 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction37 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent1 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent1 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction34 }
     *     
     */
    public CardPaymentDataSetTransaction34 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction34 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setCmpltn(CardPaymentDataSetTransaction34 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction35 }
     *     
     */
    public CardPaymentDataSetTransaction35 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction35 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setCxl(CardPaymentDataSetTransaction35 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction36 }
     *     
     */
    public CardPaymentDataSetTransaction36 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction36 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setAuthstnReq(CardPaymentDataSetTransaction36 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction37 }
     *     
     */
    public CardPaymentDataSetTransaction37 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction37 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setAuthstnRspn(CardPaymentDataSetTransaction37 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent1 }
     *     
     */
    public TokenRequestComponent1 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent1 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setTknReq(TokenRequestComponent1 value) {
        this.tknReq = value;
        return this;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent1 }
     *     
     */
    public TokenRequestComponent1 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent1 }
     *     
     */
    public CardPaymentDataSetTransaction9Choice setTknRspn(TokenRequestComponent1 value) {
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
