
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for NonRep complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "nrType"
})
public class SwIntNonRep {

    @XmlElement(name = "NRType", required = true)
    protected String nrType;

    /**
     * Gets the value of the nrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRType() {
        return nrType;
    }

    /**
     * Sets the value of the nrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntNonRep setNRType(String value) {
        this.nrType = value;
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
