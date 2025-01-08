
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
 * Further qualifies the information provided in terms of its importance and its format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationQualifierType", propOrder = {
    "isFrmtd",
    "prty"
})
public class InformationQualifierType {

    @XmlElement(name = "IsFrmtd")
    protected Boolean isFrmtd;
    @XmlElement(name = "Prty")
    @XmlSchemaType(name = "string")
    protected Priority1Code prty;

    /**
     * Gets the value of the isFrmtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFrmtd() {
        return isFrmtd;
    }

    /**
     * Sets the value of the isFrmtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InformationQualifierType setIsFrmtd(Boolean value) {
        this.isFrmtd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Code }
     *     
     */
    public Priority1Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Code }
     *     
     */
    public InformationQualifierType setPrty(Priority1Code value) {
        this.prty = value;
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
