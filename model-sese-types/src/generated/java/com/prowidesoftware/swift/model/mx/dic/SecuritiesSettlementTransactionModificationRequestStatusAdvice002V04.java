
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
 * using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04", propOrder = {
    "modReqRef",
    "acctOwnr",
    "sfkpgAcct",
    "txId",
    "modPrcgSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 {

    @XmlElement(name = "ModReqRef", required = true)
    protected Identification16 modReqRef;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification109 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications37 txId;
    @XmlElement(name = "ModPrcgSts", required = true)
    protected ModificationProcessingStatus8Choice modPrcgSts;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails84 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the modReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification16 }
     *     
     */
    public Identification16 getModReqRef() {
        return modReqRef;
    }

    /**
     * Sets the value of the modReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification16 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setModReqRef(Identification16 value) {
        this.modReqRef = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification109 }
     *     
     */
    public PartyIdentification109 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification109 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setAcctOwnr(PartyIdentification109 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesAccount30 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setSfkpgAcct(SecuritiesAccount30 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications37 }
     *     
     */
    public TransactionIdentifications37 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications37 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setTxId(TransactionIdentifications37 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus8Choice }
     *     
     */
    public ModificationProcessingStatus8Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus8Choice }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setModPrcgSts(ModificationProcessingStatus8Choice value) {
        this.modPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails84 }
     *     
     */
    public TransactionDetails84 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails84 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 setTxDtls(TransactionDetails84 value) {
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
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
