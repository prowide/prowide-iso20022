
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
 * Choice between different instruction processing statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus58Choice", propOrder = {
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
public class InstructionProcessingStatus58Choice {

    @XmlElement(name = "Canc")
    protected CancelledStatus6 canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected AcceptedStatus3 accptdForFrthrPrcg;
    @XmlElement(name = "Fwdd")
    protected NoSpecifiedReason1 fwdd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus12 rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus2 pdg;
    @XmlElement(name = "Rtrd")
    protected ReturnedStatus1Choice rtrd;
    @XmlElement(name = "DfltActn")
    protected NoSpecifiedReason1 dfltActn;
    @XmlElement(name = "StgInstr")
    protected NoSpecifiedReason1 stgInstr;
    @XmlElement(name = "RcvdByIssrOrOfferr")
    protected NoSpecifiedReason1 rcvdByIssrOrOfferr;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason7 prtrySts;

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus6 }
     *     
     */
    public CancelledStatus6 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus6 }
     *     
     */
    public InstructionProcessingStatus58Choice setCanc(CancelledStatus6 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus3 }
     *     
     */
    public AcceptedStatus3 getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus3 }
     *     
     */
    public InstructionProcessingStatus58Choice setAccptdForFrthrPrcg(AcceptedStatus3 value) {
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
    public InstructionProcessingStatus58Choice setFwdd(NoSpecifiedReason1 value) {
        this.fwdd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus12 }
     *     
     */
    public RejectedStatus12 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus12 }
     *     
     */
    public InstructionProcessingStatus58Choice setRjctd(RejectedStatus12 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus2 }
     *     
     */
    public PendingStatus2 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus2 }
     *     
     */
    public InstructionProcessingStatus58Choice setPdg(PendingStatus2 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rtrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedStatus1Choice }
     *     
     */
    public ReturnedStatus1Choice getRtrd() {
        return rtrd;
    }

    /**
     * Sets the value of the rtrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedStatus1Choice }
     *     
     */
    public InstructionProcessingStatus58Choice setRtrd(ReturnedStatus1Choice value) {
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
    public InstructionProcessingStatus58Choice setDfltActn(NoSpecifiedReason1 value) {
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
    public InstructionProcessingStatus58Choice setStgInstr(NoSpecifiedReason1 value) {
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
    public InstructionProcessingStatus58Choice setRcvdByIssrOrOfferr(NoSpecifiedReason1 value) {
        this.rcvdByIssrOrOfferr = value;
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
    public InstructionProcessingStatus58Choice setPrtrySts(ProprietaryStatusAndReason7 value) {
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
