
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
 * Processing characteristics linked to the instrument, ie, not to the market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forms", propOrder = {
    "applForm",
    "sgntrTp"
})
public class Forms {

    @XmlElement(name = "ApplForm")
    protected boolean applForm;
    @XmlElement(name = "SgntrTp", required = true)
    @XmlSchemaType(name = "string")
    protected SignatureType1Code sgntrTp;

    /**
     * Gets the value of the applForm property.
     * 
     */
    public boolean isApplForm() {
        return applForm;
    }

    /**
     * Sets the value of the applForm property.
     * 
     */
    public Forms setApplForm(boolean value) {
        this.applForm = value;
        return this;
    }

    /**
     * Gets the value of the sgntrTp property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType1Code }
     *     
     */
    public SignatureType1Code getSgntrTp() {
        return sgntrTp;
    }

    /**
     * Sets the value of the sgntrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType1Code }
     *     
     */
    public Forms setSgntrTp(SignatureType1Code value) {
        this.sgntrTp = value;
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
