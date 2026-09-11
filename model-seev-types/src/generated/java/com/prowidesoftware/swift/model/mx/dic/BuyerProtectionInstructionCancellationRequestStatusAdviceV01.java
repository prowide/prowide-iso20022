
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
 * The BuyerProtectionInstructionCancellationRequestStatusAdvice message is sent by an account servicer to an account owner or its designated agent to report the status of a previously received BuyerProtectionInstructionCancellationRequest message sent by the account owner. This will include the acknowledgement/rejection of a request to cancel an outstanding instruction. 
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
@XmlType(name = "BuyerProtectionInstructionCancellationRequestStatusAdviceV01", propOrder = {
    "buyrPrtcnInstrId",
    "prcrTxId",
    "corpActnGnlInf",
    "instrCxlReqSts",
    "rltdSttlmInstr",
    "acctId",
    "corpActnElctn",
    "splmtryData"
})
public class BuyerProtectionInstructionCancellationRequestStatusAdviceV01 {

    @XmlElement(name = "BuyrPrtcnInstrId", required = true)
    protected DocumentIdentification57 buyrPrtcnInstrId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation195 corpActnGnlInf;
    @XmlElement(name = "InstrCxlReqSts", required = true)
    protected List<InstructionCancellationRequestStatus20Choice> instrCxlReqSts;
    @XmlElement(name = "RltdSttlmInstr")
    protected RelatedSettlementInstruction4 rltdSttlmInstr;
    @XmlElement(name = "AcctId")
    protected SecuritiesAccountIdentification1Choice acctId;
    @XmlElement(name = "CorpActnElctn")
    protected CorporateActionElection4 corpActnElctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setBuyrPrtcnInstrId(DocumentIdentification57 value) {
        this.buyrPrtcnInstrId = value;
        return this;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setPrcrTxId(String value) {
        this.prcrTxId = value;
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
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setCorpActnGnlInf(CorporateActionGeneralInformation195 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlReqSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrCxlReqSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrCxlReqSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionCancellationRequestStatus20Choice }
     * 
     * 
     * @return
     *     The value of the instrCxlReqSts property.
     */
    public List<InstructionCancellationRequestStatus20Choice> getInstrCxlReqSts() {
        if (instrCxlReqSts == null) {
            instrCxlReqSts = new ArrayList<>();
        }
        return this.instrCxlReqSts;
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
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setRltdSttlmInstr(RelatedSettlementInstruction4 value) {
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
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setAcctId(SecuritiesAccountIdentification1Choice value) {
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
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 setCorpActnElctn(CorporateActionElection4 value) {
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
     * Adds a new item to the instrCxlReqSts list.
     * @see #getInstrCxlReqSts()
     * 
     */
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 addInstrCxlReqSts(InstructionCancellationRequestStatus20Choice instrCxlReqSts) {
        getInstrCxlReqSts().add(instrCxlReqSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
