
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
 * Type of charge expressed either in free format or in structured or free form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeTypeFormat2Choice", propOrder = {
    "ustrd",
    "strd"
})
public class ChargeTypeFormat2Choice {

    @XmlElement(name = "Ustrd")
    protected String ustrd;
    @XmlElement(name = "Strd")
    @XmlSchemaType(name = "string")
    protected ChargeType4Code strd;

    /**
     * Gets the value of the ustrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstrd() {
        return ustrd;
    }

    /**
     * Sets the value of the ustrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargeTypeFormat2Choice setUstrd(String value) {
        this.ustrd = value;
        return this;
    }

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType4Code }
     *     
     */
    public ChargeType4Code getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType4Code }
     *     
     */
    public ChargeTypeFormat2Choice setStrd(ChargeType4Code value) {
        this.strd = value;
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
