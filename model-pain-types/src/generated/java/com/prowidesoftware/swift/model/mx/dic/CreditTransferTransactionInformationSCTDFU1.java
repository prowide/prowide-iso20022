
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
 * CreditTransferTransactionInformationSCT_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransactionInformationSCT_DFU1", propOrder = {
    "pmtId",
    "pmtTpInf",
    "amt",
    "chrgBr",
    "ultmtDbtr",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "purp",
    "rmtInf"
})
public class CreditTransferTransactionInformationSCTDFU1 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentificationSEPADFU1 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformationSCT2DFU1 pmtTpInf;
    @XmlElement(name = "Amt", required = true)
    protected AmountTypeSEPADFU1 amt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerTypeSEPACodeDFU1 chrgBr;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentificationSEPA1DFU1 ultmtDbtr;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentificationSEPA1DFU1 cdtrAgt;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentificationSEPA2DFU1 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CashAccountSEPA2DFU1 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentificationSEPA1DFU1 ultmtCdtr;
    @XmlElement(name = "Purp")
    protected PurposeSEPADFU1 purp;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformationSEPA1ChoiceDFU1 rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentificationSEPADFU1 }
     *     
     */
    public PaymentIdentificationSEPADFU1 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentificationSEPADFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setPmtId(PaymentIdentificationSEPADFU1 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformationSCT2DFU1 }
     *     
     */
    public PaymentTypeInformationSCT2DFU1 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformationSCT2DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setPmtTpInf(PaymentTypeInformationSCT2DFU1 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountTypeSEPADFU1 }
     *     
     */
    public AmountTypeSEPADFU1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountTypeSEPADFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setAmt(AmountTypeSEPADFU1 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerTypeSEPACodeDFU1 }
     *     
     */
    public ChargeBearerTypeSEPACodeDFU1 getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerTypeSEPACodeDFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setChrgBr(ChargeBearerTypeSEPACodeDFU1 value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public PartyIdentificationSEPA1DFU1 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setUltmtDbtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA1DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA1DFU1 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA1DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setCdtrAgt(BranchAndFinancialInstitutionIdentificationSEPA1DFU1 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public PartyIdentificationSEPA2DFU1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setCdtr(PartyIdentificationSEPA2DFU1 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public CashAccountSEPA2DFU1 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setCdtrAcct(CashAccountSEPA2DFU1 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public PartyIdentificationSEPA1DFU1 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setUltmtCdtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeSEPADFU1 }
     *     
     */
    public PurposeSEPADFU1 getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeSEPADFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setPurp(PurposeSEPADFU1 value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformationSEPA1ChoiceDFU1 }
     *     
     */
    public RemittanceInformationSEPA1ChoiceDFU1 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformationSEPA1ChoiceDFU1 }
     *     
     */
    public CreditTransferTransactionInformationSCTDFU1 setRmtInf(RemittanceInformationSEPA1ChoiceDFU1 value) {
        this.rmtInf = value;
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
