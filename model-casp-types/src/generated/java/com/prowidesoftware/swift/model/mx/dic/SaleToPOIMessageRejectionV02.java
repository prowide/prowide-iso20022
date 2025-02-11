
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
 * The SaleToPOIMessageRejection message is sent by one of the parties when it detects a technical or functional error in a previous received message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIMessageRejectionV02", propOrder = {
    "hdr",
    "rjct"
})
public class SaleToPOIMessageRejectionV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "Rjct", required = true)
    protected AcceptorRejection2 rjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public SaleToPOIMessageRejectionV02 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rjct property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejection2 }
     *     
     */
    public AcceptorRejection2 getRjct() {
        return rjct;
    }

    /**
     * Sets the value of the rjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejection2 }
     *     
     */
    public SaleToPOIMessageRejectionV02 setRjct(AcceptorRejection2 value) {
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
