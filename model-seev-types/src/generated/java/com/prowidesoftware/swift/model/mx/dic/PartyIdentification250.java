
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification250", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "ntlty",
    "dtAndPlcOfBirth",
    "cpnyRegrShrhldrId"
})
public class PartyIdentification250 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName3 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id")
    protected NaturalPersonIdentification1 id;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth2 dtAndPlcOfBirth;
    @XmlElement(name = "CpnyRegrShrhldrId")
    protected String cpnyRegrShrhldrId;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName3 }
     *     
     */
    public PersonName3 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName3 }
     *     
     */
    public PartyIdentification250 setNmAndAdr(PersonName3 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification250 setEmailAdr(String value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonIdentification1 }
     *     
     */
    public NaturalPersonIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonIdentification1 }
     *     
     */
    public PartyIdentification250 setId(NaturalPersonIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification250 setNtlty(String value) {
        this.ntlty = value;
        return this;
    }

    /**
     * Gets the value of the dtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth2 }
     *     
     */
    public DateAndPlaceOfBirth2 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth2 }
     *     
     */
    public PartyIdentification250 setDtAndPlcOfBirth(DateAndPlaceOfBirth2 value) {
        this.dtAndPlcOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the cpnyRegrShrhldrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyRegrShrhldrId() {
        return cpnyRegrShrhldrId;
    }

    /**
     * Sets the value of the cpnyRegrShrhldrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification250 setCpnyRegrShrhldrId(String value) {
        this.cpnyRegrShrhldrId = value;
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
