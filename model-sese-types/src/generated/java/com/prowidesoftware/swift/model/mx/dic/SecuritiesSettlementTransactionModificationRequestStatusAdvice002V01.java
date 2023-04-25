
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
 * An account servicer sends a SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account owner to advise the status of a SecuritiesSettlementModificationRequest message previously sent by the account owner.
 * The account servicer may be:
 * - a central securities depository or another settlement market infrastructure managing securities settlement transactions on behalf of their participants
 * - an custodian acting as an accounting and/or settlement agent.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message sent by the account owner to the account servicer,
 * - provide a third party with a copy of a message being sent by the account owner for information,
 * - re-send to a third party a copy of a message being sent by the account owner for information
 * using the relevant elements in the Business Application Header
 * 
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive.
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset. 
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01", propOrder = {
    "modReqRef",
    "acctOwnr",
    "sfkpgAcct",
    "txId",
    "modPrcgSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 {

    @XmlElement(name = "ModReqRef", required = true)
    protected Identification4 modReqRef;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications20 txId;
    @XmlElement(name = "ModPrcgSts", required = true)
    protected ModificationProcessingStatus3Choice modPrcgSts;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails46 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the modReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification4 }
     *     
     */
    public Identification4 getModReqRef() {
        return modReqRef;
    }

    /**
     * Sets the value of the modReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification4 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setModReqRef(Identification4 value) {
        this.modReqRef = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setAcctOwnr(PartyIdentification51Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesAccount17 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications20 }
     *     
     */
    public TransactionIdentifications20 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications20 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setTxId(TransactionIdentifications20 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus3Choice }
     *     
     */
    public ModificationProcessingStatus3Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus3Choice }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setModPrcgSts(ModificationProcessingStatus3Choice value) {
        this.modPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails46 }
     *     
     */
    public TransactionDetails46 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails46 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 setTxDtls(TransactionDetails46 value) {
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
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
