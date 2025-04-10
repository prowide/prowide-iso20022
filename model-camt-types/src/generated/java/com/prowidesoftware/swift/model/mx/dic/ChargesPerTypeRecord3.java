
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
@XmlType(name = "ChargesPerTypeRecord3", propOrder = {
    "rcrdId",
    "chrgsRqstr",
    "undrlygTx",
    "amt",
    "cdtDbtInd",
    "valDt",
    "dbtrAgt",
    "dbtrAgtAcct",
    "chrgsAcctAgt",
    "chrgsAcctAgtAcct",
    "instrForInstdAgt",
    "addtlInf"
})
public class ChargesPerTypeRecord3 {

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
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctAgt;
    @XmlElement(name = "ChrgsAcctAgtAcct")
    protected CashAccount40 chrgsAcctAgtAcct;
    @XmlElement(name = "InstrForInstdAgt")
    protected InstructionForInstructedAgent1 instrForInstdAgt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

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
    public ChargesPerTypeRecord3 setRcrdId(String value) {
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
    public ChargesPerTypeRecord3 setChrgsRqstr(BranchAndFinancialInstitutionIdentification8 value) {
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
    public ChargesPerTypeRecord3 setUndrlygTx(TransactionReferences7 value) {
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
    public ChargesPerTypeRecord3 setAmt(ActiveCurrencyAndAmount value) {
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
    public ChargesPerTypeRecord3 setCdtDbtInd(CreditDebitCode value) {
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
    public ChargesPerTypeRecord3 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
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
    public ChargesPerTypeRecord3 setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
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
    public ChargesPerTypeRecord3 setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesPerTypeRecord3 setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctAgt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcctAgtAcct() {
        return chrgsAcctAgtAcct;
    }

    /**
     * Sets the value of the chrgsAcctAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesPerTypeRecord3 setChrgsAcctAgtAcct(CashAccount40 value) {
        this.chrgsAcctAgtAcct = value;
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
    public ChargesPerTypeRecord3 setInstrForInstdAgt(InstructionForInstructedAgent1 value) {
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
    public ChargesPerTypeRecord3 setAddtlInf(String value) {
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
