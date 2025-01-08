
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status3Choice", propOrder = {
    "affirmSts",
    "allcnSts",
    "repoCallReqSts",
    "corpActnEvtPrcgSts",
    "corpActnEvtStag",
    "ifrrdMtchgSts",
    "instrPrcgSts",
    "mtchgSts",
    "regnPrcgSts",
    "rspnSts",
    "rplcmntPrcgSts",
    "cxlPrcgSts",
    "sttlmSts",
    "sttlmCondModSts"
})
public class Status3Choice {

    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus2Choice affirmSts;
    @XmlElement(name = "AllcnSts")
    protected AllocationSatus2Choice allcnSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus3Choice repoCallReqSts;
    @XmlElement(name = "CorpActnEvtPrcgSts")
    protected CorporateActionEventProcessingStatus2Choice corpActnEvtPrcgSts;
    @XmlElement(name = "CorpActnEvtStag")
    protected CorporateActionEventStage2Choice corpActnEvtStag;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus5Choice ifrrdMtchgSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus5Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus5Choice mtchgSts;
    @XmlElement(name = "RegnPrcgSts")
    protected RegistrationProcessingStatus2Choice regnPrcgSts;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus2Choice rspnSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus2Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus2Choice cxlPrcgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus3Choice sttlmSts;
    @XmlElement(name = "SttlmCondModSts")
    protected SettlementConditionModificationStatus2Choice sttlmCondModSts;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus2Choice }
     *     
     */
    public AffirmationStatus2Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus2Choice }
     *     
     */
    public Status3Choice setAffirmSts(AffirmationStatus2Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the allcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationSatus2Choice }
     *     
     */
    public AllocationSatus2Choice getAllcnSts() {
        return allcnSts;
    }

    /**
     * Sets the value of the allcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationSatus2Choice }
     *     
     */
    public Status3Choice setAllcnSts(AllocationSatus2Choice value) {
        this.allcnSts = value;
        return this;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus3Choice }
     *     
     */
    public RepoCallRequestStatus3Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus3Choice }
     *     
     */
    public Status3Choice setRepoCallReqSts(RepoCallRequestStatus3Choice value) {
        this.repoCallReqSts = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatus2Choice }
     *     
     */
    public CorporateActionEventProcessingStatus2Choice getCorpActnEvtPrcgSts() {
        return corpActnEvtPrcgSts;
    }

    /**
     * Sets the value of the corpActnEvtPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatus2Choice }
     *     
     */
    public Status3Choice setCorpActnEvtPrcgSts(CorporateActionEventProcessingStatus2Choice value) {
        this.corpActnEvtPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStage2Choice }
     *     
     */
    public CorporateActionEventStage2Choice getCorpActnEvtStag() {
        return corpActnEvtStag;
    }

    /**
     * Sets the value of the corpActnEvtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStage2Choice }
     *     
     */
    public Status3Choice setCorpActnEvtStag(CorporateActionEventStage2Choice value) {
        this.corpActnEvtStag = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public MatchingStatus5Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public Status3Choice setIfrrdMtchgSts(MatchingStatus5Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus5Choice }
     *     
     */
    public InstructionProcessingStatus5Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus5Choice }
     *     
     */
    public Status3Choice setInstrPrcgSts(InstructionProcessingStatus5Choice value) {
        this.instrPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public MatchingStatus5Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public Status3Choice setMtchgSts(MatchingStatus5Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the regnPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationProcessingStatus2Choice }
     *     
     */
    public RegistrationProcessingStatus2Choice getRegnPrcgSts() {
        return regnPrcgSts;
    }

    /**
     * Sets the value of the regnPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationProcessingStatus2Choice }
     *     
     */
    public Status3Choice setRegnPrcgSts(RegistrationProcessingStatus2Choice value) {
        this.regnPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus2Choice }
     *     
     */
    public ResponseStatus2Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus2Choice }
     *     
     */
    public Status3Choice setRspnSts(ResponseStatus2Choice value) {
        this.rspnSts = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus2Choice }
     *     
     */
    public ReplacementProcessingStatus2Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus2Choice }
     *     
     */
    public Status3Choice setRplcmntPrcgSts(ReplacementProcessingStatus2Choice value) {
        this.rplcmntPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus2Choice }
     *     
     */
    public CancellationProcessingStatus2Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus2Choice }
     *     
     */
    public Status3Choice setCxlPrcgSts(CancellationProcessingStatus2Choice value) {
        this.cxlPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus3Choice }
     *     
     */
    public SettlementStatus3Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus3Choice }
     *     
     */
    public Status3Choice setSttlmSts(SettlementStatus3Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCondModSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementConditionModificationStatus2Choice }
     *     
     */
    public SettlementConditionModificationStatus2Choice getSttlmCondModSts() {
        return sttlmCondModSts;
    }

    /**
     * Sets the value of the sttlmCondModSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementConditionModificationStatus2Choice }
     *     
     */
    public Status3Choice setSttlmCondModSts(SettlementConditionModificationStatus2Choice value) {
        this.sttlmCondModSts = value;
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
