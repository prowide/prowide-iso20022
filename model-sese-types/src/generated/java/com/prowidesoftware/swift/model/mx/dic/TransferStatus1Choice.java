
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
 * Choice of statuses for the status of the transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatus1Choice", propOrder = {
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
public class TransferStatus1Choice {

    @XmlElement(name = "Sts")
    protected TransferInstructionStatus3 sts;
    @XmlElement(name = "PdgSttlm")
    protected PendingSettlementStatus2 pdgSttlm;
    @XmlElement(name = "Umtchd")
    protected TransferUnmatchedStatus2 umtchd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus3 inRpr;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatus8Choice> rjctd;
    @XmlElement(name = "FaildSttlm")
    protected FailedSettlementStatus1 faildSttlm;
    @XmlElement(name = "Canc")
    protected CancelledStatus3 canc;
    @XmlElement(name = "Rvsd")
    protected ReversedStatus1 rvsd;
    @XmlElement(name = "CxlPdg")
    protected CancellationPendingStatus1 cxlPdg;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatus3 }
     *     
     */
    public TransferInstructionStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatus3 }
     *     
     */
    public TransferStatus1Choice setSts(TransferInstructionStatus3 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlementStatus2 }
     *     
     */
    public PendingSettlementStatus2 getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlementStatus2 }
     *     
     */
    public TransferStatus1Choice setPdgSttlm(PendingSettlementStatus2 value) {
        this.pdgSttlm = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferUnmatchedStatus2 }
     *     
     */
    public TransferUnmatchedStatus2 getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferUnmatchedStatus2 }
     *     
     */
    public TransferStatus1Choice setUmtchd(TransferUnmatchedStatus2 value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus3 }
     *     
     */
    public InRepairStatus3 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus3 }
     *     
     */
    public TransferStatus1Choice setInRpr(InRepairStatus3 value) {
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
     * {@link RejectedStatus8Choice }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectedStatus8Choice> getRjctd() {
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
     *     {@link FailedSettlementStatus1 }
     *     
     */
    public FailedSettlementStatus1 getFaildSttlm() {
        return faildSttlm;
    }

    /**
     * Sets the value of the faildSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedSettlementStatus1 }
     *     
     */
    public TransferStatus1Choice setFaildSttlm(FailedSettlementStatus1 value) {
        this.faildSttlm = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus3 }
     *     
     */
    public CancelledStatus3 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus3 }
     *     
     */
    public TransferStatus1Choice setCanc(CancelledStatus3 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the rvsd property.
     * 
     * @return
     *     possible object is
     *     {@link ReversedStatus1 }
     *     
     */
    public ReversedStatus1 getRvsd() {
        return rvsd;
    }

    /**
     * Sets the value of the rvsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversedStatus1 }
     *     
     */
    public TransferStatus1Choice setRvsd(ReversedStatus1 value) {
        this.rvsd = value;
        return this;
    }

    /**
     * Gets the value of the cxlPdg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPendingStatus1 }
     *     
     */
    public CancellationPendingStatus1 getCxlPdg() {
        return cxlPdg;
    }

    /**
     * Sets the value of the cxlPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPendingStatus1 }
     *     
     */
    public TransferStatus1Choice setCxlPdg(CancellationPendingStatus1 value) {
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
    public TransferStatus1Choice addRjctd(RejectedStatus8Choice rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
