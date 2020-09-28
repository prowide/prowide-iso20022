
package com.prowidesoftware.swift.model.mx.dic;

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
 * Contains the requested modifications.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedModification", propOrder = {
    "rltdRef",
    "bkOprCd",
    "instrCd",
    "reqdExctnDt",
    "valDt",
    "intrBkSttldAmt",
    "dbtr",
    "dbtrAcct",
    "intrmySttlmAgt",
    "lastSttlmAgt",
    "pmtSchme",
    "bnfcryInstnAcct",
    "cdtr",
    "cdtrAcct",
    "rmtInf",
    "purp",
    "instrForFnlAgt",
    "dtlsOfChrgs",
    "sndrToRcvrInf"
})
public class RequestedModification {

    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "BkOprCd")
    @XmlSchemaType(name = "string")
    protected SWIFTServiceLevel2Code bkOprCd;
    @XmlElement(name = "InstrCd")
    @XmlSchemaType(name = "string")
    protected Instruction1Code instrCd;
    @XmlElement(name = "ReqdExctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "IntrBkSttldAmt")
    protected CurrencyAndAmount intrBkSttldAmt;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification1 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount3 dbtrAcct;
    @XmlElement(name = "IntrmySttlmAgt")
    protected BranchAndFinancialInstitutionIdentification intrmySttlmAgt;
    @XmlElement(name = "LastSttlmAgt")
    protected BranchAndFinancialInstitutionIdentification lastSttlmAgt;
    @XmlElement(name = "PmtSchme")
    protected PaymentSchemeChoice pmtSchme;
    @XmlElement(name = "BnfcryInstnAcct")
    protected CashAccount3 bnfcryInstnAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification1 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount3 cdtrAcct;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation3Choice rmtInf;
    @XmlElement(name = "Purp")
    protected PurposeChoice purp;
    @XmlElement(name = "InstrForFnlAgt")
    protected InstructionForFinalAgent instrForFnlAgt;
    @XmlElement(name = "DtlsOfChrgs")
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code dtlsOfChrgs;
    @XmlElement(name = "SndrToRcvrInf")
    protected List<String> sndrToRcvrInf;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestedModification setRltdRef(String value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the bkOprCd property.
     * 
     * @return
     *     possible object is
     *     {@link SWIFTServiceLevel2Code }
     *     
     */
    public SWIFTServiceLevel2Code getBkOprCd() {
        return bkOprCd;
    }

    /**
     * Sets the value of the bkOprCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWIFTServiceLevel2Code }
     *     
     */
    public RequestedModification setBkOprCd(SWIFTServiceLevel2Code value) {
        this.bkOprCd = value;
        return this;
    }

    /**
     * Gets the value of the instrCd property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction1Code }
     *     
     */
    public Instruction1Code getInstrCd() {
        return instrCd;
    }

    /**
     * Sets the value of the instrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction1Code }
     *     
     */
    public RequestedModification setInstrCd(Instruction1Code value) {
        this.instrCd = value;
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
    public RequestedModification setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RequestedModification setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getIntrBkSttldAmt() {
        return intrBkSttldAmt;
    }

    /**
     * Sets the value of the intrBkSttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public RequestedModification setIntrBkSttldAmt(CurrencyAndAmount value) {
        this.intrBkSttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public RequestedModification setDbtr(PartyIdentification1 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public RequestedModification setDbtrAcct(CashAccount3 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmySttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getIntrmySttlmAgt() {
        return intrmySttlmAgt;
    }

    /**
     * Sets the value of the intrmySttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public RequestedModification setIntrmySttlmAgt(BranchAndFinancialInstitutionIdentification value) {
        this.intrmySttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the lastSttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getLastSttlmAgt() {
        return lastSttlmAgt;
    }

    /**
     * Sets the value of the lastSttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public RequestedModification setLastSttlmAgt(BranchAndFinancialInstitutionIdentification value) {
        this.lastSttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the pmtSchme property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSchemeChoice }
     *     
     */
    public PaymentSchemeChoice getPmtSchme() {
        return pmtSchme;
    }

    /**
     * Sets the value of the pmtSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSchemeChoice }
     *     
     */
    public RequestedModification setPmtSchme(PaymentSchemeChoice value) {
        this.pmtSchme = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryInstnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getBnfcryInstnAcct() {
        return bnfcryInstnAcct;
    }

    /**
     * Sets the value of the bnfcryInstnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public RequestedModification setBnfcryInstnAcct(CashAccount3 value) {
        this.bnfcryInstnAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public RequestedModification setCdtr(PartyIdentification1 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public RequestedModification setCdtrAcct(CashAccount3 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation3Choice }
     *     
     */
    public RemittanceInformation3Choice getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation3Choice }
     *     
     */
    public RequestedModification setRmtInf(RemittanceInformation3Choice value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeChoice }
     *     
     */
    public PurposeChoice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeChoice }
     *     
     */
    public RequestedModification setPurp(PurposeChoice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the instrForFnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForFinalAgent }
     *     
     */
    public InstructionForFinalAgent getInstrForFnlAgt() {
        return instrForFnlAgt;
    }

    /**
     * Sets the value of the instrForFnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForFinalAgent }
     *     
     */
    public RequestedModification setInstrForFnlAgt(InstructionForFinalAgent value) {
        this.instrForFnlAgt = value;
        return this;
    }

    /**
     * Gets the value of the dtlsOfChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public ChargeBearer1Code getDtlsOfChrgs() {
        return dtlsOfChrgs;
    }

    /**
     * Sets the value of the dtlsOfChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public RequestedModification setDtlsOfChrgs(ChargeBearer1Code value) {
        this.dtlsOfChrgs = value;
        return this;
    }

    /**
     * Gets the value of the sndrToRcvrInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndrToRcvrInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndrToRcvrInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSndrToRcvrInf() {
        if (sndrToRcvrInf == null) {
            sndrToRcvrInf = new ArrayList<String>();
        }
        return this.sndrToRcvrInf;
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
     * Adds a new item to the sndrToRcvrInf list.
     * @see #getSndrToRcvrInf()
     * 
     */
    public RequestedModification addSndrToRcvrInf(String sndrToRcvrInf) {
        getSndrToRcvrInf().add(sndrToRcvrInf);
        return this;
    }

}
