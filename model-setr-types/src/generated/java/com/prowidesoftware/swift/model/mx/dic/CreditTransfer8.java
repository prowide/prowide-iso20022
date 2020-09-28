
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
 * Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransfer8", propOrder = {
    "ref",
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
public class CreditTransfer8 {

    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification113 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected AccountIdentificationAndName5 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected FinancialInstitutionIdentification10 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected AccountIdentificationAndName5 dbtrAgtAcct;
    @XmlElement(name = "IntrmyAgt1")
    protected FinancialInstitutionIdentification10 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected AccountIdentificationAndName5 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected FinancialInstitutionIdentification10 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected AccountIdentificationAndName5 intrmyAgt2Acct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected FinancialInstitutionIdentification10 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected AccountIdentificationAndName5 cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification113 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected AccountIdentificationAndName5 cdtrAcct;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditTransfer8 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public CreditTransfer8 setDbtr(PartyIdentification113 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setDbtrAcct(AccountIdentificationAndName5 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public FinancialInstitutionIdentification10 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public CreditTransfer8 setDbtrAgt(FinancialInstitutionIdentification10 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setDbtrAgtAcct(AccountIdentificationAndName5 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public FinancialInstitutionIdentification10 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public CreditTransfer8 setIntrmyAgt1(FinancialInstitutionIdentification10 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setIntrmyAgt1Acct(AccountIdentificationAndName5 value) {
        this.intrmyAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public FinancialInstitutionIdentification10 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public CreditTransfer8 setIntrmyAgt2(FinancialInstitutionIdentification10 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setIntrmyAgt2Acct(AccountIdentificationAndName5 value) {
        this.intrmyAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public FinancialInstitutionIdentification10 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public CreditTransfer8 setCdtrAgt(FinancialInstitutionIdentification10 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setCdtrAgtAcct(AccountIdentificationAndName5 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public CreditTransfer8 setCdtr(PartyIdentification113 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CreditTransfer8 setCdtrAcct(AccountIdentificationAndName5 value) {
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
