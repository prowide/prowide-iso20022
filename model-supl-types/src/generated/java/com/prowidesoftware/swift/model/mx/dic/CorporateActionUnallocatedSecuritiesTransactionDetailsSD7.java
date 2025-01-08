
package com.prowidesoftware.swift.model.mx.dic;

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
 * Breakdown of unallocated securities transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedSecuritiesTransactionDetailsSD7", propOrder = {
    "cdtDbtInd",
    "rsnCd",
    "txQty",
    "uallctdRsnCd",
    "contraPtcptNb",
    "earlstPmtDt"
})
public class CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType5Code rsnCd;
    @XmlElement(name = "TxQty")
    protected FinancialInstrumentQuantity15Choice txQty;
    @XmlElement(name = "UallctdRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCUnallocatedAdjustmentReason4Code uallctdRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat48Choice earlstPmtDt;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentType5Code }
     *     
     */
    public DTCAdjustmentPaymentType5Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentType5Code }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setRsnCd(DTCAdjustmentPaymentType5Code value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the txQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getTxQty() {
        return txQty;
    }

    /**
     * Sets the value of the txQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setTxQty(FinancialInstrumentQuantity15Choice value) {
        this.txQty = value;
        return this;
    }

    /**
     * Gets the value of the uallctdRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCUnallocatedAdjustmentReason4Code }
     *     
     */
    public DTCUnallocatedAdjustmentReason4Code getUallctdRsnCd() {
        return uallctdRsnCd;
    }

    /**
     * Sets the value of the uallctdRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCUnallocatedAdjustmentReason4Code }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setUallctdRsnCd(DTCUnallocatedAdjustmentReason4Code value) {
        this.uallctdRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the contraPtcptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraPtcptNb() {
        return contraPtcptNb;
    }

    /**
     * Sets the value of the contraPtcptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat48Choice }
     *     
     */
    public DateFormat48Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat48Choice }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 setEarlstPmtDt(DateFormat48Choice value) {
        this.earlstPmtDt = value;
        return this;
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

}
