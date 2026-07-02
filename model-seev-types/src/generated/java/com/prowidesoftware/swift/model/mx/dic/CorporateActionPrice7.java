
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionPrice7", propOrder = {
    "exrcPric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct",
    "taxblIncmPerDvddShr",
    "cshInLieuOfShrPric",
    "overSbcptDpstPric"
})
public class CorporateActionPrice7 {

    @XmlElement(name = "ExrcPric")
    protected PriceFormat12Choice exrcPric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected List<PriceFormat13Choice> gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat17Choice gncCshPricPdPerPdct;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice5 taxblIncmPerDvddShr;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat17Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat17Choice overSbcptDpstPric;

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat12Choice }
     *     
     */
    public PriceFormat12Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat12Choice }
     *     
     */
    public CorporateActionPrice7 setExrcPric(PriceFormat12Choice value) {
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
     * {@link PriceFormat13Choice }
     * 
     * 
     */
    public List<PriceFormat13Choice> getGncCshPricRcvdPerPdct() {
        if (gncCshPricRcvdPerPdct == null) {
            gncCshPricRcvdPerPdct = new ArrayList<PriceFormat13Choice>();
        }
        return this.gncCshPricRcvdPerPdct;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public PriceFormat17Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public CorporateActionPrice7 setGncCshPricPdPerPdct(PriceFormat17Choice value) {
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
    public CorporateActionPrice7 setTaxblIncmPerDvddShr(AmountPrice5 value) {
        this.taxblIncmPerDvddShr = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public PriceFormat17Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public CorporateActionPrice7 setCshInLieuOfShrPric(PriceFormat17Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public PriceFormat17Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat17Choice }
     *     
     */
    public CorporateActionPrice7 setOverSbcptDpstPric(PriceFormat17Choice value) {
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
    public CorporateActionPrice7 addGncCshPricRcvdPerPdct(PriceFormat13Choice gncCshPricRcvdPerPdct) {
        getGncCshPricRcvdPerPdct().add(gncCshPricRcvdPerPdct);
        return this;
    }

}
