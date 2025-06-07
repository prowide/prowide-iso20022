
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
 * Scope:
 * This message is sent by a triparty agent after the receipt of a collateral transaction or instruction from the collateral giver or taker to advise  that a counterparty has alleged an instruction or a transaction against the account owner's account at the TPA and that the TPA could not find the corresponding transaction or instruction of the account owner.
 * The allegement is used for initiation, modification and termination.
 * 
 * In this message, the Sender is the triparty agent and the Receiver is either the collateral taker or the collateral giver or their account servicer.
 * 
 * Usage:
 * An account servicer sends a SecuritiesSettlementTransactionAllegementNotification to an account owner to advise the account owner that a counterparty has alleged an instruction against the account owner's account at the account servicer and that the account servicer could not find the corresponding instruction of the account owner.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAllegementNotificationV01", propOrder = {
    "txInstrId",
    "pgntn",
    "gnlParams",
    "collPties",
    "dealTxDtls",
    "dealTxDt",
    "sctiesMvmnt",
    "cshMvmnt",
    "splmtryData"
})
public class TripartyCollateralAllegementNotificationV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications44 txInstrId;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "GnlParams", required = true)
    protected CollateralParameters11 gnlParams;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "DealTxDtls", required = true)
    protected DealTransactionDetails6 dealTxDtls;
    @XmlElement(name = "DealTxDt", required = true)
    protected CollateralDate2 dealTxDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecuritiesMovement7> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement5> cshMvmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TransactionIdentifications44 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 setTxInstrId(TransactionIdentifications44 value) {
        this.txInstrId = value;
        return this;
    }

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
    public TripartyCollateralAllegementNotificationV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the gnlParams property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParameters11 }
     *     
     */
    public CollateralParameters11 getGnlParams() {
        return gnlParams;
    }

    /**
     * Sets the value of the gnlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParameters11 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 setGnlParams(CollateralParameters11 value) {
        this.gnlParams = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties8 }
     *     
     */
    public CollateralParties8 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties8 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 setCollPties(CollateralParties8 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the dealTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DealTransactionDetails6 }
     *     
     */
    public DealTransactionDetails6 getDealTxDtls() {
        return dealTxDtls;
    }

    /**
     * Sets the value of the dealTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealTransactionDetails6 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 setDealTxDtls(DealTransactionDetails6 value) {
        this.dealTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the dealTxDt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDate2 }
     *     
     */
    public CollateralDate2 getDealTxDt() {
        return dealTxDt;
    }

    /**
     * Sets the value of the dealTxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDate2 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 setDealTxDt(CollateralDate2 value) {
        this.dealTxDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesMovement7 }
     * 
     * 
     */
    public List<SecuritiesMovement7> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<SecuritiesMovement7>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement5 }
     * 
     * 
     */
    public List<CashMovement5> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<CashMovement5>();
        }
        return this.cshMvmnt;
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
     * Adds a new item to the sctiesMvmnt list.
     * @see #getSctiesMvmnt()
     * 
     */
    public TripartyCollateralAllegementNotificationV01 addSctiesMvmnt(SecuritiesMovement7 sctiesMvmnt) {
        getSctiesMvmnt().add(sctiesMvmnt);
        return this;
    }

    /**
     * Adds a new item to the cshMvmnt list.
     * @see #getCshMvmnt()
     * 
     */
    public TripartyCollateralAllegementNotificationV01 addCshMvmnt(CashMovement5 cshMvmnt) {
        getCshMvmnt().add(cshMvmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TripartyCollateralAllegementNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
