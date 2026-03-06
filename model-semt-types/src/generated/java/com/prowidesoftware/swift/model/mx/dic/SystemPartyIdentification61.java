
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
 * Unique and unambiguous way to identify a system party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemPartyIdentification6__1", propOrder = {
    "rltdPtyId",
    "rspnsblPtyId"
})
public class SystemPartyIdentification61 {

    @XmlElement(name = "RltdPtyId", required = true)
    protected PartyIdentification911 rltdPtyId;
    @XmlElement(name = "RspnsblPtyId")
    protected FinancialInstitutionIdentification121 rspnsblPtyId;

    /**
     * Gets the value of the rltdPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification911 }
     *     
     */
    public PartyIdentification911 getRltdPtyId() {
        return rltdPtyId;
    }

    /**
     * Sets the value of the rltdPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification911 }
     *     
     */
    public SystemPartyIdentification61 setRltdPtyId(PartyIdentification911 value) {
        this.rltdPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification121 }
     *     
     */
    public FinancialInstitutionIdentification121 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification121 }
     *     
     */
    public SystemPartyIdentification61 setRspnsblPtyId(FinancialInstitutionIdentification121 value) {
        this.rspnsblPtyId = value;
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
