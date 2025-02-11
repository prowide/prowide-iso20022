
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
 * Specifies the identification of a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation2Choice", propOrder = {
    "lei",
    "prsn"
})
public class PersonOrOrganisation2Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Prsn")
    protected PersonIdentification10 prsn;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonOrOrganisation2Choice setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the prsn property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification10 }
     *     
     */
    public PersonIdentification10 getPrsn() {
        return prsn;
    }

    /**
     * Sets the value of the prsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification10 }
     *     
     */
    public PersonOrOrganisation2Choice setPrsn(PersonIdentification10 value) {
        this.prsn = value;
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
