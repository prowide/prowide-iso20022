
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
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or its agent) to acknowledge the acceptor (or its agent) about the notification of the payment cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceResponseV04", propOrder = {
    "hdr",
    "cxlAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceResponseV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header11 hdr;
    @XmlElement(name = "CxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse4 cxlAdvcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType11 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header11 }
     *     
     */
    public Header11 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header11 }
     *     
     */
    public AcceptorCancellationAdviceResponseV04 setHdr(Header11 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse4 }
     *     
     */
    public AcceptorCancellationAdviceResponse4 getCxlAdvcRspn() {
        return cxlAdvcRspn;
    }

    /**
     * Sets the value of the cxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse4 }
     *     
     */
    public AcceptorCancellationAdviceResponseV04 setCxlAdvcRspn(AcceptorCancellationAdviceResponse4 value) {
        this.cxlAdvcRspn = value;
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
    public AcceptorCancellationAdviceResponseV04 setSctyTrlr(ContentInformationType11 value) {
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
