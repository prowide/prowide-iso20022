
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
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or its agent) to acknowledge the acceptor (or its agent) about the notification of the payment cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceResponseV05", propOrder = {
    "hdr",
    "cxlAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceResponseV05 {

    @XmlElement(name = "Hdr", required = true)
    protected Header24 hdr;
    @XmlElement(name = "CxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse5 cxlAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header24 }
     *     
     */
    public Header24 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header24 }
     *     
     */
    public AcceptorCancellationAdviceResponseV05 setHdr(Header24 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse5 }
     *     
     */
    public AcceptorCancellationAdviceResponse5 getCxlAdvcRspn() {
        return cxlAdvcRspn;
    }

    /**
     * Sets the value of the cxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse5 }
     *     
     */
    public AcceptorCancellationAdviceResponseV05 setCxlAdvcRspn(AcceptorCancellationAdviceResponse5 value) {
        this.cxlAdvcRspn = value;
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
    public AcceptorCancellationAdviceResponseV05 setSctyTrlr(ContentInformationType15 value) {
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
