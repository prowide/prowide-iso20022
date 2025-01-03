
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification242", propOrder = {
    "id",
    "ccpMmbTp"
})
public class PartyIdentification242 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification178Choice id;
    @XmlElement(name = "CCPMmbTp")
    @XmlSchemaType(name = "string")
    protected CCPMemberType1Code ccpMmbTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification242 setId(PartyIdentification178Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ccpMmbTp property.
     * 
     * @return
     *     possible object is
     *     {@link CCPMemberType1Code }
     *     
     */
    public CCPMemberType1Code getCCPMmbTp() {
        return ccpMmbTp;
    }

    /**
     * Sets the value of the ccpMmbTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPMemberType1Code }
     *     
     */
    public PartyIdentification242 setCCPMmbTp(CCPMemberType1Code value) {
        this.ccpMmbTp = value;
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
