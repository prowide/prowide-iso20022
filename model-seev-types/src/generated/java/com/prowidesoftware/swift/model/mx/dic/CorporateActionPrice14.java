
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionPrice14", propOrder = {
    "cshInLieuOfShrPric",
    "exrcPric",
    "gncCshPricRcvdPerPdct",
    "overSbcptDpstPric",
    "gncCshPricPdPerPdct",
    "taxblIncmPerDvddShr"
})
public class CorporateActionPrice14 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat15Choice cshInLieuOfShrPric;
    @XmlElement(name = "ExrcPric")
    protected PriceFormat16Choice exrcPric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected List<PriceFormat18Choice> gncCshPricRcvdPerPdct;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat15Choice overSbcptDpstPric;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat15Choice gncCshPricPdPerPdct;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice5 taxblIncmPerDvddShr;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public PriceFormat15Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public CorporateActionPrice14 setCshInLieuOfShrPric(PriceFormat15Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat16Choice }
     *     
     */
    public PriceFormat16Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat16Choice }
     *     
     */
    public CorporateActionPrice14 setExrcPric(PriceFormat16Choice value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncCshPricRcvdPerPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncCshPricRcvdPerPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceFormat18Choice }
     * 
     * 
     */
    public List<PriceFormat18Choice> getGncCshPricRcvdPerPdct() {
        if (gncCshPricRcvdPerPdct == null) {
            gncCshPricRcvdPerPdct = new ArrayList<PriceFormat18Choice>();
        }
        return this.gncCshPricRcvdPerPdct;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public PriceFormat15Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public CorporateActionPrice14 setOverSbcptDpstPric(PriceFormat15Choice value) {
        this.overSbcptDpstPric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public PriceFormat15Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat15Choice }
     *     
     */
    public CorporateActionPrice14 setGncCshPricPdPerPdct(PriceFormat15Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice5 }
     *     
     */
    public AmountPrice5 getTaxblIncmPerDvddShr() {
        return taxblIncmPerDvddShr;
    }

    /**
     * Sets the value of the taxblIncmPerDvddShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice5 }
     *     
     */
    public CorporateActionPrice14 setTaxblIncmPerDvddShr(AmountPrice5 value) {
        this.taxblIncmPerDvddShr = value;
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

    /**
     * Adds a new item to the gncCshPricRcvdPerPdct list.
     * @see #getGncCshPricRcvdPerPdct()
     * 
     */
    public CorporateActionPrice14 addGncCshPricRcvdPerPdct(PriceFormat18Choice gncCshPricRcvdPerPdct) {
        getGncCshPricRcvdPerPdct().add(gncCshPricRcvdPerPdct);
        return this;
    }

}
