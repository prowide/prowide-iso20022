
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
 * The AcquirerRejection message is sent by any party, to reject an Acquirer to Issuer message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerRejection", propOrder = {
    "hdr",
    "rjct"
})
public class AcquirerRejection {

    @XmlElement(name = "Hdr", required = true)
    protected Header19 hdr;
    @XmlElement(name = "Rjct", required = true)
    protected AcceptorRejection4 rjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header19 }
     *     
     */
    public Header19 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header19 }
     *     
     */
    public AcquirerRejection setHdr(Header19 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rjct property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejection4 }
     *     
     */
    public AcceptorRejection4 getRjct() {
        return rjct;
    }

    /**
     * Sets the value of the rjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejection4 }
     *     
     */
    public AcquirerRejection setRjct(AcceptorRejection4 value) {
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
