
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
 * Location information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location6", propOrder = {
    "cd",
    "nm",
    "desc",
    "adr",
    "lclTmZone",
    "lclCcy"
})
public class Location6 {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "LclTmZone")
    protected String lclTmZone;
    @XmlElement(name = "LclCcy")
    protected String lclCcy;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location6 setCd(String value) {
        this.cd = value;
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
    public Location6 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location6 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public Location6 setAdr(Address2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the lclTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclTmZone() {
        return lclTmZone;
    }

    /**
     * Sets the value of the lclTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location6 setLclTmZone(String value) {
        this.lclTmZone = value;
        return this;
    }

    /**
     * Gets the value of the lclCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclCcy() {
        return lclCcy;
    }

    /**
     * Sets the value of the lclCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location6 setLclCcy(String value) {
        this.lclCcy = value;
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
