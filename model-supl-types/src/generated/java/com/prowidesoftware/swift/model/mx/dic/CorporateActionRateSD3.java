
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
@XmlType(name = "CorporateActionRateSD3", propOrder = {
    "plcAndNm",
    "dclrdSctyRate"
})
public class CorporateActionRateSD3 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DclrdSctyRate")
    protected RatioFormat13Choice dclrdSctyRate;

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
    public CorporateActionRateSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dclrdSctyRate property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat13Choice }
     *     
     */
    public RatioFormat13Choice getDclrdSctyRate() {
        return dclrdSctyRate;
    }

    /**
     * Sets the value of the dclrdSctyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat13Choice }
     *     
     */
    public CorporateActionRateSD3 setDclrdSctyRate(RatioFormat13Choice value) {
        this.dclrdSctyRate = value;
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
