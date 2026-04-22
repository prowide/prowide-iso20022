
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
@XmlType(name = "LocalData24", propOrder = {
    "lang",
    "ncodgFrmt",
    "nm",
    "aliasNm",
    "ocptn",
    "adr",
    "shppgAdr",
    "prvtData",
    "ntlData"
})
public class LocalData24 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "NcodgFrmt")
    protected String ncodgFrmt;
    @XmlElement(name = "Nm")
    protected CardholderName2 nm;
    @XmlElement(name = "AliasNm")
    protected String aliasNm;
    @XmlElement(name = "Ocptn")
    protected String ocptn;
    @XmlElement(name = "Adr")
    protected LocalAddress2 adr;
    @XmlElement(name = "ShppgAdr")
    protected List<LocalAddress1> shppgAdr;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public LocalData24 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the ncodgFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodgFrmt() {
        return ncodgFrmt;
    }

    /**
     * Sets the value of the ncodgFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData24 setNcodgFrmt(String value) {
        this.ncodgFrmt = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName2 }
     *     
     */
    public CardholderName2 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName2 }
     *     
     */
    public LocalData24 setNm(CardholderName2 value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the aliasNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNm() {
        return aliasNm;
    }

    /**
     * Sets the value of the aliasNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData24 setAliasNm(String value) {
        this.aliasNm = value;
        return this;
    }

    /**
     * Gets the value of the ocptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcptn() {
        return ocptn;
    }

    /**
     * Sets the value of the ocptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData24 setOcptn(String value) {
        this.ocptn = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link LocalAddress2 }
     *     
     */
    public LocalAddress2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalAddress2 }
     *     
     */
    public LocalData24 setAdr(LocalAddress2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shppgAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShppgAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalAddress1 }
     * 
     * 
     * @return
     *     The value of the shppgAdr property.
     */
    public List<LocalAddress1> getShppgAdr() {
        if (shppgAdr == null) {
            shppgAdr = new ArrayList<>();
        }
        return this.shppgAdr;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the shppgAdr list.
     * @see #getShppgAdr()
     * 
     */
    public LocalData24 addShppgAdr(LocalAddress1 shppgAdr) {
        getShppgAdr().add(shppgAdr);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public LocalData24 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public LocalData24 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
