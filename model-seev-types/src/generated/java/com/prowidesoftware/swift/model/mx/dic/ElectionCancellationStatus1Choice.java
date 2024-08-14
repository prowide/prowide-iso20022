
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
 * Choice between various statuses for an corporate action election cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectionCancellationStatus1Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class ElectionCancellationStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionCancellationProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionCancellationRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationProcessingStatus1 }
     *     
     */
    public CorporateActionCancellationProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationProcessingStatus1 }
     *     
     */
    public ElectionCancellationStatus1Choice setPrcdSts(CorporateActionCancellationProcessingStatus1 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationRejectionStatus1 }
     *     
     */
    public CorporateActionCancellationRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationRejectionStatus1 }
     *     
     */
    public ElectionCancellationStatus1Choice setRjctdSts(CorporateActionCancellationRejectionStatus1 value) {
        this.rjctdSts = value;
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
