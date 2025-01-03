
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
 * Contact person at the party organising the meeting, at the issuer or at an intermediary.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingContactPerson2", propOrder = {
    "ctctPrsn",
    "emplngPty",
    "plcOfListg"
})
public class MeetingContactPerson2 {

    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification1 ctctPrsn;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification40Choice emplngPty;
    @XmlElement(name = "PlcOfListg")
    protected String plcOfListg;

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
    public MeetingContactPerson2 setCtctPrsn(ContactIdentification1 value) {
        this.ctctPrsn = value;
        return this;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public PartyIdentification40Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public MeetingContactPerson2 setEmplngPty(PartyIdentification40Choice value) {
        this.emplngPty = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingContactPerson2 setPlcOfListg(String value) {
        this.plcOfListg = value;
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
