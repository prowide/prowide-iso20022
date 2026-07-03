
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
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent) to notify the acquirer (or its agent) of the cancellation of a successfully completed transaction. The transaction has been completed without financial transfer, or the acceptor is aware that the transaction was not cleared by the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceV03", propOrder = {
    "hdr",
    "cxlAdvc",
    "sctyTrlr"
})
public class AcceptorCancellationAdviceV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header8 hdr;
    @XmlElement(name = "CxlAdvc", required = true)
    protected AcceptorCancellationAdvice3 cxlAdvc;
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
    public AcceptorCancellationAdviceV03 setHdr(Header8 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdvice3 }
     *     
     */
    public AcceptorCancellationAdvice3 getCxlAdvc() {
        return cxlAdvc;
    }

    /**
     * Sets the value of the cxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdvice3 }
     *     
     */
    public AcceptorCancellationAdviceV03 setCxlAdvc(AcceptorCancellationAdvice3 value) {
        this.cxlAdvc = value;
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
    public AcceptorCancellationAdviceV03 setSctyTrlr(ContentInformationType8 value) {
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
