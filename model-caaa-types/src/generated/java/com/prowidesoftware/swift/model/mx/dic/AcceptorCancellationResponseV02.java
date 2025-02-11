
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
 * The AcceptorCancellationResponse message is sent by the acquirer (or its agent) to an acceptor (or its agent), to return the outcome of the cancellation request. If the response is positive, the acquirer has voided the financial data from the captured transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationResponseV02", propOrder = {
    "hdr",
    "cxlRspn",
    "sctyTrlr"
})
public class AcceptorCancellationResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "CxlRspn", required = true)
    protected AcceptorCancellationResponse2 cxlRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType6 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header1 }
     *     
     */
    public Header1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header1 }
     *     
     */
    public AcceptorCancellationResponseV02 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationResponse2 }
     *     
     */
    public AcceptorCancellationResponse2 getCxlRspn() {
        return cxlRspn;
    }

    /**
     * Sets the value of the cxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationResponse2 }
     *     
     */
    public AcceptorCancellationResponseV02 setCxlRspn(AcceptorCancellationResponse2 value) {
        this.cxlRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType6 }
     *     
     */
    public ContentInformationType6 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType6 }
     *     
     */
    public AcceptorCancellationResponseV02 setSctyTrlr(ContentInformationType6 value) {
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
