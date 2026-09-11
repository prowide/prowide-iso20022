
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
 * Status and quantity information related to a forwarded instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardedStatus1", propOrder = {
    "fwddQty",
    "fwddRsn"
})
public class ForwardedStatus1 {

    @XmlElement(name = "FwddQty")
    protected Quantity51Choice fwddQty;
    @XmlElement(name = "FwddRsn", required = true)
    protected NoSpecifiedReason1 fwddRsn;

    /**
     * Gets the value of the fwddQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getFwddQty() {
        return fwddQty;
    }

    /**
     * Sets the value of the fwddQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public ForwardedStatus1 setFwddQty(Quantity51Choice value) {
        this.fwddQty = value;
        return this;
    }

    /**
     * Gets the value of the fwddRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getFwddRsn() {
        return fwddRsn;
    }

    /**
     * Sets the value of the fwddRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public ForwardedStatus1 setFwddRsn(NoSpecifiedReason1 value) {
        this.fwddRsn = value;
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
