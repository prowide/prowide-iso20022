
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
 * Choice between a reason or no reason for the corporate action instruction or instruction cancellation cancelled/cancellation completed status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledStatus5", propOrder = {
    "cancQty",
    "cxlRsn"
})
public class CancelledStatus5 {

    @XmlElement(name = "CancQty")
    protected Quantity51Choice cancQty;
    @XmlElement(name = "CxlRsn", required = true)
    protected CancelledStatus12Choice cxlRsn;

    /**
     * Gets the value of the cancQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getCancQty() {
        return cancQty;
    }

    /**
     * Sets the value of the cancQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public CancelledStatus5 setCancQty(Quantity51Choice value) {
        this.cancQty = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public CancelledStatus12Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public CancelledStatus5 setCxlRsn(CancelledStatus12Choice value) {
        this.cxlRsn = value;
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
