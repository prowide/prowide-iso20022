
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on a trading venue as per ISO 10383.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification92", propOrder = {
    "oprg",
    "sgmt",
    "tp",
    "ctgy",
    "instnNm",
    "acrnm",
    "city",
    "ctry",
    "authrtyNm",
    "webSite",
    "note",
    "mod",
    "creDt",
    "vldtyPrd",
    "stsDt",
    "lastUpdtdDt"
})
public class MarketIdentification92 {

    @XmlElement(name = "Oprg", required = true)
    protected String oprg;
    @XmlElement(name = "Sgmt", required = true)
    protected String sgmt;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MarketIdentification1Code tp;
    @XmlElement(name = "Ctgy")
    @XmlSchemaType(name = "string")
    protected TradingVenue1Code ctgy;
    @XmlElement(name = "InstnNm", required = true)
    protected String instnNm;
    @XmlElement(name = "Acrnm")
    protected String acrnm;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Ctry", required = true)
    protected CountryCodeAndName3 ctry;
    @XmlElement(name = "AuthrtyNm")
    protected String authrtyNm;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Mod")
    @XmlSchemaType(name = "string")
    protected Modification1Code mod;
    @XmlElement(name = "CreDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "VldtyPrd", required = true)
    protected Period4Choice vldtyPrd;
    @XmlElement(name = "StsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "LastUpdtdDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdtdDt;

    /**
     * Gets the value of the oprg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprg() {
        return oprg;
    }

    /**
     * Sets the value of the oprg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setOprg(String value) {
        this.oprg = value;
        return this;
    }

    /**
     * Gets the value of the sgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgmt() {
        return sgmt;
    }

    /**
     * Sets the value of the sgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setSgmt(String value) {
        this.sgmt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1Code }
     *     
     */
    public MarketIdentification1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1Code }
     *     
     */
    public MarketIdentification92 setTp(MarketIdentification1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenue1Code }
     *     
     */
    public TradingVenue1Code getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenue1Code }
     *     
     */
    public MarketIdentification92 setCtgy(TradingVenue1Code value) {
        this.ctgy = value;
        return this;
    }

    /**
     * Gets the value of the instnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstnNm() {
        return instnNm;
    }

    /**
     * Sets the value of the instnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setInstnNm(String value) {
        this.instnNm = value;
        return this;
    }

    /**
     * Gets the value of the acrnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrnm() {
        return acrnm;
    }

    /**
     * Sets the value of the acrnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setAcrnm(String value) {
        this.acrnm = value;
        return this;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setCity(String value) {
        this.city = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public CountryCodeAndName3 getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public MarketIdentification92 setCtry(CountryCodeAndName3 value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the authrtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyNm() {
        return authrtyNm;
    }

    /**
     * Sets the value of the authrtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setAuthrtyNm(String value) {
        this.authrtyNm = value;
        return this;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setWebSite(String value) {
        this.webSite = value;
        return this;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification92 setNote(String value) {
        this.note = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public MarketIdentification92 setMod(Modification1Code value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the creDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Sets the value of the creDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MarketIdentification92 setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public MarketIdentification92 setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MarketIdentification92 setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the lastUpdtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdtdDt() {
        return lastUpdtdDt;
    }

    /**
     * Sets the value of the lastUpdtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MarketIdentification92 setLastUpdtdDt(XMLGregorianCalendar value) {
        this.lastUpdtdDt = value;
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
