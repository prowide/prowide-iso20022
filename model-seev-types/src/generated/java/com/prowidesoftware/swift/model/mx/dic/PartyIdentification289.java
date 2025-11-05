
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification289", propOrder = {
    "ptyId",
    "ctctPrsn",
    "ctctPrsnAdr"
})
public class PartyIdentification289 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification129Choice ptyId;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification1 ctctPrsn;
    @XmlElement(name = "CtctPrsnAdr")
    protected PostalAddress1 ctctPrsnAdr;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification289 setPtyId(PartyIdentification129Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification1 }
     *     
     */
    public ContactIdentification1 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification1 }
     *     
     */
    public PartyIdentification289 setCtctPrsn(ContactIdentification1 value) {
        this.ctctPrsn = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getCtctPrsnAdr() {
        return ctctPrsnAdr;
    }

    /**
     * Sets the value of the ctctPrsnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public PartyIdentification289 setCtctPrsnAdr(PostalAddress1 value) {
        this.ctctPrsnAdr = value;
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
