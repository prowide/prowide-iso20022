
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
 * Identification of an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerInformation3", propOrder = {
    "id",
    "urlAdr"
})
public class IssuerInformation3 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification129Choice id;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public IssuerInformation3 setId(PartyIdentification129Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IssuerInformation3 setURLAdr(String value) {
        this.urlAdr = value;
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
