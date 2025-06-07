
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification284", propOrder = {
    "id",
    "assgnr",
    "ctry",
    "shrtNm",
    "lglCorpNm",
    "addtlId",
    "nmAndLctn",
    "adr",
    "addtlAdr",
    "geogcLctn",
    "email",
    "urlAdr",
    "phneNb",
    "cstmrSvc",
    "addtlCtct",
    "taxRegnId",
    "lclData",
    "corpTaxId",
    "corpTaxIdTp",
    "bizTp",
    "bizTpPrvddBy",
    "ownrTp",
    "ownrTpPrvddBy",
    "certfctnTp",
    "certfctnTpPrvddBy",
    "ownrEthnctyTp",
    "ownrEthnctyTpPrvddBy",
    "addtlData"
})
public class PartyIdentification284 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "AddtlId")
    protected AdditionalData1 addtlId;
    @XmlElement(name = "NmAndLctn")
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "AddtlAdr")
    protected String addtlAdr;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtct")
    protected String addtlCtct;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "LclData")
    protected LocalData11 lclData;
    @XmlElement(name = "CorpTaxId")
    protected String corpTaxId;
    @XmlElement(name = "CorpTaxIdTp")
    @XmlSchemaType(name = "string")
    protected CorporateTaxType1Code corpTaxIdTp;
    @XmlElement(name = "BizTp")
    protected String bizTp;
    @XmlElement(name = "BizTpPrvddBy")
    protected String bizTpPrvddBy;
    @XmlElement(name = "OwnrTp")
    protected String ownrTp;
    @XmlElement(name = "OwnrTpPrvddBy")
    protected String ownrTpPrvddBy;
    @XmlElement(name = "CertfctnTp")
    protected String certfctnTp;
    @XmlElement(name = "CertfctnTpPrvddBy")
    protected String certfctnTpPrvddBy;
    @XmlElement(name = "OwnrEthnctyTp")
    protected String ownrEthnctyTp;
    @XmlElement(name = "OwnrEthnctyTpPrvddBy")
    protected String ownrEthnctyTpPrvddBy;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setAssgnr(String value) {
        this.assgnr = value;
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
    public PartyIdentification284 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setShrtNm(String value) {
        this.shrtNm = value;
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
    public PartyIdentification284 setLglCorpNm(String value) {
        this.lglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public PartyIdentification284 setAddtlId(AdditionalData1 value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the nmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Sets the value of the nmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setNmAndLctn(String value) {
        this.nmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public PartyIdentification284 setAdr(Address2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the addtlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlAdr() {
        return addtlAdr;
    }

    /**
     * Sets the value of the addtlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setAddtlAdr(String value) {
        this.addtlAdr = value;
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
    public PartyIdentification284 setGeogcLctn(String value) {
        this.geogcLctn = value;
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
    public PartyIdentification284 setEmail(String value) {
        this.email = value;
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
    public PartyIdentification284 setURLAdr(String value) {
        this.urlAdr = value;
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
    public PartyIdentification284 setPhneNb(String value) {
        this.phneNb = value;
        return this;
    }

    /**
     * Gets the value of the cstmrSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSvc() {
        return cstmrSvc;
    }

    /**
     * Sets the value of the cstmrSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setCstmrSvc(String value) {
        this.cstmrSvc = value;
        return this;
    }

    /**
     * Gets the value of the addtlCtct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCtct() {
        return addtlCtct;
    }

    /**
     * Sets the value of the addtlCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setAddtlCtct(String value) {
        this.addtlCtct = value;
        return this;
    }

    /**
     * Gets the value of the taxRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnId() {
        return taxRegnId;
    }

    /**
     * Sets the value of the taxRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setTaxRegnId(String value) {
        this.taxRegnId = value;
        return this;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData11 }
     *     
     */
    public LocalData11 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData11 }
     *     
     */
    public PartyIdentification284 setLclData(LocalData11 value) {
        this.lclData = value;
        return this;
    }

    /**
     * Gets the value of the corpTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpTaxId() {
        return corpTaxId;
    }

    /**
     * Sets the value of the corpTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setCorpTaxId(String value) {
        this.corpTaxId = value;
        return this;
    }

    /**
     * Gets the value of the corpTaxIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public CorporateTaxType1Code getCorpTaxIdTp() {
        return corpTaxIdTp;
    }

    /**
     * Sets the value of the corpTaxIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public PartyIdentification284 setCorpTaxIdTp(CorporateTaxType1Code value) {
        this.corpTaxIdTp = value;
        return this;
    }

    /**
     * Gets the value of the bizTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizTp() {
        return bizTp;
    }

    /**
     * Sets the value of the bizTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setBizTp(String value) {
        this.bizTp = value;
        return this;
    }

    /**
     * Gets the value of the bizTpPrvddBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizTpPrvddBy() {
        return bizTpPrvddBy;
    }

    /**
     * Sets the value of the bizTpPrvddBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setBizTpPrvddBy(String value) {
        this.bizTpPrvddBy = value;
        return this;
    }

    /**
     * Gets the value of the ownrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrTp() {
        return ownrTp;
    }

    /**
     * Sets the value of the ownrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setOwnrTp(String value) {
        this.ownrTp = value;
        return this;
    }

    /**
     * Gets the value of the ownrTpPrvddBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrTpPrvddBy() {
        return ownrTpPrvddBy;
    }

    /**
     * Sets the value of the ownrTpPrvddBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setOwnrTpPrvddBy(String value) {
        this.ownrTpPrvddBy = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setCertfctnTp(String value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTpPrvddBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnTpPrvddBy() {
        return certfctnTpPrvddBy;
    }

    /**
     * Sets the value of the certfctnTpPrvddBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setCertfctnTpPrvddBy(String value) {
        this.certfctnTpPrvddBy = value;
        return this;
    }

    /**
     * Gets the value of the ownrEthnctyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrEthnctyTp() {
        return ownrEthnctyTp;
    }

    /**
     * Sets the value of the ownrEthnctyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setOwnrEthnctyTp(String value) {
        this.ownrEthnctyTp = value;
        return this;
    }

    /**
     * Gets the value of the ownrEthnctyTpPrvddBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrEthnctyTpPrvddBy() {
        return ownrEthnctyTpPrvddBy;
    }

    /**
     * Sets the value of the ownrEthnctyTpPrvddBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification284 setOwnrEthnctyTpPrvddBy(String value) {
        this.ownrEthnctyTpPrvddBy = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
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
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
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
    public PartyIdentification284 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
