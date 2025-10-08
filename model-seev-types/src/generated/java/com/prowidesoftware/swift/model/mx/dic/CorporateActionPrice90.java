
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
@XmlType(name = "CorporateActionPrice90", propOrder = {
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
public class CorporateActionPrice90 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat81Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat81Choice overSbcptDpstPric;
    @XmlElement(name = "MaxCshToInst")
    protected PriceFormat61Choice maxCshToInst;
    @XmlElement(name = "MinCshToInst")
    protected PriceFormat61Choice minCshToInst;
    @XmlElement(name = "MinMltplCshToInst")
    protected PriceFormat61Choice minMltplCshToInst;
    @XmlElement(name = "MaxPric")
    protected PriceFormat80Choice maxPric;
    @XmlElement(name = "MinPric")
    protected PriceFormat80Choice minPric;
    @XmlElement(name = "FrstBidIncrmtPric")
    protected PriceFormat80Choice frstBidIncrmtPric;
    @XmlElement(name = "LastBidIncrmtPric")
    protected PriceFormat80Choice lastBidIncrmtPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat81Choice }
     *     
     */
    public PriceFormat81Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat81Choice }
     *     
     */
    public CorporateActionPrice90 setCshInLieuOfShrPric(PriceFormat81Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat81Choice }
     *     
     */
    public PriceFormat81Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat81Choice }
     *     
     */
    public CorporateActionPrice90 setOverSbcptDpstPric(PriceFormat81Choice value) {
        this.overSbcptDpstPric = value;
        return this;
    }

    /**
     * Gets the value of the maxCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMaxCshToInst() {
        return maxCshToInst;
    }

    /**
     * Sets the value of the maxCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public CorporateActionPrice90 setMaxCshToInst(PriceFormat61Choice value) {
        this.maxCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the minCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinCshToInst() {
        return minCshToInst;
    }

    /**
     * Sets the value of the minCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public CorporateActionPrice90 setMinCshToInst(PriceFormat61Choice value) {
        this.minCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the minMltplCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinMltplCshToInst() {
        return minMltplCshToInst;
    }

    /**
     * Sets the value of the minMltplCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public CorporateActionPrice90 setMinMltplCshToInst(PriceFormat61Choice value) {
        this.minMltplCshToInst = value;
        return this;
    }

    /**
     * Gets the value of the maxPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public PriceFormat80Choice getMaxPric() {
        return maxPric;
    }

    /**
     * Sets the value of the maxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public CorporateActionPrice90 setMaxPric(PriceFormat80Choice value) {
        this.maxPric = value;
        return this;
    }

    /**
     * Gets the value of the minPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public PriceFormat80Choice getMinPric() {
        return minPric;
    }

    /**
     * Sets the value of the minPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public CorporateActionPrice90 setMinPric(PriceFormat80Choice value) {
        this.minPric = value;
        return this;
    }

    /**
     * Gets the value of the frstBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public PriceFormat80Choice getFrstBidIncrmtPric() {
        return frstBidIncrmtPric;
    }

    /**
     * Sets the value of the frstBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public CorporateActionPrice90 setFrstBidIncrmtPric(PriceFormat80Choice value) {
        this.frstBidIncrmtPric = value;
        return this;
    }

    /**
     * Gets the value of the lastBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public PriceFormat80Choice getLastBidIncrmtPric() {
        return lastBidIncrmtPric;
    }

    /**
     * Sets the value of the lastBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat80Choice }
     *     
     */
    public CorporateActionPrice90 setLastBidIncrmtPric(PriceFormat80Choice value) {
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
