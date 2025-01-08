
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
 * Identification of a party and its role.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary47", propOrder = {
    "id",
    "lglNttyIdr",
    "acct"
})
public class Intermediary47 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification125Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Acct")
    protected Account32 acct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public Intermediary47 setId(PartyIdentification125Choice value) {
        this.id = value;
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
    public Intermediary47 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account32 }
     *     
     */
    public Account32 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account32 }
     *     
     */
    public Intermediary47 setAcct(Account32 value) {
        this.acct = value;
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
