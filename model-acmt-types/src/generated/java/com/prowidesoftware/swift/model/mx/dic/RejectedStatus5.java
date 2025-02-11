
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status is rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedStatus5", propOrder = {
    "rsn",
    "xtndedRsn"
})
public class RejectedStatus5 {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected RejectedStatusReason6Code rsn;
    @XmlElement(name = "XtndedRsn")
    protected String xtndedRsn;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatusReason6Code }
     *     
     */
    public RejectedStatusReason6Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatusReason6Code }
     *     
     */
    public RejectedStatus5 setRsn(RejectedStatusReason6Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRsn() {
        return xtndedRsn;
    }

    /**
     * Sets the value of the xtndedRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectedStatus5 setXtndedRsn(String value) {
        this.xtndedRsn = value;
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
