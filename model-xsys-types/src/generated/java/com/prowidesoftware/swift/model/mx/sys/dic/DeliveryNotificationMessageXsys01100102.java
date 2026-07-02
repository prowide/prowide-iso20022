
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
 * Java class for DeliveryNotificationMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNotificationMessage", propOrder = {
    "dlvryNtfctn"
})
public class DeliveryNotificationMessageXsys01100102 {

    @XmlElement(name = "DlvryNtfctn", required = true)
    protected DeliveryNotification dlvryNtfctn;

    /**
     * Gets the value of the dlvryNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotification }
     *     
     */
    public DeliveryNotification getDlvryNtfctn() {
        return dlvryNtfctn;
    }

    /**
     * Sets the value of the dlvryNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotification }
     *     
     */
    public DeliveryNotificationMessageXsys01100102 setDlvryNtfctn(DeliveryNotification value) {
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
