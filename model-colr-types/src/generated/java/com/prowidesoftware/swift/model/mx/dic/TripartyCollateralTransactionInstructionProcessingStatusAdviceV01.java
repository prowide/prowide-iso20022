
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
 * This message is sent by a triparty agent after the receipt of a collateral instruction from its client.
 * 
 * In this message, the Sender is the triparty agent and the Receiver is either the collateral taker or the collateral giver or their account servicer.
 * 
 * Usage:
 * This message provides the status of the Triparty collateral transaction or instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralTransactionInstructionProcessingStatusAdviceV01", propOrder = {
    "txInstrId",
    "cxlReqRef",
    "pgntn",
    "instrPrcgSts",
    "mtchgSts",
    "cxlPrcgSts",
    "gnlParams",
    "collPties",
    "dealTxDtls",
    "dealTxDt",
    "sctiesMvmnt",
    "cshMvmnt",
    "splmtryData"
})
public class TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications46 txInstrId;
    @XmlElement(name = "CxlReqRef")
    protected String cxlReqRef;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "InstrPrcgSts")
    protected ProcessingStatus82Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus33Choice mtchgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationStatus30Choice cxlPrcgSts;
    @XmlElement(name = "GnlParams", required = true)
    protected CollateralParameters12 gnlParams;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "DealTxDtls", required = true)
    protected DealTransactionDetails7 dealTxDtls;
    @XmlElement(name = "DealTxDt", required = true)
    protected CollateralDate2 dealTxDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecuritiesMovement8> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement7> cshMvmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications46 }
     *     
     */
    public TransactionIdentifications46 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications46 }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setTxInstrId(TransactionIdentifications46 value) {
        this.txInstrId = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlReqRef() {
        return cxlReqRef;
    }

    /**
     * Sets the value of the cxlReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setCxlReqRef(String value) {
        this.cxlReqRef = value;
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
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus82Choice }
     *     
     */
    public ProcessingStatus82Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus82Choice }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setInstrPrcgSts(ProcessingStatus82Choice value) {
        this.instrPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus33Choice }
     *     
     */
    public MatchingStatus33Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus33Choice }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setMtchgSts(MatchingStatus33Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus30Choice }
     *     
     */
    public CancellationStatus30Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus30Choice }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setCxlPrcgSts(CancellationStatus30Choice value) {
        this.cxlPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the gnlParams property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParameters12 }
     *     
     */
    public CollateralParameters12 getGnlParams() {
        return gnlParams;
    }

    /**
     * Sets the value of the gnlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParameters12 }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setGnlParams(CollateralParameters12 value) {
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
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setCollPties(CollateralParties8 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the dealTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DealTransactionDetails7 }
     *     
     */
    public DealTransactionDetails7 getDealTxDtls() {
        return dealTxDtls;
    }

    /**
     * Sets the value of the dealTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealTransactionDetails7 }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setDealTxDtls(DealTransactionDetails7 value) {
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
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 setDealTxDt(CollateralDate2 value) {
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
     * {@link SecuritiesMovement8 }
     * 
     * 
     */
    public List<SecuritiesMovement8> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<SecuritiesMovement8>();
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
     * {@link CashMovement7 }
     * 
     * 
     */
    public List<CashMovement7> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<CashMovement7>();
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
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 addSctiesMvmnt(SecuritiesMovement8 sctiesMvmnt) {
        getSctiesMvmnt().add(sctiesMvmnt);
        return this;
    }

    /**
     * Adds a new item to the cshMvmnt list.
     * @see #getCshMvmnt()
     * 
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 addCshMvmnt(CashMovement7 cshMvmnt) {
        getCshMvmnt().add(cshMvmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
