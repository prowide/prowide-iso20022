
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
 * Information about the status of a transfer instruction and its reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatusAndReason", propOrder = {
    "trfRef",
    "sts",
    "pdgSttlm",
    "umtchd",
    "inRpr",
    "rjctd",
    "stsInitr"
})
public class TransferStatusAndReason {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "Sts")
    protected TransferInstructionStatus sts;
    @XmlElement(name = "PdgSttlm")
    protected PendingSettlementStatusChoice pdgSttlm;
    @XmlElement(name = "Umtchd")
    protected TransferUnmatchedStatus umtchd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus2Choice inRpr;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus3Choice rjctd;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification1Choice stsInitr;

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatus }
     *     
     */
    public TransferInstructionStatus getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatus }
     *     
     */
    public TransferStatusAndReason setSts(TransferInstructionStatus value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlementStatusChoice }
     *     
     */
    public PendingSettlementStatusChoice getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlementStatusChoice }
     *     
     */
    public TransferStatusAndReason setPdgSttlm(PendingSettlementStatusChoice value) {
        this.pdgSttlm = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferUnmatchedStatus }
     *     
     */
    public TransferUnmatchedStatus getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferUnmatchedStatus }
     *     
     */
    public TransferStatusAndReason setUmtchd(TransferUnmatchedStatus value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus2Choice }
     *     
     */
    public InRepairStatus2Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus2Choice }
     *     
     */
    public TransferStatusAndReason setInRpr(InRepairStatus2Choice value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus3Choice }
     *     
     */
    public RejectedStatus3Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus3Choice }
     *     
     */
    public TransferStatusAndReason setRjctd(RejectedStatus3Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public TransferStatusAndReason setStsInitr(PartyIdentification1Choice value) {
        this.stsInitr = value;
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
