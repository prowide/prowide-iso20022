
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
 * Additional references linked to the cross order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference11", propOrder = {
    "ioiId",
    "qtId"
})
public class Reference11 {

    @XmlElement(name = "IOIId")
    protected String ioiId;
    @XmlElement(name = "QtId")
    protected String qtId;

    /**
     * Gets the value of the ioiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIId() {
        return ioiId;
    }

    /**
     * Sets the value of the ioiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference11 setIOIId(String value) {
        this.ioiId = value;
        return this;
    }

    /**
     * Gets the value of the qtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtId() {
        return qtId;
    }

    /**
     * Sets the value of the qtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference11 setQtId(String value) {
        this.qtId = value;
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
