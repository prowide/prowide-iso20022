
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
@XmlType(name = "AcceptorCancellationAdviceResponseV07", propOrder = {
    "hdr",
    "cxlAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceResponseV07 {

    @XmlElement(name = "Hdr", required = true)
    protected Header36 hdr;
    @XmlElement(name = "CxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse7 cxlAdvcRspn;
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
    public AcceptorCancellationAdviceResponseV07 setHdr(Header36 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse7 }
     *     
     */
    public AcceptorCancellationAdviceResponse7 getCxlAdvcRspn() {
        return cxlAdvcRspn;
    }

    /**
     * Sets the value of the cxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse7 }
     *     
     */
    public AcceptorCancellationAdviceResponseV07 setCxlAdvcRspn(AcceptorCancellationAdviceResponse7 value) {
        this.cxlAdvcRspn = value;
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
    public AcceptorCancellationAdviceResponseV07 setSctyTrlr(ContentInformationType16 value) {
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
