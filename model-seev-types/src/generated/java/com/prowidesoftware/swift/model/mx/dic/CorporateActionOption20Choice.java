
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
 * Choice between a standard code or a proprietary code to specify the type of the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption20Choice", propOrder = {
    "cd",
    "prtry"
})
public class CorporateActionOption20Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected CorporateActionOption9Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption9Code }
     *     
     */
    public CorporateActionOption9Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption9Code }
     *     
     */
    public CorporateActionOption20Choice setCd(CorporateActionOption9Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CorporateActionOption20Choice setPrtry(GenericIdentification30 value) {
        this.prtry = value;
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
