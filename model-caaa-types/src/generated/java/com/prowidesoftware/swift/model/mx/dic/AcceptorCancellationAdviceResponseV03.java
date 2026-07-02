
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
@XmlType(name = "AcceptorCancellationAdviceResponseV03", propOrder = {
    "hdr",
    "cxlAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header8 hdr;
    @XmlElement(name = "CxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse3 cxlAdvcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType8 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header8 }
     *     
     */
    public Header8 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header8 }
     *     
     */
    public AcceptorCancellationAdviceResponseV03 setHdr(Header8 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse3 }
     *     
     */
    public AcceptorCancellationAdviceResponse3 getCxlAdvcRspn() {
        return cxlAdvcRspn;
    }

    /**
     * Sets the value of the cxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse3 }
     *     
     */
    public AcceptorCancellationAdviceResponseV03 setCxlAdvcRspn(AcceptorCancellationAdviceResponse3 value) {
        this.cxlAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType8 }
     *     
     */
    public ContentInformationType8 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType8 }
     *     
     */
    public AcceptorCancellationAdviceResponseV03 setSctyTrlr(ContentInformationType8 value) {
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
