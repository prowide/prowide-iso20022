
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
@XmlType(name = "Reason16Choice", propOrder = {
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
public class Reason16Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason13Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason20Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons4Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons5Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason14Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason12Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason29Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason9Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason11Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason22Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason11Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason28Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason22Choice umtchdRsn;

    /**
     * Gets the value of the repoCallAckRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason13Choice }
     *     
     */
    public AcknowledgementReason13Choice getRepoCallAckRsn() {
        return repoCallAckRsn;
    }

    /**
     * Sets the value of the repoCallAckRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason13Choice }
     *     
     */
    public Reason16Choice setRepoCallAckRsn(AcknowledgementReason13Choice value) {
        this.repoCallAckRsn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason20Choice }
     *     
     */
    public CancellationReason20Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason20Choice }
     *     
     */
    public Reason16Choice setCxlRsn(CancellationReason20Choice value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationReasons4Choice }
     *     
     */
    public PendingCancellationReasons4Choice getPdgCxlRsn() {
        return pdgCxlRsn;
    }

    /**
     * Sets the value of the pdgCxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationReasons4Choice }
     *     
     */
    public Reason16Choice setPdgCxlRsn(PendingCancellationReasons4Choice value) {
        this.pdgCxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons5Choice }
     *     
     */
    public GeneratedReasons5Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons5Choice }
     *     
     */
    public Reason16Choice setGnrtdRsn(GeneratedReasons5Choice value) {
        this.gnrtdRsn = value;
        return this;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason14Choice }
     *     
     */
    public DeniedReason14Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason14Choice }
     *     
     */
    public Reason16Choice setDndRsn(DeniedReason14Choice value) {
        this.dndRsn = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason12Choice }
     *     
     */
    public AcknowledgementReason12Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason12Choice }
     *     
     */
    public Reason16Choice setAckdAccptdRsn(AcknowledgementReason12Choice value) {
        this.ackdAccptdRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason29Choice }
     *     
     */
    public PendingReason29Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason29Choice }
     *     
     */
    public Reason16Choice setPdgRsn(PendingReason29Choice value) {
        this.pdgRsn = value;
        return this;
    }

    /**
     * Gets the value of the flngRsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailingReason9Choice }
     *     
     */
    public FailingReason9Choice getFlngRsn() {
        return flngRsn;
    }

    /**
     * Sets the value of the flngRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingReason9Choice }
     *     
     */
    public Reason16Choice setFlngRsn(FailingReason9Choice value) {
        this.flngRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingReason11Choice }
     *     
     */
    public PendingProcessingReason11Choice getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingReason11Choice }
     *     
     */
    public Reason16Choice setPdgPrcgRsn(PendingProcessingReason11Choice value) {
        this.pdgPrcgRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason22Choice }
     *     
     */
    public RejectionReason22Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason22Choice }
     *     
     */
    public Reason16Choice setRjctnRsn(RejectionReason22Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason11Choice }
     *     
     */
    public RepairReason11Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason11Choice }
     *     
     */
    public Reason16Choice setRprRsn(RepairReason11Choice value) {
        this.rprRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgModRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason28Choice }
     *     
     */
    public PendingReason28Choice getPdgModRsn() {
        return pdgModRsn;
    }

    /**
     * Sets the value of the pdgModRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason28Choice }
     *     
     */
    public Reason16Choice setPdgModRsn(PendingReason28Choice value) {
        this.pdgModRsn = value;
        return this;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason22Choice }
     *     
     */
    public UnmatchedReason22Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason22Choice }
     *     
     */
    public Reason16Choice setUmtchdRsn(UnmatchedReason22Choice value) {
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
