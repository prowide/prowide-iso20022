
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Lodging provides summary information about lodging accommodations and related expenses for the cardholder. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lodging4", propOrder = {
    "folioNb",
    "prprtyTp",
    "prprtyOthrTp",
    "prstgsPrprty",
    "prprtyNm",
    "prprtyId",
    "prprtyLctn",
    "prprtyAssgnr",
    "prprtyCtct",
    "prprtyCtry",
    "prprtyFireSftyAct",
    "cstmrNm",
    "cstmrId",
    "cstmrFileRefNb",
    "cstmrAge",
    "cstmrAdr",
    "cstmrCtct",
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
    "addtlData",
    "lineItm"
})
public class Lodging4 {

    @XmlElement(name = "FolioNb")
    protected String folioNb;
    @XmlElement(name = "PrprtyTp")
    @XmlSchemaType(name = "string")
    protected LodgingActivity1Code prprtyTp;
    @XmlElement(name = "PrprtyOthrTp")
    protected String prprtyOthrTp;
    @XmlElement(name = "PrstgsPrprty")
    protected String prstgsPrprty;
    @XmlElement(name = "PrprtyNm")
    protected String prprtyNm;
    @XmlElement(name = "PrprtyId")
    protected PartyIdentification285 prprtyId;
    @XmlElement(name = "PrprtyLctn")
    protected Location6 prprtyLctn;
    @XmlElement(name = "PrprtyAssgnr")
    @XmlSchemaType(name = "string")
    protected CompanyAssigner2Code prprtyAssgnr;
    @XmlElement(name = "PrprtyCtct")
    protected ContactBusiness1 prprtyCtct;
    @XmlElement(name = "PrprtyCtry")
    protected String prprtyCtry;
    @XmlElement(name = "PrprtyFireSftyAct")
    protected Boolean prprtyFireSftyAct;
    @XmlElement(name = "CstmrNm")
    protected String cstmrNm;
    @XmlElement(name = "CstmrId")
    protected Credentials3 cstmrId;
    @XmlElement(name = "CstmrFileRefNb")
    protected String cstmrFileRefNb;
    @XmlElement(name = "CstmrAge")
    protected String cstmrAge;
    @XmlElement(name = "CstmrAdr")
    protected Address2 cstmrAdr;
    @XmlElement(name = "CstmrCtct")
    protected ContactPersonal1 cstmrCtct;
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
    protected List<Tax41> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected List<AuthorisedAmount2> authrsdAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme4> lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LineItm")
    protected List<LodgingLineItem3> lineItm;

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
    public Lodging4 setFolioNb(String value) {
        this.folioNb = value;
        return this;
    }

    /**
     * Gets the value of the prprtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public LodgingActivity1Code getPrprtyTp() {
        return prprtyTp;
    }

    /**
     * Sets the value of the prprtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public Lodging4 setPrprtyTp(LodgingActivity1Code value) {
        this.prprtyTp = value;
        return this;
    }

    /**
     * Gets the value of the prprtyOthrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyOthrTp() {
        return prprtyOthrTp;
    }

    /**
     * Sets the value of the prprtyOthrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging4 setPrprtyOthrTp(String value) {
        this.prprtyOthrTp = value;
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
    public Lodging4 setPrstgsPrprty(String value) {
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
    public Lodging4 setPrprtyNm(String value) {
        this.prprtyNm = value;
        return this;
    }

    /**
     * Gets the value of the prprtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getPrprtyId() {
        return prprtyId;
    }

    /**
     * Sets the value of the prprtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public Lodging4 setPrprtyId(PartyIdentification285 value) {
        this.prprtyId = value;
        return this;
    }

    /**
     * Gets the value of the prprtyLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Location6 }
     *     
     */
    public Location6 getPrprtyLctn() {
        return prprtyLctn;
    }

    /**
     * Sets the value of the prprtyLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location6 }
     *     
     */
    public Lodging4 setPrprtyLctn(Location6 value) {
        this.prprtyLctn = value;
        return this;
    }

