
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action confirmation securities movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionConfirmationSecuritiesMovementDetailsSD6", propOrder = {
    "plcAndNm",
    "cdtDbtInd",
    "pyoutTp",
    "txQty",
    "rsnCd",
    "subRsnCd",
    "contraPtcptNb",
    "mtrtyDt",
    "pstngDt",
    "taxAdjstmntRate",
    "rdpRefNb",
    "rndgFctr"
})
public class CorporateActionConfirmationSecuritiesMovementDetailsSD6 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "PyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCPayoutType4Code pyoutTp;
    @XmlElement(name = "TxQty")
    protected FinancialInstrumentQuantity15Choice txQty;
    @XmlElement(name = "RsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentType4Code rsnCd;
    @XmlElement(name = "SubRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentSubReason2Code subRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar mtrtyDt;
    @XmlElement(name = "PstngDt")
    protected DateFormat48Choice pstngDt;
    @XmlElement(name = "TaxAdjstmntRate")
    protected BigDecimal taxAdjstmntRate;
    @XmlElement(name = "RDPRefNb")
    protected String rdpRefNb;
    @XmlElement(name = "RndgFctr")
    protected BigDecimal rndgFctr;

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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setPlcAndNm(String value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the pyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCPayoutType4Code }
     *     
     */
    public DTCCPayoutType4Code getPyoutTp() {
        return pyoutTp;
    }

    /**
     * Sets the value of the pyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCPayoutType4Code }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setPyoutTp(DTCCPayoutType4Code value) {
        this.pyoutTp = value;
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setTxQty(FinancialInstrumentQuantity15Choice value) {
        this.txQty = value;
        return this;
    }

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentType4Code }
     *     
     */
    public DTCAdjustmentPaymentType4Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentType4Code }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setRsnCd(DTCAdjustmentPaymentType4Code value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the subRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAdjustmentPaymentSubReason2Code }
     *     
     */
    public DTCAdjustmentPaymentSubReason2Code getSubRsnCd() {
        return subRsnCd;
    }

    /**
     * Sets the value of the subRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAdjustmentPaymentSubReason2Code }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setSubRsnCd(DTCAdjustmentPaymentSubReason2Code value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setMtrtyDt(Calendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat48Choice }
     *     
     */
    public DateFormat48Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat48Choice }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setPstngDt(DateFormat48Choice value) {
        this.pstngDt = value;
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setTaxAdjstmntRate(BigDecimal value) {
        this.taxAdjstmntRate = value;
        return this;
    }

    /**
     * Gets the value of the rdpRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPRefNb() {
        return rdpRefNb;
    }

    /**
     * Sets the value of the rdpRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setRDPRefNb(String value) {
        this.rdpRefNb = value;
        return this;
    }

    /**
     * Gets the value of the rndgFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndgFctr() {
        return rndgFctr;
    }

    /**
     * Sets the value of the rndgFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD6 setRndgFctr(BigDecimal value) {
        this.rndgFctr = value;
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
