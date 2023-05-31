
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the foreign exchange commissions and fees amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FXCommissionOrFee1", propOrder = {
    "tp",
    "amtOrRate",
    "sgn"
})
public class FXCommissionOrFee1 {

    @XmlElement(name = "Tp", required = true)
    protected FXAmountType1Choice tp;
    @XmlElement(name = "AmtOrRate", required = true)
    protected AmountOrRate4Choice amtOrRate;
    @XmlElement(name = "Sgn")
    protected Boolean sgn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FXAmountType1Choice }
     *     
     */
    public FXAmountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXAmountType1Choice }
     *     
     */
    public FXCommissionOrFee1 setTp(FXAmountType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amtOrRate property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate4Choice }
     *     
     */
    public AmountOrRate4Choice getAmtOrRate() {
        return amtOrRate;
    }

    /**
     * Sets the value of the amtOrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate4Choice }
     *     
     */
    public FXCommissionOrFee1 setAmtOrRate(AmountOrRate4Choice value) {
        this.amtOrRate = value;
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
    public FXCommissionOrFee1 setSgn(Boolean value) {
        this.sgn = value;
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
