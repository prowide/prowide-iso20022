
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Double volume cap report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCapReport2", propOrder = {
    "techRcrdId",
    "id",
    "ccy",
    "ttlTradgVol",
    "ttlRefPricTradgVol",
    "ttlNgtdTxsTradgVol"
})
public class VolumeCapReport2 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlTradgVol", required = true)
    protected BigDecimal ttlTradgVol;
    @XmlElement(name = "TtlRefPricTradgVol", required = true)
    protected BigDecimal ttlRefPricTradgVol;
    @XmlElement(name = "TtlNgtdTxsTradgVol", required = true)
    protected BigDecimal ttlNgtdTxsTradgVol;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapReport2 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapReport2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapReport2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlTradgVol() {
        return ttlTradgVol;
    }

    /**
     * Sets the value of the ttlTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VolumeCapReport2 setTtlTradgVol(BigDecimal value) {
        this.ttlTradgVol = value;
        return this;
    }

    /**
     * Gets the value of the ttlRefPricTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlRefPricTradgVol() {
        return ttlRefPricTradgVol;
    }

    /**
     * Sets the value of the ttlRefPricTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VolumeCapReport2 setTtlRefPricTradgVol(BigDecimal value) {
        this.ttlRefPricTradgVol = value;
        return this;
    }

    /**
     * Gets the value of the ttlNgtdTxsTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNgtdTxsTradgVol() {
        return ttlNgtdTxsTradgVol;
    }

    /**
     * Sets the value of the ttlNgtdTxsTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VolumeCapReport2 setTtlNgtdTxsTradgVol(BigDecimal value) {
        this.ttlNgtdTxsTradgVol = value;
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
