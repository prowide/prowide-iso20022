
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
public class DeliveryNotificationMessage {

    @XmlElement(name = "DlvryNtfctn", required = true)
    protected DeliveryNotificationXsys01100101 dlvryNtfctn;

    /**
     * Gets the value of the dlvryNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotificationXsys01100101 }
     *     
     */
    public DeliveryNotificationXsys01100101 getDlvryNtfctn() {
        return dlvryNtfctn;
    }

    /**
     * Sets the value of the dlvryNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotificationXsys01100101 }
     *     
     */
    public DeliveryNotificationMessage setDlvryNtfctn(DeliveryNotificationXsys01100101 value) {
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
