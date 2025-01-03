
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
 * Information about investment plans issued during previous years.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousYear4", propOrder = {
    "prvsYrs",
    "cshCmpntInd"
})
public class PreviousYear4 {

    @XmlElement(name = "PrvsYrs", required = true)
    protected PreviousYear1Choice prvsYrs;
    @XmlElement(name = "CshCmpntInd")
    protected Boolean cshCmpntInd;

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public PreviousYear1Choice getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public PreviousYear4 setPrvsYrs(PreviousYear1Choice value) {
        this.prvsYrs = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PreviousYear4 setCshCmpntInd(Boolean value) {
        this.cshCmpntInd = value;
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
