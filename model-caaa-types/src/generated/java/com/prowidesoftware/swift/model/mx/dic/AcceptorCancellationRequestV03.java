
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
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to request the cancellation of a successfully completed transaction. Cancellation should only occur before the transaction has been cleared.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationRequestV03", propOrder = {
    "hdr",
    "cxlReq",
    "sctyTrlr"
})
public class AcceptorCancellationRequestV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header7 hdr;
    @XmlElement(name = "CxlReq", required = true)
    protected AcceptorCancellationRequest3 cxlReq;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType8 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header7 }
     *     
     */
    public Header7 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header7 }
     *     
     */
    public AcceptorCancellationRequestV03 setHdr(Header7 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationRequest3 }
     *     
     */
    public AcceptorCancellationRequest3 getCxlReq() {
        return cxlReq;
    }

    /**
     * Sets the value of the cxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationRequest3 }
     *     
     */
    public AcceptorCancellationRequestV03 setCxlReq(AcceptorCancellationRequest3 value) {
        this.cxlReq = value;
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
    public AcceptorCancellationRequestV03 setSctyTrlr(ContentInformationType8 value) {
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
