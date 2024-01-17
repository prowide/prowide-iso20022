
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
 * Details of a contact person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact2", propOrder = {
    "nm",
    "homePhneNb",
    "bizPhneNb",
    "mobPhneNb",
    "othrPhneNb",
    "prsnlEmailAdr",
    "bizEmailAdr",
    "othrEmailAdr",
    "homeFaxNb",
    "bizFaxNb",
    "urlAdr",
    "lang"
})
public class Contact2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "HomePhneNb")
    protected String homePhneNb;
    @XmlElement(name = "BizPhneNb")
    protected String bizPhneNb;
    @XmlElement(name = "MobPhneNb")
    protected String mobPhneNb;
    @XmlElement(name = "OthrPhneNb")
    protected String othrPhneNb;
    @XmlElement(name = "PrsnlEmailAdr")
    protected String prsnlEmailAdr;
    @XmlElement(name = "BizEmailAdr")
    protected String bizEmailAdr;
    @XmlElement(name = "OthrEmailAdr")
    protected String othrEmailAdr;
    @XmlElement(name = "HomeFaxNb")
    protected String homeFaxNb;
    @XmlElement(name = "BizFaxNb")
    protected String bizFaxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Lang")
    protected String lang;

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
    public Contact2 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the homePhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhneNb() {
        return homePhneNb;
    }

    /**
     * Sets the value of the homePhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setHomePhneNb(String value) {
        this.homePhneNb = value;
        return this;
    }

    /**
     * Gets the value of the bizPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPhneNb() {
        return bizPhneNb;
    }

    /**
     * Sets the value of the bizPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setBizPhneNb(String value) {
        this.bizPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the mobPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobPhneNb() {
        return mobPhneNb;
    }

    /**
     * Sets the value of the mobPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setMobPhneNb(String value) {
        this.mobPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the othrPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPhneNb() {
        return othrPhneNb;
    }

    /**
     * Sets the value of the othrPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setOthrPhneNb(String value) {
        this.othrPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the prsnlEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlEmailAdr() {
        return prsnlEmailAdr;
    }

    /**
     * Sets the value of the prsnlEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setPrsnlEmailAdr(String value) {
        this.prsnlEmailAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizEmailAdr() {
        return bizEmailAdr;
    }

    /**
     * Sets the value of the bizEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setBizEmailAdr(String value) {
        this.bizEmailAdr = value;
        return this;
    }

    /**
     * Gets the value of the othrEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEmailAdr() {
        return othrEmailAdr;
    }

    /**
     * Sets the value of the othrEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setOthrEmailAdr(String value) {
        this.othrEmailAdr = value;
        return this;
    }

    /**
     * Gets the value of the homeFaxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeFaxNb() {
        return homeFaxNb;
    }

    /**
     * Sets the value of the homeFaxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setHomeFaxNb(String value) {
        this.homeFaxNb = value;
        return this;
    }

    /**
     * Gets the value of the bizFaxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFaxNb() {
        return bizFaxNb;
    }

    /**
     * Sets the value of the bizFaxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setBizFaxNb(String value) {
        this.bizFaxNb = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact2 setURLAdr(String value) {
        this.urlAdr = value;
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
    public Contact2 setLang(String value) {
        this.lang = value;
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
