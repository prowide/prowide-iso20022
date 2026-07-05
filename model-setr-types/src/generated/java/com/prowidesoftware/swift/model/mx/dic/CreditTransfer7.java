
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
@XmlType(name = "CreditTransfer7", propOrder = {
    "dbtrAgt",
    "dbtrAgtAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct"
})
public class CreditTransfer7 {

    @XmlElement(name = "DbtrAgt")
    protected FinancialInstitutionIdentification6Choice dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected AccountIdentificationAndName4 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected FinancialInstitutionIdentification6Choice cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected AccountIdentificationAndName4 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification26Choice cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected AccountIdentificationAndName4 cdtrAcct;

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6Choice }
     *     
     */
    public FinancialInstitutionIdentification6Choice getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6Choice }
     *     
     */
    public CreditTransfer7 setDbtrAgt(FinancialInstitutionIdentification6Choice value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public AccountIdentificationAndName4 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public CreditTransfer7 setDbtrAgtAcct(AccountIdentificationAndName4 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6Choice }
     *     
     */
    public FinancialInstitutionIdentification6Choice getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6Choice }
     *     
     */
    public CreditTransfer7 setCdtrAgt(FinancialInstitutionIdentification6Choice value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public AccountIdentificationAndName4 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public CreditTransfer7 setCdtrAgtAcct(AccountIdentificationAndName4 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26Choice }
     *     
     */
    public PartyIdentification26Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26Choice }
     *     
     */
    public CreditTransfer7 setCdtr(PartyIdentification26Choice value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public AccountIdentificationAndName4 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName4 }
     *     
     */
    public CreditTransfer7 setCdtrAcct(AccountIdentificationAndName4 value) {
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
