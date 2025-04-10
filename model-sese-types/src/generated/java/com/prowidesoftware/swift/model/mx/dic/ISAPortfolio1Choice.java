
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
@XmlType(name = "ISAPortfolio1Choice", propOrder = {
    "isa",
    "prtfl"
})
public class ISAPortfolio1Choice {

    @XmlElement(name = "ISA")
    protected ISAYearsOfIssue4 isa;
    @XmlElement(name = "Prtfl")
    protected Portfolio1 prtfl;

    /**
     * Gets the value of the isa property.
     * 
     * @return
     *     possible object is
     *     {@link ISAYearsOfIssue4 }
     *     
     */
    public ISAYearsOfIssue4 getISA() {
        return isa;
    }

    /**
     * Sets the value of the isa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAYearsOfIssue4 }
     *     
     */
    public ISAPortfolio1Choice setISA(ISAYearsOfIssue4 value) {
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
    public ISAPortfolio1Choice setPrtfl(Portfolio1 value) {
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
