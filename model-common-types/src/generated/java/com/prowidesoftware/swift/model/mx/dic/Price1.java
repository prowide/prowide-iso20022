
package com.prowidesoftware.swift.model.mx.dic;

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
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price1", propOrder = {
    "valTp",
    "val",
    "pricTp"
})
public class Price1 {

    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType3Code valTp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountChoice val;
    @XmlElement(name = "PricTp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice1Code pricTp;

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType3Code }
     *     
     */
    public PriceValueType3Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType3Code }
     *     
     */
    public Price1 setValTp(PriceValueType3Code value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public Price1 setVal(PriceRateOrAmountChoice value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice1Code }
     *     
     */
    public TypeOfPrice1Code getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice1Code }
     *     
     */
    public Price1 setPricTp(TypeOfPrice1Code value) {
        this.pricTp = value;
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
