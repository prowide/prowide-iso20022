
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
 * Choice of formats for the identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification257Choice", propOrder = {
    "anyBIC",
    "nmAndAdr",
    "ctry",
    "dgtlLdgrId"
})
public class PartyIdentification257Choice {

    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress5 nmAndAdr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "DgtlLdgrId")
    protected String dgtlLdgrId;

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification257Choice setAnyBIC(String value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public PartyIdentification257Choice setNmAndAdr(NameAndAddress5 value) {
        this.nmAndAdr = value;
        return this;
    }

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
    public PartyIdentification257Choice setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the dgtlLdgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgtlLdgrId() {
        return dgtlLdgrId;
    }

    /**
     * Sets the value of the dgtlLdgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification257Choice setDgtlLdgrId(String value) {
        this.dgtlLdgrId = value;
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
