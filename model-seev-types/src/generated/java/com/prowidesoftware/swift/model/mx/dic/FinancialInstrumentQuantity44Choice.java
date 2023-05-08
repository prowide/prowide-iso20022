
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
 * Choice between formats for the quantity of security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity44Choice", propOrder = {
    "unit",
    "faceAmt",
    "amtsdVal",
    "cd",
    "dgtlTknUnit"
})
public class FinancialInstrumentQuantity44Choice {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "FaceAmt")
    protected BigDecimal faceAmt;
    @XmlElement(name = "AmtsdVal")
    protected BigDecimal amtsdVal;
    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected Quantity4Code cd;
    @XmlElement(name = "DgtlTknUnit")
    protected BigDecimal dgtlTknUnit;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity44Choice setUnit(BigDecimal value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity44Choice setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity44Choice setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
        return this;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity4Code }
     *     
     */
    public Quantity4Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity4Code }
     *     
     */
    public FinancialInstrumentQuantity44Choice setCd(Quantity4Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the dgtlTknUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDgtlTknUnit() {
        return dgtlTknUnit;
    }

    /**
     * Sets the value of the dgtlTknUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentQuantity44Choice setDgtlTknUnit(BigDecimal value) {
        this.dgtlTknUnit = value;
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
