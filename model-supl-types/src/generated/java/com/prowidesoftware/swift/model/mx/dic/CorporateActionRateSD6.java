
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
 * Provides additional information regarding corporate action option securities movement rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRateSD6", propOrder = {
    "plcAndNm",
    "dclrdSctyRate",
    "estmtdRateFlg",
    "dclrdFeeRate"
})
public class CorporateActionRateSD6 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DclrdSctyRate")
    protected CorporateActionRateSD6Choice dclrdSctyRate;
    @XmlElement(name = "EstmtdRateFlg")
    protected Boolean estmtdRateFlg;
    @XmlElement(name = "DclrdFeeRate")
    protected PriceFormatSD1Choice dclrdFeeRate;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionRateSD6 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dclrdSctyRate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD6Choice }
     *     
     */
    public CorporateActionRateSD6Choice getDclrdSctyRate() {
        return dclrdSctyRate;
    }

    /**
     * Sets the value of the dclrdSctyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD6Choice }
     *     
     */
    public CorporateActionRateSD6 setDclrdSctyRate(CorporateActionRateSD6Choice value) {
        this.dclrdSctyRate = value;
        return this;
    }

    /**
     * Gets the value of the estmtdRateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstmtdRateFlg() {
        return estmtdRateFlg;
    }

    /**
     * Sets the value of the estmtdRateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionRateSD6 setEstmtdRateFlg(Boolean value) {
        this.estmtdRateFlg = value;
        return this;
    }

    /**
     * Gets the value of the dclrdFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDclrdFeeRate() {
        return dclrdFeeRate;
    }

    /**
     * Sets the value of the dclrdFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CorporateActionRateSD6 setDclrdFeeRate(PriceFormatSD1Choice value) {
        this.dclrdFeeRate = value;
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
