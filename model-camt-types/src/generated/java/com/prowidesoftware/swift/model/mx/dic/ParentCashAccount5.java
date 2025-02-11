
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the cash account elements of a parent cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentCashAccount5", propOrder = {
    "lvl",
    "id",
    "svcr"
})
public class ParentCashAccount5 {

    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected AccountLevel1Code lvl;
    @XmlElement(name = "Id", required = true)
    protected CashAccount40 id;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification8 svcr;

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLevel1Code }
     *     
     */
    public AccountLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLevel1Code }
     *     
     */
    public ParentCashAccount5 setLvl(AccountLevel1Code value) {
        this.lvl = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ParentCashAccount5 setId(CashAccount40 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ParentCashAccount5 setSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.svcr = value;
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
