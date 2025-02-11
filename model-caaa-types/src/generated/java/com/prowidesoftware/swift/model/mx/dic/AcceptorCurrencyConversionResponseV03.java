
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
@XmlType(name = "AcceptorCurrencyConversionResponseV03", propOrder = {
    "hdr",
    "ccyConvsRspn",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header30 hdr;
    @XmlElement(name = "CcyConvsRspn", required = true)
    protected AcceptorCurrencyConversionResponse3 ccyConvsRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header30 }
     *     
     */
    public Header30 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header30 }
     *     
     */
    public AcceptorCurrencyConversionResponseV03 setHdr(Header30 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionResponse3 }
     *     
     */
    public AcceptorCurrencyConversionResponse3 getCcyConvsRspn() {
        return ccyConvsRspn;
    }

    /**
     * Sets the value of the ccyConvsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionResponse3 }
     *     
     */
    public AcceptorCurrencyConversionResponseV03 setCcyConvsRspn(AcceptorCurrencyConversionResponse3 value) {
        this.ccyConvsRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public AcceptorCurrencyConversionResponseV03 setSctyTrlr(ContentInformationType15 value) {
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
