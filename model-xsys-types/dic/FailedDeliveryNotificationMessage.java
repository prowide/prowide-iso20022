
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
public class FailedDeliveryNotificationMessage {

    @XmlElement(name = "DlvryNtfctn", required = true)
    protected DeliveryNotificationXsys01200102 dlvryNtfctn;

    /**
     * Gets the value of the dlvryNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotificationXsys01200102 }
     *     
     */
    public DeliveryNotificationXsys01200102 getDlvryNtfctn() {
        return dlvryNtfctn;
    }

    /**
     * Sets the value of the dlvryNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotificationXsys01200102 }
     *     
     */
    public FailedDeliveryNotificationMessage setDlvryNtfctn(DeliveryNotificationXsys01200102 value) {
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
