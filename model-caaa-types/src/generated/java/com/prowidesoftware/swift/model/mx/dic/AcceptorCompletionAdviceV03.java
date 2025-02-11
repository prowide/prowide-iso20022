
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
@XmlType(name = "AcceptorCompletionAdviceV03", propOrder = {
    "hdr",
    "cmpltnAdvc",
    "sctyTrlr"
})
public class AcceptorCompletionAdviceV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header8 hdr;
    @XmlElement(name = "CmpltnAdvc", required = true)
    protected AcceptorCompletionAdvice3 cmpltnAdvc;
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
    public AcceptorCompletionAdviceV03 setHdr(Header8 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice3 }
     *     
     */
    public AcceptorCompletionAdvice3 getCmpltnAdvc() {
        return cmpltnAdvc;
    }

    /**
     * Sets the value of the cmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice3 }
     *     
     */
    public AcceptorCompletionAdviceV03 setCmpltnAdvc(AcceptorCompletionAdvice3 value) {
        this.cmpltnAdvc = value;
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
    public AcceptorCompletionAdviceV03 setSctyTrlr(ContentInformationType8 value) {
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
