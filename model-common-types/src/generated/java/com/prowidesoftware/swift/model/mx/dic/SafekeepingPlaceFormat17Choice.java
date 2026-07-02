
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
 * Choice between formats for the place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat17Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat17Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText15 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndAnyBICIdentifier1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification85 prtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText15 }
     *     
     */
    public SafekeepingPlaceTypeAndText15 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText15 }
     *     
     */
    public SafekeepingPlaceFormat17Choice setId(SafekeepingPlaceTypeAndText15 value) {
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
    public SafekeepingPlaceFormat17Choice setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public SafekeepingPlaceFormat17Choice setTpAndId(SafekeepingPlaceTypeAndAnyBICIdentifier1 value) {
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
    public SafekeepingPlaceFormat17Choice setPrtry(GenericIdentification85 value) {
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
