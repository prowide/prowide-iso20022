
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
 * Specifies prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice62", propOrder = {
    "indctvOrMktPric",
    "issePric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct"
})
public class CorporateActionPrice62 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice9Choice indctvOrMktPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat52Choice issePric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat53Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat52Choice gncCshPricPdPerPdct;

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public IndicativeOrMarketPrice9Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public CorporateActionPrice62 setIndctvOrMktPric(IndicativeOrMarketPrice9Choice value) {
        this.indctvOrMktPric = value;
        return this;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public PriceFormat52Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public CorporateActionPrice62 setIssePric(PriceFormat52Choice value) {
        this.issePric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat53Choice }
     *     
     */
    public PriceFormat53Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat53Choice }
     *     
     */
    public CorporateActionPrice62 setGncCshPricRcvdPerPdct(PriceFormat53Choice value) {
        this.gncCshPricRcvdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public PriceFormat52Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public CorporateActionPrice62 setGncCshPricPdPerPdct(PriceFormat52Choice value) {
        this.gncCshPricPdPerPdct = value;
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
