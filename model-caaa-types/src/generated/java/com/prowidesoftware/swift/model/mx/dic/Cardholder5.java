
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder5", propOrder = {
    "id",
    "nm",
    "lang",
    "bllgAdr",
    "shppgAdr",
    "authntcn",
    "adrVrfctn",
    "prsnlData"
})
public class Cardholder5 {

    @XmlElement(name = "Id")
    protected PersonIdentification7 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress13 bllgAdr;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress13 shppgAdr;
    @XmlElement(name = "Authntcn")
    protected List<CardholderAuthentication5> authntcn;
    @XmlElement(name = "AdrVrfctn")
    protected AddressVerification1 adrVrfctn;
    @XmlElement(name = "PrsnlData")
    protected String prsnlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification7 }
     *     
     */
    public PersonIdentification7 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification7 }
     *     
     */
    public Cardholder5 setId(PersonIdentification7 value) {
        this.id = value;
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
    public Cardholder5 setNm(String value) {
        this.nm = value;
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
    public Cardholder5 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress13 }
     *     
     */
    public PostalAddress13 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress13 }
     *     
     */
    public Cardholder5 setBllgAdr(PostalAddress13 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress13 }
     *     
     */
    public PostalAddress13 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Sets the value of the shppgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress13 }
     *     
     */
    public Cardholder5 setShppgAdr(PostalAddress13 value) {
        this.shppgAdr = value;
        return this;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAuthentication5 }
     * 
     * 
     */
    public List<CardholderAuthentication5> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<CardholderAuthentication5>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the adrVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerification1 }
     *     
     */
    public AddressVerification1 getAdrVrfctn() {
        return adrVrfctn;
    }

    /**
     * Sets the value of the adrVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerification1 }
     *     
     */
    public Cardholder5 setAdrVrfctn(AddressVerification1 value) {
        this.adrVrfctn = value;
        return this;
    }

    /**
     * Gets the value of the prsnlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlData() {
        return prsnlData;
    }

    /**
     * Sets the value of the prsnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder5 setPrsnlData(String value) {
        this.prsnlData = value;
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

    /**
     * Adds a new item to the authntcn list.
     * @see #getAuthntcn()
     * 
     */
    public Cardholder5 addAuthntcn(CardholderAuthentication5 authntcn) {
        getAuthntcn().add(authntcn);
        return this;
    }

}
