
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
 * Provides the details of the excess cash standing instruction or the margin settlement request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessCashInstruction1", propOrder = {
    "mkt",
    "instdAmt",
    "rmvXcssCshStgInstr"
})
public class ExcessCashInstruction1 {

    @XmlElement(name = "Mkt", required = true)
    protected MarketIdentification3Choice mkt;
    @XmlElement(name = "InstdAmt")
    protected AmountAndDirection52 instdAmt;
    @XmlElement(name = "RmvXcssCshStgInstr")
    protected Boolean rmvXcssCshStgInstr;

    /**
     * Gets the value of the mkt property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public ExcessCashInstruction1 setMkt(MarketIdentification3Choice value) {
        this.mkt = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public ExcessCashInstruction1 setInstdAmt(AmountAndDirection52 value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmvXcssCshStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmvXcssCshStgInstr() {
        return rmvXcssCshStgInstr;
    }

    /**
     * Sets the value of the rmvXcssCshStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExcessCashInstruction1 setRmvXcssCshStgInstr(Boolean value) {
        this.rmvXcssCshStgInstr = value;
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
