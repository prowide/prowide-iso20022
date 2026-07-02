
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
 * Choice between a BIC, name and address or a LEI to identify a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification242Choice", propOrder = {
    "nmAndAdr",
    "anyBIC",
    "ptyId"
})
public class PartyIdentification242Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "PtyId")
    protected PartyIdentification266 ptyId;

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
    public PartyIdentification242Choice setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification242Choice setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification266 }
     *     
     */
    public PartyIdentification266 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification266 }
     *     
     */
    public PartyIdentification242Choice setPtyId(PartyIdentification266 value) {
        this.ptyId = value;
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
