
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies reasons for the pending status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatusReason6", propOrder = {
    "rsnCd",
    "addtlRsnInf"
})
public class PendingStatusReason6 {

    @XmlElement(name = "RsnCd", required = true)
    protected PendingReason23Choice rsnCd;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason23Choice }
     *     
     */
    public PendingReason23Choice getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason23Choice }
     *     
     */
    public PendingStatusReason6 setRsnCd(PendingReason23Choice value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PendingStatusReason6 setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
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
