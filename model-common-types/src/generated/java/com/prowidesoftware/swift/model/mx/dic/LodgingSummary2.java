
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Data pertaining to a lodging transaction. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingSummary2", propOrder = {
    "folioNb",
    "prprty",
    "cstmr",
    "nbOfRooms",
    "room",
    "drtn",
    "arrvl",
    "dprture",
    "noShowInd",
    "insrncInd",
    "insrncAmt",
    "ttlTax",
    "ttlAmt",
    "authrsdAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "addtlData"
})
public class LodgingSummary2 {

    @XmlElement(name = "FolioNb")
    protected String folioNb;
    @XmlElement(name = "Prprty")
    protected LodgingProperty2 prprty;
    @XmlElement(name = "Cstmr")
    protected Customer8 cstmr;
    @XmlElement(name = "NbOfRooms")
    protected String nbOfRooms;
    @XmlElement(name = "Room")
    protected List<LodgingRoom1> room;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "Arrvl")
    protected DepartureOrArrival2 arrvl;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "TtlTax")
    protected List<Tax39> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected List<AuthorisedAmount1> authrsdAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme2> lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

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
    public LodgingSummary2 setFolioNb(String value) {
        this.folioNb = value;
        return this;
    }

    /**
     * Gets the value of the prprty property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingProperty2 }
     *     
     */
    public LodgingProperty2 getPrprty() {
        return prprty;
    }

    /**
     * Sets the value of the prprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingProperty2 }
     *     
     */
    public LodgingSummary2 setPrprty(LodgingProperty2 value) {
        this.prprty = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer8 }
     *     
     */
    public Customer8 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer8 }
     *     
     */
    public LodgingSummary2 setCstmr(Customer8 value) {
        this.cstmr = value;
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
    public LodgingSummary2 setNbOfRooms(String value) {
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
     * {@link LodgingRoom1 }
     * 
     * 
     */
    public List<LodgingRoom1> getRoom() {
        if (room == null) {
            room = new ArrayList<LodgingRoom1>();
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
    public LodgingSummary2 setDrtn(String value) {
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
    public LodgingSummary2 setArrvl(DepartureOrArrival2 value) {
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
    public LodgingSummary2 setDprture(DepartureOrArrival1 value) {
        this.dprture = value;
        return this;
    }

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LodgingSummary2 setNoShowInd(Boolean value) {
        this.noShowInd = value;
        return this;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LodgingSummary2 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
    public LodgingSummary2 setInsrncAmt(BigDecimal value) {
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
     * {@link Tax39 }
     * 
     * 
     */
    public List<Tax39> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<Tax39>();
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
    public LodgingSummary2 setTtlAmt(BigDecimal value) {
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
     * {@link AuthorisedAmount1 }
     * 
     * 
     */
    public List<AuthorisedAmount1> getAuthrsdAmt() {
        if (authrsdAmt == null) {
            authrsdAmt = new ArrayList<AuthorisedAmount1>();
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
    public LodgingSummary2 setSummryCmmdtyId(String value) {
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
     * {@link LoyaltyProgramme2 }
     * 
     * 
     */
    public List<LoyaltyProgramme2> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<LoyaltyProgramme2>();
        }
        return this.lltyPrgrmm;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingSummary2 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the room list.
     * @see #getRoom()
     * 
     */
    public LodgingSummary2 addRoom(LodgingRoom1 room) {
        getRoom().add(room);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public LodgingSummary2 addTtlTax(Tax39 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

    /**
     * Adds a new item to the authrsdAmt list.
     * @see #getAuthrsdAmt()
     * 
     */
    public LodgingSummary2 addAuthrsdAmt(AuthorisedAmount1 authrsdAmt) {
        getAuthrsdAmt().add(authrsdAmt);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public LodgingSummary2 addLltyPrgrmm(LoyaltyProgramme2 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

}
