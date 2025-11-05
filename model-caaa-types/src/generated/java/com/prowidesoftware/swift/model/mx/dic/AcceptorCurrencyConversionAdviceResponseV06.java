
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
 * The AcceptorCurrencyConversionAdviceResponse message is sent by the service provider to acknowledge the acceptor about the notification of the reception of the currency conversion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionAdviceResponseV06", propOrder = {
    "hdr",
    "ccyConvsAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionAdviceResponseV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header70 hdr;
    @XmlElement(name = "CcyConvsAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse11 ccyConvsAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType36 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header70 }
     *     
     */
    public Header70 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header70 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV06 setHdr(Header70 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse11 }
     *     
     */
    public AcceptorCancellationAdviceResponse11 getCcyConvsAdvcRspn() {
        return ccyConvsAdvcRspn;
    }

    /**
     * Sets the value of the ccyConvsAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse11 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV06 setCcyConvsAdvcRspn(AcceptorCancellationAdviceResponse11 value) {
        this.ccyConvsAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType36 }
     *     
     */
    public ContentInformationType36 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType36 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV06 setSctyTrlr(ContentInformationType36 value) {
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
