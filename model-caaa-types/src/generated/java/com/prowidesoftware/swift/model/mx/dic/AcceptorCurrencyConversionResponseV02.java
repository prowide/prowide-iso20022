
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
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion service provider to the card acceptor to return the result of a potential currency conversion for the cardholder.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionResponseV02", propOrder = {
    "hdr",
    "ccyConvsRspn",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header10 hdr;
    @XmlElement(name = "CcyConvsRspn", required = true)
    protected AcceptorCurrencyConversionResponse2 ccyConvsRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType11 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header10 }
     *     
     */
    public Header10 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header10 }
     *     
     */
    public AcceptorCurrencyConversionResponseV02 setHdr(Header10 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionResponse2 }
     *     
     */
    public AcceptorCurrencyConversionResponse2 getCcyConvsRspn() {
        return ccyConvsRspn;
    }

    /**
     * Sets the value of the ccyConvsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionResponse2 }
     *     
     */
    public AcceptorCurrencyConversionResponseV02 setCcyConvsRspn(AcceptorCurrencyConversionResponse2 value) {
        this.ccyConvsRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType11 }
     *     
     */
    public ContentInformationType11 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType11 }
     *     
     */
    public AcceptorCurrencyConversionResponseV02 setSctyTrlr(ContentInformationType11 value) {
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
