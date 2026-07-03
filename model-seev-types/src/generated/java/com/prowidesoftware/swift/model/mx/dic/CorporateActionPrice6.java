
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
 * Specifies prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice6", propOrder = {
    "cshInLieuOfShrPric",
    "exrcPric",
    "gncCshPricRcvdPerPdct",
    "overSbcptDpstPric",
    "gncCshPricPdPerPdct",
    "taxblIncmPerDvddShr"
})
public class CorporateActionPrice6 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat11Choice cshInLieuOfShrPric;
    @XmlElement(name = "ExrcPric")
    protected PriceFormat8Choice exrcPric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected List<PriceFormat9Choice> gncCshPricRcvdPerPdct;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat11Choice overSbcptDpstPric;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat11Choice gncCshPricPdPerPdct;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice3 taxblIncmPerDvddShr;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public PriceFormat11Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public CorporateActionPrice6 setCshInLieuOfShrPric(PriceFormat11Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat8Choice }
     *     
     */
    public PriceFormat8Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat8Choice }
     *     
     */
    public CorporateActionPrice6 setExrcPric(PriceFormat8Choice value) {
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
     * {@link PriceFormat9Choice }
     * 
     * 
     */
    public List<PriceFormat9Choice> getGncCshPricRcvdPerPdct() {
        if (gncCshPricRcvdPerPdct == null) {
            gncCshPricRcvdPerPdct = new ArrayList<PriceFormat9Choice>();
        }
        return this.gncCshPricRcvdPerPdct;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public PriceFormat11Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public CorporateActionPrice6 setOverSbcptDpstPric(PriceFormat11Choice value) {
        this.overSbcptDpstPric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public PriceFormat11Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat11Choice }
     *     
     */
    public CorporateActionPrice6 setGncCshPricPdPerPdct(PriceFormat11Choice value) {
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
    public CorporateActionPrice6 setTaxblIncmPerDvddShr(AmountPrice3 value) {
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
    public CorporateActionPrice6 addGncCshPricRcvdPerPdct(PriceFormat9Choice gncCshPricRcvdPerPdct) {
        getGncCshPricRcvdPerPdct().add(gncCshPricRcvdPerPdct);
        return this;
    }

}
