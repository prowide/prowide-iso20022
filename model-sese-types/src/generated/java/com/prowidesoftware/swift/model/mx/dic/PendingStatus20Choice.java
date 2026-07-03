
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
 * Choice of format for the matching status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatus20Choice", propOrder = {
    "fwdd",
    "udrInvstgtn"
})
public class PendingStatus20Choice {

    @XmlElement(name = "Fwdd")
    protected NoSpecifiedReason1 fwdd;
    @XmlElement(name = "UdrInvstgtn")
    protected NoSpecifiedReason1 udrInvstgtn;

    /**
     * Gets the value of the fwdd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getFwdd() {
        return fwdd;
    }

    /**
     * Sets the value of the fwdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public PendingStatus20Choice setFwdd(NoSpecifiedReason1 value) {
        this.fwdd = value;
        return this;
    }

    /**
     * Gets the value of the udrInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getUdrInvstgtn() {
        return udrInvstgtn;
    }

    /**
     * Sets the value of the udrInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public PendingStatus20Choice setUdrInvstgtn(NoSpecifiedReason1 value) {
        this.udrInvstgtn = value;
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
