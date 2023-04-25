
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of statuses for the status of a transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatus3Choice", propOrder = {
    "sts",
    "pdgSttlm",
    "umtchd",
    "inRpr",
    "rjctd",
    "faildSttlm",
    "canc",
    "rvsd",
    "cxlPdg"
})
public class TransferStatus3Choice {

    @XmlElement(name = "Sts")
    protected TransferInstructionStatus5 sts;
    @XmlElement(name = "PdgSttlm")
    protected PendingSettlementStatus3Choice pdgSttlm;
    @XmlElement(name = "Umtchd")
    protected TransferUnmatchedStatus3Choice umtchd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus4Choice inRpr;
    @XmlElement(name = "Rjctd")
    protected List<RejectionReason32> rjctd;
    @XmlElement(name = "FaildSttlm")
    protected FailedSettlementStatus2Choice faildSttlm;
    @XmlElement(name = "Canc")
    protected CancelledStatus13Choice canc;
    @XmlElement(name = "Rvsd")
    protected ReversedStatus2Choice rvsd;
    @XmlElement(name = "CxlPdg")
    protected CancellationPendingStatus7Choice cxlPdg;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatus5 }
     *     
     */
    public TransferInstructionStatus5 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatus5 }
     *     
     */
    public TransferStatus3Choice setSts(TransferInstructionStatus5 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlementStatus3Choice }
     *     
     */
    public PendingSettlementStatus3Choice getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlementStatus3Choice }
     *     
     */
    public TransferStatus3Choice setPdgSttlm(PendingSettlementStatus3Choice value) {
        this.pdgSttlm = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferUnmatchedStatus3Choice }
     *     
     */
    public TransferUnmatchedStatus3Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferUnmatchedStatus3Choice }
     *     
     */
    public TransferStatus3Choice setUmtchd(TransferUnmatchedStatus3Choice value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus4Choice }
     *     
     */
    public InRepairStatus4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus4Choice }
     *     
     */
    public TransferStatus3Choice setInRpr(InRepairStatus4Choice value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason32 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectionReason32> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the faildSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link FailedSettlementStatus2Choice }
     *     
     */
    public FailedSettlementStatus2Choice getFaildSttlm() {
        return faildSttlm;
    }

    /**
     * Sets the value of the faildSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedSettlementStatus2Choice }
     *     
     */
    public TransferStatus3Choice setFaildSttlm(FailedSettlementStatus2Choice value) {
        this.faildSttlm = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus13Choice }
     *     
     */
    public CancelledStatus13Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus13Choice }
     *     
     */
    public TransferStatus3Choice setCanc(CancelledStatus13Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the rvsd property.
     * 
     * @return
     *     possible object is
     *     {@link ReversedStatus2Choice }
     *     
     */
    public ReversedStatus2Choice getRvsd() {
        return rvsd;
    }

    /**
     * Sets the value of the rvsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversedStatus2Choice }
     *     
     */
    public TransferStatus3Choice setRvsd(ReversedStatus2Choice value) {
        this.rvsd = value;
        return this;
    }

    /**
     * Gets the value of the cxlPdg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPendingStatus7Choice }
     *     
     */
    public CancellationPendingStatus7Choice getCxlPdg() {
        return cxlPdg;
    }

    /**
     * Sets the value of the cxlPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPendingStatus7Choice }
     *     
     */
    public TransferStatus3Choice setCxlPdg(CancellationPendingStatus7Choice value) {
        this.cxlPdg = value;
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

    /**
     * Adds a new item to the rjctd list.
     * @see #getRjctd()
     * 
     */
    public TransferStatus3Choice addRjctd(RejectionReason32 rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
