
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
 * Scope
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer to acknowledge the proper receipt of an AcceptorCompletionAdvice. The message can be sent directly to the card acceptor or through an agent.
 * Usage
 * The AcceptorCompletionAdviceResponse message is used to acknowledge the data capture process performed by the acquirer based on the data required to carry out the financial clearing and settlement of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdviceResponseV01", propOrder = {
    "hdr",
    "cmpltnAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCompletionAdviceResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header2 hdr;
    @XmlElement(name = "CmpltnAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponse1 cmpltnAdvcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType3 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header2 }
     *     
     */
    public Header2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header2 }
     *     
     */
    public AcceptorCompletionAdviceResponseV01 setHdr(Header2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse1 }
     *     
     */
    public AcceptorCompletionAdviceResponse1 getCmpltnAdvcRspn() {
        return cmpltnAdvcRspn;
    }

    /**
     * Sets the value of the cmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse1 }
     *     
     */
    public AcceptorCompletionAdviceResponseV01 setCmpltnAdvcRspn(AcceptorCompletionAdviceResponse1 value) {
        this.cmpltnAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType3 }
     *     
     */
    public ContentInformationType3 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType3 }
     *     
     */
    public AcceptorCompletionAdviceResponseV01 setSctyTrlr(ContentInformationType3 value) {
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
