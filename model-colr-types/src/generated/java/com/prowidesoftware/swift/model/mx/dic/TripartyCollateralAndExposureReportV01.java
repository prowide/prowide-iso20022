
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
 * This message is sent by a triparty agent to both the collateral giver and the collateral taker or to an account servicer, who manage the account at the triparty agent on behalf of a trading party, in the following circumstances:
 * - after all collateral movements have been affected (after settlement-initiated) to show the end (fixed) positions (current status) or,
 * - taking into account all collateral management instructions (including pending initiation and/or initiated.
 * 
 * Usage:
 * This message is sent to provide the details of the valuation of both the collateral and the exposure.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAndExposureReportV01", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "collPties",
    "ovrllCollAggtn",
    "xpsrTpAggtn",
    "ctrPtyAggtn",
    "txs",
    "acctBaseCcyTtlAmts",
    "splmtryData"
})
public class TripartyCollateralAndExposureReportV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement78 stmtGnlDtls;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties9 collPties;
    @XmlElement(name = "OvrllCollAggtn")
    protected OverallCollateralDetails2 ovrllCollAggtn;
    @XmlElement(name = "XpsrTpAggtn")
    protected List<ExposureTypeAggregation3> xpsrTpAggtn;
    @XmlElement(name = "CtrPtyAggtn")
    protected List<CounterpartyAggregation3> ctrPtyAggtn;
    @XmlElement(name = "Txs")
    protected List<Transaction124> txs;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement5 acctBaseCcyTtlAmts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public TripartyCollateralAndExposureReportV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement78 }
     *     
     */
    public Statement78 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement78 }
     *     
     */
    public TripartyCollateralAndExposureReportV01 setStmtGnlDtls(Statement78 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties9 }
     *     
     */
    public CollateralParties9 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties9 }
     *     
     */
    public TripartyCollateralAndExposureReportV01 setCollPties(CollateralParties9 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the ovrllCollAggtn property.
     * 
     * @return
     *     possible object is
     *     {@link OverallCollateralDetails2 }
     *     
     */
    public OverallCollateralDetails2 getOvrllCollAggtn() {
        return ovrllCollAggtn;
    }

    /**
     * Sets the value of the ovrllCollAggtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallCollateralDetails2 }
     *     
     */
    public TripartyCollateralAndExposureReportV01 setOvrllCollAggtn(OverallCollateralDetails2 value) {
        this.ovrllCollAggtn = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTpAggtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xpsrTpAggtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXpsrTpAggtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureTypeAggregation3 }
     * 
     * 
     */
    public List<ExposureTypeAggregation3> getXpsrTpAggtn() {
        if (xpsrTpAggtn == null) {
            xpsrTpAggtn = new ArrayList<ExposureTypeAggregation3>();
        }
        return this.xpsrTpAggtn;
    }

    /**
     * Gets the value of the ctrPtyAggtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtyAggtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyAggtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartyAggregation3 }
     * 
     * 
     */
    public List<CounterpartyAggregation3> getCtrPtyAggtn() {
        if (ctrPtyAggtn == null) {
            ctrPtyAggtn = new ArrayList<CounterpartyAggregation3>();
        }
        return this.ctrPtyAggtn;
    }

    /**
     * Gets the value of the txs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction124 }
     * 
     * 
     */
    public List<Transaction124> getTxs() {
        if (txs == null) {
            txs = new ArrayList<Transaction124>();
        }
        return this.txs;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement5 }
     *     
     */
    public TotalValueInPageAndStatement5 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement5 }
     *     
     */
    public TripartyCollateralAndExposureReportV01 setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement5 value) {
        this.acctBaseCcyTtlAmts = value;
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
     * Adds a new item to the xpsrTpAggtn list.
     * @see #getXpsrTpAggtn()
     * 
     */
    public TripartyCollateralAndExposureReportV01 addXpsrTpAggtn(ExposureTypeAggregation3 xpsrTpAggtn) {
        getXpsrTpAggtn().add(xpsrTpAggtn);
        return this;
    }

    /**
     * Adds a new item to the ctrPtyAggtn list.
     * @see #getCtrPtyAggtn()
     * 
     */
    public TripartyCollateralAndExposureReportV01 addCtrPtyAggtn(CounterpartyAggregation3 ctrPtyAggtn) {
        getCtrPtyAggtn().add(ctrPtyAggtn);
        return this;
    }

    /**
     * Adds a new item to the txs list.
     * @see #getTxs()
     * 
     */
    public TripartyCollateralAndExposureReportV01 addTxs(Transaction124 txs) {
        getTxs().add(txs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TripartyCollateralAndExposureReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
