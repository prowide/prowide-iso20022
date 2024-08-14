
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
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent) to notify the acquirer (or its agent) of the cancellation of a successfully completed transaction. The transaction has been completed without financial transfer, or the acceptor is aware that the transaction was not cleared by the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceV11", propOrder = {
    "hdr",
    "cxlAdvc",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceV11 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "CxlAdvc", required = true)
    protected AcceptorCancellationAdvice11 cxlAdvc;
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
    public AcceptorCancellationAdviceV11 setHdr(Header59 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdvice11 }
     *     
     */
    public AcceptorCancellationAdvice11 getCxlAdvc() {
        return cxlAdvc;
    }

    /**
     * Sets the value of the cxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdvice11 }
     *     
     */
    public AcceptorCancellationAdviceV11 setCxlAdvc(AcceptorCancellationAdvice11 value) {
        this.cxlAdvc = value;
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
    public AcceptorCancellationAdviceV11 setSctyTrlr(ContentInformationType31 value) {
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
