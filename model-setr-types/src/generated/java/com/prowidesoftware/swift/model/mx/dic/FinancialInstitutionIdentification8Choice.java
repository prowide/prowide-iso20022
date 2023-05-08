
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
 * Choice between formats for the identification of the financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification8Choice", propOrder = {
    "nmAndAdr",
    "bicfi",
    "clrSysMmbId",
    "prtryId"
})
public class FinancialInstitutionIdentification8Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress5 nmAndAdr;
    @XmlElement(name = "BICFI")
    protected String bicfi;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentificationChoice clrSysMmbId;
    @XmlElement(name = "PrtryId")
    protected String prtryId;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public FinancialInstitutionIdentification8Choice setNmAndAdr(NameAndAddress5 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the bicfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * Sets the value of the bicfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstitutionIdentification8Choice setBICFI(String value) {
        this.bicfi = value;
        return this;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public ClearingSystemMemberIdentificationChoice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public FinancialInstitutionIdentification8Choice setClrSysMmbId(ClearingSystemMemberIdentificationChoice value) {
        this.clrSysMmbId = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstitutionIdentification8Choice setPrtryId(String value) {
        this.prtryId = value;
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
