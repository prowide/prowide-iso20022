
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
 * Choice between a period or a period code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period3Choice", propOrder = {
    "prd",
    "prdCd"
})
public class Period3Choice {

    @XmlElement(name = "Prd")
    protected Period4 prd;
    @XmlElement(name = "PrdCd")
    @XmlSchemaType(name = "string")
    protected DateType8Code prdCd;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public Period3Choice setPrd(Period4 value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the prdCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType8Code }
     *     
     */
    public DateType8Code getPrdCd() {
        return prdCd;
    }

    /**
     * Sets the value of the prdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType8Code }
     *     
     */
    public Period3Choice setPrdCd(DateType8Code value) {
        this.prdCd = value;
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
