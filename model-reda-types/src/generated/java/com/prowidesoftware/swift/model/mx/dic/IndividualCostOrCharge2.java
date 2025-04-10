
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
 * Individual cost or charge associated with the distribution or selling of a financial instrument. It may be one-off or recurring charge. It may be intended (ex ante) or actual (ex post).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCostOrCharge2", propOrder = {
    "costTp",
    "exAnteOrExPst",
    "amt",
    "sgn",
    "rate",
    "refPrd",
    "addtlInf"
})
public class IndividualCostOrCharge2 {

    @XmlElement(name = "CostTp", required = true)
    protected ChargeType8Choice costTp;
    @XmlElement(name = "ExAnteOrExPst", required = true)
    @XmlSchemaType(name = "string")
    protected IntendedOrActual2Code exAnteOrExPst;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Sgn")
    protected Boolean sgn;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RefPrd")
    protected Period15 refPrd;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the costTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType8Choice }
     *     
     */
    public ChargeType8Choice getCostTp() {
        return costTp;
    }

    /**
     * Sets the value of the costTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType8Choice }
     *     
     */
    public IndividualCostOrCharge2 setCostTp(ChargeType8Choice value) {
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
    public IndividualCostOrCharge2 setExAnteOrExPst(IntendedOrActual2Code value) {
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
    public IndividualCostOrCharge2 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the sgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IndividualCostOrCharge2 setSgn(Boolean value) {
        this.sgn = value;
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
    public IndividualCostOrCharge2 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period15 }
     *     
     */
    public Period15 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period15 }
     *     
     */
    public IndividualCostOrCharge2 setRefPrd(Period15 value) {
        this.refPrd = value;
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
    public IndividualCostOrCharge2 setAddtlInf(AdditionalInformation15 value) {
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
