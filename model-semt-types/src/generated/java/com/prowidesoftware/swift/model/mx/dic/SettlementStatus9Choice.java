
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
 * Choice of format for the settlement status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementStatus9Choice", propOrder = {
    "pdg",
    "flng",
    "prtry"
})
public class SettlementStatus9Choice {

    @XmlElement(name = "Pdg")
    protected PendingStatus12Choice pdg;
    @XmlElement(name = "Flng")
    protected FailingStatus4Choice flng;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus12Choice }
     *     
     */
    public PendingStatus12Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus12Choice }
     *     
     */
    public SettlementStatus9Choice setPdg(PendingStatus12Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the flng property.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus4Choice }
     *     
     */
    public FailingStatus4Choice getFlng() {
        return flng;
    }

    /**
     * Sets the value of the flng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus4Choice }
     *     
     */
    public SettlementStatus9Choice setFlng(FailingStatus4Choice value) {
        this.flng = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public SettlementStatus9Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
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
