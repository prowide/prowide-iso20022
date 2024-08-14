
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies prices.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice1", propOrder = {
    "exrcPric",
    "issePric",
    "cshInLieuOfShrPric",
    "taxblIncmPerDvddShr",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct",
    "overSbcptDpstPric"
})
public class CorporateActionPrice1 {

    @XmlElement(name = "ExrcPric")
    protected PriceFormat4Choice exrcPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat2Choice issePric;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat2Choice cshInLieuOfShrPric;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice1 taxblIncmPerDvddShr;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat1Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat2Choice gncCshPricPdPerPdct;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat2Choice overSbcptDpstPric;

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat4Choice }
     *     
     */
    public PriceFormat4Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat4Choice }
     *     
     */
    public CorporateActionPrice1 setExrcPric(PriceFormat4Choice value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public CorporateActionPrice1 setIssePric(PriceFormat2Choice value) {
        this.issePric = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public CorporateActionPrice1 setCshInLieuOfShrPric(PriceFormat2Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1 }
     *     
     */
    public AmountPrice1 getTaxblIncmPerDvddShr() {
        return taxblIncmPerDvddShr;
    }

    /**
     * Sets the value of the taxblIncmPerDvddShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1 }
     *     
     */
    public CorporateActionPrice1 setTaxblIncmPerDvddShr(AmountPrice1 value) {
        this.taxblIncmPerDvddShr = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat1Choice }
     *     
     */
    public PriceFormat1Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat1Choice }
     *     
     */
    public CorporateActionPrice1 setGncCshPricRcvdPerPdct(PriceFormat1Choice value) {
        this.gncCshPricRcvdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public CorporateActionPrice1 setGncCshPricPdPerPdct(PriceFormat2Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public CorporateActionPrice1 setOverSbcptDpstPric(PriceFormat2Choice value) {
        this.overSbcptDpstPric = value;
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
