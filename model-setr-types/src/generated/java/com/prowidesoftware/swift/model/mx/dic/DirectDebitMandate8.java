
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
 * Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandate8", propOrder = {
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
public class DirectDebitMandate8 {

    @XmlElement(name = "DbtrAcct", required = true)
    protected AccountIdentificationAndName5 dbtrAcct;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification139 dbtr;
    @XmlElement(name = "DbtrTaxIdNb")
    protected String dbtrTaxIdNb;
    @XmlElement(name = "DbtrNtlRegnNb")
    protected String dbtrNtlRegnNb;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification139 cdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected FinancialInstitutionIdentification15 dbtrAgt;
    @XmlElement(name = "DbtrAgtBrnch")
    protected BranchData4 dbtrAgtBrnch;
    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitutionIdentification15 cdtrAgt;
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
    public DirectDebitMandate8 setDbtrAcct(AccountIdentificationAndName5 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public DirectDebitMandate8 setDbtr(PartyIdentification139 value) {
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
    public DirectDebitMandate8 setDbtrTaxIdNb(String value) {
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
    public DirectDebitMandate8 setDbtrNtlRegnNb(String value) {
        this.dbtrNtlRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public DirectDebitMandate8 setCdtr(PartyIdentification139 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification15 }
     *     
     */
    public FinancialInstitutionIdentification15 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification15 }
     *     
     */
    public DirectDebitMandate8 setDbtrAgt(FinancialInstitutionIdentification15 value) {
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
    public DirectDebitMandate8 setDbtrAgtBrnch(BranchData4 value) {
        this.dbtrAgtBrnch = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification15 }
     *     
     */
    public FinancialInstitutionIdentification15 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification15 }
     *     
     */
    public DirectDebitMandate8 setCdtrAgt(FinancialInstitutionIdentification15 value) {
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
    public DirectDebitMandate8 setCdtrAgtBrnch(BranchData4 value) {
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
    public DirectDebitMandate8 setRegnId(String value) {
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
    public DirectDebitMandate8 setMndtId(String value) {
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
