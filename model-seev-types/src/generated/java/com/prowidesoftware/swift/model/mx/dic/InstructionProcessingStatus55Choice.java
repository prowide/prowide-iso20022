
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
@XmlType(name = "InstructionProcessingStatus55Choice", propOrder = {
    "canc",
    "accptdForFrthrPrcg",
    "fwdd",
    "rjctd",
    "pdg",
    "rtrd",
    "dfltActn",
    "stgInstr",
    "rcvdByIssrOrOfferr",
    "prtrySts"
})
public class InstructionProcessingStatus55Choice {

    @XmlElement(name = "Canc")
    protected CancelledStatus5 canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected AcceptedStatus2 accptdForFrthrPrcg;
    @XmlElement(name = "Fwdd")
    protected NoSpecifiedReason1 fwdd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus11 rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus1 pdg;
    @XmlElement(name = "Rtrd")
    protected ReturnedStatus2Choice rtrd;
    @XmlElement(name = "DfltActn")
    protected NoSpecifiedReason1 dfltActn;
    @XmlElement(name = "StgInstr")
    protected NoSpecifiedReason1 stgInstr;
    @XmlElement(name = "RcvdByIssrOrOfferr")
    protected NoSpecifiedReason1 rcvdByIssrOrOfferr;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus5 }
     *     
     */
    public CancelledStatus5 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus5 }
     *     
     */
    public InstructionProcessingStatus55Choice setCanc(CancelledStatus5 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus2 }
     *     
     */
    public AcceptedStatus2 getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus2 }
     *     
     */
    public InstructionProcessingStatus55Choice setAccptdForFrthrPrcg(AcceptedStatus2 value) {
        this.accptdForFrthrPrcg = value;
        return this;
    }

    /**
     * Gets the value of the fwdd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getFwdd() {
        return fwdd;
    }

    /**
     * Sets the value of the fwdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus55Choice setFwdd(NoSpecifiedReason1 value) {
        this.fwdd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus11 }
     *     
     */
    public RejectedStatus11 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus11 }
     *     
     */
    public InstructionProcessingStatus55Choice setRjctd(RejectedStatus11 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus1 }
     *     
     */
    public PendingStatus1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus1 }
     *     
     */
    public InstructionProcessingStatus55Choice setPdg(PendingStatus1 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rtrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public ReturnedStatus2Choice getRtrd() {
        return rtrd;
    }

    /**
     * Sets the value of the rtrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public InstructionProcessingStatus55Choice setRtrd(ReturnedStatus2Choice value) {
        this.rtrd = value;
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
    public InstructionProcessingStatus55Choice setDfltActn(NoSpecifiedReason1 value) {
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
    public InstructionProcessingStatus55Choice setStgInstr(NoSpecifiedReason1 value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the rcvdByIssrOrOfferr property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getRcvdByIssrOrOfferr() {
        return rcvdByIssrOrOfferr;
    }

    /**
     * Sets the value of the rcvdByIssrOrOfferr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus55Choice setRcvdByIssrOrOfferr(NoSpecifiedReason1 value) {
        this.rcvdByIssrOrOfferr = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public InstructionProcessingStatus55Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
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
