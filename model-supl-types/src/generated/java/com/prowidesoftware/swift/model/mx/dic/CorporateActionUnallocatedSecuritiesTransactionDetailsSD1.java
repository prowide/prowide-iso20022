
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
@XmlType(name = "CorporateActionUnallocatedSecuritiesTransactionDetailsSD1", propOrder = {
    "cdtDbtInd",
    "txQty",
    "uallctdRsnCd",
    "contraPtcptNb",
    "earlstPmtDt",
    "rsnCd"
})
public class CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TxQty")
    protected FinancialInstrumentQuantity15Choice txQty;
    @XmlElement(name = "UallctdRsnCd", required = true)
    protected String uallctdRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat22Choice earlstPmtDt;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType1Code rsnCd;

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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setTxQty(FinancialInstrumentQuantity15Choice value) {
        this.txQty = value;
        return this;
    }

    /**
     * Gets the value of the uallctdRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUallctdRsnCd() {
        return uallctdRsnCd;
    }

    /**
     * Sets the value of the uallctdRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setUallctdRsnCd(String value) {
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
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setEarlstPmtDt(DateFormat22Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentType1Code }
     *     
     */
    public DTCAdjustmentPaymentType1Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentType1Code }
     *     
     */
    public CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 setRsnCd(DTCAdjustmentPaymentType1Code value) {
        this.rsnCd = value;
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
