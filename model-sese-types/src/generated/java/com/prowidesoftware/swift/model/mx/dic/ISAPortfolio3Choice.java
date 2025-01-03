
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
 * Choice to provide additional portfolio information or individual savings account information (UK government scheme provided by UK based financial institutions only).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISAPortfolio3Choice", propOrder = {
    "isa",
    "prtfl"
})
public class ISAPortfolio3Choice {

    @XmlElement(name = "ISA")
    protected ISAYearsOfIssue6 isa;
    @XmlElement(name = "Prtfl")
    protected Portfolio1 prtfl;

    /**
     * Gets the value of the isa property.
     * 
     * @return
     *     possible object is
     *     {@link ISAYearsOfIssue6 }
     *     
     */
    public ISAYearsOfIssue6 getISA() {
        return isa;
    }

    /**
     * Sets the value of the isa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAYearsOfIssue6 }
     *     
     */
    public ISAPortfolio3Choice setISA(ISAYearsOfIssue6 value) {
        this.isa = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link Portfolio1 }
     *     
     */
    public Portfolio1 getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portfolio1 }
     *     
     */
    public ISAPortfolio3Choice setPrtfl(Portfolio1 value) {
        this.prtfl = value;
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
