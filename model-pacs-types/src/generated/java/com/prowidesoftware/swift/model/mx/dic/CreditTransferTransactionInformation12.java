
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of elements used to provide information specific to the individual transaction(s) included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransactionInformation12", propOrder = {
    "ultmtDbtr",
    "initgPty",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "prvsInstgAgt",
    "prvsInstgAgtAcct",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "intrmyAgt3",
    "intrmyAgt3Acct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "rmtInf",
    "instdAmt"
})
public class CreditTransferTransactionInformation12 {

    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification32 ultmtDbtr;
    @XmlElement(name = "InitgPty")
    protected PartyIdentification32 initgPty;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification32 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount16 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification4 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount16 dbtrAgtAcct;
    @XmlElement(name = "PrvsInstgAgt")
    protected BranchAndFinancialInstitutionIdentification4 prvsInstgAgt;
    @XmlElement(name = "PrvsInstgAgtAcct")
    protected CashAccount16 prvsInstgAgtAcct;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification4 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected CashAccount16 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification4 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected CashAccount16 intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification4 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct")
    protected CashAccount16 intrmyAgt3Acct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification4 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount16 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification32 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount16 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification32 ultmtCdtr;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation5 rmtInf;
    @XmlElement(name = "InstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public CreditTransferTransactionInformation12 setUltmtDbtr(PartyIdentification32 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public CreditTransferTransactionInformation12 setInitgPty(PartyIdentification32 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public CreditTransferTransactionInformation12 setDbtr(PartyIdentification32 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setDbtrAcct(CashAccount16 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setDbtrAgt(BranchAndFinancialInstitutionIdentification4 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setDbtrAgtAcct(CashAccount16 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPrvsInstgAgt() {
        return prvsInstgAgt;
    }

    /**
     * Sets the value of the prvsInstgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setPrvsInstgAgt(BranchAndFinancialInstitutionIdentification4 value) {
        this.prvsInstgAgt = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPrvsInstgAgtAcct() {
        return prvsInstgAgtAcct;
    }

    /**
     * Sets the value of the prvsInstgAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setPrvsInstgAgtAcct(CashAccount16 value) {
        this.prvsInstgAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt1(BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt1Acct(CashAccount16 value) {
        this.intrmyAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt2(BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt2Acct(CashAccount16 value) {
        this.intrmyAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt3(BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getIntrmyAgt3Acct() {
        return intrmyAgt3Acct;
    }

    /**
     * Sets the value of the intrmyAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setIntrmyAgt3Acct(CashAccount16 value) {
        this.intrmyAgt3Acct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public CreditTransferTransactionInformation12 setCdtrAgt(BranchAndFinancialInstitutionIdentification4 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setCdtrAgtAcct(CashAccount16 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public CreditTransferTransactionInformation12 setCdtr(PartyIdentification32 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public CreditTransferTransactionInformation12 setCdtrAcct(CashAccount16 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public CreditTransferTransactionInformation12 setUltmtCdtr(PartyIdentification32 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation5 }
     *     
     */
    public RemittanceInformation5 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation5 }
     *     
     */
    public CreditTransferTransactionInformation12 setRmtInf(RemittanceInformation5 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CreditTransferTransactionInformation12 setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
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
