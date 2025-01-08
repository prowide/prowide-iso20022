
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
 * Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification5Choice", propOrder = {
    "bic",
    "clrSysMmbId",
    "nmAndAdr",
    "prtryId",
    "cmbndId"
})
public class FinancialInstitutionIdentification5Choice {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentification3Choice clrSysMmbId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress7 nmAndAdr;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification3 prtryId;
    @XmlElement(name = "CmbndId")
    protected FinancialInstitutionIdentification3 cmbndId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstitutionIdentification5Choice setBIC(String value) {
        this.bic = value;
        return this;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification3Choice }
     *     
     */
    public ClearingSystemMemberIdentification3Choice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification3Choice }
     *     
     */
    public FinancialInstitutionIdentification5Choice setClrSysMmbId(ClearingSystemMemberIdentification3Choice value) {
        this.clrSysMmbId = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress7 }
     *     
     */
    public NameAndAddress7 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress7 }
     *     
     */
    public FinancialInstitutionIdentification5Choice setNmAndAdr(NameAndAddress7 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public FinancialInstitutionIdentification5Choice setPrtryId(GenericIdentification3 value) {
        this.prtryId = value;
        return this;
    }

    /**
     * Gets the value of the cmbndId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification3 }
     *     
     */
    public FinancialInstitutionIdentification3 getCmbndId() {
        return cmbndId;
    }

    /**
     * Sets the value of the cmbndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification3 }
     *     
     */
    public FinancialInstitutionIdentification5Choice setCmbndId(FinancialInstitutionIdentification3 value) {
        this.cmbndId = value;
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
