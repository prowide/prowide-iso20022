
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
 * Java class for SnFOpResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFOpResponse", propOrder = {
    "notifySnFResponse"
})
public class SwSnFOpResponse {

    @XmlElement(name = "NotifySnFResponse", required = true)
    protected SwNotifySnFResponse notifySnFResponse;

    /**
     * Gets the value of the notifySnFResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwNotifySnFResponse }
     *     
     */
    public SwNotifySnFResponse getNotifySnFResponse() {
        return notifySnFResponse;
    }

    /**
     * Sets the value of the notifySnFResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwNotifySnFResponse }
     *     
     */
    public SwSnFOpResponse setNotifySnFResponse(SwNotifySnFResponse value) {
        this.notifySnFResponse = value;
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
