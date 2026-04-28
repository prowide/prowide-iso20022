
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "SecuritiesTradeConfirmationStatusAdviceV04", propOrder = {
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
public class SecuritiesTradeConfirmationStatusAdviceV04 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs", required = true)
    protected List<Linkages77> refs;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus11Choice affirmSts;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus98Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus35Choice mtchgSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus10Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus10Choice cxlPrcgSts;
    @XmlElement(name = "PtyTradgDtls")
    protected Order23 ptyTradgDtls;
    @XmlElement(name = "CtrPtyTradgDtls")
    protected Order23 ctrPtyTradgDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties9> confPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties121 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties121 rcvgSttlmPties;
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
    public SecuritiesTradeConfirmationStatusAdviceV04 setId(TransactiontIdentification4 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
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
     * {@link Linkages77 }
     * 
     * 
     */
    public List<Linkages77> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Linkages77>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus11Choice }
     *     
     */
    public AffirmationStatus11Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus11Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setAffirmSts(AffirmationStatus11Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus98Choice }
     *     
     */
    public ProcessingStatus98Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus98Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setPrcgSts(ProcessingStatus98Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus35Choice }
     *     
     */
    public MatchingStatus35Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus35Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setMtchgSts(MatchingStatus35Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus10Choice }
     *     
     */
    public ReplacementProcessingStatus10Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus10Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setRplcmntPrcgSts(ReplacementProcessingStatus10Choice value) {
        this.rplcmntPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus10Choice }
     *     
     */
    public CancellationProcessingStatus10Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus10Choice }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setCxlPrcgSts(CancellationProcessingStatus10Choice value) {
        this.cxlPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the ptyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order23 }
     *     
     */
    public Order23 getPtyTradgDtls() {
        return ptyTradgDtls;
    }

    /**
     * Sets the value of the ptyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order23 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setPtyTradgDtls(Order23 value) {
        this.ptyTradgDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order23 }
     *     
     */
    public Order23 getCtrPtyTradgDtls() {
        return ctrPtyTradgDtls;
    }

    /**
     * Sets the value of the ctrPtyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order23 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setCtrPtyTradgDtls(Order23 value) {
        this.ctrPtyTradgDtls = value;
        return this;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confPties property.
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
     * {@link ConfirmationParties9 }
     * 
     * 
     */
    public List<ConfirmationParties9> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<ConfirmationParties9>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties121 }
     *     
     */
    public SettlementParties121 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties121 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setDlvrgSttlmPties(SettlementParties121 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties121 }
     *     
     */
    public SettlementParties121 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties121 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 setRcvgSttlmPties(SettlementParties121 value) {
        this.rcvgSttlmPties = value;
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 addRefs(Linkages77 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the confPties list.
     * @see #getConfPties()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 addConfPties(ConfirmationParties9 confPties) {
        getConfPties().add(confPties);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeConfirmationStatusAdviceV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
