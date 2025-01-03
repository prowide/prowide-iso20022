
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
 * Characteristics and values set for account limits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLimits1", propOrder = {
    "lmtTp",
    "lmtAmt",
    "lmtUtlstnAmt",
    "bilLmtCtrPtyId",
    "clrCrctSchme"
})
public class AccountLimits1 {

    @XmlElement(name = "LmtTp", required = true)
    protected String lmtTp;
    @XmlElement(name = "LmtAmt", required = true)
    protected ActiveCurrencyAndAmount lmtAmt;
    @XmlElement(name = "LmtUtlstnAmt")
    protected ActiveCurrencyAndAmount lmtUtlstnAmt;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected BranchAndFinancialInstitutionIdentification5 bilLmtCtrPtyId;
    @XmlElement(name = "ClrCrctSchme")
    protected ClearingScheme1Choice clrCrctSchme;

    /**
     * Gets the value of the lmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtTp() {
        return lmtTp;
    }

    /**
     * Sets the value of the lmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountLimits1 setLmtTp(String value) {
        this.lmtTp = value;
        return this;
    }

    /**
     * Gets the value of the lmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLmtAmt() {
        return lmtAmt;
    }

    /**
     * Sets the value of the lmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AccountLimits1 setLmtAmt(ActiveCurrencyAndAmount value) {
        this.lmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the lmtUtlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLmtUtlstnAmt() {
        return lmtUtlstnAmt;
    }

    /**
     * Sets the value of the lmtUtlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AccountLimits1 setLmtUtlstnAmt(ActiveCurrencyAndAmount value) {
        this.lmtUtlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getBilLmtCtrPtyId() {
        return bilLmtCtrPtyId;
    }

    /**
     * Sets the value of the bilLmtCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public AccountLimits1 setBilLmtCtrPtyId(BranchAndFinancialInstitutionIdentification5 value) {
        this.bilLmtCtrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the clrCrctSchme property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public ClearingScheme1Choice getClrCrctSchme() {
        return clrCrctSchme;
    }

    /**
     * Sets the value of the clrCrctSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public AccountLimits1 setClrCrctSchme(ClearingScheme1Choice value) {
        this.clrCrctSchme = value;
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
