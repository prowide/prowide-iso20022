
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
 * Structured postal address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address1", propOrder = {
    "adrLine1",
    "adrLine2",
    "strtNm",
    "bldgNb",
    "pstlCd",
    "twnNm",
    "ctrySubDvsnMnr",
    "ctrySubDvsnMjr",
    "ctry"
})
public class Address1 {

    @XmlElement(name = "AdrLine1")
    protected String adrLine1;
    @XmlElement(name = "AdrLine2")
    protected String adrLine2;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstlCd")
    protected String pstlCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsnMnr")
    protected String ctrySubDvsnMnr;
    @XmlElement(name = "CtrySubDvsnMjr")
    protected String ctrySubDvsnMjr;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the adrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine1() {
        return adrLine1;
    }

    /**
     * Sets the value of the adrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setAdrLine1(String value) {
        this.adrLine1 = value;
        return this;
    }

    /**
     * Gets the value of the adrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine2() {
        return adrLine2;
    }

    /**
     * Sets the value of the adrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setAdrLine2(String value) {
        this.adrLine2 = value;
        return this;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setStrtNm(String value) {
        this.strtNm = value;
        return this;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setBldgNb(String value) {
        this.bldgNb = value;
        return this;
    }

    /**
     * Gets the value of the pstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCd() {
        return pstlCd;
    }

    /**
     * Sets the value of the pstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setPstlCd(String value) {
        this.pstlCd = value;
        return this;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setTwnNm(String value) {
        this.twnNm = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnr() {
        return ctrySubDvsnMnr;
    }

    /**
     * Sets the value of the ctrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setCtrySubDvsnMnr(String value) {
        this.ctrySubDvsnMnr = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjr() {
        return ctrySubDvsnMjr;
    }

    /**
     * Sets the value of the ctrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setCtrySubDvsnMjr(String value) {
        this.ctrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address1 setCtry(String value) {
        this.ctry = value;
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
