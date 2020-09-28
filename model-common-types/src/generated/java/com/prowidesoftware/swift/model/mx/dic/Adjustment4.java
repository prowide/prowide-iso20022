
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
 * Modification on the value of goods and / or services. For example: rebate, discount, surcharge
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment4", propOrder = {
    "tp",
    "othrAdjstmntTp",
    "drctn",
    "amt"
})
public class Adjustment4 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected AdjustmentType2Code tp;
    @XmlElement(name = "OthrAdjstmntTp")
    protected String othrAdjstmntTp;
    @XmlElement(name = "Drctn", required = true)
    @XmlSchemaType(name = "string")
    protected AdjustmentDirection1Code drctn;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

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
    public Adjustment4 setTp(AdjustmentType2Code value) {
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
    public Adjustment4 setOthrAdjstmntTp(String value) {
        this.othrAdjstmntTp = value;
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
    public Adjustment4 setDrctn(AdjustmentDirection1Code value) {
        this.drctn = value;
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
    public Adjustment4 setAmt(CurrencyAndAmount value) {
        this.amt = value;
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
