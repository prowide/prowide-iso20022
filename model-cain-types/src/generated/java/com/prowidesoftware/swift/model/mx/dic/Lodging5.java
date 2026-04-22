
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Lodging provides summary information about lodging accommodations and related expenses for the cardholder. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lodging5", propOrder = {
    "folioNb",
    "prprtyTp",
    "prstgsPrprty",
    "prprtyNm",
    "prprtyId",
    "prprtyBizNm",
    "prprtyLglCorpNm",
    "prprtyAdr",
    "prprtyLctnCd",
    "prprtyLclTmZone",
    "prprtyLclData",
    "prprtyLclCcy",
    "prprtyCtct",
    "prprtyFireSftyAct",
    "cstmr",
    "nbOfRooms",
    "room",
    "drtn",
    "arrvl",
    "dprture",
    "noShow",
    "insrnc",
    "insrncAmt",
    "ttlTax",
    "ttlAmt",
    "authrsdAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "prvtData",
    "ntlData",
    "lineItm"
})
public class Lodging5 {

    @XmlElement(name = "FolioNb")
    protected String folioNb;
    @XmlElement(name = "PrprtyTp")
    @XmlSchemaType(name = "string")
    protected LodgingActivity2Code prprtyTp;
    @XmlElement(name = "PrstgsPrprty")
    protected String prstgsPrprty;
    @XmlElement(name = "PrprtyNm")
    protected String prprtyNm;
    @XmlElement(name = "PrprtyId")
    protected String prprtyId;
    @XmlElement(name = "PrprtyBizNm")
    protected String prprtyBizNm;
    @XmlElement(name = "PrprtyLglCorpNm")
    protected String prprtyLglCorpNm;
    @XmlElement(name = "PrprtyAdr")
    protected Address4 prprtyAdr;
    @XmlElement(name = "PrprtyLctnCd")
    protected String prprtyLctnCd;
    @XmlElement(name = "PrprtyLclTmZone")
    protected String prprtyLclTmZone;
    @XmlElement(name = "PrprtyLclData")
    protected List<LocalData20> prprtyLclData;
    @XmlElement(name = "PrprtyLclCcy")
    protected String prprtyLclCcy;
    @XmlElement(name = "PrprtyCtct")
    protected ContactBusiness1 prprtyCtct;
    @XmlElement(name = "PrprtyFireSftyAct")
    protected Boolean prprtyFireSftyAct;
    @XmlElement(name = "Cstmr")
    protected List<Customer10> cstmr;
    @XmlElement(name = "NbOfRooms")
    protected String nbOfRooms;
    @XmlElement(name = "Room")
    protected List<LodgingRoom2> room;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "Arrvl")
    protected DepartureOrArrival2 arrvl;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "NoShow")
    protected Boolean noShow;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "TtlTax")
    protected List<Tax44> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected List<AuthorisedAmount2> authrsdAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme4> lltyPrgrmm;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;
    @XmlElement(name = "LineItm")
    protected List<LodgingLineItem4> lineItm;

    /**
     * Gets the value of the folioNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNb() {
        return folioNb;
    }

    /**
     * Sets the value of the folioNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setFolioNb(String value) {
        this.folioNb = value;
        return this;
    }

    /**
     * Gets the value of the prprtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingActivity2Code }
     *     
     */
    public LodgingActivity2Code getPrprtyTp() {
        return prprtyTp;
    }

    /**
     * Sets the value of the prprtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingActivity2Code }
     *     
     */
    public Lodging5 setPrprtyTp(LodgingActivity2Code value) {
        this.prprtyTp = value;
        return this;
    }

    /**
     * Gets the value of the prstgsPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrstgsPrprty() {
        return prstgsPrprty;
    }

    /**
     * Sets the value of the prstgsPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrstgsPrprty(String value) {
        this.prstgsPrprty = value;
        return this;
    }

    /**
     * Gets the value of the prprtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyNm() {
        return prprtyNm;
    }

    /**
     * Sets the value of the prprtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyNm(String value) {
        this.prprtyNm = value;
        return this;
    }

    /**
     * Gets the value of the prprtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyId() {
        return prprtyId;
    }

    /**
     * Sets the value of the prprtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyId(String value) {
        this.prprtyId = value;
        return this;
    }

    /**
     * Gets the value of the prprtyBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyBizNm() {
        return prprtyBizNm;
    }

    /**
     * Sets the value of the prprtyBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyBizNm(String value) {
        this.prprtyBizNm = value;
        return this;
    }

    /**
     * Gets the value of the prprtyLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyLglCorpNm() {
        return prprtyLglCorpNm;
    }

    /**
     * Sets the value of the prprtyLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyLglCorpNm(String value) {
        this.prprtyLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the prprtyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getPrprtyAdr() {
        return prprtyAdr;
    }

    /**
     * Sets the value of the prprtyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public Lodging5 setPrprtyAdr(Address4 value) {
        this.prprtyAdr = value;
        return this;
    }

    /**
     * Gets the value of the prprtyLctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyLctnCd() {
        return prprtyLctnCd;
    }

    /**
     * Sets the value of the prprtyLctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyLctnCd(String value) {
        this.prprtyLctnCd = value;
        return this;
    }

    /**
     * Gets the value of the prprtyLclTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyLclTmZone() {
        return prprtyLclTmZone;
    }

    /**
     * Sets the value of the prprtyLclTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyLclTmZone(String value) {
        this.prprtyLclTmZone = value;
        return this;
    }

    /**
     * Gets the value of the prprtyLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prprtyLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrprtyLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the prprtyLclData property.
     */
    public List<LocalData20> getPrprtyLclData() {
        if (prprtyLclData == null) {
            prprtyLclData = new ArrayList<>();
        }
        return this.prprtyLclData;
    }

    /**
     * Gets the value of the prprtyLclCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyLclCcy() {
        return prprtyLclCcy;
    }

    /**
     * Sets the value of the prprtyLclCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setPrprtyLclCcy(String value) {
        this.prprtyLclCcy = value;
        return this;
    }

    /**
     * Gets the value of the prprtyCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getPrprtyCtct() {
        return prprtyCtct;
    }

    /**
     * Sets the value of the prprtyCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public Lodging5 setPrprtyCtct(ContactBusiness1 value) {
        this.prprtyCtct = value;
        return this;
    }

    /**
     * Gets the value of the prprtyFireSftyAct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrprtyFireSftyAct() {
        return prprtyFireSftyAct;
    }

    /**
     * Sets the value of the prprtyFireSftyAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Lodging5 setPrprtyFireSftyAct(Boolean value) {
        this.prprtyFireSftyAct = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer10 }
     * 
     * 
     * @return
     *     The value of the cstmr property.
     */
    public List<Customer10> getCstmr() {
        if (cstmr == null) {
            cstmr = new ArrayList<>();
        }
        return this.cstmr;
    }

    /**
     * Gets the value of the nbOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfRooms() {
        return nbOfRooms;
    }

    /**
     * Sets the value of the nbOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setNbOfRooms(String value) {
        this.nbOfRooms = value;
        return this;
    }

    /**
     * Gets the value of the room property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the room property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LodgingRoom2 }
     * 
     * 
     * @return
     *     The value of the room property.
     */
    public List<LodgingRoom2> getRoom() {
        if (room == null) {
            room = new ArrayList<>();
        }
        return this.room;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the arrvl property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival2 }
     *     
     */
    public DepartureOrArrival2 getArrvl() {
        return arrvl;
    }

    /**
     * Sets the value of the arrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival2 }
     *     
     */
    public Lodging5 setArrvl(DepartureOrArrival2 value) {
        this.arrvl = value;
        return this;
    }

    /**
     * Gets the value of the dprture property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public DepartureOrArrival1 getDprture() {
        return dprture;
    }

    /**
     * Sets the value of the dprture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public Lodging5 setDprture(DepartureOrArrival1 value) {
        this.dprture = value;
        return this;
    }

    /**
     * Gets the value of the noShow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShow() {
        return noShow;
    }

    /**
     * Sets the value of the noShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Lodging5 setNoShow(Boolean value) {
        this.noShow = value;
        return this;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Lodging5 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Lodging5 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax44> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Lodging5 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrsdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrsdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorisedAmount2 }
     * 
     * 
     * @return
     *     The value of the authrsdAmt property.
     */
    public List<AuthorisedAmount2> getAuthrsdAmt() {
        if (authrsdAmt == null) {
            authrsdAmt = new ArrayList<>();
        }
        return this.authrsdAmt;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging5 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramme4 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme4> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<>();
        }
        return this.lltyPrgrmm;
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

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LodgingLineItem4 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<LodgingLineItem4> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
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
     * Adds a new item to the prprtyLclData list.
     * @see #getPrprtyLclData()
     * 
     */
    public Lodging5 addPrprtyLclData(LocalData20 prprtyLclData) {
        getPrprtyLclData().add(prprtyLclData);
        return this;
    }

    /**
     * Adds a new item to the cstmr list.
     * @see #getCstmr()
     * 
     */
    public Lodging5 addCstmr(Customer10 cstmr) {
        getCstmr().add(cstmr);
        return this;
    }

    /**
     * Adds a new item to the room list.
     * @see #getRoom()
     * 
     */
    public Lodging5 addRoom(LodgingRoom2 room) {
        getRoom().add(room);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public Lodging5 addTtlTax(Tax44 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

    /**
     * Adds a new item to the authrsdAmt list.
     * @see #getAuthrsdAmt()
     * 
     */
    public Lodging5 addAuthrsdAmt(AuthorisedAmount2 authrsdAmt) {
        getAuthrsdAmt().add(authrsdAmt);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public Lodging5 addLltyPrgrmm(LoyaltyProgramme4 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Lodging5 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Lodging5 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public Lodging5 addLineItm(LodgingLineItem4 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
