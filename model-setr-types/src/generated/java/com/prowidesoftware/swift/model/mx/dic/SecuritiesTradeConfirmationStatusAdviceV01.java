
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
 * This message is sent from Central Matching Utility (CMU) to an executing party or an instructing party to advise the status of the SecuritiesTradeConfirmation message previously sent by the party. The status may be a processing, pending processing, affirmed or disaffirmed, cancel or replacement by an instructing party, a custodian or an affirming party, internal matching, and/or matching status.
 * The instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors. The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * Initiator: In central matching the Initiator is the Central Matching Utility.
 * Respondent: no response is needed by the recipient of the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationStatusAdviceV01", propOrder = {
    "id",
    "refs",
    "affirmSts",
    "prcgSts",
    "mtchgSts",
    "rplcmntPrcgSts",
    "cxlPrcgSts",
    "ptyTradgDtls",
    "ctrPtyTradgDtls",
    "confPties",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "splmtryData"
})
public class SecuritiesTradeConfirmationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs", required = true)
    protected List<Linkages18> refs;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus6Choice affirmSts;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus17Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus9Choice mtchgSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus7Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus6Choice cxlPrcgSts;
    @XmlElement(name = "PtyTradgDtls")
    protected Order16 ptyTradgDtls;
    @XmlElement(name = "CtrPtyTradgDtls")
    protected Order16 ctrPtyTradgDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties4> confPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties23 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties23 rcvgSttlmPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setId(TransactiontIdentification4 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages18 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<Linkages18> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus6Choice }
     *     
     */
    public AffirmationStatus6Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus6Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setAffirmSts(AffirmationStatus6Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus17Choice }
     *     
     */
    public ProcessingStatus17Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus17Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setPrcgSts(ProcessingStatus17Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus9Choice }
     *     
     */
    public MatchingStatus9Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus9Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setMtchgSts(MatchingStatus9Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus7Choice }
     *     
     */
    public ReplacementProcessingStatus7Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus7Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setRplcmntPrcgSts(ReplacementProcessingStatus7Choice value) {
        this.rplcmntPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus6Choice }
     *     
     */
    public CancellationProcessingStatus6Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus6Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setCxlPrcgSts(CancellationProcessingStatus6Choice value) {
        this.cxlPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the ptyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order16 }
     *     
     */
    public Order16 getPtyTradgDtls() {
        return ptyTradgDtls;
    }

    /**
     * Sets the value of the ptyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order16 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setPtyTradgDtls(Order16 value) {
        this.ptyTradgDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order16 }
     *     
     */
    public Order16 getCtrPtyTradgDtls() {
        return ctrPtyTradgDtls;
    }

    /**
     * Sets the value of the ctrPtyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order16 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setCtrPtyTradgDtls(Order16 value) {
        this.ctrPtyTradgDtls = value;
        return this;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties4 }
     * 
     * 
     * @return
     *     The value of the confPties property.
     */
    public List<ConfirmationParties4> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties23 }
     *     
     */
    public SettlementParties23 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties23 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setDlvrgSttlmPties(SettlementParties23 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties23 }
     *     
     */
    public SettlementParties23 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties23 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 setRcvgSttlmPties(SettlementParties23 value) {
        this.rcvgSttlmPties = value;
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 addRefs(Linkages18 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the confPties list.
     * @see #getConfPties()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 addConfPties(ConfirmationParties4 confPties) {
        getConfPties().add(confPties);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
