
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
 * Provides additional information regarding corporate action confirmation cash movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionConfirmationCashMovementDetailsSD1", propOrder = {
    "plcAndNm",
    "cdtDbtInd",
    "txAmt",
    "rsnCd",
    "contraPtcptNb",
    "pstngDt"
})
public class CorporateActionConfirmationCashMovementDetailsSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TxAmt")
    protected RestrictedFINActiveCurrencyAndAmount txAmt;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType1Code rsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "PstngDt")
    protected DateFormat22Choice pstngDt;

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
    public CorporateActionConfirmationCashMovementDetailsSD1 setPlcAndNm(String value) {
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
    public CorporateActionConfirmationCashMovementDetailsSD1 setCdtDbtInd(CreditDebitCode value) {
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
    public CorporateActionConfirmationCashMovementDetailsSD1 setTxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.txAmt = value;
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
    public CorporateActionConfirmationCashMovementDetailsSD1 setRsnCd(DTCAdjustmentPaymentType1Code value) {
        this.rsnCd = value;
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
    public CorporateActionConfirmationCashMovementDetailsSD1 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionConfirmationCashMovementDetailsSD1 setPstngDt(DateFormat22Choice value) {
        this.pstngDt = value;
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
