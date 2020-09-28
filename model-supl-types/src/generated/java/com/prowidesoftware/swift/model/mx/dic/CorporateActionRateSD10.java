
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
 * Provides additional information regarding corporate action option securities movement rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRateSD10", propOrder = {
    "plcAndNm",
    "dclrdSctyRate",
    "estmtdRateFlg",
    "dclrdFeeRate"
})
public class CorporateActionRateSD10 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "DclrdSctyRate")
    protected CorporateActionRateSD7Choice dclrdSctyRate;
    @XmlElement(name = "EstmtdRateFlg")
    protected Boolean estmtdRateFlg;
    @XmlElement(name = "DclrdFeeRate")
    protected PriceFormatSD3Choice dclrdFeeRate;

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
    public CorporateActionRateSD10 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dclrdSctyRate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD7Choice }
     *     
     */
    public CorporateActionRateSD7Choice getDclrdSctyRate() {
        return dclrdSctyRate;
    }

    /**
     * Sets the value of the dclrdSctyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD7Choice }
     *     
     */
    public CorporateActionRateSD10 setDclrdSctyRate(CorporateActionRateSD7Choice value) {
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
    public CorporateActionRateSD10 setEstmtdRateFlg(Boolean value) {
        this.estmtdRateFlg = value;
        return this;
    }

    /**
     * Gets the value of the dclrdFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD3Choice }
     *     
     */
    public PriceFormatSD3Choice getDclrdFeeRate() {
        return dclrdFeeRate;
    }

    /**
     * Sets the value of the dclrdFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD3Choice }
     *     
     */
    public CorporateActionRateSD10 setDclrdFeeRate(PriceFormatSD3Choice value) {
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
