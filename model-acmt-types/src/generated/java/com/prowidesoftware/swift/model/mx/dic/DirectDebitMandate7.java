
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
 * Direct debit mandate parties and accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandate7", propOrder = {
    "dbtrAcct",
    "dbtr",
    "dbtrTaxIdNb",
    "dbtrNtlRegnNb",
    "cdtr",
    "dbtrAgt",
    "dbtrAgtBrnch",
    "cdtrAgt",
    "cdtrAgtBrnch",
    "regnId",
    "mndtId"
})
public class DirectDebitMandate7 {

    @XmlElement(name = "DbtrAcct", required = true)
    protected AccountIdentificationAndName5 dbtrAcct;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification125Choice dbtr;
    @XmlElement(name = "DbtrTaxIdNb")
    protected String dbtrTaxIdNb;
    @XmlElement(name = "DbtrNtlRegnNb")
    protected String dbtrNtlRegnNb;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification125Choice cdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected FinancialInstitutionIdentification11Choice dbtrAgt;
    @XmlElement(name = "DbtrAgtBrnch")
    protected BranchData4 dbtrAgtBrnch;
    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitutionIdentification11Choice cdtrAgt;
    @XmlElement(name = "CdtrAgtBrnch")
    protected BranchData4 cdtrAgtBrnch;
    @XmlElement(name = "RegnId")
    protected String regnId;
    @XmlElement(name = "MndtId")
    protected String mndtId;

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
    public DirectDebitMandate7 setDbtrAcct(AccountIdentificationAndName5 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public DirectDebitMandate7 setDbtr(PartyIdentification125Choice value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrTaxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrTaxIdNb() {
        return dbtrTaxIdNb;
    }

    /**
     * Sets the value of the dbtrTaxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandate7 setDbtrTaxIdNb(String value) {
        this.dbtrTaxIdNb = value;
        return this;
    }

    /**
     * Gets the value of the dbtrNtlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrNtlRegnNb() {
        return dbtrNtlRegnNb;
    }

    /**
     * Sets the value of the dbtrNtlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandate7 setDbtrNtlRegnNb(String value) {
        this.dbtrNtlRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public DirectDebitMandate7 setCdtr(PartyIdentification125Choice value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public DirectDebitMandate7 setDbtrAgt(FinancialInstitutionIdentification11Choice value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getDbtrAgtBrnch() {
        return dbtrAgtBrnch;
    }

    /**
     * Sets the value of the dbtrAgtBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public DirectDebitMandate7 setDbtrAgtBrnch(BranchData4 value) {
        this.dbtrAgtBrnch = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public DirectDebitMandate7 setCdtrAgt(FinancialInstitutionIdentification11Choice value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getCdtrAgtBrnch() {
        return cdtrAgtBrnch;
    }

    /**
     * Sets the value of the cdtrAgtBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public DirectDebitMandate7 setCdtrAgtBrnch(BranchData4 value) {
        this.cdtrAgtBrnch = value;
        return this;
    }

    /**
     * Gets the value of the regnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnId() {
        return regnId;
    }

    /**
     * Sets the value of the regnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandate7 setRegnId(String value) {
        this.regnId = value;
        return this;
    }

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandate7 setMndtId(String value) {
        this.mndtId = value;
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
