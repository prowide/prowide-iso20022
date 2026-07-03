
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
 * Provides details on the overall amount of "not yet executed" predefined liquidity transfer orders or "defined" by a system participant in its sphere of responsibility within the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderTotalAmount1", propOrder = {
    "setPrdfndOrdr",
    "pdgPrdfndOrdr",
    "setStgOrdr",
    "pdgStgOrdr"
})
public class StandingOrderTotalAmount1 {

    @XmlElement(name = "SetPrdfndOrdr", required = true)
    protected TotalAmountAndCurrency1 setPrdfndOrdr;
    @XmlElement(name = "PdgPrdfndOrdr", required = true)
    protected TotalAmountAndCurrency1 pdgPrdfndOrdr;
    @XmlElement(name = "SetStgOrdr", required = true)
    protected TotalAmountAndCurrency1 setStgOrdr;
    @XmlElement(name = "PdgStgOrdr", required = true)
    protected TotalAmountAndCurrency1 pdgStgOrdr;

    /**
     * Gets the value of the setPrdfndOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getSetPrdfndOrdr() {
        return setPrdfndOrdr;
    }

    /**
     * Sets the value of the setPrdfndOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public StandingOrderTotalAmount1 setSetPrdfndOrdr(TotalAmountAndCurrency1 value) {
        this.setPrdfndOrdr = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrdfndOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getPdgPrdfndOrdr() {
        return pdgPrdfndOrdr;
    }

    /**
     * Sets the value of the pdgPrdfndOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public StandingOrderTotalAmount1 setPdgPrdfndOrdr(TotalAmountAndCurrency1 value) {
        this.pdgPrdfndOrdr = value;
        return this;
    }

    /**
     * Gets the value of the setStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getSetStgOrdr() {
        return setStgOrdr;
    }

    /**
     * Sets the value of the setStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public StandingOrderTotalAmount1 setSetStgOrdr(TotalAmountAndCurrency1 value) {
        this.setStgOrdr = value;
        return this;
    }

    /**
     * Gets the value of the pdgStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getPdgStgOrdr() {
        return pdgStgOrdr;
    }

    /**
     * Sets the value of the pdgStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public StandingOrderTotalAmount1 setPdgStgOrdr(TotalAmountAndCurrency1 value) {
        this.pdgStgOrdr = value;
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
