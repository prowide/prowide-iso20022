
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
 * Choice of reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason14Choice", propOrder = {
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
public class Reason14Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason3Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason9Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons2Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons3Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason8Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason4Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason11Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason1Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason1Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason16Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason7Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason2Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason16Choice umtchdRsn;

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
    public Reason14Choice setRepoCallAckRsn(AcknowledgementReason3Choice value) {
        this.repoCallAckRsn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason9Choice }
     *     
     */
    public CancellationReason9Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason9Choice }
     *     
     */
    public Reason14Choice setCxlRsn(CancellationReason9Choice value) {
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
    public Reason14Choice setPdgCxlRsn(PendingCancellationReasons2Choice value) {
        this.pdgCxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons3Choice }
     *     
     */
    public GeneratedReasons3Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons3Choice }
     *     
     */
    public Reason14Choice setGnrtdRsn(GeneratedReasons3Choice value) {
        this.gnrtdRsn = value;
        return this;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason8Choice }
     *     
     */
    public DeniedReason8Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason8Choice }
     *     
     */
    public Reason14Choice setDndRsn(DeniedReason8Choice value) {
        this.dndRsn = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason4Choice }
     *     
     */
    public AcknowledgementReason4Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason4Choice }
     *     
     */
    public Reason14Choice setAckdAccptdRsn(AcknowledgementReason4Choice value) {
        this.ackdAccptdRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason11Choice }
     *     
     */
    public PendingReason11Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason11Choice }
     *     
     */
    public Reason14Choice setPdgRsn(PendingReason11Choice value) {
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
    public Reason14Choice setFlngRsn(FailingReason1Choice value) {
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
    public Reason14Choice setPdgPrcgRsn(PendingProcessingReason1Choice value) {
        this.pdgPrcgRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason16Choice }
     *     
     */
    public RejectionReason16Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason16Choice }
     *     
     */
    public Reason14Choice setRjctnRsn(RejectionReason16Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason7Choice }
     *     
     */
    public RepairReason7Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason7Choice }
     *     
     */
    public Reason14Choice setRprRsn(RepairReason7Choice value) {
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
    public Reason14Choice setPdgModRsn(PendingReason2Choice value) {
        this.pdgModRsn = value;
        return this;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason16Choice }
     *     
     */
    public UnmatchedReason16Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason16Choice }
     *     
     */
    public Reason14Choice setUmtchdRsn(UnmatchedReason16Choice value) {
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
