
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
 * Identification of the place of safekeeping expressed as a code and a BIC.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceAsCodeAndPartyIdentification", propOrder = {
    "plcSfkpg",
    "nrrtv",
    "pty"
})
public class SafekeepingPlaceAsCodeAndPartyIdentification {

    @XmlElement(name = "PlcSfkpg", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace1Code plcSfkpg;
    @XmlElement(name = "Nrrtv")
    protected String nrrtv;
    @XmlElement(name = "Pty")
    protected PartyIdentification3 pty;

    /**
     * Gets the value of the plcSfkpg property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlace1Code getPlcSfkpg() {
        return plcSfkpg;
    }

    /**
     * Sets the value of the plcSfkpg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlaceAsCodeAndPartyIdentification setPlcSfkpg(SafekeepingPlace1Code value) {
        this.plcSfkpg = value;
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
    public SafekeepingPlaceAsCodeAndPartyIdentification setNrrtv(String value) {
        this.nrrtv = value;
        return this;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification3 }
     *     
     */
    public PartyIdentification3 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification3 }
     *     
     */
    public SafekeepingPlaceAsCodeAndPartyIdentification setPty(PartyIdentification3 value) {
        this.pty = value;
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
