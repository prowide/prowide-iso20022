
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
 * Specifies information about a blocked holding.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockedHoldingDetails1", propOrder = {
    "blckdHldg",
    "prtlHldgUnits",
    "hldgCertNb"
})
public class BlockedHoldingDetails1 {

    @XmlElement(name = "BlckdHldg", required = true)
    @XmlSchemaType(name = "string")
    protected Holding1Code blckdHldg;
    @XmlElement(name = "PrtlHldgUnits")
    protected BigDecimal prtlHldgUnits;
    @XmlElement(name = "HldgCertNb")
    protected String hldgCertNb;

    /**
     * Gets the value of the blckdHldg property.
     * 
     * @return
     *     possible object is
     *     {@link Holding1Code }
     *     
     */
    public Holding1Code getBlckdHldg() {
        return blckdHldg;
    }

    /**
     * Sets the value of the blckdHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holding1Code }
     *     
     */
    public BlockedHoldingDetails1 setBlckdHldg(Holding1Code value) {
        this.blckdHldg = value;
        return this;
    }

    /**
     * Gets the value of the prtlHldgUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlHldgUnits() {
        return prtlHldgUnits;
    }

    /**
     * Sets the value of the prtlHldgUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BlockedHoldingDetails1 setPrtlHldgUnits(BigDecimal value) {
        this.prtlHldgUnits = value;
        return this;
    }

    /**
     * Gets the value of the hldgCertNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgCertNb() {
        return hldgCertNb;
    }

    /**
     * Sets the value of the hldgCertNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BlockedHoldingDetails1 setHldgCertNb(String value) {
        this.hldgCertNb = value;
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
