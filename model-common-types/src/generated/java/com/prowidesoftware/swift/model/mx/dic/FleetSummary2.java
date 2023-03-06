
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
 * Supplies additional transaction information for fleet transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetSummary2", propOrder = {
    "drvr",
    "vhcl",
    "drvrOrVhclCard",
    "cardFuelPrmptCd",
    "agtFuelPrmptCd",
    "tripInf",
    "lclAmnty",
    "txRltdData",
    "addtlData"
})
public class FleetSummary2 {

    @XmlElement(name = "Drvr")
    protected Driver2 drvr;
    @XmlElement(name = "Vhcl")
    protected Vehicle5 vhcl;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData21 drvrOrVhclCard;
    @XmlElement(name = "CardFuelPrmptCd")
    protected BigDecimal cardFuelPrmptCd;
    @XmlElement(name = "AgtFuelPrmptCd")
    protected String agtFuelPrmptCd;
    @XmlElement(name = "TripInf")
    protected TripInformation1 tripInf;
    @XmlElement(name = "LclAmnty")
    protected List<LocalAmenity1> lclAmnty;
    @XmlElement(name = "TxRltdData")
    protected List<PaymentTransaction141> txRltdData;
    @XmlElement(name = "AddtlData")
    protected AdditionalInformation19 addtlData;

    /**
     * Gets the value of the drvr property.
     * 
     * @return
     *     possible object is
     *     {@link Driver2 }
     *     
     */
    public Driver2 getDrvr() {
        return drvr;
    }

    /**
     * Sets the value of the drvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver2 }
     *     
     */
    public FleetSummary2 setDrvr(Driver2 value) {
        this.drvr = value;
        return this;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle5 }
     *     
     */
    public Vehicle5 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle5 }
     *     
     */
    public FleetSummary2 setVhcl(Vehicle5 value) {
        this.vhcl = value;
        return this;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData21 }
     *     
     */
    public PlainCardData21 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData21 }
     *     
     */
    public FleetSummary2 setDrvrOrVhclCard(PlainCardData21 value) {
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
    public FleetSummary2 setCardFuelPrmptCd(BigDecimal value) {
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
    public FleetSummary2 setAgtFuelPrmptCd(String value) {
        this.agtFuelPrmptCd = value;
        return this;
    }

    /**
     * Gets the value of the tripInf property.
     * 
     * @return
     *     possible object is
     *     {@link TripInformation1 }
     *     
     */
    public TripInformation1 getTripInf() {
        return tripInf;
    }

    /**
     * Sets the value of the tripInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInformation1 }
     *     
     */
    public FleetSummary2 setTripInf(TripInformation1 value) {
        this.tripInf = value;
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
     * {@link PaymentTransaction141 }
     * 
     * 
     */
    public List<PaymentTransaction141> getTxRltdData() {
        if (txRltdData == null) {
            txRltdData = new ArrayList<PaymentTransaction141>();
        }
        return this.txRltdData;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation19 }
     *     
     */
    public AdditionalInformation19 getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation19 }
     *     
     */
    public FleetSummary2 setAddtlData(AdditionalInformation19 value) {
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
     * Adds a new item to the lclAmnty list.
     * @see #getLclAmnty()
     * 
     */
    public FleetSummary2 addLclAmnty(LocalAmenity1 lclAmnty) {
        getLclAmnty().add(lclAmnty);
        return this;
    }

    /**
     * Adds a new item to the txRltdData list.
     * @see #getTxRltdData()
     * 
     */
    public FleetSummary2 addTxRltdData(PaymentTransaction141 txRltdData) {
        getTxRltdData().add(txRltdData);
        return this;
    }

}
