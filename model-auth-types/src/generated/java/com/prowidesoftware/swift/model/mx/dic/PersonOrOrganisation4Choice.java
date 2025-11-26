
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
@XmlType(name = "PersonOrOrganisation4Choice", propOrder = {
    "lei",
    "prsn",
    "xcptnId"
})
public class PersonOrOrganisation4Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Prsn")
    protected GenericPersonIdentification1 prsn;
    @XmlElement(name = "XcptnId")
    @XmlSchemaType(name = "string")
    protected PartyExceptionType1Code xcptnId;

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
    public PersonOrOrganisation4Choice setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the prsn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public GenericPersonIdentification1 getPrsn() {
        return prsn;
    }

    /**
     * Sets the value of the prsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public PersonOrOrganisation4Choice setPrsn(GenericPersonIdentification1 value) {
        this.prsn = value;
        return this;
    }

    /**
     * Gets the value of the xcptnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyExceptionType1Code }
     *     
     */
    public PartyExceptionType1Code getXcptnId() {
        return xcptnId;
    }

    /**
     * Sets the value of the xcptnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyExceptionType1Code }
     *     
     */
    public PersonOrOrganisation4Choice setXcptnId(PartyExceptionType1Code value) {
        this.xcptnId = value;
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
