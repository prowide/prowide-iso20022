
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
 * Status and quantity information related to a rejected instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedStatus12", propOrder = {
    "rjctdQty",
    "rjctdRsn"
})
public class RejectedStatus12 {

    @XmlElement(name = "RjctdQty")
    protected Quantity54Choice rjctdQty;
    @XmlElement(name = "RjctdRsn", required = true)
    protected RejectedStatus61Choice rjctdRsn;

    /**
     * Gets the value of the rjctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getRjctdQty() {
        return rjctdQty;
    }

    /**
     * Sets the value of the rjctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public RejectedStatus12 setRjctdQty(Quantity54Choice value) {
        this.rjctdQty = value;
        return this;
    }

    /**
     * Gets the value of the rjctdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus61Choice }
     *     
     */
    public RejectedStatus61Choice getRjctdRsn() {
        return rjctdRsn;
    }

    /**
     * Sets the value of the rjctdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus61Choice }
     *     
     */
    public RejectedStatus12 setRjctdRsn(RejectedStatus61Choice value) {
        this.rjctdRsn = value;
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
