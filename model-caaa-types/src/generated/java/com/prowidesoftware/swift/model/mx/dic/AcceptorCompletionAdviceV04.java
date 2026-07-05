
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
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to notify the acquirer (or its agent) of the outcome of the payment at the acceptor, and to transfer the financial data of the transaction to the acquirer (capture).
 * A AcceptorCompletionAdvice message is also sent to reverse an approved authorisation and any associated financial transfer (capture), if the card payment transaction could not be completed successfully.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdviceV04", propOrder = {
    "hdr",
    "cmpltnAdvc",
    "sctyTrlr"
})
public class AcceptorCompletionAdviceV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header11 hdr;
    @XmlElement(name = "CmpltnAdvc", required = true)
    protected AcceptorCompletionAdvice4 cmpltnAdvc;
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
    public AcceptorCompletionAdviceV04 setHdr(Header11 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice4 }
     *     
     */
    public AcceptorCompletionAdvice4 getCmpltnAdvc() {
        return cmpltnAdvc;
    }

    /**
     * Sets the value of the cmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice4 }
     *     
     */
    public AcceptorCompletionAdviceV04 setCmpltnAdvc(AcceptorCompletionAdvice4 value) {
        this.cmpltnAdvc = value;
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
    public AcceptorCompletionAdviceV04 setSctyTrlr(ContentInformationType11 value) {
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
