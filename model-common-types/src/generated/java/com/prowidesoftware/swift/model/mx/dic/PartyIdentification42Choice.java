
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
 * Choice of identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification42Choice", propOrder = {
    "bicfi",
    "nmAndAdr",
    "prtryId"
})
public class PartyIdentification42Choice {

    @XmlElement(name = "BICFI")
    protected String bicfi;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress5 nmAndAdr;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification19 prtryId;

    /**
     * Gets the value of the bicfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * Sets the value of the bicfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification42Choice setBICFI(String value) {
        this.bicfi = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public PartyIdentification42Choice setNmAndAdr(NameAndAddress5 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification19 }
     *     
     */
    public GenericIdentification19 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification19 }
     *     
     */
    public PartyIdentification42Choice setPrtryId(GenericIdentification19 value) {
        this.prtryId = value;
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
