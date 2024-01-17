
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
 * Java class for WaitDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitDescriptor", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "sendReferenceVal"
})
public class SwIntWaitDescriptor {

    @XmlElement(name = "SendReferenceVal", required = true)
    protected String sendReferenceVal;

    /**
     * Gets the value of the sendReferenceVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendReferenceVal() {
        return sendReferenceVal;
    }

    /**
     * Sets the value of the sendReferenceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntWaitDescriptor setSendReferenceVal(String value) {
        this.sendReferenceVal = value;
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
