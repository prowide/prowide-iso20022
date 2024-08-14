
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
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to notify the acquirer (or its agent) of the outcome of the payment at the acceptor, and to transfer the financial data of the transaction to the acquirer (capture).
 * A AcceptorCompletionAdvice message is also sent to reverse an approved authorisation and any associated financial transfer (capture), if the card payment transaction could not be completed successfully.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdviceV11", propOrder = {
    "hdr",
    "cmpltnAdvc",
    "sctyTrlr"
})
public class AcceptorCompletionAdviceV11 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "CmpltnAdvc", required = true)
    protected AcceptorCompletionAdvice11 cmpltnAdvc;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType31 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header59 }
     *     
     */
    public Header59 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header59 }
     *     
     */
    public AcceptorCompletionAdviceV11 setHdr(Header59 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice11 }
     *     
     */
    public AcceptorCompletionAdvice11 getCmpltnAdvc() {
        return cmpltnAdvc;
    }

    /**
     * Sets the value of the cmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice11 }
     *     
     */
    public AcceptorCompletionAdviceV11 setCmpltnAdvc(AcceptorCompletionAdvice11 value) {
        this.cmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType31 }
     *     
     */
    public ContentInformationType31 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType31 }
     *     
     */
    public AcceptorCompletionAdviceV11 setSctyTrlr(ContentInformationType31 value) {
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
