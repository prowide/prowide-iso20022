
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
 * Choice between an amount and percentage.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOrPercentage1Choice", propOrder = {
    "dfndAmt",
    "pctgAmt"
})
public class AmountOrPercentage1Choice {

    @XmlElement(name = "DfndAmt")
    protected UndertakingAmount4 dfndAmt;
    @XmlElement(name = "PctgAmt")
    protected Percentage1 pctgAmt;

    /**
     * Gets the value of the dfndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount4 }
     *     
     */
    public UndertakingAmount4 getDfndAmt() {
        return dfndAmt;
    }

    /**
     * Sets the value of the dfndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount4 }
     *     
     */
    public AmountOrPercentage1Choice setDfndAmt(UndertakingAmount4 value) {
        this.dfndAmt = value;
        return this;
    }

    /**
     * Gets the value of the pctgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Percentage1 }
     *     
     */
    public Percentage1 getPctgAmt() {
        return pctgAmt;
    }

    /**
     * Sets the value of the pctgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Percentage1 }
     *     
     */
    public AmountOrPercentage1Choice setPctgAmt(Percentage1 value) {
        this.pctgAmt = value;
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
