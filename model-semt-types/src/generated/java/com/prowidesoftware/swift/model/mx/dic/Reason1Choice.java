
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
@XmlType(name = "Reason1Choice", propOrder = {
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
public class Reason1Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason3Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason4Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons2Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons1Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason1Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason2Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason3Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason1Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason1Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason5Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason3Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason2Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason2Choice umtchdRsn;

    /**
     * Gets the value of the repoCallAckRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason3Choice }
     *     
     */
    public AcknowledgementReason3Choice getRepoCallAckRsn() {
        return repoCallAckRsn;
    }

    /**
     * Sets the value of the repoCallAckRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason3Choice }
     *     
     */
    public Reason1Choice setRepoCallAckRsn(AcknowledgementReason3Choice value) {
        this.repoCallAckRsn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason4Choice }
     *     
     */
    public CancellationReason4Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason4Choice }
     *     
     */
    public Reason1Choice setCxlRsn(CancellationReason4Choice value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationReasons2Choice }
     *     
     */
    public PendingCancellationReasons2Choice getPdgCxlRsn() {
        return pdgCxlRsn;
    }

    /**
     * Sets the value of the pdgCxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationReasons2Choice }
     *     
     */
    public Reason1Choice setPdgCxlRsn(PendingCancellationReasons2Choice value) {
        this.pdgCxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons1Choice }
     *     
     */
    public GeneratedReasons1Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons1Choice }
     *     
     */
    public Reason1Choice setGnrtdRsn(GeneratedReasons1Choice value) {
        this.gnrtdRsn = value;
        return this;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason1Choice }
     *     
     */
    public DeniedReason1Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason1Choice }
     *     
     */
    public Reason1Choice setDndRsn(DeniedReason1Choice value) {
        this.dndRsn = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason2Choice }
     *     
     */
    public AcknowledgementReason2Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason2Choice }
     *     
     */
    public Reason1Choice setAckdAccptdRsn(AcknowledgementReason2Choice value) {
        this.ackdAccptdRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason3Choice }
     *     
     */
    public PendingReason3Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason3Choice }
     *     
     */
    public Reason1Choice setPdgRsn(PendingReason3Choice value) {
        this.pdgRsn = value;
        return this;
    }

    /**
     * Gets the value of the flngRsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailingReason1Choice }
     *     
     */
    public FailingReason1Choice getFlngRsn() {
        return flngRsn;
    }

    /**
     * Sets the value of the flngRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingReason1Choice }
     *     
     */
    public Reason1Choice setFlngRsn(FailingReason1Choice value) {
        this.flngRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingReason1Choice }
     *     
     */
    public PendingProcessingReason1Choice getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingReason1Choice }
     *     
     */
    public Reason1Choice setPdgPrcgRsn(PendingProcessingReason1Choice value) {
        this.pdgPrcgRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason5Choice }
     *     
     */
    public RejectionReason5Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason5Choice }
     *     
     */
    public Reason1Choice setRjctnRsn(RejectionReason5Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason3Choice }
     *     
     */
    public RepairReason3Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason3Choice }
     *     
     */
    public Reason1Choice setRprRsn(RepairReason3Choice value) {
        this.rprRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgModRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason2Choice }
     *     
     */
    public PendingReason2Choice getPdgModRsn() {
        return pdgModRsn;
    }

    /**
     * Sets the value of the pdgModRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason2Choice }
     *     
     */
    public Reason1Choice setPdgModRsn(PendingReason2Choice value) {
        this.pdgModRsn = value;
        return this;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason2Choice }
     *     
     */
    public UnmatchedReason2Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason2Choice }
     *     
     */
    public Reason1Choice setUmtchdRsn(UnmatchedReason2Choice value) {
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
