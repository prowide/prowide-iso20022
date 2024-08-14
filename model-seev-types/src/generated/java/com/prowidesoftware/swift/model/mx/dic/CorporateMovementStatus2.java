
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
 * Provides status of the movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateMovementStatus2", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class CorporateMovementStatus2 {

    @XmlElement(name = "PrcdSts", required = true)
    protected CorporationActionMovementProcessingStatus2 prcdSts;
    @XmlElement(name = "RjctdSts", required = true)
    protected CorporateActionMovementRejectionStatus2 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationActionMovementProcessingStatus2 }
     *     
     */
    public CorporationActionMovementProcessingStatus2 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationActionMovementProcessingStatus2 }
     *     
     */
    public CorporateMovementStatus2 setPrcdSts(CorporationActionMovementProcessingStatus2 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementRejectionStatus2 }
     *     
     */
    public CorporateActionMovementRejectionStatus2 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementRejectionStatus2 }
     *     
     */
    public CorporateMovementStatus2 setRjctdSts(CorporateActionMovementRejectionStatus2 value) {
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
