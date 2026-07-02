
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
 * Details of a contact person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPersonal1", propOrder = {
    "nm",
    "gvnNm",
    "mddlNm",
    "lastNm",
    "homePhne",
    "bizPhne",
    "mobPhne",
    "othrPhne",
    "prsnlEmail",
    "bizEmail",
    "othrEmail",
    "homeFax",
    "bizFax",
    "url",
    "lang"
})
public class ContactPersonal1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "LastNm")
    protected String lastNm;
    @XmlElement(name = "HomePhne")
    protected String homePhne;
    @XmlElement(name = "BizPhne")
    protected String bizPhne;
    @XmlElement(name = "MobPhne")
    protected String mobPhne;
    @XmlElement(name = "OthrPhne")
    protected String othrPhne;
    @XmlElement(name = "PrsnlEmail")
    protected String prsnlEmail;
    @XmlElement(name = "BizEmail")
    protected String bizEmail;
    @XmlElement(name = "OthrEmail")
    protected String othrEmail;
    @XmlElement(name = "HomeFax")
    protected String homeFax;
    @XmlElement(name = "BizFax")
    protected String bizFax;
    @XmlElement(name = "URL")
    protected String url;
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
    public ContactPersonal1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setMddlNm(String value) {
        this.mddlNm = value;
        return this;
    }

    /**
     * Gets the value of the lastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Sets the value of the lastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setLastNm(String value) {
        this.lastNm = value;
        return this;
    }

    /**
     * Gets the value of the homePhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhne() {
        return homePhne;
    }

    /**
     * Sets the value of the homePhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setHomePhne(String value) {
        this.homePhne = value;
        return this;
    }

    /**
     * Gets the value of the bizPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPhne() {
        return bizPhne;
    }

    /**
     * Sets the value of the bizPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setBizPhne(String value) {
        this.bizPhne = value;
        return this;
    }

    /**
     * Gets the value of the mobPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobPhne() {
        return mobPhne;
    }

    /**
     * Sets the value of the mobPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setMobPhne(String value) {
        this.mobPhne = value;
        return this;
    }

    /**
     * Gets the value of the othrPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPhne() {
        return othrPhne;
    }

    /**
     * Sets the value of the othrPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setOthrPhne(String value) {
        this.othrPhne = value;
        return this;
    }

    /**
     * Gets the value of the prsnlEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlEmail() {
        return prsnlEmail;
    }

    /**
     * Sets the value of the prsnlEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setPrsnlEmail(String value) {
        this.prsnlEmail = value;
        return this;
    }

    /**
     * Gets the value of the bizEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizEmail() {
        return bizEmail;
    }

    /**
     * Sets the value of the bizEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setBizEmail(String value) {
        this.bizEmail = value;
        return this;
    }

    /**
     * Gets the value of the othrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEmail() {
        return othrEmail;
    }

    /**
     * Sets the value of the othrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setOthrEmail(String value) {
        this.othrEmail = value;
        return this;
    }

    /**
     * Gets the value of the homeFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeFax() {
        return homeFax;
    }

    /**
     * Sets the value of the homeFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setHomeFax(String value) {
        this.homeFax = value;
        return this;
    }

    /**
     * Gets the value of the bizFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFax() {
        return bizFax;
    }

    /**
     * Sets the value of the bizFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setBizFax(String value) {
        this.bizFax = value;
        return this;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactPersonal1 setURL(String value) {
        this.url = value;
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
    public ContactPersonal1 setLang(String value) {
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
