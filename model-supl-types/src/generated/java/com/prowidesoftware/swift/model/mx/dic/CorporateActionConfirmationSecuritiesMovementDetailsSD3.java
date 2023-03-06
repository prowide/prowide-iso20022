
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "CorporateActionConfirmationSecuritiesMovementDetailsSD3", propOrder = {
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
    "newSctiesIssncInd",
    "rdpRefNb"
})
public class CorporateActionConfirmationSecuritiesMovementDetailsSD3 {

    @XmlElement(name = "PlcAndNm", required = true)
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
    protected DTCAdjustmentPaymentType2Code rsnCd;
    @XmlElement(name = "SubRsnCd")
    @XmlSchemaType(name = "string")
    protected DTCAdjustmentPaymentSubReason1Code subRsnCd;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "PstngDt")
    protected DateFormat28Choice pstngDt;
    @XmlElement(name = "TaxAdjstmntRate")
    protected BigDecimal taxAdjstmntRate;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType4Code newSctiesIssncInd;
    @XmlElement(name = "RDPRefNb")
    protected String rdpRefNb;

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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setPlcAndNm(String value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setCdtDbtInd(CreditDebitCode value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setPyoutTp(DTCCPayoutType4Code value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setTxQty(FinancialInstrumentQuantity15Choice value) {
        this.txQty = value;
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setRsnCd(DTCAdjustmentPaymentType2Code value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setSubRsnCd(DTCAdjustmentPaymentSubReason1Code value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setContraPtcptNb(String value) {
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
    public XMLGregorianCalendar getMtrtyDt() {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat28Choice }
     *     
     */
    public DateFormat28Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat28Choice }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setPstngDt(DateFormat28Choice value) {
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setTaxAdjstmntRate(BigDecimal value) {
        this.taxAdjstmntRate = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType4Code }
     *     
     */
    public NewSecuritiesIssuanceType4Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType4Code }
     *     
     */
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setNewSctiesIssncInd(NewSecuritiesIssuanceType4Code value) {
        this.newSctiesIssncInd = value;
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
    public CorporateActionConfirmationSecuritiesMovementDetailsSD3 setRDPRefNb(String value) {
        this.rdpRefNb = value;
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
