
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
 * Scope
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer to acknowledge the proper reception of the AcceptorCancellationAdvice. The message can be sent directly to the card acceptor or through an agent.
 * Usage
 * The AcceptorCancellationAdviceResponse message should be accepted by the card acceptor unless the message received was invalid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceResponseV01", propOrder = {
    "hdr",
    "accptrCxlAdvcRspn",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header2 hdr;
    @XmlElement(name = "AccptrCxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponse1 accptrCxlAdvcRspn;
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
    public AcceptorCancellationAdviceResponseV01 setHdr(Header2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse1 }
     *     
     */
    public AcceptorCancellationAdviceResponse1 getAccptrCxlAdvcRspn() {
        return accptrCxlAdvcRspn;
    }

    /**
     * Sets the value of the accptrCxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse1 }
     *     
     */
    public AcceptorCancellationAdviceResponseV01 setAccptrCxlAdvcRspn(AcceptorCancellationAdviceResponse1 value) {
        this.accptrCxlAdvcRspn = value;
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
    public AcceptorCancellationAdviceResponseV01 setSctyTrlr(ContentInformationType3 value) {
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
