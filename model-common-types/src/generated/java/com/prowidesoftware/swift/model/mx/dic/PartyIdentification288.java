
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "PartyIdentification288", propOrder = {
    "id",
    "assgnr",
    "shrtNm",
    "lglCorpNm",
    "addtlId",
    "nmAndLctn",
    "adr",
    "addtlAdr",
    "geogcLctn",
    "email",
    "url",
    "phne",
    "cstmrSvc",
    "addtlCtct",
    "taxRegnId",
    "lclData",
    "spnsrdMrchnt",
    "addtlTxRefNb",
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
public class PartyIdentification288 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalData1> addtlId;
    @XmlElement(name = "NmAndLctn", required = true)
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "AddtlAdr")
    protected String addtlAdr;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtct")
    protected String addtlCtct;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "LclData")
    protected List<LocalData11> lclData;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<SponsoredMerchant3> spnsrdMrchnt;
    @XmlElement(name = "AddtlTxRefNb")
    protected String addtlTxRefNb;
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
    public PartyIdentification288 setId(String value) {
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
    public PartyIdentification288 setAssgnr(String value) {
        this.assgnr = value;
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
    public PartyIdentification288 setShrtNm(String value) {
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
    public PartyIdentification288 setLglCorpNm(String value) {
        this.lglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<AdditionalData1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
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
    public PartyIdentification288 setNmAndLctn(String value) {
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
    public PartyIdentification288 setAdr(Address2 value) {
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
    public PartyIdentification288 setAddtlAdr(String value) {
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
    public PartyIdentification288 setGeogcLctn(String value) {
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
    public PartyIdentification288 setEmail(String value) {
        this.email = value;
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
    public PartyIdentification288 setURL(String value) {
        this.url = value;
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
    public PartyIdentification288 setPhne(String value) {
        this.phne = value;
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
    public PartyIdentification288 setCstmrSvc(String value) {
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
    public PartyIdentification288 setAddtlCtct(String value) {
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
    public PartyIdentification288 setTaxRegnId(String value) {
        this.taxRegnId = value;
        return this;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData11 }
     * 
     * 
     * @return
     *     The value of the lclData property.
     */
    public List<LocalData11> getLclData() {
        if (lclData == null) {
            lclData = new ArrayList<>();
        }
        return this.lclData;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SponsoredMerchant3 }
     * 
     * 
     * @return
     *     The value of the spnsrdMrchnt property.
     */
    public List<SponsoredMerchant3> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Gets the value of the addtlTxRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxRefNb() {
        return addtlTxRefNb;
    }

    /**
     * Sets the value of the addtlTxRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification288 setAddtlTxRefNb(String value) {
        this.addtlTxRefNb = value;
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
    public PartyIdentification288 setCorpTaxId(String value) {
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
    public PartyIdentification288 setCorpTaxIdTp(CorporateTaxType1Code value) {
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
    public PartyIdentification288 setBizTp(String value) {
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
    public PartyIdentification288 setBizTpPrvddBy(String value) {
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
    public PartyIdentification288 setOwnrTp(String value) {
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
    public PartyIdentification288 setOwnrTpPrvddBy(String value) {
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
    public PartyIdentification288 setCertfctnTp(String value) {
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
    public PartyIdentification288 setCertfctnTpPrvddBy(String value) {
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
    public PartyIdentification288 setOwnrEthnctyTp(String value) {
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
    public PartyIdentification288 setOwnrEthnctyTpPrvddBy(String value) {
        this.ownrEthnctyTpPrvddBy = value;
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public PartyIdentification288 addAddtlId(AdditionalData1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

    /**
     * Adds a new item to the lclData list.
     * @see #getLclData()
     * 
     */
    public PartyIdentification288 addLclData(LocalData11 lclData) {
        getLclData().add(lclData);
        return this;
    }

    /**
     * Adds a new item to the spnsrdMrchnt list.
     * @see #getSpnsrdMrchnt()
     * 
     */
    public PartyIdentification288 addSpnsrdMrchnt(SponsoredMerchant3 spnsrdMrchnt) {
        getSpnsrdMrchnt().add(spnsrdMrchnt);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public PartyIdentification288 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
