
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
 * The CorporateActionInstructionCancellationRequestStatusAdvice message is sent by an account servicer to an account owner or its designated agent to report the status of a previously received CorporateActionInstructionCancellationRequest message sent by the account owner. This will include the acknowledgement/rejection of a request to cancel an outstanding instruction. 
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
@XmlType(name = "CorporateActionInstructionCancellationRequestStatusAdvice002V12", propOrder = {
    "instrCxlReqId",
    "othrDocId",
    "corpActnGnlInf",
    "instrCxlReqSts",
    "corpActnInstr",
    "prtctInstr",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionInstructionCancellationRequestStatusAdvice002V12 {

    @XmlElement(name = "InstrCxlReqId")
    protected DocumentIdentification17 instrCxlReqId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification34> othrDocId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation158 corpActnGnlInf;
    @XmlElement(name = "InstrCxlReqSts", required = true)
    protected List<InstructionCancellationRequestStatus14Choice> instrCxlReqSts;
    @XmlElement(name = "CorpActnInstr")
    protected CorporateActionOption201 corpActnInstr;
    @XmlElement(name = "PrtctInstr")
    protected ProtectInstruction8 prtctInstr;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative19 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the instrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public DocumentIdentification17 getInstrCxlReqId() {
        return instrCxlReqId;
    }

    /**
     * Sets the value of the instrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 setInstrCxlReqId(DocumentIdentification17 value) {
        this.instrCxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification34 }
     * 
     * 
     */
    public List<DocumentIdentification34> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification34>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation158 }
     *     
     */
    public CorporateActionGeneralInformation158 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation158 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 setCorpActnGnlInf(CorporateActionGeneralInformation158 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlReqSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrCxlReqSts property.
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
     * {@link InstructionCancellationRequestStatus14Choice }
     * 
     * 
     */
    public List<InstructionCancellationRequestStatus14Choice> getInstrCxlReqSts() {
        if (instrCxlReqSts == null) {
            instrCxlReqSts = new ArrayList<InstructionCancellationRequestStatus14Choice>();
        }
        return this.instrCxlReqSts;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption201 }
     *     
     */
    public CorporateActionOption201 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption201 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 setCorpActnInstr(CorporateActionOption201 value) {
        this.corpActnInstr = value;
        return this;
    }

    /**
     * Gets the value of the prtctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstruction8 }
     *     
     */
    public ProtectInstruction8 getPrtctInstr() {
        return prtctInstr;
    }

    /**
     * Sets the value of the prtctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstruction8 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 setPrtctInstr(ProtectInstruction8 value) {
        this.prtctInstr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public CorporateActionNarrative19 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 setAddtlInf(CorporateActionNarrative19 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the othrDocId list.
     * @see #getOthrDocId()
     * 
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 addOthrDocId(DocumentIdentification34 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the instrCxlReqSts list.
     * @see #getInstrCxlReqSts()
     * 
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 addInstrCxlReqSts(InstructionCancellationRequestStatus14Choice instrCxlReqSts) {
        getInstrCxlReqSts().add(instrCxlReqSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V12 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
