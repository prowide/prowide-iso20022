
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the reason for the status of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatusReason1", propOrder = {
    "cd"
})
public class TrackerStatusReason1 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected TrackerTransactionStatusReason1Code cd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerTransactionStatusReason1Code }
     *     
     */
    public TrackerTransactionStatusReason1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerTransactionStatusReason1Code }
     *     
     */
    public TrackerStatusReason1 setCd(TrackerTransactionStatusReason1Code value) {
        this.cd = value;
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
