
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
 * 
 * This message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.
 * 
 * 
 * Usage
 * 
 * The message may also be used to: 
 * 
 * - re-send a message sent by the market infrastructure to the direct participant,
 * 
 * - provide a third party with a copy of a message being sent by the market infrastructure for information,
 * 
 * - re-send to a third party a copy of a message being sent by the market infrastructure for information
 * using the relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReport002V02", propOrder = {
    "pgntn",
    "qryRef",
    "txId",
    "sfkpgAcct",
    "acctOwnr",
    "stsTrl"
})
public class SecuritiesSettlementTransactionAuditTrailReport002V02 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "QryRef")
    protected Identification4 qryRef;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications19 txId;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "StsTrl")
    protected List<StatusTrail5> stsTrl;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V02 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification4 }
     *     
     */
    public Identification4 getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification4 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V02 setQryRef(Identification4 value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications19 }
     *     
     */
    public TransactionIdentifications19 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications19 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V02 setTxId(TransactionIdentifications19 value) {
        this.txId = value;
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
    public SecuritiesSettlementTransactionAuditTrailReport002V02 setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
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
    public SecuritiesSettlementTransactionAuditTrailReport002V02 setAcctOwnr(PartyIdentification51Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the stsTrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsTrl property.
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
     * {@link StatusTrail5 }
     * 
     * 
     * @return
     *     The value of the stsTrl property.
     */
    public List<StatusTrail5> getStsTrl() {
        if (stsTrl == null) {
            stsTrl = new ArrayList<>();
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
    public SecuritiesSettlementTransactionAuditTrailReport002V02 addStsTrl(StatusTrail5 stsTrl) {
        getStsTrl().add(stsTrl);
        return this;
    }

}
