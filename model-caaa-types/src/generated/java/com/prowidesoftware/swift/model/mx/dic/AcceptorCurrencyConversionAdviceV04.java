
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
 * The AcceptorCurrencyConversionAdvice message is sent by the card acceptor to inform the currency conversion service provider of the outcome of the card currency conversion.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionAdviceV04", propOrder = {
    "hdr",
    "accptrCcyConvsAdvc",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionAdviceV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header58 hdr;
    @XmlElement(name = "AccptrCcyConvsAdvc", required = true)
    protected AcceptorCurrencyConversionAdvice4 accptrCcyConvsAdvc;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType24 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header58 }
     *     
     */
    public Header58 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header58 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV04 setHdr(Header58 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCcyConvsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionAdvice4 }
     *     
     */
    public AcceptorCurrencyConversionAdvice4 getAccptrCcyConvsAdvc() {
        return accptrCcyConvsAdvc;
    }

    /**
     * Sets the value of the accptrCcyConvsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionAdvice4 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV04 setAccptrCcyConvsAdvc(AcceptorCurrencyConversionAdvice4 value) {
        this.accptrCcyConvsAdvc = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType24 }
     *     
     */
    public ContentInformationType24 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType24 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV04 setSctyTrlr(ContentInformationType24 value) {
        this.sctyTrlr = value;
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
