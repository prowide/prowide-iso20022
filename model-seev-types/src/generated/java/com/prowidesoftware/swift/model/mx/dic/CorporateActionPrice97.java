
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
 * Specifies prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice97", propOrder = {
    "cshInLieuOfShrPric",
    "overSbcptDpstPric",
    "maxCshToInst",
    "minCshToInst",
    "minMltplCshToInst",
    "maxPric",
    "minPric",
    "frstBidIncrmtPric",
    "lastBidIncrmtPric"
})
public class CorporateActionPrice97 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat92Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat92Choice overSbcptDpstPric;
    @XmlElement(name = "MaxCshToInst")
    protected PriceFormat62Choice maxCshToInst;
    @XmlElement(name = "MinCshToInst")
    protected PriceFormat62Choice minCshToInst;
    @XmlElement(name = "MinMltplCshToInst")
    protected PriceFormat62Choice minMltplCshToInst;
    @XmlElement(name = "MaxPric")
    protected PriceFormat93Choice maxPric;
    @XmlElement(name = "MinPric")
    protected PriceFormat93Choice minPric;
    @XmlElement(name = "FrstBidIncrmtPric")
    protected PriceFormat93Choice frstBidIncrmtPric;
    @XmlElement(name = "LastBidIncrmtPric")
    protected PriceFormat93Choice lastBidIncrmtPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat92Choice }
     *     
     */
    public PriceFormat92Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat92Choice }
     *     
     */
    public CorporateActionPrice97 setCshInLieuOfShrPric(PriceFormat92Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat92Choice }
     *     
     */
    public PriceFormat92Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat92Choice }
     *     
     */
    public CorporateActionPrice97 setOverSbcptDpstPric(PriceFormat92Choice value) {
        this.overSbcptDpstPric = value;
        return this;
    }

    /**
     * Gets the value of the maxCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public PriceFormat62Choice getMaxCshToInst() {
        return maxCshToInst;
    }

    /**
     * Sets the value of the maxCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public CorporateActionPrice97 setMaxCshToInst(PriceFormat62Choice value) {
        this.maxCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the minCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public PriceFormat62Choice getMinCshToInst() {
        return minCshToInst;
    }

    /**
     * Sets the value of the minCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public CorporateActionPrice97 setMinCshToInst(PriceFormat62Choice value) {
        this.minCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the minMltplCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public PriceFormat62Choice getMinMltplCshToInst() {
        return minMltplCshToInst;
    }

    /**
     * Sets the value of the minMltplCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat62Choice }
     *     
     */
    public CorporateActionPrice97 setMinMltplCshToInst(PriceFormat62Choice value) {
        this.minMltplCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the maxPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public PriceFormat93Choice getMaxPric() {
        return maxPric;
    }

    /**
     * Sets the value of the maxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public CorporateActionPrice97 setMaxPric(PriceFormat93Choice value) {
        this.maxPric = value;
        return this;
    }

    /**
     * Gets the value of the minPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public PriceFormat93Choice getMinPric() {
        return minPric;
    }

    /**
     * Sets the value of the minPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public CorporateActionPrice97 setMinPric(PriceFormat93Choice value) {
        this.minPric = value;
        return this;
    }

    /**
     * Gets the value of the frstBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public PriceFormat93Choice getFrstBidIncrmtPric() {
        return frstBidIncrmtPric;
    }

    /**
     * Sets the value of the frstBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public CorporateActionPrice97 setFrstBidIncrmtPric(PriceFormat93Choice value) {
        this.frstBidIncrmtPric = value;
        return this;
    }

    /**
     * Gets the value of the lastBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public PriceFormat93Choice getLastBidIncrmtPric() {
        return lastBidIncrmtPric;
    }

    /**
     * Sets the value of the lastBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat93Choice }
     *     
     */
    public CorporateActionPrice97 setLastBidIncrmtPric(PriceFormat93Choice value) {
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
