
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
 * Choice between the different statuses of a deactivation cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDeactivationCancellationStatus1Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class CorporateActionDeactivationCancellationStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionDeactivationCancellationProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionDeactivationCancellationRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationCancellationProcessingStatus1 }
     *     
     */
    public CorporateActionDeactivationCancellationProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationCancellationProcessingStatus1 }
     *     
     */
    public CorporateActionDeactivationCancellationStatus1Choice setPrcdSts(CorporateActionDeactivationCancellationProcessingStatus1 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationCancellationRejectionStatus1 }
     *     
     */
    public CorporateActionDeactivationCancellationRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationCancellationRejectionStatus1 }
     *     
     */
    public CorporateActionDeactivationCancellationStatus1Choice setRjctdSts(CorporateActionDeactivationCancellationRejectionStatus1 value) {
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
