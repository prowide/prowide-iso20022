
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
@XmlType(name = "CardPaymentDataSetTransaction2Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn"
})
public class CardPaymentDataSetTransaction2Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction6 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction7 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction8 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction9 authstnRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction6 }
     *     
     */
    public CardPaymentDataSetTransaction6 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction6 }
     *     
     */
    public CardPaymentDataSetTransaction2Choice setCmpltn(CardPaymentDataSetTransaction6 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction7 }
     *     
     */
    public CardPaymentDataSetTransaction7 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction7 }
     *     
     */
    public CardPaymentDataSetTransaction2Choice setCxl(CardPaymentDataSetTransaction7 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction8 }
     *     
     */
    public CardPaymentDataSetTransaction8 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction8 }
     *     
     */
    public CardPaymentDataSetTransaction2Choice setAuthstnReq(CardPaymentDataSetTransaction8 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction9 }
     *     
     */
    public CardPaymentDataSetTransaction9 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction9 }
     *     
     */
    public CardPaymentDataSetTransaction2Choice setAuthstnRspn(CardPaymentDataSetTransaction9 value) {
        this.authstnRspn = value;
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
