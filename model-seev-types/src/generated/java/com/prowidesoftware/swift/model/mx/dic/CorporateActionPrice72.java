
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
 * Specifies various prices of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice72", propOrder = {
    "maxPric",
    "minPric",
    "frstBidIncrmtPric",
    "lastBidIncrmtPric"
})
public class CorporateActionPrice72 {

    @XmlElement(name = "MaxPric")
    protected PriceFormat44Choice maxPric;
    @XmlElement(name = "MinPric")
    protected PriceFormat44Choice minPric;
    @XmlElement(name = "FrstBidIncrmtPric")
    protected PriceFormat44Choice frstBidIncrmtPric;
    @XmlElement(name = "LastBidIncrmtPric")
    protected PriceFormat44Choice lastBidIncrmtPric;

    /**
     * Gets the value of the maxPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getMaxPric() {
        return maxPric;
    }

    /**
     * Sets the value of the maxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public CorporateActionPrice72 setMaxPric(PriceFormat44Choice value) {
        this.maxPric = value;
        return this;
    }

    /**
     * Gets the value of the minPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getMinPric() {
        return minPric;
    }

    /**
     * Sets the value of the minPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public CorporateActionPrice72 setMinPric(PriceFormat44Choice value) {
        this.minPric = value;
        return this;
    }

    /**
     * Gets the value of the frstBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getFrstBidIncrmtPric() {
        return frstBidIncrmtPric;
    }

    /**
     * Sets the value of the frstBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public CorporateActionPrice72 setFrstBidIncrmtPric(PriceFormat44Choice value) {
        this.frstBidIncrmtPric = value;
        return this;
    }

    /**
     * Gets the value of the lastBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getLastBidIncrmtPric() {
        return lastBidIncrmtPric;
    }

    /**
     * Sets the value of the lastBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public CorporateActionPrice72 setLastBidIncrmtPric(PriceFormat44Choice value) {
        this.lastBidIncrmtPric = value;
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
