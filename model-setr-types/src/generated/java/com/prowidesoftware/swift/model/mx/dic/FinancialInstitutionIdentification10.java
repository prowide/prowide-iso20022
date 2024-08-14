
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
 * Identification of a financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification10", propOrder = {
    "pty",
    "lei"
})
public class FinancialInstitutionIdentification10 {

    @XmlElement(name = "Pty", required = true)
    protected FinancialInstitutionIdentification8Choice pty;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification8Choice }
     *     
     */
    public FinancialInstitutionIdentification8Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification8Choice }
     *     
     */
    public FinancialInstitutionIdentification10 setPty(FinancialInstitutionIdentification8Choice value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstitutionIdentification10 setLEI(String value) {
        this.lei = value;
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
