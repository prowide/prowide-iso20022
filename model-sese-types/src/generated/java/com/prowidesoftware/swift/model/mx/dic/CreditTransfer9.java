
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransfer9", propOrder = {
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct"
})
public class CreditTransfer9 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentification132 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected AccountIdentificationAndName6 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected FinancialInstitutionIdentification16 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected AccountIdentificationAndName6 dbtrAgtAcct;
    @XmlElement(name = "IntrmyAgt1")
    protected FinancialInstitutionIdentification16 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected AccountIdentificationAndName6 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected FinancialInstitutionIdentification16 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected AccountIdentificationAndName6 intrmyAgt2Acct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected FinancialInstitutionIdentification16 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected AccountIdentificationAndName6 cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification132 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected AccountIdentificationAndName6 cdtrAcct;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public CreditTransfer9 setDbtr(PartyIdentification132 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setDbtrAcct(AccountIdentificationAndName6 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public CreditTransfer9 setDbtrAgt(FinancialInstitutionIdentification16 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setDbtrAgtAcct(AccountIdentificationAndName6 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public CreditTransfer9 setIntrmyAgt1(FinancialInstitutionIdentification16 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setIntrmyAgt1Acct(AccountIdentificationAndName6 value) {
        this.intrmyAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public CreditTransfer9 setIntrmyAgt2(FinancialInstitutionIdentification16 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setIntrmyAgt2Acct(AccountIdentificationAndName6 value) {
        this.intrmyAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public CreditTransfer9 setCdtrAgt(FinancialInstitutionIdentification16 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setCdtrAgtAcct(AccountIdentificationAndName6 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public CreditTransfer9 setCdtr(PartyIdentification132 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public CreditTransfer9 setCdtrAcct(AccountIdentificationAndName6 value) {
        this.cdtrAcct = value;
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
