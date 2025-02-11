
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
 * Choice between selected investment plans issued during previous years or the entirety of the investment plans.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousYear3", propOrder = {
    "prvsYr",
    "cshCmpntInd"
})
public class PreviousYear3 {

    @XmlElement(name = "PrvsYr", required = true)
    protected PreviousYear1Choice prvsYr;
    @XmlElement(name = "CshCmpntInd")
    protected boolean cshCmpntInd;

    /**
     * Gets the value of the prvsYr property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public PreviousYear1Choice getPrvsYr() {
        return prvsYr;
    }

    /**
     * Sets the value of the prvsYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public PreviousYear3 setPrvsYr(PreviousYear1Choice value) {
        this.prvsYr = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     */
    public boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     */
    public PreviousYear3 setCshCmpntInd(boolean value) {
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
