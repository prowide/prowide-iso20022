
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device2", propOrder = {
    "manfctr",
    "manfctrMdlId",
    "tp",
    "othrTp",
    "lang",
    "phneNb",
    "geogcLctn",
    "lctnCtryCd",
    "ipAdr",
    "email",
    "dvcNm",
    "dvcNmNrmlzd"
})
public class Device2 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "ManfctrMdlId")
    protected String manfctrMdlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerDeviceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "LctnCtryCd")
    protected String lctnCtryCd;
    @XmlElement(name = "IPAdr")
    protected String ipAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "DvcNm")
    protected String dvcNm;
    @XmlElement(name = "DvcNmNrmlzd")
    protected String dvcNmNrmlzd;

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setManfctr(String value) {
        this.manfctr = value;
        return this;
    }

    /**
     * Gets the value of the manfctrMdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrMdlId() {
        return manfctrMdlId;
    }

    /**
     * Sets the value of the manfctrMdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setManfctrMdlId(String value) {
        this.manfctrMdlId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public CustomerDeviceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public Device2 setTp(CustomerDeviceType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setPhneNb(String value) {
        this.phneNb = value;
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
    public Device2 setGeogcLctn(String value) {
        this.geogcLctn = value;
        return this;
    }

    /**
     * Gets the value of the lctnCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCtryCd() {
        return lctnCtryCd;
    }

    /**
     * Sets the value of the lctnCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setLctnCtryCd(String value) {
        this.lctnCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the ipAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdr() {
        return ipAdr;
    }

    /**
     * Sets the value of the ipAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setIPAdr(String value) {
        this.ipAdr = value;
        return this;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setEmail(String value) {
        this.email = value;
        return this;
    }

    /**
     * Gets the value of the dvcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNm() {
        return dvcNm;
    }

    /**
     * Sets the value of the dvcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setDvcNm(String value) {
        this.dvcNm = value;
        return this;
    }

    /**
     * Gets the value of the dvcNmNrmlzd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNmNrmlzd() {
        return dvcNmNrmlzd;
    }

    /**
     * Sets the value of the dvcNmNrmlzd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device2 setDvcNmNrmlzd(String value) {
        this.dvcNmNrmlzd = value;
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
