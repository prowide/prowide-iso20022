
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
 * Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccount4", propOrder = {
    "id",
    "nm",
    "chrtc"
})
public class SubAccount4 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification26 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Chrtc")
    protected String chrtc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification26 }
     *     
     */
    public AccountIdentification26 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification26 }
     *     
     */
    public SubAccount4 setId(AccountIdentification26 value) {
        this.id = value;
        return this;
    }

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
    public SubAccount4 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the chrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtc() {
        return chrtc;
    }

    /**
     * Sets the value of the chrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubAccount4 setChrtc(String value) {
        this.chrtc = value;
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
