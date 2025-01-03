
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
 * Provides information about the processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualMovementStatus1", propOrder = {
    "mvmntId",
    "prcdSts",
    "rjctdSts"
})
public class IndividualMovementStatus1 {

    @XmlElement(name = "MvmntId")
    protected String mvmntId;
    @XmlElement(name = "PrcdSts")
    protected MovementProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected DistributionRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the mvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntId() {
        return mvmntId;
    }

    /**
     * Sets the value of the mvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualMovementStatus1 setMvmntId(String value) {
        this.mvmntId = value;
        return this;
    }

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link MovementProcessingStatus1 }
     *     
     */
    public MovementProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementProcessingStatus1 }
     *     
     */
    public IndividualMovementStatus1 setPrcdSts(MovementProcessingStatus1 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionRejectionStatus1 }
     *     
     */
    public DistributionRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionRejectionStatus1 }
     *     
     */
    public IndividualMovementStatus1 setRjctdSts(DistributionRejectionStatus1 value) {
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
