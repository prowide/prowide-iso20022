
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
@XmlType(name = "CardPaymentDataSetTransaction1Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn"
})
public class CardPaymentDataSetTransaction1Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction2 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction3 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction4 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction5 authstnRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction2 }
     *     
     */
    public CardPaymentDataSetTransaction2 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction2 }
     *     
     */
    public CardPaymentDataSetTransaction1Choice setCmpltn(CardPaymentDataSetTransaction2 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction3 }
     *     
     */
    public CardPaymentDataSetTransaction3 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction3 }
     *     
     */
    public CardPaymentDataSetTransaction1Choice setCxl(CardPaymentDataSetTransaction3 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction4 }
     *     
     */
    public CardPaymentDataSetTransaction4 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction4 }
     *     
     */
    public CardPaymentDataSetTransaction1Choice setAuthstnReq(CardPaymentDataSetTransaction4 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction5 }
     *     
     */
    public CardPaymentDataSetTransaction5 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction5 }
     *     
     */
    public CardPaymentDataSetTransaction1Choice setAuthstnRspn(CardPaymentDataSetTransaction5 value) {
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
