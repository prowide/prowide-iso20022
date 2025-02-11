
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
@XmlType(name = "PartyIdentification269", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "cpnyRegrShrhldrId",
    "ctryOfIncorprtn"
})
public class PartyIdentification269 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName2 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id")
    protected PartyIdentification198Choice id;
    @XmlElement(name = "CpnyRegrShrhldrId")
    protected String cpnyRegrShrhldrId;
    @XmlElement(name = "CtryOfIncorprtn")
    protected String ctryOfIncorprtn;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName2 }
     *     
     */
    public PersonName2 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName2 }
     *     
     */
    public PartyIdentification269 setNmAndAdr(PersonName2 value) {
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
    public PartyIdentification269 setEmailAdr(String value) {
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
    public PartyIdentification269 setId(PartyIdentification198Choice value) {
        this.id = value;
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
    public PartyIdentification269 setCpnyRegrShrhldrId(String value) {
        this.cpnyRegrShrhldrId = value;
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
    public PartyIdentification269 setCtryOfIncorprtn(String value) {
        this.ctryOfIncorprtn = value;
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
