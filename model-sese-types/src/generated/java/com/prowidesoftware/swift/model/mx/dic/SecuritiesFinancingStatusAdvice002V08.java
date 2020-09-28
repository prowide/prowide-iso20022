
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
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingStatusAdvice002V08", propOrder = {
    "txId",
    "prcgSts",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "repoCallReqSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesFinancingStatusAdvice002V08 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications35 txId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus57Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus29Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus29Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus21Choice sttlmSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus9Choice repoCallReqSts;
    @XmlElement(name = "TxDtls")
    protected SecuritiesFinancingTransactionDetails49 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications35 }
     *     
     */
    public TransactionIdentifications35 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications35 }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setTxId(TransactionIdentifications35 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus57Choice }
     *     
     */
    public ProcessingStatus57Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus57Choice }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setPrcgSts(ProcessingStatus57Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus29Choice }
     *     
     */
    public MatchingStatus29Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus29Choice }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setMtchgSts(MatchingStatus29Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus29Choice }
     *     
     */
    public MatchingStatus29Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus29Choice }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setIfrrdMtchgSts(MatchingStatus29Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus21Choice }
     *     
     */
    public SettlementStatus21Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus21Choice }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setSttlmSts(SettlementStatus21Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus9Choice }
     *     
     */
    public RepoCallRequestStatus9Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus9Choice }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setRepoCallReqSts(RepoCallRequestStatus9Choice value) {
        this.repoCallReqSts = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails49 }
     *     
     */
    public SecuritiesFinancingTransactionDetails49 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails49 }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V08 setTxDtls(SecuritiesFinancingTransactionDetails49 value) {
        this.txDtls = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingStatusAdvice002V08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
