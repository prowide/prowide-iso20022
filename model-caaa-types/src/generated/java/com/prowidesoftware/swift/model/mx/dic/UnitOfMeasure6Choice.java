
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
 * Specifies a unit of measure with a code or free text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasure6Choice", propOrder = {
    "unitOfMeasrCd",
    "othrUnitOfMeasr"
})
public class UnitOfMeasure6Choice {

    @XmlElement(name = "UnitOfMeasrCd")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure9Code unitOfMeasrCd;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;

    /**
     * Gets the value of the unitOfMeasrCd property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure9Code }
     *     
     */
    public UnitOfMeasure9Code getUnitOfMeasrCd() {
        return unitOfMeasrCd;
    }

    /**
     * Sets the value of the unitOfMeasrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure9Code }
     *     
     */
    public UnitOfMeasure6Choice setUnitOfMeasrCd(UnitOfMeasure9Code value) {
        this.unitOfMeasrCd = value;
        return this;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnitOfMeasure6Choice setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
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
