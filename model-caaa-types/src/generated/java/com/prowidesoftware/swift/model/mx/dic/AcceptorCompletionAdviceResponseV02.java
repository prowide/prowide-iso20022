
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
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer (or its agent) to acknowledge the acceptor (or its agent) of the outcome of the payment transaction, and the transfer the  financial data of the transaction contained in the completion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdviceResponseV02", propOrder = {
    "hdr",
    "cmpltnAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCompletionAdviceResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header2 hdr;
    @XmlElement(name = "CmpltnAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponse2 cmpltnAdvcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType6 sctyTrlr;

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
    public AcceptorCompletionAdviceResponseV02 setHdr(Header2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse2 }
     *     
     */
    public AcceptorCompletionAdviceResponse2 getCmpltnAdvcRspn() {
        return cmpltnAdvcRspn;
    }

    /**
     * Sets the value of the cmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse2 }
     *     
     */
    public AcceptorCompletionAdviceResponseV02 setCmpltnAdvcRspn(AcceptorCompletionAdviceResponse2 value) {
        this.cmpltnAdvcRspn = value;
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
    public AcceptorCompletionAdviceResponseV02 setSctyTrlr(ContentInformationType6 value) {
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
