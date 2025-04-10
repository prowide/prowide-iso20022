
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Used to subscribe or unsubscribe for the receipt of a certain message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRequest", propOrder = {
    "sbcptReq"
})
public class SubscriptionRequest {

    @XmlElement(name = "SbcptReq", required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionRequest1Code sbcptReq;

    /**
     * Gets the value of the sbcptReq property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest1Code }
     *     
     */
    public SubscriptionRequest1Code getSbcptReq() {
        return sbcptReq;
    }

    /**
     * Sets the value of the sbcptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest1Code }
     *     
     */
    public SubscriptionRequest setSbcptReq(SubscriptionRequest1Code value) {
        this.sbcptReq = value;
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
