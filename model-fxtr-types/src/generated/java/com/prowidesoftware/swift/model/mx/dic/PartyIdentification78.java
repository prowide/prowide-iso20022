
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
 * Identification of an entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification78", propOrder = {
    "ptySrc",
    "tradPtyId"
})
public class PartyIdentification78 {

    @XmlElement(name = "PtySrc")
    @XmlSchemaType(name = "string")
    protected IdentificationType1Code ptySrc;
    @XmlElement(name = "TradPtyId", required = true)
    protected String tradPtyId;

    /**
     * Gets the value of the ptySrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType1Code }
     *     
     */
    public IdentificationType1Code getPtySrc() {
        return ptySrc;
    }

    /**
     * Sets the value of the ptySrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType1Code }
     *     
     */
    public PartyIdentification78 setPtySrc(IdentificationType1Code value) {
        this.ptySrc = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPtyId() {
        return tradPtyId;
    }

    /**
     * Sets the value of the tradPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification78 setTradPtyId(String value) {
        this.tradPtyId = value;
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
