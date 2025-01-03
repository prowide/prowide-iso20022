
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
 * Alternate identification for a party using an id type, a country code and an text field.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePartyIdentification6", propOrder = {
    "tpOfId",
    "ctry",
    "altrnId"
})
public class AlternatePartyIdentification6 {

    @XmlElement(name = "TpOfId", required = true)
    protected IdentificationType41Choice tpOfId;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "AltrnId", required = true)
    protected String altrnId;

    /**
     * Gets the value of the tpOfId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType41Choice }
     *     
     */
    public IdentificationType41Choice getTpOfId() {
        return tpOfId;
    }

    /**
     * Sets the value of the tpOfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType41Choice }
     *     
     */
    public AlternatePartyIdentification6 setTpOfId(IdentificationType41Choice value) {
        this.tpOfId = value;
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
    public AlternatePartyIdentification6 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlternatePartyIdentification6 setAltrnId(String value) {
        this.altrnId = value;
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
