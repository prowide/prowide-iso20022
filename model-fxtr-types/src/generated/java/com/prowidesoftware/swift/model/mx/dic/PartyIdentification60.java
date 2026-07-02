
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
 * Identification of a party by fund name, name and address or an LEI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification60", propOrder = {
    "fndId",
    "nmAndAdr",
    "lglNttyIdr"
})
public class PartyIdentification60 {

    @XmlElement(name = "FndId", required = true)
    protected String fndId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Gets the value of the fndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndId() {
        return fndId;
    }

    /**
     * Sets the value of the fndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification60 setFndId(String value) {
        this.fndId = value;
        return this;
    }

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
    public PartyIdentification60 setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification60 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
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
