
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
 * Choice between formats for the quantity of security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantitySearch2", propOrder = {
    "faceAmt",
    "amtsdVal"
})
public class FinancialInstrumentQuantitySearch2 {

    @XmlElement(name = "FaceAmt", required = true)
    protected ImpliedCurrencyAmountRange1Choice faceAmt;
    @XmlElement(name = "AmtsdVal", required = true)
    protected ImpliedCurrencyAmountRange1Choice amtsdVal;

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public FinancialInstrumentQuantitySearch2 setFaceAmt(ImpliedCurrencyAmountRange1Choice value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public FinancialInstrumentQuantitySearch2 setAmtsdVal(ImpliedCurrencyAmountRange1Choice value) {
        this.amtsdVal = value;
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
