
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
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReport002V04", propOrder = {
    "pgntn",
    "qryRef",
    "txId",
    "sfkpgAcct",
    "acctOwnr",
    "stsTrl"
})
public class SecuritiesSettlementTransactionAuditTrailReport002V04 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "QryRef")
    protected Identification16 qryRef;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications34 txId;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount37 sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "StsTrl")
    protected List<StatusTrail9> stsTrl;

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
    public SecuritiesSettlementTransactionAuditTrailReport002V04 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification16 }
     *     
     */
    public Identification16 getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification16 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V04 setQryRef(Identification16 value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications34 }
     *     
     */
    public TransactionIdentifications34 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications34 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V04 setTxId(TransactionIdentifications34 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount37 }
     *     
     */
    public SecuritiesAccount37 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount37 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V04 setSfkpgAcct(SecuritiesAccount37 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification156 }
     *     
     */
    public PartyIdentification156 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification156 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V04 setAcctOwnr(PartyIdentification156 value) {
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
     * {@link StatusTrail9 }
     * 
     * 
     */
    public List<StatusTrail9> getStsTrl() {
        if (stsTrl == null) {
            stsTrl = new ArrayList<StatusTrail9>();
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
    public SecuritiesSettlementTransactionAuditTrailReport002V04 addStsTrl(StatusTrail9 stsTrl) {
        getStsTrl().add(stsTrl);
        return this;
    }

}
