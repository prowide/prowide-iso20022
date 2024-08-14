
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
 * Specifies the identification of a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation1Choice", propOrder = {
    "lei",
    "mic",
    "prsn",
    "intl"
})
public class PersonOrOrganisation1Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "MIC")
    protected String mic;
    @XmlElement(name = "Prsn")
    protected PersonIdentification10 prsn;
    @XmlElement(name = "Intl")
    @XmlSchemaType(name = "string")
    protected InternalPartyRole1Code intl;

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
    public PersonOrOrganisation1Choice setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the mic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIC() {
        return mic;
    }

    /**
     * Sets the value of the mic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonOrOrganisation1Choice setMIC(String value) {
        this.mic = value;
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
    public PersonOrOrganisation1Choice setPrsn(PersonIdentification10 value) {
        this.prsn = value;
        return this;
    }

    /**
     * Gets the value of the intl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalPartyRole1Code }
     *     
     */
    public InternalPartyRole1Code getIntl() {
        return intl;
    }

    /**
     * Sets the value of the intl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalPartyRole1Code }
     *     
     */
    public PersonOrOrganisation1Choice setIntl(InternalPartyRole1Code value) {
        this.intl = value;
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
