
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
 * Specifies prices.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice5", propOrder = {
    "exrcPric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct",
    "taxblIncmPerDvddShr",
    "cshInLieuOfShrPric",
    "overSbcptDpstPric"
})
public class CorporateActionPrice5 {

    @XmlElement(name = "ExrcPric")
    protected PriceFormat6Choice exrcPric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected List<PriceFormat7Choice> gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat5Choice gncCshPricPdPerPdct;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice3 taxblIncmPerDvddShr;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat5Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat5Choice overSbcptDpstPric;

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat6Choice }
     *     
     */
    public PriceFormat6Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat6Choice }
     *     
     */
    public CorporateActionPrice5 setExrcPric(PriceFormat6Choice value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gncCshPricRcvdPerPdct property.
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
     * {@link PriceFormat7Choice }
     * 
     * 
     * @return
     *     The value of the gncCshPricRcvdPerPdct property.
     */
    public List<PriceFormat7Choice> getGncCshPricRcvdPerPdct() {
        if (gncCshPricRcvdPerPdct == null) {
            gncCshPricRcvdPerPdct = new ArrayList<>();
        }
        return this.gncCshPricRcvdPerPdct;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice5 setGncCshPricPdPerPdct(PriceFormat5Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice3 }
     *     
     */
    public AmountPrice3 getTaxblIncmPerDvddShr() {
        return taxblIncmPerDvddShr;
    }

    /**
     * Sets the value of the taxblIncmPerDvddShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice3 }
     *     
     */
    public CorporateActionPrice5 setTaxblIncmPerDvddShr(AmountPrice3 value) {
        this.taxblIncmPerDvddShr = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice5 setCshInLieuOfShrPric(PriceFormat5Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice5 setOverSbcptDpstPric(PriceFormat5Choice value) {
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

    /**
     * Adds a new item to the gncCshPricRcvdPerPdct list.
     * @see #getGncCshPricRcvdPerPdct()
     * 
     */
    public CorporateActionPrice5 addGncCshPricRcvdPerPdct(PriceFormat7Choice gncCshPricRcvdPerPdct) {
        getGncCshPricRcvdPerPdct().add(gncCshPricRcvdPerPdct);
        return this;
    }

}
