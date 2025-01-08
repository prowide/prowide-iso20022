
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
@XmlType(name = "AcceptorCurrencyConversionAdviceV02", propOrder = {
    "hdr",
    "accptrCcyConvsAdvc",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionAdviceV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header36 hdr;
    @XmlElement(name = "AccptrCcyConvsAdvc", required = true)
    protected AcceptorCurrencyConversionAdvice2 accptrCcyConvsAdvc;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType16 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header36 }
     *     
     */
    public Header36 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header36 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV02 setHdr(Header36 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCcyConvsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionAdvice2 }
     *     
     */
    public AcceptorCurrencyConversionAdvice2 getAccptrCcyConvsAdvc() {
        return accptrCcyConvsAdvc;
    }

    /**
     * Sets the value of the accptrCcyConvsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionAdvice2 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV02 setAccptrCcyConvsAdvc(AcceptorCurrencyConversionAdvice2 value) {
        this.accptrCcyConvsAdvc = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType16 }
     *     
     */
    public ContentInformationType16 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType16 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV02 setSctyTrlr(ContentInformationType16 value) {
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
