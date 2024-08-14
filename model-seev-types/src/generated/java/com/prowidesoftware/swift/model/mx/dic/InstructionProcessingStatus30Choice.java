
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
 * Choice between different instruction processing statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus30Choice", propOrder = {
    "canc",
    "accptdForFrthrPrcg",
    "rjctd",
    "pdg",
    "dfltActn",
    "stgInstr",
    "prtrySts"
})
public class InstructionProcessingStatus30Choice {

    @XmlElement(name = "Canc")
    protected CancelledStatus15Choice canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected AcceptedStatus9Choice accptdForFrthrPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus24Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus53Choice pdg;
    @XmlElement(name = "DfltActn")
    protected NoSpecifiedReason1 dfltActn;
    @XmlElement(name = "StgInstr")
    protected NoSpecifiedReason1 stgInstr;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason7 prtrySts;

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus15Choice }
     *     
     */
    public CancelledStatus15Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus15Choice }
     *     
     */
    public InstructionProcessingStatus30Choice setCanc(CancelledStatus15Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus9Choice }
     *     
     */
    public AcceptedStatus9Choice getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus9Choice }
     *     
     */
    public InstructionProcessingStatus30Choice setAccptdForFrthrPrcg(AcceptedStatus9Choice value) {
        this.accptdForFrthrPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus24Choice }
     *     
     */
    public RejectedStatus24Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus24Choice }
     *     
     */
    public InstructionProcessingStatus30Choice setRjctd(RejectedStatus24Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus53Choice }
     *     
     */
    public PendingStatus53Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus53Choice }
     *     
     */
    public InstructionProcessingStatus30Choice setPdg(PendingStatus53Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus30Choice setDfltActn(NoSpecifiedReason1 value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus30Choice setStgInstr(NoSpecifiedReason1 value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public InstructionProcessingStatus30Choice setPrtrySts(ProprietaryStatusAndReason7 value) {
        this.prtrySts = value;
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
