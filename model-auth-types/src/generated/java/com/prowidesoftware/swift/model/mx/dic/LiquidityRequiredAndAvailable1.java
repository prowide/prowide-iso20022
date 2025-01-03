
package com.prowidesoftware.swift.model.mx.dic;

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
 * Obligations of a legal entity or other financial construct that must be met in cash and the resources such legal entity of financial construct has available to meet those obligations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityRequiredAndAvailable1", propOrder = {
    "lqdRsrcs",
    "lqdtyHrzn",
    "strssLqdRsrcRqrmnt"
})
public class LiquidityRequiredAndAvailable1 {

    @XmlElement(name = "LqdRsrcs", required = true)
    protected LiquidResources1 lqdRsrcs;
    @XmlElement(name = "LqdtyHrzn", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDate6Code lqdtyHrzn;
    @XmlElement(name = "StrssLqdRsrcRqrmnt", required = true)
    protected StressLiquidResourceRequirement1 strssLqdRsrcRqrmnt;

    /**
     * Gets the value of the lqdRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidResources1 }
     *     
     */
    public LiquidResources1 getLqdRsrcs() {
        return lqdRsrcs;
    }

    /**
     * Sets the value of the lqdRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidResources1 }
     *     
     */
    public LiquidityRequiredAndAvailable1 setLqdRsrcs(LiquidResources1 value) {
        this.lqdRsrcs = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyHrzn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate6Code }
     *     
     */
    public SettlementDate6Code getLqdtyHrzn() {
        return lqdtyHrzn;
    }

    /**
     * Sets the value of the lqdtyHrzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate6Code }
     *     
     */
    public LiquidityRequiredAndAvailable1 setLqdtyHrzn(SettlementDate6Code value) {
        this.lqdtyHrzn = value;
        return this;
    }

    /**
     * Gets the value of the strssLqdRsrcRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link StressLiquidResourceRequirement1 }
     *     
     */
    public StressLiquidResourceRequirement1 getStrssLqdRsrcRqrmnt() {
        return strssLqdRsrcRqrmnt;
    }

    /**
     * Sets the value of the strssLqdRsrcRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressLiquidResourceRequirement1 }
     *     
     */
    public LiquidityRequiredAndAvailable1 setStrssLqdRsrcRqrmnt(StressLiquidResourceRequirement1 value) {
        this.strssLqdRsrcRqrmnt = value;
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
