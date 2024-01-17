
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
@XmlType(name = "PartyIdentification210", propOrder = {
    "prsnlId",
    "mplyeeId",
    "nm",
    "prfssnlLvl"
})
public class PartyIdentification210 {

    @XmlElement(name = "PrsnlId")
    protected String prsnlId;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PrfssnlLvl")
    protected String prfssnlLvl;

    /**
     * Gets the value of the prsnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlId() {
        return prsnlId;
    }

    /**
     * Sets the value of the prsnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification210 setPrsnlId(String value) {
        this.prsnlId = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification210 setMplyeeId(String value) {
        this.mplyeeId = value;
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
    public PartyIdentification210 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the prfssnlLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfssnlLvl() {
        return prfssnlLvl;
    }

    /**
     * Sets the value of the prfssnlLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification210 setPrfssnlLvl(String value) {
        this.prfssnlLvl = value;
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
