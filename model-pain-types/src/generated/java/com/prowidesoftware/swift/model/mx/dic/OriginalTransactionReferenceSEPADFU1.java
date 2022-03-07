
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * OriginalTransactionReferenceSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionReferenceSEPA_DFU1", propOrder = {
    "amt",
    "reqdColltnDt",
    "reqdExctnDt",
    "cdtrSchmeId",
    "pmtTpInf",
    "pmtMtd",
    "mndtRltdInf",
    "rmtInf",
    "ultmtDbtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr"
})
public class OriginalTransactionReferenceSEPADFU1 {

    @XmlElement(name = "Amt")
    protected AmountTypeSEPADFU2 amt;
    @XmlElement(name = "ReqdColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdColltnDt;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentificationSEPA3DFU1 cdtrSchmeId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformationSEPADFU1 pmtTpInf;
    @XmlElement(name = "PmtMtd")
    @XmlSchemaType(name = "string")
    protected PaymentMethodSEPACodeDFU1 pmtMtd;
    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformationSEPADFU1 mndtRltdInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformationSEPA2ChoiceDFU1 rmtInf;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentificationSEPA1DFU1 ultmtDbtr;
    @XmlElement(name = "Dbtr")
    protected PartyIdentificationSEPA2DFU2 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccountSEPA1DFU1 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentificationSEPA3DFU1 dbtrAgt;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentificationSEPA3DFU1 cdtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationSEPA2DFU2 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccountSEPA1DFU1 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentificationSEPA1DFU1 ultmtCdtr;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountTypeSEPADFU2 }
     *     
     */
    public AmountTypeSEPADFU2 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountTypeSEPADFU2 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setAmt(AmountTypeSEPADFU2 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the reqdColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdColltnDt() {
        return reqdColltnDt;
    }

    /**
     * Sets the value of the reqdColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setReqdColltnDt(XMLGregorianCalendar value) {
        this.reqdColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA3DFU1 }
     *     
     */
    public PartyIdentificationSEPA3DFU1 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA3DFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setCdtrSchmeId(PartyIdentificationSEPA3DFU1 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformationSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSEPADFU1 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformationSEPADFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setPmtTpInf(PaymentTypeInformationSEPADFU1 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodSEPACodeDFU1 }
     *     
     */
    public PaymentMethodSEPACodeDFU1 getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodSEPACodeDFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setPmtMtd(PaymentMethodSEPACodeDFU1 value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformationSEPADFU1 }
     *     
     */
    public MandateRelatedInformationSEPADFU1 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformationSEPADFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setMndtRltdInf(MandateRelatedInformationSEPADFU1 value) {
        this.mndtRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformationSEPA2ChoiceDFU1 }
     *     
     */
    public RemittanceInformationSEPA2ChoiceDFU1 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformationSEPA2ChoiceDFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setRmtInf(RemittanceInformationSEPA2ChoiceDFU1 value) {
        this.rmtInf = value;
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
    public OriginalTransactionReferenceSEPADFU1 setUltmtDbtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2DFU2 }
     *     
     */
    public PartyIdentificationSEPA2DFU2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2DFU2 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setDbtr(PartyIdentificationSEPA2DFU2 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA1DFU1 }
     *     
     */
    public CashAccountSEPA1DFU1 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA1DFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setDbtrAcct(CashAccountSEPA1DFU1 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA3DFU1 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA3DFU1 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA3DFU1 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setCdtrAgt(BranchAndFinancialInstitutionIdentificationSEPA3DFU1 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2DFU2 }
     *     
     */
    public PartyIdentificationSEPA2DFU2 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2DFU2 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setCdtr(PartyIdentificationSEPA2DFU2 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA1DFU1 }
     *     
     */
    public CashAccountSEPA1DFU1 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA1DFU1 }
     *     
     */
    public OriginalTransactionReferenceSEPADFU1 setCdtrAcct(CashAccountSEPA1DFU1 value) {
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
    public OriginalTransactionReferenceSEPADFU1 setUltmtCdtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtCdtr = value;
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
