
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
 * Rejected status reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedStatusReason1Choice", propOrder = {
    "rsn",
    "prtry"
})
public class RejectedStatusReason1Choice {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected RejectedStatusReason10Code rsn;
    @XmlElement(name = "Prtry")
    protected GenericIdentification13 prtry;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatusReason10Code }
     *     
     */
    public RejectedStatusReason10Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatusReason10Code }
     *     
     */
    public RejectedStatusReason1Choice setRsn(RejectedStatusReason10Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public RejectedStatusReason1Choice setPrtry(GenericIdentification13 value) {
        this.prtry = value;
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