    /**
     * Gets the value of the prprtyAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public CompanyAssigner2Code getPrprtyAssgnr() {
        return prprtyAssgnr;
    }

    /**
     * Sets the value of the prprtyAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public Lodging4 setPrprtyAssgnr(CompanyAssigner2Code value) {
        this.prprtyAssgnr = value;
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
    public Lodging4 setPrprtyCtct(ContactBusiness1 value) {
        this.prprtyCtct = value;
        return this;
    }

    /**
     * Gets the value of the prprtyCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyCtry() {
        return prprtyCtry;
    }

    /**
     * Sets the value of the prprtyCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging4 setPrprtyCtry(String value) {
        this.prprtyCtry = value;
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
    public Lodging4 setPrprtyFireSftyAct(Boolean value) {
        this.prprtyFireSftyAct = value;
        return this;
    }

    /**
     * Gets the value of the cstmrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrNm() {
        return cstmrNm;
    }

    /**
     * Sets the value of the cstmrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging4 setCstmrNm(String value) {
        this.cstmrNm = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials3 }
     *     
     */
    public Credentials3 getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials3 }
     *     
     */
    public Lodging4 setCstmrId(Credentials3 value) {
        this.cstmrId = value;
        return this;
    }

    /**
     * Gets the value of the cstmrFileRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrFileRefNb() {
        return cstmrFileRefNb;
    }

    /**
     * Sets the value of the cstmrFileRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging4 setCstmrFileRefNb(String value) {
        this.cstmrFileRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cstmrAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrAge() {
        return cstmrAge;
    }

    /**
     * Sets the value of the cstmrAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Lodging4 setCstmrAge(String value) {
        this.cstmrAge = value;
        return this;
    }

    /**
     * Gets the value of the cstmrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getCstmrAdr() {
        return cstmrAdr;
    }

    /**
     * Sets the value of the cstmrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public Lodging4 setCstmrAdr(Address2 value) {
        this.cstmrAdr = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonal1 }
     *     
     */
    public ContactPersonal1 getCstmrCtct() {
        return cstmrCtct;
    }

    /**
     * Sets the value of the cstmrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonal1 }
     *     
     */
    public Lodging4 setCstmrCtct(ContactPersonal1 value) {
        this.cstmrCtct = value;
        return this;
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
    public Lodging4 setNbOfRooms(String value) {
        this.nbOfRooms = value;
        return this;
    }

    /**
     * Gets the value of the room property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the room property.
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
     */
    public List<LodgingRoom2> getRoom() {
        if (room == null) {
            room = new ArrayList<LodgingRoom2>();
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
    public Lodging4 setDrtn(String value) {
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
    public Lodging4 setArrvl(DepartureOrArrival2 value) {
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
    public Lodging4 setDprture(DepartureOrArrival1 value) {
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
    public Lodging4 setNoShow(Boolean value) {
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
    public Lodging4 setInsrnc(Boolean value) {
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
    public Lodging4 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlTax property.
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
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<Tax41>();
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
    public Lodging4 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authrsdAmt property.
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
     */
    public List<AuthorisedAmount2> getAuthrsdAmt() {
        if (authrsdAmt == null) {
            authrsdAmt = new ArrayList<AuthorisedAmount2>();
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
    public Lodging4 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lltyPrgrmm property.
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
     */
    public List<LoyaltyProgramme4> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<LoyaltyProgramme4>();
        }
        return this.lltyPrgrmm;
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

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
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
     * {@link LodgingLineItem3 }
     * 
     * 
     */
    public List<LodgingLineItem3> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<LodgingLineItem3>();
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
     * Adds a new item to the room list.
     * @see #getRoom()
     * 
     */
    public Lodging4 addRoom(LodgingRoom2 room) {
        getRoom().add(room);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public Lodging4 addTtlTax(Tax41 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

    /**
     * Adds a new item to the authrsdAmt list.
     * @see #getAuthrsdAmt()
     * 
     */
    public Lodging4 addAuthrsdAmt(AuthorisedAmount2 authrsdAmt) {
        getAuthrsdAmt().add(authrsdAmt);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public Lodging4 addLltyPrgrmm(LoyaltyProgramme4 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Lodging4 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public Lodging4 addLineItm(LodgingLineItem3 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
