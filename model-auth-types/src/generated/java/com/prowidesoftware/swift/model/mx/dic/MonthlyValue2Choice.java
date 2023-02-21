
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Value for the end-of-month. Choice between a value or the foreign exchange details used to compute other values.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyValue2Choice", propOrder = {
    "val",
    "fx",
    "notAvlblVal"
})
public class MonthlyValue2Choice {

    @XmlElement(name = "Val")
    protected BigDecimal val;
    @XmlElement(name = "FX")
    protected ForeignExchangeTerms36 fx;
    @XmlElement(name = "NotAvlblVal")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlblVal;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MonthlyValue2Choice setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms36 }
     *     
     */
    public ForeignExchangeTerms36 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms36 }
     *     
     */
    public MonthlyValue2Choice setFX(ForeignExchangeTerms36 value) {
        this.fx = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblVal property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlblVal() {
        return notAvlblVal;
    }

    /**
     * Sets the value of the notAvlblVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public MonthlyValue2Choice setNotAvlblVal(NotAvailable1Code value) {
        this.notAvlblVal = value;
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
