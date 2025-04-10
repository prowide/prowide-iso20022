
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionUnallocatedSecuritiesTransactionDetailsSD5", propOrder = {
    "cdtDbtInd",
    "rsnCd",
    "txQty",
    "uallctdRsnCd",
    "contraPtcptNb",
    "earlstPmtDt"
})
public class CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType3Code rsnCd;
    @XmlElement(name = "TxQty")
    protected FinancialInstrumentQuantity15Choice txQty;
    @XmlElement(name = "UallctdRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCUnallocatedAdjustmentReason2Code uallctdRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat28Choice earlstPmtDt;

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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentType3Code }
     *     
     */
    public DTCAdjustmentPaymentType3Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentType3Code }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setRsnCd(DTCAdjustmentPaymentType3Code value) {
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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setTxQty(FinancialInstrumentQuantity15Choice value) {
        this.txQty = value;
        return this;
    }

    /**
     * Gets the value of the uallctdRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCUnallocatedAdjustmentReason2Code }
     *     
     */
    public DTCUnallocatedAdjustmentReason2Code getUallctdRsnCd() {
        return uallctdRsnCd;
    }

    /**
     * Sets the value of the uallctdRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCUnallocatedAdjustmentReason2Code }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setUallctdRsnCd(DTCUnallocatedAdjustmentReason2Code value) {
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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat28Choice }
     *     
     */
    public DateFormat28Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat28Choice }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 setEarlstPmtDt(DateFormat28Choice value) {
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
