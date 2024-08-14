
package com.prowidesoftware.swift.model.mx.dic;

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
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice1", propOrder = {
    "tp",
    "val",
    "pricMtd"
})
public class UnitPrice1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfPrice2Code tp;
    @XmlElement(name = "Val", required = true)
    protected PriceValue1 val;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice2Code }
     *     
     */
    public TypeOfPrice2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice2Code }
     *     
     */
    public UnitPrice1 setTp(TypeOfPrice2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public UnitPrice1 setVal(PriceValue1 value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public UnitPrice1 setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
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
