
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
 * Information about the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Creditor2", propOrder = {
    "cdtr",
    "acctId",
    "fnlAgt"
})
public class Creditor2 {

    @XmlElement(name = "Cdtr")
    protected PartyIdentification2Choice cdtr;
    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentificationAndName3 acctId;
    @XmlElement(name = "FnlAgt", required = true)
    protected FinancialInstitutionIdentification3Choice fnlAgt;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Creditor2 setCdtr(PartyIdentification2Choice value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName3 }
     *     
     */
    public AccountIdentificationAndName3 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName3 }
     *     
     */
    public Creditor2 setAcctId(AccountIdentificationAndName3 value) {
        this.acctId = value;
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
    public Creditor2 setFnlAgt(FinancialInstitutionIdentification3Choice value) {
        this.fnlAgt = value;
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
