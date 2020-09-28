
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the security pledge as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral18", propOrder = {
    "valtn",
    "hrcut",
    "spclCollInd"
})
public class Collateral18 {

    @XmlElement(name = "Valtn", required = true)
    protected SecuredCollateral2Choice valtn;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "SpclCollInd")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral2Code spclCollInd;

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredCollateral2Choice }
     *     
     */
    public SecuredCollateral2Choice getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredCollateral2Choice }
     *     
     */
    public Collateral18 setValtn(SecuredCollateral2Choice value) {
        this.valtn = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Collateral18 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the spclCollInd property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral2Code }
     *     
     */
    public SpecialCollateral2Code getSpclCollInd() {
        return spclCollInd;
    }

    /**
     * Sets the value of the spclCollInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral2Code }
     *     
     */
    public Collateral18 setSpclCollInd(SpecialCollateral2Code value) {
        this.spclCollInd = value;
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
