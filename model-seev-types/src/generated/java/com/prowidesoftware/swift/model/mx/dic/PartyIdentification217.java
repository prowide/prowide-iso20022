
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
@XmlType(name = "PartyIdentification217", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "ntlty",
    "dtAndPlcOfBirth",
    "invstrTp",
    "ownrsh"
})
public class PartyIdentification217 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName3 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id", required = true)
    protected NaturalPersonIdentification1 id;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth2 dtAndPlcOfBirth;
    @XmlElement(name = "InvstrTp")
    protected InvestorType1Choice invstrTp;
    @XmlElement(name = "Ownrsh")
    protected Ownership1 ownrsh;

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
    public PartyIdentification217 setNmAndAdr(PersonName3 value) {
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
    public PartyIdentification217 setEmailAdr(String value) {
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
    public PartyIdentification217 setId(NaturalPersonIdentification1 value) {
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
    public PartyIdentification217 setNtlty(String value) {
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
    public PartyIdentification217 setDtAndPlcOfBirth(DateAndPlaceOfBirth2 value) {
        this.dtAndPlcOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType1Choice }
     *     
     */
    public InvestorType1Choice getInvstrTp() {
        return invstrTp;
    }

    /**
     * Sets the value of the invstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType1Choice }
     *     
     */
    public PartyIdentification217 setInvstrTp(InvestorType1Choice value) {
        this.invstrTp = value;
        return this;
    }

    /**
     * Gets the value of the ownrsh property.
     * 
     * @return
     *     possible object is
     *     {@link Ownership1 }
     *     
     */
    public Ownership1 getOwnrsh() {
        return ownrsh;
    }

    /**
     * Sets the value of the ownrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ownership1 }
     *     
     */
    public PartyIdentification217 setOwnrsh(Ownership1 value) {
        this.ownrsh = value;
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
