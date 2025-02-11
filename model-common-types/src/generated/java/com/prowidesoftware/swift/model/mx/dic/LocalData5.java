
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains text fields in the local language.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalData5", propOrder = {
    "lang",
    "cmonNm",
    "lglCorpNm",
    "adr",
    "addtlAdrInf",
    "addtlData"
})
public class LocalData5 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "CmonNm")
    protected String cmonNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "Adr")
    protected Address3 adr;
    @XmlElement(name = "AddtlAdrInf")
    protected String addtlAdrInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public LocalData5 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the cmonNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Sets the value of the cmonNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData5 setCmonNm(String value) {
        this.cmonNm = value;
        return this;
    }

    /**
     * Gets the value of the lglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglCorpNm() {
        return lglCorpNm;
    }

    /**
     * Sets the value of the lglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData5 setLglCorpNm(String value) {
        this.lglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address3 }
     *     
     */
    public Address3 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address3 }
     *     
     */
    public LocalData5 setAdr(Address3 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the addtlAdrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlAdrInf() {
        return addtlAdrInf;
    }

    /**
     * Sets the value of the addtlAdrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData5 setAddtlAdrInf(String value) {
        this.addtlAdrInf = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public LocalData5 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
