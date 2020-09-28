
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
 * Modification on the value of goods and / or services. For example: rebate, discount, surcharge
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment3", propOrder = {
    "tp",
    "othrAdjstmntTp",
    "amt",
    "rate",
    "drctn"
})
public class Adjustment3 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected AdjustmentType2Code tp;
    @XmlElement(name = "OthrAdjstmntTp")
    protected String othrAdjstmntTp;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Drctn", required = true)
    @XmlSchemaType(name = "string")
    protected AdjustmentDirection1Code drctn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public AdjustmentType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public Adjustment3 setTp(AdjustmentType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrAdjstmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAdjstmntTp() {
        return othrAdjstmntTp;
    }

    /**
     * Sets the value of the othrAdjstmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Adjustment3 setOthrAdjstmntTp(String value) {
        this.othrAdjstmntTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public Adjustment3 setAmt(CurrencyAndAmount value) {
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
    public Adjustment3 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the drctn property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentDirection1Code }
     *     
     */
    public AdjustmentDirection1Code getDrctn() {
        return drctn;
    }

    /**
     * Sets the value of the drctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentDirection1Code }
     *     
     */
    public Adjustment3 setDrctn(AdjustmentDirection1Code value) {
        this.drctn = value;
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
