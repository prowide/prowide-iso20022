
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
 * Describes frequency of payments for interest rates, either using term notation or a proprietary notation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateFrequency3Choice", propOrder = {
    "term",
    "prtry"
})
public class InterestRateFrequency3Choice {

    @XmlElement(name = "Term")
    protected InterestRateContractTerm4 term;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public InterestRateContractTerm4 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public InterestRateFrequency3Choice setTerm(InterestRateContractTerm4 value) {
        this.term = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestRateFrequency3Choice setPrtry(String value) {
        this.prtry = value;
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
