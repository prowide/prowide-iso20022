
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Individual cost or charge associated with the distribution or selling of a financial instrument. It may be one-off or recurring charge. It may be intended (ex ante) or actual (ex post).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCostOrCharge1", propOrder = {
    "costTp",
    "exAnteOrExPst",
    "amt",
    "rate",
    "clctnPrd",
    "addtlInf"
})
public class IndividualCostOrCharge1 {

    @XmlElement(name = "CostTp", required = true)
    protected ChargeType7Choice costTp;
    @XmlElement(name = "ExAnteOrExPst", required = true)
    @XmlSchemaType(name = "string")
    protected IntendedOrActual2Code exAnteOrExPst;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "ClctnPrd")
    protected Period15 clctnPrd;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the costTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType7Choice }
     *     
     */
    public ChargeType7Choice getCostTp() {
        return costTp;
    }

    /**
     * Sets the value of the costTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType7Choice }
     *     
     */
    public IndividualCostOrCharge1 setCostTp(ChargeType7Choice value) {
        this.costTp = value;
        return this;
    }

    /**
     * Gets the value of the exAnteOrExPst property.
     * 
     * @return
     *     possible object is
     *     {@link IntendedOrActual2Code }
     *     
     */
    public IntendedOrActual2Code getExAnteOrExPst() {
        return exAnteOrExPst;
    }

    /**
     * Sets the value of the exAnteOrExPst property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntendedOrActual2Code }
     *     
     */
    public IndividualCostOrCharge1 setExAnteOrExPst(IntendedOrActual2Code value) {
        this.exAnteOrExPst = value;
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
    public IndividualCostOrCharge1 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IndividualCostOrCharge1 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the clctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period15 }
     *     
     */
    public Period15 getClctnPrd() {
        return clctnPrd;
    }

    /**
     * Sets the value of the clctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period15 }
     *     
     */
    public IndividualCostOrCharge1 setClctnPrd(Period15 value) {
        this.clctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public IndividualCostOrCharge1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
