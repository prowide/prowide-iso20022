
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
 * Choice between a standard code or proprietary code to specify the type of interest computation method.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestComputationMethodFormat7", propOrder = {
    "cd",
    "nrrtv"
})
public class InterestComputationMethodFormat7 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod4Code cd;
    @XmlElement(name = "Nrrtv")
    protected String nrrtv;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod4Code }
     *     
     */
    public InterestComputationMethod4Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod4Code }
     *     
     */
    public InterestComputationMethodFormat7 setCd(InterestComputationMethod4Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the nrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrrtv() {
        return nrrtv;
    }

    /**
     * Sets the value of the nrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestComputationMethodFormat7 setNrrtv(String value) {
        this.nrrtv = value;
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
