
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
 * The AcceptorRejection message is used by the acquirer to reject a message received from the card acceptor. The acquirer uses this message as a substitute to a response or an advice response message sent to the card acceptor.
 * Usage
 * The AcceptorRejection message is used to indicate that the received message could not be processed by the acquirer (for example, unable to read or process the message, security error, duplicate message).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorRejectionV01", propOrder = {
    "hdr",
    "rjct"
})
public class AcceptorRejectionV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "Rjct", required = true)
    protected AcceptorRejection1 rjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header1 }
     *     
     */
    public Header1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header1 }
     *     
     */
    public AcceptorRejectionV01 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rjct property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejection1 }
     *     
     */
    public AcceptorRejection1 getRjct() {
        return rjct;
    }

    /**
     * Sets the value of the rjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejection1 }
     *     
     */
    public AcceptorRejectionV01 setRjct(AcceptorRejection1 value) {
        this.rjct = value;
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
