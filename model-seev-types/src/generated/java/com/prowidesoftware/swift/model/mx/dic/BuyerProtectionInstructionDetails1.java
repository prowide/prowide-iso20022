
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
 * Information received for a given buyer protection instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerProtectionInstructionDetails1", propOrder = {
    "buyrPrtcnInstrId",
    "rltdSttlmInstrId",
    "ctrPtyDpstry",
    "acctId",
    "instrPrcgSts"
})
public class BuyerProtectionInstructionDetails1 {

    @XmlElement(name = "BuyrPrtcnInstrId", required = true)
    protected DocumentIdentification57 buyrPrtcnInstrId;
    @XmlElement(name = "RltdSttlmInstrId", required = true)
    protected RelatedSettlementInstruction4 rltdSttlmInstrId;
    @XmlElement(name = "CtrPtyDpstry")
    protected PartyIdentification143 ctrPtyDpstry;
    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccountIdentification1Choice acctId;
    @XmlElement(name = "InstrPrcgSts", required = true)
    protected InstructionProcessingStatus59Choice instrPrcgSts;

    /**
     * Gets the value of the buyrPrtcnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification57 }
     *     
     */
    public DocumentIdentification57 getBuyrPrtcnInstrId() {
        return buyrPrtcnInstrId;
    }

    /**
     * Sets the value of the buyrPrtcnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification57 }
     *     
     */
    public BuyerProtectionInstructionDetails1 setBuyrPrtcnInstrId(DocumentIdentification57 value) {
        this.buyrPrtcnInstrId = value;
        return this;
    }

    /**
     * Gets the value of the rltdSttlmInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction4 }
     *     
     */
    public RelatedSettlementInstruction4 getRltdSttlmInstrId() {
        return rltdSttlmInstrId;
    }

    /**
     * Sets the value of the rltdSttlmInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction4 }
     *     
     */
    public BuyerProtectionInstructionDetails1 setRltdSttlmInstrId(RelatedSettlementInstruction4 value) {
        this.rltdSttlmInstrId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyDpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification143 }
     *     
     */
    public PartyIdentification143 getCtrPtyDpstry() {
        return ctrPtyDpstry;
    }

    /**
     * Sets the value of the ctrPtyDpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification143 }
     *     
     */
    public BuyerProtectionInstructionDetails1 setCtrPtyDpstry(PartyIdentification143 value) {
        this.ctrPtyDpstry = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountIdentification1Choice }
     *     
     */
    public SecuritiesAccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountIdentification1Choice }
     *     
     */
    public BuyerProtectionInstructionDetails1 setAcctId(SecuritiesAccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus59Choice }
     *     
     */
    public InstructionProcessingStatus59Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus59Choice }
     *     
     */
    public BuyerProtectionInstructionDetails1 setInstrPrcgSts(InstructionProcessingStatus59Choice value) {
        this.instrPrcgSts = value;
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
