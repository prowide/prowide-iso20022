
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for the place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormatChoice", propOrder = {
    "id",
    "idAsDSS",
    "idAsCtry"
})
public class SafekeepingPlaceFormatChoice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceAsCodeAndPartyIdentification id;
    @XmlElement(name = "IdAsDSS")
    protected GenericIdentification5 idAsDSS;
    @XmlElement(name = "IdAsCtry")
    protected String idAsCtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     *     
     */
    public SafekeepingPlaceAsCodeAndPartyIdentification getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     *     
     */
    public SafekeepingPlaceFormatChoice setId(SafekeepingPlaceAsCodeAndPartyIdentification value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the idAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification5 }
     *     
     */
    public GenericIdentification5 getIdAsDSS() {
        return idAsDSS;
    }

    /**
     * Sets the value of the idAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification5 }
     *     
     */
    public SafekeepingPlaceFormatChoice setIdAsDSS(GenericIdentification5 value) {
        this.idAsDSS = value;
        return this;
    }

    /**
     * Gets the value of the idAsCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsCtry() {
        return idAsCtry;
    }

    /**
     * Sets the value of the idAsCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingPlaceFormatChoice setIdAsCtry(String value) {
        this.idAsCtry = value;
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
