
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
 * The ATMReject message is sent by any entity to reject a received message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMRejectV01", propOrder = {
    "hdr",
    "atmRjct"
})
public class ATMRejectV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header22 hdr;
    @XmlElement(name = "ATMRjct", required = true)
    protected ATMReject1 atmRjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header22 }
     *     
     */
    public Header22 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header22 }
     *     
     */
    public ATMRejectV01 setHdr(Header22 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the atmRjct property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReject1 }
     *     
     */
    public ATMReject1 getATMRjct() {
        return atmRjct;
    }

    /**
     * Sets the value of the atmRjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReject1 }
     *     
     */
    public ATMRejectV01 setATMRjct(ATMReject1 value) {
        this.atmRjct = value;
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
