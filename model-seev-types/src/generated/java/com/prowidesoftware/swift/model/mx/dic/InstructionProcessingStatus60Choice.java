
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
@XmlType(name = "InstructionProcessingStatus60Choice", propOrder = {
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
public class InstructionProcessingStatus60Choice {

    @XmlElement(name = "Canc")
    protected CancelledStatus5 canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected AcceptedStatus2 accptdForFrthrPrcg;
    @XmlElement(name = "Fwdd")
    protected ForwardedStatus1 fwdd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus15 rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus3 pdg;
    @XmlElement(name = "Rtrd")
    protected ReturnedStatus1 rtrd;
    @XmlElement(name = "DfltActn")
    protected NoSpecifiedReason1 dfltActn;
    @XmlElement(name = "StgInstr")
    protected NoSpecifiedReason1 stgInstr;
    @XmlElement(name = "RcvdByIssrOrOfferr")
    protected ReceivedByIssuerOrOfferorStatus1 rcvdByIssrOrOfferr;
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
    public InstructionProcessingStatus60Choice setCanc(CancelledStatus5 value) {
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
    public InstructionProcessingStatus60Choice setAccptdForFrthrPrcg(AcceptedStatus2 value) {
        this.accptdForFrthrPrcg = value;
        return this;
    }

    /**
     * Gets the value of the fwdd property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardedStatus1 }
     *     
     */
    public ForwardedStatus1 getFwdd() {
        return fwdd;
    }

    /**
     * Sets the value of the fwdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardedStatus1 }
     *     
     */
    public InstructionProcessingStatus60Choice setFwdd(ForwardedStatus1 value) {
        this.fwdd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus15 }
     *     
     */
    public RejectedStatus15 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus15 }
     *     
     */
    public InstructionProcessingStatus60Choice setRjctd(RejectedStatus15 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus3 }
     *     
     */
    public PendingStatus3 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus3 }
     *     
     */
    public InstructionProcessingStatus60Choice setPdg(PendingStatus3 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rtrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedStatus1 }
     *     
     */
    public ReturnedStatus1 getRtrd() {
        return rtrd;
    }

    /**
     * Sets the value of the rtrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedStatus1 }
     *     
     */
    public InstructionProcessingStatus60Choice setRtrd(ReturnedStatus1 value) {
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
    public InstructionProcessingStatus60Choice setDfltActn(NoSpecifiedReason1 value) {
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
    public InstructionProcessingStatus60Choice setStgInstr(NoSpecifiedReason1 value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the rcvdByIssrOrOfferr property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedByIssuerOrOfferorStatus1 }
     *     
     */
    public ReceivedByIssuerOrOfferorStatus1 getRcvdByIssrOrOfferr() {
        return rcvdByIssrOrOfferr;
    }

    /**
     * Sets the value of the rcvdByIssrOrOfferr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedByIssuerOrOfferorStatus1 }
     *     
     */
    public InstructionProcessingStatus60Choice setRcvdByIssrOrOfferr(ReceivedByIssuerOrOfferorStatus1 value) {
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
    public InstructionProcessingStatus60Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
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
