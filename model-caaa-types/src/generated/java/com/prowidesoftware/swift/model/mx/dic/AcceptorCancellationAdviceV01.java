
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
 * The AcceptorCancellationAdvice message is sent by a card acceptor to notify the cancellation of a successfully completed card payment transaction. The message can be sent directly to the acquirer or through an agent.
 * Usage
 * The AcceptorCancellationAdvice message is sent by the card acceptor to an acquirer when the acquirer did not receive a correct response to the AcceptorCompletionAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceV01", propOrder = {
    "hdr",
    "cxlAdvc",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header2 hdr;
    @XmlElement(name = "CxlAdvc", required = true)
    protected AcceptorCancellationAdvice1 cxlAdvc;
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
    public AcceptorCancellationAdviceV01 setHdr(Header2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdvice1 }
     *     
     */
    public AcceptorCancellationAdvice1 getCxlAdvc() {
        return cxlAdvc;
    }

    /**
     * Sets the value of the cxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdvice1 }
     *     
     */
    public AcceptorCancellationAdviceV01 setCxlAdvc(AcceptorCancellationAdvice1 value) {
        this.cxlAdvc = value;
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
    public AcceptorCancellationAdviceV01 setSctyTrlr(ContentInformationType3 value) {
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
