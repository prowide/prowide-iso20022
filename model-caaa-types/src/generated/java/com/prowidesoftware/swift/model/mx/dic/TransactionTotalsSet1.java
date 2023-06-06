
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Result of the Sale to POI Reconciliation processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotalsSet1", propOrder = {
    "pmtInstrmTp",
    "acqrrId",
    "rcncltnId",
    "saleRcncltnId",
    "brnd",
    "poiId",
    "saleId",
    "cshrId",
    "shftNb",
    "spnsrdMrchnt",
    "txTtl",
    "lltyTxTtl"
})
public class TransactionTotalsSet1 {

    @XmlElement(name = "PmtInstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentType1Code pmtInstrmTp;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<Organisation26> spnsrdMrchnt;
    @XmlElement(name = "TxTtl", required = true)
    protected TransactionTotals8 txTtl;
    @XmlElement(name = "LltyTxTtl")
    protected List<LoyaltyTransactionTotals1> lltyTxTtl;

    /**
     * Gets the value of the pmtInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType1Code }
     *     
     */
    public PaymentInstrumentType1Code getPmtInstrmTp() {
        return pmtInstrmTp;
    }

    /**
     * Sets the value of the pmtInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType1Code }
     *     
     */
    public TransactionTotalsSet1 setPmtInstrmTp(PaymentInstrumentType1Code value) {
        this.pmtInstrmTp = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setAcqrrId(String value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the brnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnd() {
        return brnd;
    }

    /**
     * Sets the value of the brnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setBrnd(String value) {
        this.brnd = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setPOIId(String value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setCshrId(String value) {
        this.cshrId = value;
        return this;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotalsSet1 setShftNb(String value) {
        this.shftNb = value;
        return this;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation26 }
     * 
     * 
     * @return
     *     The value of the spnsrdMrchnt property.
     */
    public List<Organisation26> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Gets the value of the txTtl property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals8 }
     *     
     */
    public TransactionTotals8 getTxTtl() {
        return txTtl;
    }

    /**
     * Sets the value of the txTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals8 }
     *     
     */
    public TransactionTotalsSet1 setTxTtl(TransactionTotals8 value) {
        this.txTtl = value;
        return this;
    }

    /**
     * Gets the value of the lltyTxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyTxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyTxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyTransactionTotals1 }
     * 
     * 
     * @return
     *     The value of the lltyTxTtl property.
     */
    public List<LoyaltyTransactionTotals1> getLltyTxTtl() {
        if (lltyTxTtl == null) {
            lltyTxTtl = new ArrayList<>();
        }
        return this.lltyTxTtl;
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
     * Adds a new item to the spnsrdMrchnt list.
     * @see #getSpnsrdMrchnt()
     * 
     */
    public TransactionTotalsSet1 addSpnsrdMrchnt(Organisation26 spnsrdMrchnt) {
        getSpnsrdMrchnt().add(spnsrdMrchnt);
        return this;
    }

    /**
     * Adds a new item to the lltyTxTtl list.
     * @see #getLltyTxTtl()
     * 
     */
    public TransactionTotalsSet1 addLltyTxTtl(LoyaltyTransactionTotals1 lltyTxTtl) {
        getLltyTxTtl().add(lltyTxTtl);
        return this;
    }

}
