
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
 * Reason for a conditionally accepted status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionallyAcceptedStatusReason3", propOrder = {
    "rsn",
    "addtlInf"
})
public class ConditionallyAcceptedStatusReason3 {

    @XmlElement(name = "Rsn", required = true)
    protected ConditionallyAcceptedStatusReason3Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatusReason3Choice }
     *     
     */
    public ConditionallyAcceptedStatusReason3Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatusReason3Choice }
     *     
     */
    public ConditionallyAcceptedStatusReason3 setRsn(ConditionallyAcceptedStatusReason3Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ConditionallyAcceptedStatusReason3 setAddtlInf(String value) {
        this.addtlInf = value;
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
