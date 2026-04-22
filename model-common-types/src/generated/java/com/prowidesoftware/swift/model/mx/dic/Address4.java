
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
 * Structured postal address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address4", propOrder = {
    "line1",
    "line2",
    "strtNm",
    "bldgNb",
    "pstlCd",
    "twnNm",
    "ctrySubDvsnMnr",
    "ctrySubDvsnMjr",
    "ctrySubDvsnMjrNm",
    "ctrySubDvsnMnrNm",
    "ctry",
    "geogcLctn"
})
public class Address4 {

    @XmlElement(name = "Line1")
    protected String line1;
    @XmlElement(name = "Line2")
    protected String line2;
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
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address4 setLine1(String value) {
        this.line1 = value;
        return this;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address4 setLine2(String value) {
        this.line2 = value;
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
    public Address4 setStrtNm(String value) {
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
    public Address4 setBldgNb(String value) {
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
    public Address4 setPstlCd(String value) {
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
    public Address4 setTwnNm(String value) {
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
    public Address4 setCtrySubDvsnMnr(String value) {
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
    public Address4 setCtrySubDvsnMjr(String value) {
        this.ctrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMjrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjrNm() {
        return ctrySubDvsnMjrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMjrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address4 setCtrySubDvsnMjrNm(String value) {
        this.ctrySubDvsnMjrNm = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMnrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnrNm() {
        return ctrySubDvsnMnrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMnrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address4 setCtrySubDvsnMnrNm(String value) {
        this.ctrySubDvsnMnrNm = value;
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
    public Address4 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Address4 setGeogcLctn(String value) {
        this.geogcLctn = value;
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
