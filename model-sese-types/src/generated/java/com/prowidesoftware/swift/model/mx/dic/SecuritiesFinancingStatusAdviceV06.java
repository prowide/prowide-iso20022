
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
 * An securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.
 * The status advice may be sent as a response to the request of the account owner or not.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants
 * - an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or
 * - a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingStatusAdviceV06", propOrder = {
    "txId",
    "prcgSts",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "repoCallReqSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesFinancingStatusAdviceV06 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications32 txId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus51Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus26Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus26Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus18Choice sttlmSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus7Choice repoCallReqSts;
    @XmlElement(name = "TxDtls")
    protected SecuritiesFinancingTransactionDetails26 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications32 }
     *     
     */
    public TransactionIdentifications32 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications32 }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setTxId(TransactionIdentifications32 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus51Choice }
     *     
     */
    public ProcessingStatus51Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus51Choice }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setPrcgSts(ProcessingStatus51Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public MatchingStatus26Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setMtchgSts(MatchingStatus26Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public MatchingStatus26Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setIfrrdMtchgSts(MatchingStatus26Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus18Choice }
     *     
     */
    public SettlementStatus18Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus18Choice }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setSttlmSts(SettlementStatus18Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus7Choice }
     *     
     */
    public RepoCallRequestStatus7Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus7Choice }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setRepoCallReqSts(RepoCallRequestStatus7Choice value) {
        this.repoCallReqSts = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails26 }
     *     
     */
    public SecuritiesFinancingTransactionDetails26 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails26 }
     *     
     */
    public SecuritiesFinancingStatusAdviceV06 setTxDtls(SecuritiesFinancingTransactionDetails26 value) {
        this.txDtls = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingStatusAdviceV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
