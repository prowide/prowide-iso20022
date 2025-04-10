
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action details rates and amounts details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRateSD1", propOrder = {
    "plcAndNm",
    "dfrrdIntrstRate",
    "intrstShrtfllRate",
    "realsdLossRate",
    "amrcnOrGblDpstRctRatio"
})
public class CorporateActionRateSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DfrrdIntrstRate")
    protected BigDecimal dfrrdIntrstRate;
    @XmlElement(name = "IntrstShrtfllRate")
    protected BigDecimal intrstShrtfllRate;
    @XmlElement(name = "RealsdLossRate")
    protected BigDecimal realsdLossRate;
    @XmlElement(name = "AmrcnOrGblDpstRctRatio")
    protected CorporateActionRateSD2 amrcnOrGblDpstRctRatio;

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
    public CorporateActionRateSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDfrrdIntrstRate() {
        return dfrrdIntrstRate;
    }

    /**
     * Sets the value of the dfrrdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD1 setDfrrdIntrstRate(BigDecimal value) {
        this.dfrrdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the intrstShrtfllRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstShrtfllRate() {
        return intrstShrtfllRate;
    }

    /**
     * Sets the value of the intrstShrtfllRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD1 setIntrstShrtfllRate(BigDecimal value) {
        this.intrstShrtfllRate = value;
        return this;
    }

    /**
     * Gets the value of the realsdLossRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealsdLossRate() {
        return realsdLossRate;
    }

    /**
     * Sets the value of the realsdLossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD1 setRealsdLossRate(BigDecimal value) {
        this.realsdLossRate = value;
        return this;
    }

    /**
     * Gets the value of the amrcnOrGblDpstRctRatio property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD2 }
     *     
     */
    public CorporateActionRateSD2 getAmrcnOrGblDpstRctRatio() {
        return amrcnOrGblDpstRctRatio;
    }

    /**
     * Sets the value of the amrcnOrGblDpstRctRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD2 }
     *     
     */
    public CorporateActionRateSD1 setAmrcnOrGblDpstRctRatio(CorporateActionRateSD2 value) {
        this.amrcnOrGblDpstRctRatio = value;
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
