
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Official identification of an organisation (legal entity) in a specific register.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification5", propOrder = {
    "regnNb",
    "regrNm"
})
public class OrganisationIdentification5 {

    @XmlElement(name = "RegnNb", required = true)
    protected String regnNb;
    @XmlElement(name = "RegrNm")
    protected String regrNm;

    /**
     * Gets the value of the regnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNb() {
        return regnNb;
    }

    /**
     * Sets the value of the regnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification5 setRegnNb(String value) {
        this.regnNb = value;
        return this;
    }

    /**
     * Gets the value of the regrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegrNm() {
        return regrNm;
    }

    /**
     * Sets the value of the regrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification5 setRegrNm(String value) {
        this.regrNm = value;
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
