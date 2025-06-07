
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
 * Provides further individual record details on the charges related to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesRecord11", propOrder = {
    "chrgsId",
    "rcrdId",
    "chrgsRqstr",
    "undrlygTx",
    "amt",
    "cdtDbtInd",
    "valDt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "chrgsAcct",
    "chrgsAcctOwnr",
    "tp",
    "instrForInstdAgt",
    "addtlInf"
})
public class ChargesRecord11 {

    @XmlElement(name = "ChrgsId")
    protected String chrgsId;
    @XmlElement(name = "RcrdId")
    protected String rcrdId;
    @XmlElement(name = "ChrgsRqstr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsRqstr;
    @XmlElement(name = "UndrlygTx", required = true)
    protected TransactionReferences7 undrlygTx;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification272 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount40 chrgsAcct;
    @XmlElement(name = "ChrgsAcctOwnr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctOwnr;
    @XmlElement(name = "Tp")
    protected ChargeType3Choice tp;
    @XmlElement(name = "InstrForInstdAgt")
    protected InstructionForInstructedAgent1 instrForInstdAgt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the chrgsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgsId() {
        return chrgsId;
    }

    /**
     * Sets the value of the chrgsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesRecord11 setChrgsId(String value) {
        this.chrgsId = value;
        return this;
    }

    /**
     * Gets the value of the rcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrdId() {
        return rcrdId;
    }

    /**
     * Sets the value of the rcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesRecord11 setRcrdId(String value) {
        this.rcrdId = value;
        return this;
    }

    /**
     * Gets the value of the chrgsRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsRqstr() {
        return chrgsRqstr;
    }

    /**
     * Sets the value of the chrgsRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesRecord11 setChrgsRqstr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsRqstr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygTx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences7 }
     *     
     */
    public TransactionReferences7 getUndrlygTx() {
        return undrlygTx;
    }

    /**
     * Sets the value of the undrlygTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences7 }
     *     
     */
    public ChargesRecord11 setUndrlygTx(TransactionReferences7 value) {
        this.undrlygTx = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ChargesRecord11 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
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
    public ChargesRecord11 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public ChargesRecord11 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public ChargesRecord11 setDbtr(PartyIdentification272 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesRecord11 setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesRecord11 setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesRecord11 setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesRecord11 setChrgsAcct(CashAccount40 value) {
        this.chrgsAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsAcctOwnr() {
        return chrgsAcctOwnr;
    }

    /**
     * Sets the value of the chrgsAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesRecord11 setChrgsAcctOwnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType3Choice }
     *     
     */
    public ChargeType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType3Choice }
     *     
     */
    public ChargesRecord11 setTp(ChargeType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the instrForInstdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForInstructedAgent1 }
     *     
     */
    public InstructionForInstructedAgent1 getInstrForInstdAgt() {
        return instrForInstdAgt;
    }

    /**
     * Sets the value of the instrForInstdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForInstructedAgent1 }
     *     
     */
    public ChargesRecord11 setInstrForInstdAgt(InstructionForInstructedAgent1 value) {
        this.instrForInstdAgt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesRecord11 setAddtlInf(String value) {
        this.addtlInf = value;
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
