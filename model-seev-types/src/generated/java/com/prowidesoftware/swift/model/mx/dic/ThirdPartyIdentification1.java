
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the third party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyIdentification1", propOrder = {
    "role",
    "lglPrsnId"
})
public class ThirdPartyIdentification1 {

    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "string")
    protected PartyRole3Code role;
    @XmlElement(name = "LglPrsnId")
    protected PartyIdentification221 lglPrsnId;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole3Code }
     *     
     */
    public PartyRole3Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole3Code }
     *     
     */
    public ThirdPartyIdentification1 setRole(PartyRole3Code value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the lglPrsnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification221 }
     *     
     */
    public PartyIdentification221 getLglPrsnId() {
        return lglPrsnId;
    }

    /**
     * Sets the value of the lglPrsnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification221 }
     *     
     */
    public ThirdPartyIdentification1 setLglPrsnId(PartyIdentification221 value) {
        this.lglPrsnId = value;
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
