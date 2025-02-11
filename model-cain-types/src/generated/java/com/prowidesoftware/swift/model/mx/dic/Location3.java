
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
 * Location information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location3", propOrder = {
    "lctnCd",
    "lctnNm",
    "desc",
    "adr",
    "lclTmZone",
    "lclCcy"
})
public class Location3 {

    @XmlElement(name = "LctnCd")
    protected String lctnCd;
    @XmlElement(name = "LctnNm")
    protected String lctnNm;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Adr")
    protected Address1 adr;
    @XmlElement(name = "LclTmZone")
    protected String lclTmZone;
    @XmlElement(name = "LclCcy")
    protected String lclCcy;

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location3 setLctnCd(String value) {
        this.lctnCd = value;
        return this;
    }

    /**
     * Gets the value of the lctnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnNm() {
        return lctnNm;
    }

    /**
     * Sets the value of the lctnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location3 setLctnNm(String value) {
        this.lctnNm = value;
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
    public Location3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public Location3 setAdr(Address1 value) {
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
    public Location3 setLclTmZone(String value) {
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
    public Location3 setLclCcy(String value) {
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
