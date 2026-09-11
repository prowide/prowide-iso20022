
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
 * Fleet data pertaining to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetData7", propOrder = {
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
    "dscntMtd",
    "dscntNtty",
    "dscntPlanId",
    "purchsRstrctnInd",
    "lineItm"
})
public class FleetData7 {

    @XmlElement(name = "Drvr")
    protected FleetDriverData2 drvr;
    @XmlElement(name = "Vhcl")
    protected FleetVehicleData1 vhcl;
    @XmlElement(name = "DrvrOrVhclCard")
    protected DriverOrVehicleCardData1 drvrOrVhclCard;
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
    protected List<LocalAmenity2> lclAmnty;
    @XmlElement(name = "TxRltdData")
    protected List<FleetTransactionDetail2> txRltdData;
    @XmlElement(name = "AddtlNtrdData")
    protected AdditionalEnteredFleetData1 addtlNtrdData;
    @XmlElement(name = "DscntMtd")
    protected String dscntMtd;
    @XmlElement(name = "DscntNtty")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code dscntNtty;
    @XmlElement(name = "DscntPlanId")
    protected String dscntPlanId;
    @XmlElement(name = "PurchsRstrctnInd")
    protected String purchsRstrctnInd;
    @XmlElement(name = "LineItm")
    protected List<FleetLineItem7> lineItm;

    /**
     * Gets the value of the drvr property.
     * 
     * @return
     *     possible object is
     *     {@link FleetDriverData2 }
     *     
     */
    public FleetDriverData2 getDrvr() {
        return drvr;
    }

    /**
     * Sets the value of the drvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetDriverData2 }
     *     
     */
    public FleetData7 setDrvr(FleetDriverData2 value) {
        this.drvr = value;
        return this;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link FleetVehicleData1 }
     *     
     */
    public FleetVehicleData1 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetVehicleData1 }
     *     
     */
    public FleetData7 setVhcl(FleetVehicleData1 value) {
        this.vhcl = value;
        return this;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link DriverOrVehicleCardData1 }
     *     
     */
    public DriverOrVehicleCardData1 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverOrVehicleCardData1 }
     *     
     */
    public FleetData7 setDrvrOrVhclCard(DriverOrVehicleCardData1 value) {
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
    public FleetData7 setCardFuelPrmptCd(BigDecimal value) {
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
    public FleetData7 setAgtFuelPrmptCd(String value) {
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
    public FleetData7 setTripNb(String value) {
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
    public FleetData7 setTripJobNb(String value) {
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
    public FleetData7 setTripWorkOrdr(String value) {
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
    public FleetData7 setTripInvcNb(String value) {
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
    public FleetData7 setTripBllgId(String value) {
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
    public FleetData7 setTripCtrlNb(String value) {
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
    public FleetData7 setTripDlvryTcktNb(String value) {
        this.tripDlvryTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the lclAmnty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclAmnty property.
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
     * {@link LocalAmenity2 }
     * 
     * 
     * @return
     *     The value of the lclAmnty property.
     */
    public List<LocalAmenity2> getLclAmnty() {
        if (lclAmnty == null) {
            lclAmnty = new ArrayList<>();
        }
        return this.lclAmnty;
    }

    /**
     * Gets the value of the txRltdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRltdData property.
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
     * {@link FleetTransactionDetail2 }
     * 
     * 
     * @return
     *     The value of the txRltdData property.
     */
    public List<FleetTransactionDetail2> getTxRltdData() {
        if (txRltdData == null) {
            txRltdData = new ArrayList<>();
        }
        return this.txRltdData;
    }

    /**
     * Gets the value of the addtlNtrdData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalEnteredFleetData1 }
     *     
     */
    public AdditionalEnteredFleetData1 getAddtlNtrdData() {
        return addtlNtrdData;
    }

    /**
     * Sets the value of the addtlNtrdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalEnteredFleetData1 }
     *     
     */
    public FleetData7 setAddtlNtrdData(AdditionalEnteredFleetData1 value) {
        this.addtlNtrdData = value;
        return this;
    }

    /**
     * Gets the value of the dscntMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscntMtd() {
        return dscntMtd;
    }

    /**
     * Sets the value of the dscntMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData7 setDscntMtd(String value) {
        this.dscntMtd = value;
        return this;
    }

    /**
     * Gets the value of the dscntNtty property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getDscntNtty() {
        return dscntNtty;
    }

    /**
     * Sets the value of the dscntNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public FleetData7 setDscntNtty(ATICAPartyType1Code value) {
        this.dscntNtty = value;
        return this;
    }

    /**
     * Gets the value of the dscntPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscntPlanId() {
        return dscntPlanId;
    }

    /**
     * Sets the value of the dscntPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData7 setDscntPlanId(String value) {
        this.dscntPlanId = value;
        return this;
    }

    /**
     * Gets the value of the purchsRstrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsRstrctnInd() {
        return purchsRstrctnInd;
    }

    /**
     * Sets the value of the purchsRstrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetData7 setPurchsRstrctnInd(String value) {
        this.purchsRstrctnInd = value;
        return this;
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
     * {@link FleetLineItem7 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<FleetLineItem7> getLineItm() {
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
     * Adds a new item to the lclAmnty list.
     * @see #getLclAmnty()
     * 
     */
    public FleetData7 addLclAmnty(LocalAmenity2 lclAmnty) {
        getLclAmnty().add(lclAmnty);
        return this;
    }

    /**
     * Adds a new item to the txRltdData list.
     * @see #getTxRltdData()
     * 
     */
    public FleetData7 addTxRltdData(FleetTransactionDetail2 txRltdData) {
        getTxRltdData().add(txRltdData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public FleetData7 addLineItm(FleetLineItem7 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
