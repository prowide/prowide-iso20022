
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
 * Provides information about the status of a standing instruction cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingInstructionCancellationStatus1Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class StandingInstructionCancellationStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionStandingInstructionCancellationProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionStandingInstructionCancellationRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionCancellationProcessingStatus1 }
     *     
     */
    public CorporateActionStandingInstructionCancellationProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionCancellationProcessingStatus1 }
     *     
     */
    public StandingInstructionCancellationStatus1Choice setPrcdSts(CorporateActionStandingInstructionCancellationProcessingStatus1 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionCancellationRejectionStatus1 }
     *     
     */
    public CorporateActionStandingInstructionCancellationRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionCancellationRejectionStatus1 }
     *     
     */
    public StandingInstructionCancellationStatus1Choice setRjctdSts(CorporateActionStandingInstructionCancellationRejectionStatus1 value) {
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
