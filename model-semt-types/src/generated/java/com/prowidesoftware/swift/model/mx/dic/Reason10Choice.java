
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
 * Choice of reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason10Choice", propOrder = {
    "repoCallAckRsn",
    "cxlRsn",
    "pdgCxlRsn",
    "gnrtdRsn",
    "dndRsn",
    "ackdAccptdRsn",
    "pdgRsn",
    "flngRsn",
    "pdgPrcgRsn",
    "rjctnRsn",
    "rprRsn",
    "pdgModRsn",
    "umtchdRsn"
})
public class Reason10Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason7Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason10Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons3Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons2Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason4Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason5Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason12Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason2Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason2Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason7Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason8Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason9Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason4Choice umtchdRsn;

    /**
     * Gets the value of the repoCallAckRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason7Choice }
     *     
     */
    public AcknowledgementReason7Choice getRepoCallAckRsn() {
        return repoCallAckRsn;
    }

    /**
     * Sets the value of the repoCallAckRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason7Choice }
     *     
     */
    public Reason10Choice setRepoCallAckRsn(AcknowledgementReason7Choice value) {
        this.repoCallAckRsn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason10Choice }
     *     
     */
    public CancellationReason10Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason10Choice }
     *     
     */
    public Reason10Choice setCxlRsn(CancellationReason10Choice value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationReasons3Choice }
     *     
     */
    public PendingCancellationReasons3Choice getPdgCxlRsn() {
        return pdgCxlRsn;
    }

    /**
     * Sets the value of the pdgCxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationReasons3Choice }
     *     
     */
    public Reason10Choice setPdgCxlRsn(PendingCancellationReasons3Choice value) {
        this.pdgCxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons2Choice }
     *     
     */
    public GeneratedReasons2Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons2Choice }
     *     
     */
    public Reason10Choice setGnrtdRsn(GeneratedReasons2Choice value) {
        this.gnrtdRsn = value;
        return this;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason4Choice }
     *     
     */
    public DeniedReason4Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason4Choice }
     *     
     */
    public Reason10Choice setDndRsn(DeniedReason4Choice value) {
        this.dndRsn = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason5Choice }
     *     
     */
    public AcknowledgementReason5Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason5Choice }
     *     
     */
    public Reason10Choice setAckdAccptdRsn(AcknowledgementReason5Choice value) {
        this.ackdAccptdRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason12Choice }
     *     
     */
    public PendingReason12Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason12Choice }
     *     
     */
    public Reason10Choice setPdgRsn(PendingReason12Choice value) {
        this.pdgRsn = value;
        return this;
    }

    /**
     * Gets the value of the flngRsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailingReason2Choice }
     *     
     */
    public FailingReason2Choice getFlngRsn() {
        return flngRsn;
    }

    /**
     * Sets the value of the flngRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingReason2Choice }
     *     
     */
    public Reason10Choice setFlngRsn(FailingReason2Choice value) {
        this.flngRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingReason2Choice }
     *     
     */
    public PendingProcessingReason2Choice getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingReason2Choice }
     *     
     */
    public Reason10Choice setPdgPrcgRsn(PendingProcessingReason2Choice value) {
        this.pdgPrcgRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason7Choice }
     *     
     */
    public RejectionReason7Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason7Choice }
     *     
     */
    public Reason10Choice setRjctnRsn(RejectionReason7Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason8Choice }
     *     
     */
    public RepairReason8Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason8Choice }
     *     
     */
    public Reason10Choice setRprRsn(RepairReason8Choice value) {
        this.rprRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgModRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason9Choice }
     *     
     */
    public PendingReason9Choice getPdgModRsn() {
        return pdgModRsn;
    }

    /**
     * Sets the value of the pdgModRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason9Choice }
     *     
     */
    public Reason10Choice setPdgModRsn(PendingReason9Choice value) {
        this.pdgModRsn = value;
        return this;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason4Choice }
     *     
     */
    public UnmatchedReason4Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason4Choice }
     *     
     */
    public Reason10Choice setUmtchdRsn(UnmatchedReason4Choice value) {
        this.umtchdRsn = value;
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
