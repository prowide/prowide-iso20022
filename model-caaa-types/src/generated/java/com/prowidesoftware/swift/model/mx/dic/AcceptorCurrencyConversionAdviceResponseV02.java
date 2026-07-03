
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
@XmlType(name = "AcceptorCurrencyConversionAdviceResponseV02", propOrder = {
    "hdr",
    "ccyConvsAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCurrencyConversionAdviceResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header36 hdr;
    @XmlElement(name = "CcyConvsAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse7 ccyConvsAdvcRspn;
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
    public AcceptorCurrencyConversionAdviceResponseV02 setHdr(Header36 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse7 }
     *     
     */
    public AcceptorCancellationAdviceResponse7 getCcyConvsAdvcRspn() {
        return ccyConvsAdvcRspn;
    }

    /**
     * Sets the value of the ccyConvsAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse7 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV02 setCcyConvsAdvcRspn(AcceptorCancellationAdviceResponse7 value) {
        this.ccyConvsAdvcRspn = value;
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
    public AcceptorCurrencyConversionAdviceResponseV02 setSctyTrlr(ContentInformationType16 value) {
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
