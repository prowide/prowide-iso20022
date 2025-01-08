
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
 * Provides details on the margin result.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginResult1Choice", propOrder = {
    "xcssAmt",
    "dfcitAmt"
})
public class MarginResult1Choice {

    @XmlElement(name = "XcssAmt")
    protected ActiveCurrencyAndAmount xcssAmt;
    @XmlElement(name = "DfcitAmt")
    protected ActiveCurrencyAndAmount dfcitAmt;

    /**
     * Gets the value of the xcssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXcssAmt() {
        return xcssAmt;
    }

    /**
     * Sets the value of the xcssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginResult1Choice setXcssAmt(ActiveCurrencyAndAmount value) {
        this.xcssAmt = value;
        return this;
    }

    /**
     * Gets the value of the dfcitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDfcitAmt() {
        return dfcitAmt;
    }

    /**
     * Sets the value of the dfcitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginResult1Choice setDfcitAmt(ActiveCurrencyAndAmount value) {
        this.dfcitAmt = value;
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
