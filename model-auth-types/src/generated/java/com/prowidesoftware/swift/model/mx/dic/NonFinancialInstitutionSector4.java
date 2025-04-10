
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
 * Provides detailed information concerning non financial counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialInstitutionSector4", propOrder = {
    "nfi",
    "nfiIdr"
})
public class NonFinancialInstitutionSector4 {

    @XmlElement(name = "NFI", required = true)
    @XmlSchemaType(name = "string")
    protected NoReasonCode nfi;
    @XmlElement(name = "NFIIdr")
    protected NonFinancialInstitutionSector2 nfiIdr;

    /**
     * Gets the value of the nfi property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNFI() {
        return nfi;
    }

    /**
     * Sets the value of the nfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public NonFinancialInstitutionSector4 setNFI(NoReasonCode value) {
        this.nfi = value;
        return this;
    }

    /**
     * Gets the value of the nfiIdr property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialInstitutionSector2 }
     *     
     */
    public NonFinancialInstitutionSector2 getNFIIdr() {
        return nfiIdr;
    }

    /**
     * Sets the value of the nfiIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialInstitutionSector2 }
     *     
     */
    public NonFinancialInstitutionSector4 setNFIIdr(NonFinancialInstitutionSector2 value) {
        this.nfiIdr = value;
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
