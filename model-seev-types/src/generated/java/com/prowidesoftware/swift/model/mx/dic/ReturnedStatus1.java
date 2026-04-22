
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
 * Instructed units are returned or partially returned to the instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnedStatus1", propOrder = {
    "rtrdQty",
    "rtrdRsn"
})
public class ReturnedStatus1 {

    @XmlElement(name = "RtrdQty")
    protected Quantity51Choice rtrdQty;
    @XmlElement(name = "RtrdRsn", required = true)
    protected ReturnedStatus2Choice rtrdRsn;

    /**
     * Gets the value of the rtrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getRtrdQty() {
        return rtrdQty;
    }

    /**
     * Sets the value of the rtrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public ReturnedStatus1 setRtrdQty(Quantity51Choice value) {
        this.rtrdQty = value;
        return this;
    }

    /**
     * Gets the value of the rtrdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public ReturnedStatus2Choice getRtrdRsn() {
        return rtrdRsn;
    }

    /**
     * Sets the value of the rtrdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public ReturnedStatus1 setRtrdRsn(ReturnedStatus2Choice value) {
        this.rtrdRsn = value;
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
