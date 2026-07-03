
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between formats for the quantity of security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantitySearch2Choice__1", propOrder = {
    "unit",
    "faceAmt"
})
public class FinancialInstrumentQuantitySearch2Choice1 {

    @XmlElement(name = "Unit")
    protected QuantityRange1Choice1 unit;
    @XmlElement(name = "FaceAmt")
    protected ImpliedCurrencyAmountRange1Choice1 faceAmt;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRange1Choice1 }
     *     
     */
    public QuantityRange1Choice1 getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRange1Choice1 }
     *     
     */
    public FinancialInstrumentQuantitySearch2Choice1 setUnit(QuantityRange1Choice1 value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice1 }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice1 getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice1 }
     *     
     */
    public FinancialInstrumentQuantitySearch2Choice1 setFaceAmt(ImpliedCurrencyAmountRange1Choice1 value) {
        this.faceAmt = value;
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
