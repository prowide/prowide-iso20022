
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
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to request the cancellation of a successfully completed transaction. Cancellation should only occur before the transaction has been cleared.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationRequestV08", propOrder = {
    "hdr",
    "cxlReq",
    "sctyTrlr"
})
public class AcceptorCancellationRequestV08 {

    @XmlElement(name = "Hdr", required = true)
    protected Header35 hdr;
    @XmlElement(name = "CxlReq", required = true)
    protected AcceptorCancellationRequest8 cxlReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType16 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header35 }
     *     
     */
    public Header35 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header35 }
     *     
     */
    public AcceptorCancellationRequestV08 setHdr(Header35 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationRequest8 }
     *     
     */
    public AcceptorCancellationRequest8 getCxlReq() {
        return cxlReq;
    }

    /**
     * Sets the value of the cxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationRequest8 }
     *     
     */
    public AcceptorCancellationRequestV08 setCxlReq(AcceptorCancellationRequest8 value) {
        this.cxlReq = value;
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
    public AcceptorCancellationRequestV08 setSctyTrlr(ContentInformationType16 value) {
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
