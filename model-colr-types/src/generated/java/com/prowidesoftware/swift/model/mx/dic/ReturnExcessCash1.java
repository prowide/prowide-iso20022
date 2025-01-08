
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
 * Identifies the return excess cash type and the collateral currency.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnExcessCash1", propOrder = {
    "rtrXcssCshTp",
    "cshCollCcy"
})
public class ReturnExcessCash1 {

    @XmlElement(name = "RtrXcssCshTp", required = true)
    protected ReturnExcessCash1Choice rtrXcssCshTp;
    @XmlElement(name = "CshCollCcy", required = true)
    protected String cshCollCcy;

    /**
     * Gets the value of the rtrXcssCshTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnExcessCash1Choice }
     *     
     */
    public ReturnExcessCash1Choice getRtrXcssCshTp() {
        return rtrXcssCshTp;
    }

    /**
     * Sets the value of the rtrXcssCshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnExcessCash1Choice }
     *     
     */
    public ReturnExcessCash1 setRtrXcssCshTp(ReturnExcessCash1Choice value) {
        this.rtrXcssCshTp = value;
        return this;
    }

    /**
     * Gets the value of the cshCollCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshCollCcy() {
        return cshCollCcy;
    }

    /**
     * Sets the value of the cshCollCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReturnExcessCash1 setCshCollCcy(String value) {
        this.cshCollCcy = value;
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
