
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates how the amount of the investment plan is split amongst the funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repartition2", propOrder = {
    "pctg",
    "finInstrm",
    "ccyOfPlan"
})
public class Repartition2 {

    @XmlElement(name = "Pctg", required = true)
    protected BigDecimal pctg;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrument29 finInstrm;
    @XmlElement(name = "CcyOfPlan")
    protected String ccyOfPlan;

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Repartition2 setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument29 }
     *     
     */
    public FinancialInstrument29 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument29 }
     *     
     */
    public Repartition2 setFinInstrm(FinancialInstrument29 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ccyOfPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOfPlan() {
        return ccyOfPlan;
    }

    /**
     * Sets the value of the ccyOfPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Repartition2 setCcyOfPlan(String value) {
        this.ccyOfPlan = value;
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
