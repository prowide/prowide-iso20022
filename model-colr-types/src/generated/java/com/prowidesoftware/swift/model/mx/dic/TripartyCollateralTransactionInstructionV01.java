
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
 * Scope:
 * This message is sent by a trading party to its triparty agent to instruct the agent to perform a specific action on a collateral management transaction.
 * It is also sent by an account owner to an account servicer where the account servicer manages the account at the triparty agent on behalf of the trading party. The account owner may be a global custodian which manages an account with a triparty agent on behalf of their client or an investment management institution or a broker/dealer which has an account with their custodian.
 * 
 * Usage:
 * The triparty collateral management service is used by two trading parties at the agreement of a business transaction (for example, a repo, a securities loan, ... ) when they want to secure the transaction with collateral. The management of this collateral (that is, agreeing on quantity and type, marking to market, ... ) is done by a third party, the triparty collateral manager.
 * 
 * Before starting to use these services, the three parties will first sign a contract in which they stipulate the rules of the agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralTransactionInstructionV01", propOrder = {
    "txInstrId",
    "lnkgs",
    "pgntn",
    "gnlParams",
    "collPties",
    "dealTxDtls",
    "dealTxDt",
    "sctiesMvmnt",
    "cshMvmnt",
    "othrPties",
    "splmtryData"
})
public class TripartyCollateralTransactionInstructionV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications45 txInstrId;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages58> lnkgs;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "GnlParams", required = true)
    protected CollateralParameters10 gnlParams;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties10 collPties;
    @XmlElement(name = "DealTxDtls", required = true)
    protected DealTransactionDetails5 dealTxDtls;
    @XmlElement(name = "DealTxDt", required = true)
    protected CollateralDate2 dealTxDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecuritiesMovement9> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement8> cshMvmnt;
    @XmlElement(name = "OthrPties")
    protected OtherParties38 othrPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications45 }
     *     
     */
    public TransactionIdentifications45 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications45 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 setTxInstrId(TransactionIdentifications45 value) {
        this.txInstrId = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages58 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages58> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
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
    public TripartyCollateralTransactionInstructionV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the gnlParams property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParameters10 }
     *     
     */
    public CollateralParameters10 getGnlParams() {
        return gnlParams;
    }

    /**
     * Sets the value of the gnlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParameters10 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 setGnlParams(CollateralParameters10 value) {
        this.gnlParams = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties10 }
     *     
     */
    public CollateralParties10 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties10 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 setCollPties(CollateralParties10 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the dealTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DealTransactionDetails5 }
     *     
     */
    public DealTransactionDetails5 getDealTxDtls() {
        return dealTxDtls;
    }

    /**
     * Sets the value of the dealTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealTransactionDetails5 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 setDealTxDtls(DealTransactionDetails5 value) {
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
    public TripartyCollateralTransactionInstructionV01 setDealTxDt(CollateralDate2 value) {
        this.dealTxDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmnt property.
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
     * {@link SecuritiesMovement9 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmnt property.
     */
    public List<SecuritiesMovement9> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmnt property.
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
     * {@link CashMovement8 }
     * 
     * 
     * @return
     *     The value of the cshMvmnt property.
     */
    public List<CashMovement8> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<>();
        }
        return this.cshMvmnt;
    }

    /**
     * Gets the value of the othrPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties38 }
     *     
     */
    public OtherParties38 getOthrPties() {
        return othrPties;
    }

    /**
     * Sets the value of the othrPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties38 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 setOthrPties(OtherParties38 value) {
        this.othrPties = value;
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
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public TripartyCollateralTransactionInstructionV01 addLnkgs(Linkages58 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmnt list.
     * @see #getSctiesMvmnt()
     * 
     */
    public TripartyCollateralTransactionInstructionV01 addSctiesMvmnt(SecuritiesMovement9 sctiesMvmnt) {
        getSctiesMvmnt().add(sctiesMvmnt);
        return this;
    }

    /**
     * Adds a new item to the cshMvmnt list.
     * @see #getCshMvmnt()
     * 
     */
    public TripartyCollateralTransactionInstructionV01 addCshMvmnt(CashMovement8 cshMvmnt) {
        getCshMvmnt().add(cshMvmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TripartyCollateralTransactionInstructionV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
