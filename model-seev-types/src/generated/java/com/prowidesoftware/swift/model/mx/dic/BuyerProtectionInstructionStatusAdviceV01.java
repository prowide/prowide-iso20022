
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
 * Scope
 * The BuyerProtectionInstructionStatusAdvice message is sent by an account servicer to an account owner or its designated agent, to report the status of a received Buyer Protection Instruction.
 * 
 * This message is used to advise the status, or a change in status, of a Buyer Protection Instruction previously instructed by, or processed on behalf of, the account owner. This will include the acknowledgement/rejection of a Buyer Protection Instruction.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerProtectionInstructionStatusAdviceV01", propOrder = {
    "buyrPrtcnInstr",
    "corpActnGnlInf",
    "instrPrcgSts",
    "rltdSttlmInstr",
    "acctId",
    "corpActnElctn",
    "splmtryData"
})
public class BuyerProtectionInstructionStatusAdviceV01 {

    @XmlElement(name = "BuyrPrtcnInstr", required = true)
    protected DocumentIdentification57 buyrPrtcnInstr;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation195 corpActnGnlInf;
    @XmlElement(name = "InstrPrcgSts", required = true)
    protected List<InstructionProcessingStatus59Choice> instrPrcgSts;
    @XmlElement(name = "RltdSttlmInstr")
    protected RelatedSettlementInstruction4 rltdSttlmInstr;
    @XmlElement(name = "AcctId")
    protected SecuritiesAccountIdentification1Choice acctId;
    @XmlElement(name = "CorpActnElctn")
    protected CorporateActionElection4 corpActnElctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the buyrPrtcnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification57 }
     *     
     */
    public DocumentIdentification57 getBuyrPrtcnInstr() {
        return buyrPrtcnInstr;
    }

    /**
     * Sets the value of the buyrPrtcnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification57 }
     *     
     */
    public BuyerProtectionInstructionStatusAdviceV01 setBuyrPrtcnInstr(DocumentIdentification57 value) {
        this.buyrPrtcnInstr = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation195 }
     *     
     */
    public CorporateActionGeneralInformation195 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation195 }
     *     
     */
    public BuyerProtectionInstructionStatusAdviceV01 setCorpActnGnlInf(CorporateActionGeneralInformation195 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrPrcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionProcessingStatus59Choice }
     * 
     * 
     * @return
     *     The value of the instrPrcgSts property.
     */
    public List<InstructionProcessingStatus59Choice> getInstrPrcgSts() {
        if (instrPrcgSts == null) {
            instrPrcgSts = new ArrayList<>();
        }
        return this.instrPrcgSts;
    }

    /**
     * Gets the value of the rltdSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction4 }
     *     
     */
    public RelatedSettlementInstruction4 getRltdSttlmInstr() {
        return rltdSttlmInstr;
    }

    /**
     * Sets the value of the rltdSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction4 }
     *     
     */
    public BuyerProtectionInstructionStatusAdviceV01 setRltdSttlmInstr(RelatedSettlementInstruction4 value) {
        this.rltdSttlmInstr = value;
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
    public BuyerProtectionInstructionStatusAdviceV01 setAcctId(SecuritiesAccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnElctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection4 }
     *     
     */
    public CorporateActionElection4 getCorpActnElctn() {
        return corpActnElctn;
    }

    /**
     * Sets the value of the corpActnElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection4 }
     *     
     */
    public BuyerProtectionInstructionStatusAdviceV01 setCorpActnElctn(CorporateActionElection4 value) {
        this.corpActnElctn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the instrPrcgSts list.
     * @see #getInstrPrcgSts()
     * 
     */
    public BuyerProtectionInstructionStatusAdviceV01 addInstrPrcgSts(InstructionProcessingStatus59Choice instrPrcgSts) {
        getInstrPrcgSts().add(instrPrcgSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BuyerProtectionInstructionStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
