
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "PartyIdentification237", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "ctryOfIncorprtn",
    "yrOfIncorprtn",
    "actvtyInd",
    "invstrTp",
    "ownrsh"
})
public class PartyIdentification237 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected NameAndAddress17 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id", required = true)
    protected PartyIdentification198Choice id;
    @XmlElement(name = "CtryOfIncorprtn")
    protected String ctryOfIncorprtn;
    @XmlElement(name = "YrOfIncorprtn")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yrOfIncorprtn;
    @XmlElement(name = "ActvtyInd")
    protected String actvtyInd;
    @XmlElement(name = "InvstrTp")
    protected InvestorType1Choice invstrTp;
    @XmlElement(name = "Ownrsh")
    protected Ownership1 ownrsh;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress17 }
     *     
     */
    public NameAndAddress17 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress17 }
     *     
     */
    public PartyIdentification237 setNmAndAdr(NameAndAddress17 value) {
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
    public PartyIdentification237 setEmailAdr(String value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification198Choice }
     *     
     */
    public PartyIdentification198Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification198Choice }
     *     
     */
    public PartyIdentification237 setId(PartyIdentification198Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncorprtn() {
        return ctryOfIncorprtn;
    }

    /**
     * Sets the value of the ctryOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification237 setCtryOfIncorprtn(String value) {
        this.ctryOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the yrOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrOfIncorprtn() {
        return yrOfIncorprtn;
    }

    /**
     * Sets the value of the yrOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PartyIdentification237 setYrOfIncorprtn(XMLGregorianCalendar value) {
        this.yrOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification237 setActvtyInd(String value) {
        this.actvtyInd = value;
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
    public PartyIdentification237 setInvstrTp(InvestorType1Choice value) {
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
    public PartyIdentification237 setOwnrsh(Ownership1 value) {
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
