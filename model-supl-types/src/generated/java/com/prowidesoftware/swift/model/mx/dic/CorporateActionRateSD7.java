
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
@XmlType(name = "CorporateActionRateSD7", propOrder = {
    "plcAndNm",
    "csdSctyRate",
    "estmtdRateFlg",
    "dtcFeeRate"
})
public class CorporateActionRateSD7 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "CSDSctyRate")
    protected CorporateActionRateSD6Choice csdSctyRate;
    @XmlElement(name = "EstmtdRateFlg")
    protected Boolean estmtdRateFlg;
    @XmlElement(name = "DTCFeeRate")
    protected PriceFormatSD1Choice dtcFeeRate;

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
    public CorporateActionRateSD7 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the csdSctyRate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD6Choice }
     *     
     */
    public CorporateActionRateSD6Choice getCSDSctyRate() {
        return csdSctyRate;
    }

    /**
     * Sets the value of the csdSctyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD6Choice }
     *     
     */
    public CorporateActionRateSD7 setCSDSctyRate(CorporateActionRateSD6Choice value) {
        this.csdSctyRate = value;
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
    public CorporateActionRateSD7 setEstmtdRateFlg(Boolean value) {
        this.estmtdRateFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDTCFeeRate() {
        return dtcFeeRate;
    }

    /**
     * Sets the value of the dtcFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CorporateActionRateSD7 setDTCFeeRate(PriceFormatSD1Choice value) {
        this.dtcFeeRate = value;
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
