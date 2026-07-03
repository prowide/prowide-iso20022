
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
@XmlType(name = "CardPaymentDataSetTransaction8Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn"
})
public class CardPaymentDataSetTransaction8Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction30 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction31 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction32 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction33 authstnRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction30 }
     *     
     */
    public CardPaymentDataSetTransaction30 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction30 }
     *     
     */
    public CardPaymentDataSetTransaction8Choice setCmpltn(CardPaymentDataSetTransaction30 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction31 }
     *     
     */
    public CardPaymentDataSetTransaction31 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction31 }
     *     
     */
    public CardPaymentDataSetTransaction8Choice setCxl(CardPaymentDataSetTransaction31 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction32 }
     *     
     */
    public CardPaymentDataSetTransaction32 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction32 }
     *     
     */
    public CardPaymentDataSetTransaction8Choice setAuthstnReq(CardPaymentDataSetTransaction32 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction33 }
     *     
     */
    public CardPaymentDataSetTransaction33 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction33 }
     *     
     */
    public CardPaymentDataSetTransaction8Choice setAuthstnRspn(CardPaymentDataSetTransaction33 value) {
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
