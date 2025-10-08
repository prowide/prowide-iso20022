
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
 * Status and quantity information related to a rejected instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedStatus11", propOrder = {
    "rjctdQty",
    "rjctdRsn"
})
public class RejectedStatus11 {

    @XmlElement(name = "RjctdQty")
    protected Quantity51Choice rjctdQty;
    @XmlElement(name = "RjctdRsn", required = true)
    protected RejectedStatus56Choice rjctdRsn;

    /**
     * Gets the value of the rjctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getRjctdQty() {
        return rjctdQty;
    }

    /**
     * Sets the value of the rjctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public RejectedStatus11 setRjctdQty(Quantity51Choice value) {
        this.rjctdQty = value;
        return this;
    }

    /**
     * Gets the value of the rjctdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus56Choice }
     *     
     */
    public RejectedStatus56Choice getRjctdRsn() {
        return rjctdRsn;
    }

    /**
     * Sets the value of the rjctdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus56Choice }
     *     
     */
    public RejectedStatus11 setRjctdRsn(RejectedStatus56Choice value) {
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
