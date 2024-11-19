
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
 * Address of a party expressed in a formal structure, usually according to the country's postal services specifications.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredLongPostalAddress1", propOrder = {
    "bldgNm",
    "strtNm",
    "strtBldgId",
    "flr",
    "twnNm",
    "dstrctNm",
    "rgnId",
    "stat",
    "ctyId",
    "ctry",
    "pstCdId",
    "pob"
})
public class StructuredLongPostalAddress1 {

    @XmlElement(name = "BldgNm")
    protected String bldgNm;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "StrtBldgId")
    protected String strtBldgId;
    @XmlElement(name = "Flr")
    protected String flr;
    @XmlElement(name = "TwnNm", required = true)
    protected String twnNm;
    @XmlElement(name = "DstrctNm")
    protected String dstrctNm;
    @XmlElement(name = "RgnId")
    protected String rgnId;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "CtyId")
    protected String ctyId;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "PstCdId", required = true)
    protected String pstCdId;
    @XmlElement(name = "POB")
    protected String pob;

    /**
     * Gets the value of the bldgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNm() {
        return bldgNm;
    }

    /**
     * Sets the value of the bldgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setBldgNm(String value) {
        this.bldgNm = value;
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
    public StructuredLongPostalAddress1 setStrtNm(String value) {
        this.strtNm = value;
        return this;
    }

    /**
     * Gets the value of the strtBldgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtBldgId() {
        return strtBldgId;
    }

    /**
     * Sets the value of the strtBldgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setStrtBldgId(String value) {
        this.strtBldgId = value;
        return this;
    }

    /**
     * Gets the value of the flr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlr() {
        return flr;
    }

    /**
     * Sets the value of the flr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setFlr(String value) {
        this.flr = value;
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
    public StructuredLongPostalAddress1 setTwnNm(String value) {
        this.twnNm = value;
        return this;
    }

    /**
     * Gets the value of the dstrctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrctNm() {
        return dstrctNm;
    }

    /**
     * Sets the value of the dstrctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setDstrctNm(String value) {
        this.dstrctNm = value;
        return this;
    }

    /**
     * Gets the value of the rgnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnId() {
        return rgnId;
    }

    /**
     * Sets the value of the rgnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setRgnId(String value) {
        this.rgnId = value;
        return this;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setStat(String value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the ctyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtyId() {
        return ctyId;
    }

    /**
     * Sets the value of the ctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setCtyId(String value) {
        this.ctyId = value;
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
    public StructuredLongPostalAddress1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the pstCdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCdId() {
        return pstCdId;
    }

    /**
     * Sets the value of the pstCdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setPstCdId(String value) {
        this.pstCdId = value;
        return this;
    }

    /**
     * Gets the value of the pob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Sets the value of the pob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredLongPostalAddress1 setPOB(String value) {
        this.pob = value;
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
