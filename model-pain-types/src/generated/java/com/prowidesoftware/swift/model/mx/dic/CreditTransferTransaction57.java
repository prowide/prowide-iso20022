
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details specific to the individual transaction(s) included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction57", propOrder = {
    "pmtId",
    "pmtTpInf",
    "pmtCond",
    "reqdExctnDt",
    "amt",
    "chrgBr",
    "mndtRltdInf",
    "chqInstr",
    "ultmtDbtr",
    "intrmyAgt1",
    "intrmyAgt2",
    "intrmyAgt3",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgt",
    "purp",
    "rgltryRptg",
    "tax",
    "rltdRmtInf",
    "rmtInf",
    "nclsdFile",
    "splmtryData"
})
public class CreditTransferTransaction57 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification6 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation26 pmtTpInf;
    @XmlElement(name = "PmtCond")
    protected PaymentCondition1 pmtCond;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "Amt", required = true)
    protected AmountType4Choice amt;
    @XmlElement(name = "ChrgBr", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "MndtRltdInf")
    protected CreditTransferMandateData1 mndtRltdInf;
    @XmlElement(name = "ChqInstr")
    protected Cheque16 chqInstr;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt3;
    @XmlElement(name = "CdtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount40 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent3> instrForCdtrAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax")
    protected TaxInformation10 tax;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation21 rmtInf;
    @XmlElement(name = "NclsdFile")
    protected List<Document12> nclsdFile;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification6 }
     *     
     */
    public PaymentIdentification6 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification6 }
     *     
     */
    public CreditTransferTransaction57 setPmtId(PaymentIdentification6 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public PaymentTypeInformation26 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public CreditTransferTransaction57 setPmtTpInf(PaymentTypeInformation26 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtCond property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition1 }
     *     
     */
    public PaymentCondition1 getPmtCond() {
        return pmtCond;
    }

    /**
     * Sets the value of the pmtCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition1 }
     *     
     */
    public CreditTransferTransaction57 setPmtCond(PaymentCondition1 value) {
        this.pmtCond = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CreditTransferTransaction57 setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType4Choice }
     *     
     */
    public AmountType4Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType4Choice }
     *     
     */
    public CreditTransferTransaction57 setAmt(AmountType4Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public CreditTransferTransaction57 setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferTransaction57 setMndtRltdInf(CreditTransferMandateData1 value) {
        this.mndtRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the chqInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque16 }
     *     
     */
    public Cheque16 getChqInstr() {
        return chqInstr;
    }

    /**
     * Sets the value of the chqInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque16 }
     *     
     */
    public CreditTransferTransaction57 setChqInstr(Cheque16 value) {
        this.chqInstr = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CreditTransferTransaction57 setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CreditTransferTransaction57 setIntrmyAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CreditTransferTransaction57 setIntrmyAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CreditTransferTransaction57 setIntrmyAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CreditTransferTransaction57 setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public CreditTransferTransaction57 setCdtrAgtAcct(CashAccount40 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CreditTransferTransaction57 setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public CreditTransferTransaction57 setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CreditTransferTransaction57 setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the instrForCdtrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForCdtrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForCdtrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForCreditorAgent3 }
     * 
     * 
     * @return
     *     The value of the instrForCdtrAgt property.
     */
    public List<InstructionForCreditorAgent3> getInstrForCdtrAgt() {
        if (instrForCdtrAgt == null) {
            instrForCdtrAgt = new ArrayList<>();
        }
        return this.instrForCdtrAgt;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public CreditTransferTransaction57 setPurp(Purpose2Choice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReporting3 }
     * 
     * 
     * @return
     *     The value of the rgltryRptg property.
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<>();
        }
        return this.rgltryRptg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation10 }
     *     
     */
    public TaxInformation10 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation10 }
     *     
     */
    public CreditTransferTransaction57 setTax(TaxInformation10 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     * 
     * 
     * @return
     *     The value of the rltdRmtInf property.
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public RemittanceInformation21 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public CreditTransferTransaction57 setRmtInf(RemittanceInformation21 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document12 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document12> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the instrForCdtrAgt list.
     * @see #getInstrForCdtrAgt()
     * 
     */
    public CreditTransferTransaction57 addInstrForCdtrAgt(InstructionForCreditorAgent3 instrForCdtrAgt) {
        getInstrForCdtrAgt().add(instrForCdtrAgt);
        return this;
    }

    /**
     * Adds a new item to the rgltryRptg list.
     * @see #getRgltryRptg()
     * 
     */
    public CreditTransferTransaction57 addRgltryRptg(RegulatoryReporting3 rgltryRptg) {
        getRgltryRptg().add(rgltryRptg);
        return this;
    }

    /**
     * Adds a new item to the rltdRmtInf list.
     * @see #getRltdRmtInf()
     * 
     */
    public CreditTransferTransaction57 addRltdRmtInf(RemittanceLocation7 rltdRmtInf) {
        getRltdRmtInf().add(rltdRmtInf);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public CreditTransferTransaction57 addNclsdFile(Document12 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CreditTransferTransaction57 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
