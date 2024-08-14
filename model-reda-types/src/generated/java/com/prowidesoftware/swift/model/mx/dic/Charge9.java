
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge9", propOrder = {
    "tp",
    "amt",
    "clctnBsis"
})
public class Charge9 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType2 tp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "ClctnBsis")
    protected CalculationBasis1 clctnBsis;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType2 }
     *     
     */
    public ChargeType2 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType2 }
     *     
     */
    public Charge9 setTp(ChargeType2 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Charge9 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationBasis1 }
     *     
     */
    public CalculationBasis1 getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationBasis1 }
     *     
     */
    public Charge9 setClctnBsis(CalculationBasis1 value) {
        this.clctnBsis = value;
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
