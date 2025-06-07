
package com.prowidesoftware.swift.model.mx.dic;

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
 * Indicates the independent amount and how it was applied in the calculation. It also provides a description of the amount type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndependentAmount2", propOrder = {
    "desc",
    "amt",
    "cnvntn"
})
public class IndependentAmount2 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Cnvntn", required = true)
    @XmlSchemaType(name = "string")
    protected IndependentAmountConventionType1Code cnvntn;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndependentAmount2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IndependentAmount2 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cnvntn property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmountConventionType1Code }
     *     
     */
    public IndependentAmountConventionType1Code getCnvntn() {
        return cnvntn;
    }

    /**
     * Sets the value of the cnvntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmountConventionType1Code }
     *     
     */
    public IndependentAmount2 setCnvntn(IndependentAmountConventionType1Code value) {
        this.cnvntn = value;
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
