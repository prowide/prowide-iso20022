
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
 * Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationOrNameChoice", propOrder = {
    "nm",
    "id",
    "nmAndId"
})
public class AccountIdentificationOrNameChoice {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected AccountIdentification1Choice id;
    @XmlElement(name = "NmAndId")
    protected AccountIdentificationAndName2 nmAndId;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentificationOrNameChoice setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentificationOrNameChoice setId(AccountIdentification1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nmAndId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName2 }
     *     
     */
    public AccountIdentificationAndName2 getNmAndId() {
        return nmAndId;
    }

    /**
     * Sets the value of the nmAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName2 }
     *     
     */
    public AccountIdentificationOrNameChoice setNmAndId(AccountIdentificationAndName2 value) {
        this.nmAndId = value;
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
