
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
@XmlType(name = "CorporateActionPrice16", propOrder = {
    "cshInLieuOfShrPric",
    "gncCshPricRcvdPerPdct",
    "overSbcptDpstPric"
})
public class CorporateActionPrice16 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat19Choice cshInLieuOfShrPric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected List<PriceFormat20Choice> gncCshPricRcvdPerPdct;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat19Choice overSbcptDpstPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public PriceFormat19Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public CorporateActionPrice16 setCshInLieuOfShrPric(PriceFormat19Choice value) {
        this.cshInLieuOfShrPric = value;
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
     * {@link PriceFormat20Choice }
     * 
     * 
     */
    public List<PriceFormat20Choice> getGncCshPricRcvdPerPdct() {
        if (gncCshPricRcvdPerPdct == null) {
            gncCshPricRcvdPerPdct = new ArrayList<PriceFormat20Choice>();
        }
        return this.gncCshPricRcvdPerPdct;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public PriceFormat19Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public CorporateActionPrice16 setOverSbcptDpstPric(PriceFormat19Choice value) {
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
    public CorporateActionPrice16 addGncCshPricRcvdPerPdct(PriceFormat20Choice gncCshPricRcvdPerPdct) {
        getGncCshPricRcvdPerPdct().add(gncCshPricRcvdPerPdct);
        return this;
    }

}
