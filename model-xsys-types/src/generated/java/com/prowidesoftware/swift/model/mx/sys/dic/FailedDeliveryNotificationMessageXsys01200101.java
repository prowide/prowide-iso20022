
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for FailedDeliveryNotificationMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedDeliveryNotificationMessage", propOrder = {
    "dlvryNtfctn"
})
public class FailedDeliveryNotificationMessageXsys01200101 {

    @XmlElement(name = "DlvryNtfctn", required = true)
    protected DeliveryNotificationXsys01200101 dlvryNtfctn;

    /**
     * Gets the value of the dlvryNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotificationXsys01200101 }
     *     
     */
    public DeliveryNotificationXsys01200101 getDlvryNtfctn() {
        return dlvryNtfctn;
    }

    /**
     * Sets the value of the dlvryNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotificationXsys01200101 }
     *     
     */
    public FailedDeliveryNotificationMessageXsys01200101 setDlvryNtfctn(DeliveryNotificationXsys01200101 value) {
        this.dlvryNtfctn = value;
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
