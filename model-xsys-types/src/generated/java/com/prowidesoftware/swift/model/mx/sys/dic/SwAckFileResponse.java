
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
 * Java class for AckFileResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AckFileResponse", propOrder = {
    "ackDescription",
    "ackInfo"
})
public class SwAckFileResponse {

    @XmlElement(name = "AckDescription")
    protected String ackDescription;
    @XmlElement(name = "AckInfo")
    protected String ackInfo;

    /**
     * Gets the value of the ackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckFileResponse setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * Gets the value of the ackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckInfo() {
        return ackInfo;
    }

    /**
     * Sets the value of the ackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckFileResponse setAckInfo(String value) {
        this.ackInfo = value;
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
