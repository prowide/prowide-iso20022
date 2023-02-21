
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of a hardware memory module.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoryCharacteristics1", propOrder = {
    "id",
    "ttlSz",
    "freeSz",
    "unit"
})
public class MemoryCharacteristics1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TtlSz", required = true)
    protected BigDecimal ttlSz;
    @XmlElement(name = "FreeSz", required = true)
    protected BigDecimal freeSz;
    @XmlElement(name = "Unit", required = true)
    @XmlSchemaType(name = "string")
    protected MemoryUnit1Code unit;

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
    public MemoryCharacteristics1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ttlSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSz() {
        return ttlSz;
    }

    /**
     * Sets the value of the ttlSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MemoryCharacteristics1 setTtlSz(BigDecimal value) {
        this.ttlSz = value;
        return this;
    }

    /**
     * Gets the value of the freeSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreeSz() {
        return freeSz;
    }

    /**
     * Sets the value of the freeSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MemoryCharacteristics1 setFreeSz(BigDecimal value) {
        this.freeSz = value;
        return this;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public MemoryUnit1Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public MemoryCharacteristics1 setUnit(MemoryUnit1Code value) {
        this.unit = value;
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
