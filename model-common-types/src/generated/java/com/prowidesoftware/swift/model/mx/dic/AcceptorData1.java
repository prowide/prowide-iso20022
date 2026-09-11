
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
 * Information related the acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorData1", propOrder = {
    "id",
    "schmeAssgndId",
    "bizNm",
    "lglCorpNm",
    "nmAndLctn",
    "adr",
    "addtlAdr",
    "email",
    "url",
    "phne",
    "cstmrSvc",
    "addtlCtct",
    "bizRegnId",
    "bizRegnIdTp",
    "svcLctn",
    "lclData",
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
    "prtnrId",
    "prvtData",
    "ntlData"
})
public class AcceptorData1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SchmeAssgndId")
    protected String schmeAssgndId;
    @XmlElement(name = "BizNm")
    protected String bizNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "NmAndLctn", required = true)
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address4 adr;
    @XmlElement(name = "AddtlAdr")
    protected String addtlAdr;
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
    @XmlElement(name = "BizRegnId")
    protected String bizRegnId;
    @XmlElement(name = "BizRegnIdTp")
    protected String bizRegnIdTp;
    @XmlElement(name = "SvcLctn")
    protected Address4 svcLctn;
    @XmlElement(name = "LclData")
    protected List<LocalData19> lclData;
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
    @XmlElement(name = "PrtnrId")
    protected String prtnrId;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public AcceptorData1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the schmeAssgndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeAssgndId() {
        return schmeAssgndId;
    }

    /**
     * Sets the value of the schmeAssgndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData1 setSchmeAssgndId(String value) {
        this.schmeAssgndId = value;
        return this;
    }

    /**
     * Gets the value of the bizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizNm() {
        return bizNm;
    }

    /**
     * Sets the value of the bizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData1 setBizNm(String value) {
        this.bizNm = value;
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
    public AcceptorData1 setLglCorpNm(String value) {
        this.lglCorpNm = value;
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
    public AcceptorData1 setNmAndLctn(String value) {
        this.nmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public AcceptorData1 setAdr(Address4 value) {
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
    public AcceptorData1 setAddtlAdr(String value) {
        this.addtlAdr = value;
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
    public AcceptorData1 setEmail(String value) {
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
    public AcceptorData1 setURL(String value) {
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
    public AcceptorData1 setPhne(String value) {
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
    public AcceptorData1 setCstmrSvc(String value) {
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
    public AcceptorData1 setAddtlCtct(String value) {
        this.addtlCtct = value;
        return this;
    }

    /**
     * Gets the value of the bizRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegnId() {
        return bizRegnId;
    }

    /**
     * Sets the value of the bizRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData1 setBizRegnId(String value) {
        this.bizRegnId = value;
        return this;
    }

    /**
     * Gets the value of the bizRegnIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegnIdTp() {
        return bizRegnIdTp;
    }

    /**
     * Sets the value of the bizRegnIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData1 setBizRegnIdTp(String value) {
        this.bizRegnIdTp = value;
        return this;
    }

    /**
     * Gets the value of the svcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getSvcLctn() {
        return svcLctn;
    }

    /**
     * Sets the value of the svcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public AcceptorData1 setSvcLctn(Address4 value) {
        this.svcLctn = value;
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
     * {@link LocalData19 }
     * 
     * 
     * @return
     *     The value of the lclData property.
     */
    public List<LocalData19> getLclData() {
        if (lclData == null) {
            lclData = new ArrayList<>();
        }
        return this.lclData;
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
    public AcceptorData1 setAddtlTxRefNb(String value) {
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
    public AcceptorData1 setCorpTaxId(String value) {
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
    public AcceptorData1 setCorpTaxIdTp(CorporateTaxType1Code value) {
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
    public AcceptorData1 setBizTp(String value) {
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
    public AcceptorData1 setBizTpPrvddBy(String value) {
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
    public AcceptorData1 setOwnrTp(String value) {
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
    public AcceptorData1 setOwnrTpPrvddBy(String value) {
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
    public AcceptorData1 setCertfctnTp(String value) {
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
    public AcceptorData1 setCertfctnTpPrvddBy(String value) {
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
    public AcceptorData1 setOwnrEthnctyTp(String value) {
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
    public AcceptorData1 setOwnrEthnctyTpPrvddBy(String value) {
        this.ownrEthnctyTpPrvddBy = value;
        return this;
    }

    /**
     * Gets the value of the prtnrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtnrId() {
        return prtnrId;
    }

    /**
     * Sets the value of the prtnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData1 setPrtnrId(String value) {
        this.prtnrId = value;
        return this;
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
     * Adds a new item to the lclData list.
     * @see #getLclData()
     * 
     */
    public AcceptorData1 addLclData(LocalData19 lclData) {
        getLclData().add(lclData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public AcceptorData1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public AcceptorData1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
