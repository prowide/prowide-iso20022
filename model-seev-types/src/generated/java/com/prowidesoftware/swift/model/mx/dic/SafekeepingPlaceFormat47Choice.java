
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
 * Choice of formats for a place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat47Choice", propOrder = {
    "id",
    "ctry",
    "dgtlLdgrId",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat47Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText9 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "DgtlLdgrId")
    protected String dgtlLdgrId;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndIdentification1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification85 prtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText9 }
     *     
     */
    public SafekeepingPlaceTypeAndText9 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText9 }
     *     
     */
    public SafekeepingPlaceFormat47Choice setId(SafekeepingPlaceTypeAndText9 value) {
        this.id = value;
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
    public SafekeepingPlaceFormat47Choice setCtry(String value) {
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
    public SafekeepingPlaceFormat47Choice setDgtlLdgrId(String value) {
        this.dgtlLdgrId = value;
        return this;
    }

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public SafekeepingPlaceTypeAndIdentification1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public SafekeepingPlaceFormat47Choice setTpAndId(SafekeepingPlaceTypeAndIdentification1 value) {
        this.tpAndId = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification85 }
     *     
     */
    public GenericIdentification85 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification85 }
     *     
     */
    public SafekeepingPlaceFormat47Choice setPrtry(GenericIdentification85 value) {
        this.prtry = value;
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
