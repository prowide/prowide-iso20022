
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
 * Identification of a party by a choice between a BIC or a name and address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification99Choice", propOrder = {
    "nmAndAdr",
    "anyBIC"
})
public class PartyIdentification99Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification44 anyBIC;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress8 }
     *     
     */
    public NameAndAddress8 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress8 }
     *     
     */
    public PartyIdentification99Choice setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification44 }
     *     
     */
    public PartyIdentification44 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification44 }
     *     
     */
    public PartyIdentification99Choice setAnyBIC(PartyIdentification44 value) {
        this.anyBIC = value;
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
