
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
 * This message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.
 * 
 * Usage
 * The message may also be used to: 
 * - re-send a message sent by the market infrastructure to the direct participant,
 * - provide a third party with a copy of a message being sent by the market infrastructure for information,
 * - re-send to a third party a copy of a message being sent by the market infrastructure for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReportV06", propOrder = {
    "pgntn",
    "qryRef",
    "txId",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "acctOwnr",
    "stsTrl"
})
public class SecuritiesSettlementTransactionAuditTrailReportV06 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications54 txId;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount22 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "StsTrl")
    protected List<StatusTrail12> stsTrl;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications54 }
     *     
     */
    public TransactionIdentifications54 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications54 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setTxId(TransactionIdentifications54 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount22 }
     *     
     */
    public SecuritiesAccount22 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount22 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setSfkpgAcct(SecuritiesAccount22 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the stsTrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsTrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsTrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusTrail12 }
     * 
     * 
     */
    public List<StatusTrail12> getStsTrl() {
        if (stsTrl == null) {
            stsTrl = new ArrayList<StatusTrail12>();
        }
        return this.stsTrl;
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
     * Adds a new item to the stsTrl list.
     * @see #getStsTrl()
     * 
     */
    public SecuritiesSettlementTransactionAuditTrailReportV06 addStsTrl(StatusTrail12 stsTrl) {
        getStsTrl().add(stsTrl);
        return this;
    }

}
