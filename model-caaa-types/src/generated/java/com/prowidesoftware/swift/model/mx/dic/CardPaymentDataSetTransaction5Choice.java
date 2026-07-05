
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
@XmlType(name = "CardPaymentDataSetTransaction5Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn"
})
public class CardPaymentDataSetTransaction5Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction18 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction19 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction20 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction21 authstnRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction18 }
     *     
     */
    public CardPaymentDataSetTransaction18 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction18 }
     *     
     */
    public CardPaymentDataSetTransaction5Choice setCmpltn(CardPaymentDataSetTransaction18 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction19 }
     *     
     */
    public CardPaymentDataSetTransaction19 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction19 }
     *     
     */
    public CardPaymentDataSetTransaction5Choice setCxl(CardPaymentDataSetTransaction19 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction20 }
     *     
     */
    public CardPaymentDataSetTransaction20 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction20 }
     *     
     */
    public CardPaymentDataSetTransaction5Choice setAuthstnReq(CardPaymentDataSetTransaction20 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction21 }
     *     
     */
    public CardPaymentDataSetTransaction21 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction21 }
     *     
     */
    public CardPaymentDataSetTransaction5Choice setAuthstnRspn(CardPaymentDataSetTransaction21 value) {
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
