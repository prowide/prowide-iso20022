
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides additional information regarding corporate action movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementCashMovementDetailsSD2", propOrder = {
    "plcAndNm",
    "cdtDbtInd",
    "txAmt",
    "rsnCd",
    "subRsnCd",
    "contraPtcptNb",
    "earlstPmtDt",
    "taxAdjstmntRate"
})
public class CorporateActionMovementCashMovementDetailsSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TxAmt")
    protected RestrictedFINActiveCurrencyAndAmount txAmt;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType2Code rsnCd;
    @XmlElement(name = "SubRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentSubReason1Code subRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat28Choice earlstPmtDt;
    @XmlElement(name = "TaxAdjstmntRate")
    protected BigDecimal taxAdjstmntRate;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovementCashMovementDetailsSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

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
    public CorporateActionMovementCashMovementDetailsSD2 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
    public CorporateActionMovementCashMovementDetailsSD2 setTxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentType2Code }
     *     
     */
    public DTCAdjustmentPaymentType2Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentType2Code }
     *     
     */
    public CorporateActionMovementCashMovementDetailsSD2 setRsnCd(DTCAdjustmentPaymentType2Code value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the subRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentSubReason1Code }
     *     
     */
    public DTCAdjustmentPaymentSubReason1Code getSubRsnCd() {
        return subRsnCd;
    }

    /**
     * Sets the value of the subRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentSubReason1Code }
     *     
     */
    public CorporateActionMovementCashMovementDetailsSD2 setSubRsnCd(DTCAdjustmentPaymentSubReason1Code value) {
        this.subRsnCd = value;
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
    public CorporateActionMovementCashMovementDetailsSD2 setContraPtcptNb(String value) {
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
    public CorporateActionMovementCashMovementDetailsSD2 setEarlstPmtDt(DateFormat28Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the taxAdjstmntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAdjstmntRate() {
        return taxAdjstmntRate;
    }

    /**
     * Sets the value of the taxAdjstmntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionMovementCashMovementDetailsSD2 setTaxAdjstmntRate(BigDecimal value) {
        this.taxAdjstmntRate = value;
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
