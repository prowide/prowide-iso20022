
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
 * Contact details of a business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactBusiness1", propOrder = {
    "nm",
    "gvnNm",
    "mddlNm",
    "lastNm",
    "phne",
    "prprtyPhne",
    "tollFreePhne",
    "email",
    "fax",
    "url",
    "lang"
})
public class ContactBusiness1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "LastNm")
    protected String lastNm;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "PrprtyPhne")
    protected String prprtyPhne;
    @XmlElement(name = "TollFreePhne")
    protected String tollFreePhne;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Fax")
    protected String fax;
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
    public ContactBusiness1 setNm(String value) {
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
    public ContactBusiness1 setGvnNm(String value) {
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
    public ContactBusiness1 setMddlNm(String value) {
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
    public ContactBusiness1 setLastNm(String value) {
        this.lastNm = value;
        return this;
    }

    /**
     * Gets the value of the phne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhne() {
        return phne;
    }

    /**
     * Sets the value of the phne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactBusiness1 setPhne(String value) {
        this.phne = value;
        return this;
    }

    /**
     * Gets the value of the prprtyPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyPhne() {
        return prprtyPhne;
    }

    /**
     * Sets the value of the prprtyPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactBusiness1 setPrprtyPhne(String value) {
        this.prprtyPhne = value;
        return this;
    }

    /**
     * Gets the value of the tollFreePhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreePhne() {
        return tollFreePhne;
    }

    /**
     * Sets the value of the tollFreePhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactBusiness1 setTollFreePhne(String value) {
        this.tollFreePhne = value;
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
    public ContactBusiness1 setEmail(String value) {
        this.email = value;
        return this;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactBusiness1 setFax(String value) {
        this.fax = value;
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
    public ContactBusiness1 setURL(String value) {
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
    public ContactBusiness1 setLang(String value) {
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
