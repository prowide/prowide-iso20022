
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
 * The AcceptorCurrencyConversionAdviceResponse message is sent by the service provider to acknowledge the acceptor about the notification of the reception of the currency conversion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionAdviceResponseV01", propOrder = {
    "hdr",
    "ccyConvsAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionAdviceResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header34 hdr;
    @XmlElement(name = "CcyConvsAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse6 ccyConvsAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header34 }
     *     
     */
    public Header34 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header34 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV01 setHdr(Header34 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse6 }
     *     
     */
    public AcceptorCancellationAdviceResponse6 getCcyConvsAdvcRspn() {
        return ccyConvsAdvcRspn;
    }

    /**
     * Sets the value of the ccyConvsAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse6 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV01 setCcyConvsAdvcRspn(AcceptorCancellationAdviceResponse6 value) {
        this.ccyConvsAdvcRspn = value;
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
    public AcceptorCurrencyConversionAdviceResponseV01 setSctyTrlr(ContentInformationType15 value) {
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
