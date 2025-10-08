
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Fleet data pertaining to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetData6", propOrder = {
    "drvr",
    "vhcl",
    "drvrOrVhclCard",
    "cardFuelPrmptCd",
    "agtFuelPrmptCd",
    "tripNb",
    "tripJobNb",
    "tripWorkOrdr",
    "tripInvcNb",
    "tripBllgId",
    "tripCtrlNb",
    "tripDlvryTcktNb",
    "lclAmnty",
    "txRltdData",
    "addtlNtrdData",
    "lineItm"
})
public class FleetData6 {

    @XmlElement(name = "Drvr")
    protected Driver3 drvr;
    @XmlElement(name = "Vhcl")
    protected Vehicle6 vhcl;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData23 drvrOrVhclCard;
    @XmlElement(name = "CardFuelPrmptCd")
    protected BigDecimal cardFuelPrmptCd;
    @XmlElement(name = "AgtFuelPrmptCd")
    protected String agtFuelPrmptCd;
    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "TripJobNb")
    protected String tripJobNb;
    @XmlElement(name = "TripWorkOrdr")
    protected String tripWorkOrdr;
    @XmlElement(name = "TripInvcNb")
    protected String tripInvcNb;
    @XmlElement(name = "TripBllgId")
    protected String tripBllgId;
    @XmlElement(name = "TripCtrlNb")
    protected String tripCtrlNb;
    @XmlElement(name = "TripDlvryTcktNb")
    protected String tripDlvryTcktNb;
    @XmlElement(name = "LclAmnty")
    protected List<LocalAmenity1> lclAmnty;
    @XmlElement(name = "TxRltdData")
    protected List<FleetTransactionDetail1> txRltdData;
    @XmlElement(name = "AddtlNtrdData")
    protected AdditionalInformation31 addtlNtrdData;
    @XmlElement(name = "LineItm")
    protected List<FleetLineItem5> lineItm;

    /**
     * Gets the value of the drvr property.
     * 
     * @return
     *     possible object is
     *     {@link Driver3 }
     *     
     */
    public Driver3 getDrvr() {
        return drvr;
    }

    /**
     * Sets the value of the drvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver3 }
     *     
     */
    public FleetData6 setDrvr(Driver3 value) {
        this.drvr = value;
        return this;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle6 }
     *     
     */
    public Vehicle6 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle6 }
     *     
     */
    public FleetData6 setVhcl(Vehicle6 value) {
        this.vhcl = value;
        return this;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData23 }
     *     
     */
    public PlainCardData23 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData23 }
     *     
     */
    public FleetData6 setDrvrOrVhclCard(PlainCardData23 value) {
        this.drvrOrVhclCard = value;
        return this;
    }

    /**
     * Gets the value of the cardFuelPrmptCd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardFuelPrmptCd() {
        return cardFuelPrmptCd;
    }

    /**
     * Sets the value of the cardFuelPrmptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetData6 setCardFuelPrmptCd(BigDecimal value) {
        this.cardFuelPrmptCd = value;
        return this;
    }

    /**
     * Gets the value of the agtFuelPrmptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtFuelPrmptCd() {
        return agtFuelPrmptCd;
    }

    /**
     * Sets the value of the agtFuelPrmptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setAgtFuelPrmptCd(String value) {
        this.agtFuelPrmptCd = value;
        return this;
    }

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripNb(String value) {
        this.tripNb = value;
        return this;
    }

    /**
     * Gets the value of the tripJobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripJobNb() {
        return tripJobNb;
    }

    /**
     * Sets the value of the tripJobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripJobNb(String value) {
        this.tripJobNb = value;
        return this;
    }

    /**
     * Gets the value of the tripWorkOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripWorkOrdr() {
        return tripWorkOrdr;
    }

    /**
     * Sets the value of the tripWorkOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripWorkOrdr(String value) {
        this.tripWorkOrdr = value;
        return this;
    }

    /**
     * Gets the value of the tripInvcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripInvcNb() {
        return tripInvcNb;
    }

    /**
     * Sets the value of the tripInvcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripInvcNb(String value) {
        this.tripInvcNb = value;
        return this;
    }

    /**
     * Gets the value of the tripBllgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripBllgId() {
        return tripBllgId;
    }

    /**
     * Sets the value of the tripBllgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripBllgId(String value) {
        this.tripBllgId = value;
        return this;
    }

    /**
     * Gets the value of the tripCtrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripCtrlNb() {
        return tripCtrlNb;
    }

    /**
     * Sets the value of the tripCtrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripCtrlNb(String value) {
        this.tripCtrlNb = value;
        return this;
    }

    /**
     * Gets the value of the tripDlvryTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDlvryTcktNb() {
        return tripDlvryTcktNb;
    }

    /**
     * Sets the value of the tripDlvryTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData6 setTripDlvryTcktNb(String value) {
        this.tripDlvryTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the lclAmnty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lclAmnty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclAmnty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalAmenity1 }
     * 
     * 
     */
    public List<LocalAmenity1> getLclAmnty() {
        if (lclAmnty == null) {
            lclAmnty = new ArrayList<LocalAmenity1>();
        }
        return this.lclAmnty;
    }

    /**
     * Gets the value of the txRltdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRltdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRltdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FleetTransactionDetail1 }
     * 
     * 
     */
    public List<FleetTransactionDetail1> getTxRltdData() {
        if (txRltdData == null) {
            txRltdData = new ArrayList<FleetTransactionDetail1>();
        }
        return this.txRltdData;
    }

    /**
     * Gets the value of the addtlNtrdData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation31 }
     *     
     */
    public AdditionalInformation31 getAddtlNtrdData() {
        return addtlNtrdData;
    }

    /**
     * Sets the value of the addtlNtrdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation31 }
     *     
     */
    public FleetData6 setAddtlNtrdData(AdditionalInformation31 value) {
        this.addtlNtrdData = value;
        return this;
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
     * {@link FleetLineItem5 }
     * 
     * 
     */
    public List<FleetLineItem5> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<FleetLineItem5>();
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
     * Adds a new item to the lclAmnty list.
     * @see #getLclAmnty()
     * 
     */
    public FleetData6 addLclAmnty(LocalAmenity1 lclAmnty) {
        getLclAmnty().add(lclAmnty);
        return this;
    }

    /**
     * Adds a new item to the txRltdData list.
     * @see #getTxRltdData()
     * 
     */
    public FleetData6 addTxRltdData(FleetTransactionDetail1 txRltdData) {
        getTxRltdData().add(txRltdData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public FleetData6 addLineItm(FleetLineItem5 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
