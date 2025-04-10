
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
 * Breakdown of unallocated cash transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedCashTransactionDetailsSD2", propOrder = {
    "cdtDbtInd",
    "rsnCd",
    "txAmt",
    "uallctdRsnCd",
    "contraPtcptNb",
    "earlstPmtDt"
})
public class CorporateActionUnallocatedCashTransactionDetailsSD2 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType1Code rsnCd;
    @XmlElement(name = "TxAmt")
    protected RestrictedFINActiveCurrencyAndAmount txAmt;
    @XmlElement(name = "UallctdRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCUnallocatedAdjustmentReason1Code uallctdRsnCd;
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
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setRsnCd(DTCAdjustmentPaymentType1Code value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setTxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the uallctdRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCUnallocatedAdjustmentReason1Code }
     *     
     */
    public DTCUnallocatedAdjustmentReason1Code getUallctdRsnCd() {
        return uallctdRsnCd;
    }

    /**
     * Sets the value of the uallctdRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCUnallocatedAdjustmentReason1Code }
     *     
     */
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setUallctdRsnCd(DTCUnallocatedAdjustmentReason1Code value) {
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
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setContraPtcptNb(String value) {
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
    public CorporateActionUnallocatedCashTransactionDetailsSD2 setEarlstPmtDt(DateFormat28Choice value) {
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
