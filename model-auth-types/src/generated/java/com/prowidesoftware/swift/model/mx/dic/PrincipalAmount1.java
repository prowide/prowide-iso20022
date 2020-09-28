
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indication of the cash values to be settled as of the start and maturity date of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAmount1", propOrder = {
    "valDtAmt",
    "mtrtyDtAmt",
    "ccy"
})
public class PrincipalAmount1 {

    @XmlElement(name = "ValDtAmt", required = true)
    protected BigDecimal valDtAmt;
    @XmlElement(name = "MtrtyDtAmt", required = true)
    protected BigDecimal mtrtyDtAmt;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;

    /**
     * Gets the value of the valDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValDtAmt() {
        return valDtAmt;
    }

    /**
     * Sets the value of the valDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PrincipalAmount1 setValDtAmt(BigDecimal value) {
        this.valDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMtrtyDtAmt() {
        return mtrtyDtAmt;
    }

    /**
     * Sets the value of the mtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PrincipalAmount1 setMtrtyDtAmt(BigDecimal value) {
        this.mtrtyDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PrincipalAmount1 setCcy(String value) {
        this.ccy = value;
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
