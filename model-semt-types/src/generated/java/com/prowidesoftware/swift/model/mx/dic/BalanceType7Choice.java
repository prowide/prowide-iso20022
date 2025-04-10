
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
 * Choice of format for the balance type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType7Choice", propOrder = {
    "cd",
    "prtry",
    "acct"
})
public class BalanceType7Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected FinancialAssetBalanceType1Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;
    @XmlElement(name = "Acct")
    protected AccountIdentification5 acct;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAssetBalanceType1Code }
     *     
     */
    public FinancialAssetBalanceType1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAssetBalanceType1Code }
     *     
     */
    public BalanceType7Choice setCd(FinancialAssetBalanceType1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public BalanceType7Choice setPrtry(GenericIdentification30 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification5 }
     *     
     */
    public AccountIdentification5 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification5 }
     *     
     */
    public BalanceType7Choice setAcct(AccountIdentification5 value) {
        this.acct = value;
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
