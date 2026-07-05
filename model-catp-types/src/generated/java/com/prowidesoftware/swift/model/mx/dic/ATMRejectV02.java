
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
@XmlType(name = "ATMRejectV02", propOrder = {
    "hdr",
    "atmRjct"
})
public class ATMRejectV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header33 hdr;
    @XmlElement(name = "ATMRjct", required = true)
    protected ATMReject2 atmRjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header33 }
     *     
     */
    public Header33 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header33 }
     *     
     */
    public ATMRejectV02 setHdr(Header33 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the atmRjct property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReject2 }
     *     
     */
    public ATMReject2 getATMRjct() {
        return atmRjct;
    }

    /**
     * Sets the value of the atmRjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReject2 }
     *     
     */
    public ATMRejectV02 setATMRjct(ATMReject2 value) {
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
