
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
 * Java class for Status complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "urn:swift:snl:ns.SwGbl", propOrder = {
    "statusAttributes"
})
public class SwGblStatus {

    @XmlElement(name = "StatusAttributes", required = true)
    protected SwGblStatusAttributes statusAttributes;

    /**
     * Gets the value of the statusAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatusAttributes }
     *     
     */
    public SwGblStatusAttributes getStatusAttributes() {
        return statusAttributes;
    }

    /**
     * Sets the value of the statusAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatusAttributes }
     *     
     */
    public SwGblStatus setStatusAttributes(SwGblStatusAttributes value) {
        this.statusAttributes = value;
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
