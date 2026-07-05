
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
 * Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandate2", propOrder = {
    "dbtrAcctId",
    "dbtrId",
    "cdtrId",
    "frstAgt",
    "fnlAgt",
    "regnId",
    "mndtId"
})
public class DirectDebitMandate2 {

    @XmlElement(name = "DbtrAcctId", required = true)
    protected CashAccountIdentification1Choice dbtrAcctId;
    @XmlElement(name = "DbtrId")
    protected PartyIdentification2Choice dbtrId;
    @XmlElement(name = "CdtrId")
    protected PartyIdentification2Choice cdtrId;
    @XmlElement(name = "FrstAgt", required = true)
    protected FinancialInstitutionIdentification3Choice frstAgt;
    @XmlElement(name = "FnlAgt")
    protected FinancialInstitutionIdentification3Choice fnlAgt;
    @XmlElement(name = "RegnId")
    protected String regnId;
    @XmlElement(name = "MndtId")
    protected String mndtId;

    /**
     * Gets the value of the dbtrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public CashAccountIdentification1Choice getDbtrAcctId() {
        return dbtrAcctId;
    }

    /**
     * Sets the value of the dbtrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public DirectDebitMandate2 setDbtrAcctId(CashAccountIdentification1Choice value) {
        this.dbtrAcctId = value;
        return this;
    }

    /**
     * Gets the value of the dbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getDbtrId() {
        return dbtrId;
    }

    /**
     * Sets the value of the dbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public DirectDebitMandate2 setDbtrId(PartyIdentification2Choice value) {
        this.dbtrId = value;
        return this;
    }

    /**
     * Gets the value of the cdtrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getCdtrId() {
        return cdtrId;
    }

    /**
     * Sets the value of the cdtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public DirectDebitMandate2 setCdtrId(PartyIdentification2Choice value) {
        this.cdtrId = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification3Choice }
     *     
     */
    public FinancialInstitutionIdentification3Choice getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification3Choice }
     *     
     */
    public DirectDebitMandate2 setFrstAgt(FinancialInstitutionIdentification3Choice value) {
        this.frstAgt = value;
        return this;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification3Choice }
     *     
     */
    public FinancialInstitutionIdentification3Choice getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification3Choice }
     *     
     */
    public DirectDebitMandate2 setFnlAgt(FinancialInstitutionIdentification3Choice value) {
        this.fnlAgt = value;
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
    public DirectDebitMandate2 setRegnId(String value) {
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
    public DirectDebitMandate2 setMndtId(String value) {
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
