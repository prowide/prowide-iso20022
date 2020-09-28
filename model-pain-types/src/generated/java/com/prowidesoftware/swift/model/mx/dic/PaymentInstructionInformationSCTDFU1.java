
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * PaymentInstructionInformationSCT_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionInformationSCT_DFU1", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "btchBookg",
    "nbOfTxs",
    "ctrlSum",
    "pmtTpInf",
    "reqdExctnDt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "ultmtDbtr",
    "chrgBr",
    "cdtTrfTxInf"
})
public class PaymentInstructionInformationSCTDFU1 {

    @XmlElement(name = "PmtInfId", required = true)
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethodSCTCodeDFU1 pmtMtd;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformationSCT1DFU1 pmtTpInf;
    @XmlElement(name = "ReqdExctnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentificationSEPA2DFU1 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccountSEPA1DFU1 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentificationSEPA3DFU1 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentificationSEPA1DFU1 ultmtDbtr;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerTypeSEPACodeDFU1 chrgBr;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    protected List<CreditTransferTransactionInformationSCTDFU1> cdtTrfTxInf;

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setPmtInfId(String value) {
        this.pmtInfId = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodSCTCodeDFU1 }
     *     
     */
    public PaymentMethodSCTCodeDFU1 getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodSCTCodeDFU1 }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setPmtMtd(PaymentMethodSCTCodeDFU1 value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setBtchBookg(Boolean value) {
        this.btchBookg = value;
        return this;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setNbOfTxs(String value) {
        this.nbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformationSCT1DFU1 }
     *     
     */
    public PaymentTypeInformationSCT1DFU1 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformationSCT1DFU1 }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setPmtTpInf(PaymentTypeInformationSCT1DFU1 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public PartyIdentificationSEPA2DFU1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public PaymentInstructionInformationSCTDFU1 setDbtr(PartyIdentificationSEPA2DFU1 value) {
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
    public PaymentInstructionInformationSCTDFU1 setDbtrAcct(CashAccountSEPA1DFU1 value) {
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
    public PaymentInstructionInformationSCTDFU1 setDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA3DFU1 value) {
        this.dbtrAgt = value;
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
    public PaymentInstructionInformationSCTDFU1 setUltmtDbtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtDbtr = value;
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
    public PaymentInstructionInformationSCTDFU1 setChrgBr(ChargeBearerTypeSEPACodeDFU1 value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtTrfTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtTrfTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransactionInformationSCTDFU1 }
     * 
     * 
     */
    public List<CreditTransferTransactionInformationSCTDFU1> getCdtTrfTxInf() {
        if (cdtTrfTxInf == null) {
            cdtTrfTxInf = new ArrayList<CreditTransferTransactionInformationSCTDFU1>();
        }
        return this.cdtTrfTxInf;
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

    /**
     * Adds a new item to the cdtTrfTxInf list.
     * @see #getCdtTrfTxInf()
     * 
     */
    public PaymentInstructionInformationSCTDFU1 addCdtTrfTxInf(CreditTransferTransactionInformationSCTDFU1 cdtTrfTxInf) {
        getCdtTrfTxInf().add(cdtTrfTxInf);
        return this;
    }

}
