
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
 * Choice between different formats for the identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification234Choice", propOrder = {
    "anyBIC",
    "prtryId",
    "nmAndAdr",
    "indvOwnrId"
})
public class PartyIdentification234Choice {

    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification84 prtryId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress12 nmAndAdr;
    @XmlElement(name = "IndvOwnrId")
    protected AlternatePartyIdentification7 indvOwnrId;

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification234Choice setAnyBIC(String value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification84 }
     *     
     */
    public GenericIdentification84 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification84 }
     *     
     */
    public PartyIdentification234Choice setPrtryId(GenericIdentification84 value) {
        this.prtryId = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress12 }
     *     
     */
    public NameAndAddress12 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress12 }
     *     
     */
    public PartyIdentification234Choice setNmAndAdr(NameAndAddress12 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the indvOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getIndvOwnrId() {
        return indvOwnrId;
    }

    /**
     * Sets the value of the indvOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public PartyIdentification234Choice setIndvOwnrId(AlternatePartyIdentification7 value) {
        this.indvOwnrId = value;
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
