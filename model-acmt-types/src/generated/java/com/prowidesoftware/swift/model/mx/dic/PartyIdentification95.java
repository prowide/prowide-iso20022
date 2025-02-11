
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
 * Identification of a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification95", propOrder = {
    "id",
    "lglNttyIdr"
})
public class PartyIdentification95 {

    @XmlElement(name = "Id")
    protected PartyIdentification70Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification95 setId(PartyIdentification70Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification95 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
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
