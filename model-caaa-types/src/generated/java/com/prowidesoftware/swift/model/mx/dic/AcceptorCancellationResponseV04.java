
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
 * The AcceptorCancellationResponse message is sent by the acquirer (or its agent) to an acceptor (or its agent), to return the outcome of the cancellation request. If the response is positive, the acquirer has voided the financial data from the captured transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationResponseV04", propOrder = {
    "hdr",
    "cxlRspn",
    "sctyTrlr"
})
public class AcceptorCancellationResponseV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header10 hdr;
    @XmlElement(name = "CxlRspn", required = true)
    protected AcceptorCancellationResponse4 cxlRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType11 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header10 }
     *     
     */
    public Header10 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header10 }
     *     
     */
    public AcceptorCancellationResponseV04 setHdr(Header10 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationResponse4 }
     *     
     */
    public AcceptorCancellationResponse4 getCxlRspn() {
        return cxlRspn;
    }

    /**
     * Sets the value of the cxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationResponse4 }
     *     
     */
    public AcceptorCancellationResponseV04 setCxlRspn(AcceptorCancellationResponse4 value) {
        this.cxlRspn = value;
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
    public AcceptorCancellationResponseV04 setSctyTrlr(ContentInformationType11 value) {
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
