
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
@XmlType(name = "Status1Choice", propOrder = {
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
public class Status1Choice {

    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus1Choice affirmSts;
    @XmlElement(name = "AllcnSts")
    protected AllocationSatus1Choice allcnSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus1Choice repoCallReqSts;
    @XmlElement(name = "CorpActnEvtPrcgSts")
    protected CorporateActionEventProcessingStatus1Choice corpActnEvtPrcgSts;
    @XmlElement(name = "CorpActnEvtStag")
    protected CorporateActionEventStage1Choice corpActnEvtStag;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus1Choice ifrrdMtchgSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus2Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus1Choice mtchgSts;
    @XmlElement(name = "RegnPrcgSts")
    protected RegistrationProcessingStatus1Choice regnPrcgSts;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus1Choice rspnSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus1Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus1Choice cxlPrcgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus1Choice sttlmSts;
    @XmlElement(name = "SttlmCondModSts")
    protected SettlementConditionModificationStatus1Choice sttlmCondModSts;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus1Choice }
     *     
     */
    public AffirmationStatus1Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus1Choice }
     *     
     */
    public Status1Choice setAffirmSts(AffirmationStatus1Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the allcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationSatus1Choice }
     *     
     */
    public AllocationSatus1Choice getAllcnSts() {
        return allcnSts;
    }

    /**
     * Sets the value of the allcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationSatus1Choice }
     *     
     */
    public Status1Choice setAllcnSts(AllocationSatus1Choice value) {
        this.allcnSts = value;
        return this;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus1Choice }
     *     
     */
    public RepoCallRequestStatus1Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus1Choice }
     *     
     */
    public Status1Choice setRepoCallReqSts(RepoCallRequestStatus1Choice value) {
        this.repoCallReqSts = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatus1Choice }
     *     
     */
    public CorporateActionEventProcessingStatus1Choice getCorpActnEvtPrcgSts() {
        return corpActnEvtPrcgSts;
    }

    /**
     * Sets the value of the corpActnEvtPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatus1Choice }
     *     
     */
    public Status1Choice setCorpActnEvtPrcgSts(CorporateActionEventProcessingStatus1Choice value) {
        this.corpActnEvtPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStage1Choice }
     *     
     */
    public CorporateActionEventStage1Choice getCorpActnEvtStag() {
        return corpActnEvtStag;
    }

    /**
     * Sets the value of the corpActnEvtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStage1Choice }
     *     
     */
    public Status1Choice setCorpActnEvtStag(CorporateActionEventStage1Choice value) {
        this.corpActnEvtStag = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public MatchingStatus1Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public Status1Choice setIfrrdMtchgSts(MatchingStatus1Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus2Choice }
     *     
     */
    public InstructionProcessingStatus2Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus2Choice }
     *     
     */
    public Status1Choice setInstrPrcgSts(InstructionProcessingStatus2Choice value) {
        this.instrPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public MatchingStatus1Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public Status1Choice setMtchgSts(MatchingStatus1Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the regnPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationProcessingStatus1Choice }
     *     
     */
    public RegistrationProcessingStatus1Choice getRegnPrcgSts() {
        return regnPrcgSts;
    }

    /**
     * Sets the value of the regnPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationProcessingStatus1Choice }
     *     
     */
    public Status1Choice setRegnPrcgSts(RegistrationProcessingStatus1Choice value) {
        this.regnPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus1Choice }
     *     
     */
    public ResponseStatus1Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus1Choice }
     *     
     */
    public Status1Choice setRspnSts(ResponseStatus1Choice value) {
        this.rspnSts = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus1Choice }
     *     
     */
    public ReplacementProcessingStatus1Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus1Choice }
     *     
     */
    public Status1Choice setRplcmntPrcgSts(ReplacementProcessingStatus1Choice value) {
        this.rplcmntPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus1Choice }
     *     
     */
    public CancellationProcessingStatus1Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus1Choice }
     *     
     */
    public Status1Choice setCxlPrcgSts(CancellationProcessingStatus1Choice value) {
        this.cxlPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus1Choice }
     *     
     */
    public SettlementStatus1Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus1Choice }
     *     
     */
    public Status1Choice setSttlmSts(SettlementStatus1Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCondModSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementConditionModificationStatus1Choice }
     *     
     */
    public SettlementConditionModificationStatus1Choice getSttlmCondModSts() {
        return sttlmCondModSts;
    }

    /**
     * Sets the value of the sttlmCondModSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementConditionModificationStatus1Choice }
     *     
     */
    public Status1Choice setSttlmCondModSts(SettlementConditionModificationStatus1Choice value) {
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
