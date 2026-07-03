
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
 * Choice between the different statuses of a movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementStatus1Choice", propOrder = {
    "prcdSts",
    "faildSts",
    "rjctdSts"
})
public class CorporateActionMovementStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionMovementProcessingStatus1 prcdSts;
    @XmlElement(name = "FaildSts")
    protected CorporateActionMovementFailedStatus1 faildSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionMovementRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementProcessingStatus1 }
     *     
     */
    public CorporateActionMovementProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementProcessingStatus1 }
     *     
     */
    public CorporateActionMovementStatus1Choice setPrcdSts(CorporateActionMovementProcessingStatus1 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the faildSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementFailedStatus1 }
     *     
     */
    public CorporateActionMovementFailedStatus1 getFaildSts() {
        return faildSts;
    }

    /**
     * Sets the value of the faildSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementFailedStatus1 }
     *     
     */
    public CorporateActionMovementStatus1Choice setFaildSts(CorporateActionMovementFailedStatus1 value) {
        this.faildSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementRejectionStatus1 }
     *     
     */
    public CorporateActionMovementRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementRejectionStatus1 }
     *     
     */
    public CorporateActionMovementStatus1Choice setRjctdSts(CorporateActionMovementRejectionStatus1 value) {
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
