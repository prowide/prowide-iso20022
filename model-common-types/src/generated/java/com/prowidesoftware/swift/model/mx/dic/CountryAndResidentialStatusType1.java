
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
 * Country and residential status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryAndResidentialStatusType1", propOrder = {
    "ctry",
    "resdtlSts"
})
public class CountryAndResidentialStatusType1 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "ResdtlSts", required = true)
    @XmlSchemaType(name = "string")
    protected ResidentialStatus1Code resdtlSts;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CountryAndResidentialStatusType1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the resdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialStatus1Code }
     *     
     */
    public ResidentialStatus1Code getResdtlSts() {
        return resdtlSts;
    }

    /**
     * Sets the value of the resdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialStatus1Code }
     *     
     */
    public CountryAndResidentialStatusType1 setResdtlSts(ResidentialStatus1Code value) {
        this.resdtlSts = value;
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
