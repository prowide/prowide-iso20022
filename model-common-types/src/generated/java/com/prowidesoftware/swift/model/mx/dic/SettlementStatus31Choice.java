
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
 * Choice of format for the settlement status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementStatus31Choice", propOrder = {
    "pdg",
    "flng",
    "prtry"
})
public class SettlementStatus31Choice {

    @XmlElement(name = "Pdg")
    protected PendingStatus69Choice pdg;
    @XmlElement(name = "Flng")
    protected FailingStatus14Choice flng;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus69Choice }
     *     
     */
    public PendingStatus69Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus69Choice }
     *     
     */
    public SettlementStatus31Choice setPdg(PendingStatus69Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the flng property.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus14Choice }
     *     
     */
    public FailingStatus14Choice getFlng() {
        return flng;
    }

    /**
     * Sets the value of the flng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus14Choice }
     *     
     */
    public SettlementStatus31Choice setFlng(FailingStatus14Choice value) {
        this.flng = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public SettlementStatus31Choice setPrtry(ProprietaryStatusAndReason7 value) {
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
