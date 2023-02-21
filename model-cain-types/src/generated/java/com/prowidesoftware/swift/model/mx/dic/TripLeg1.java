
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
 * Supplies additional transaction information for travel transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripLeg1", propOrder = {
    "seqNb",
    "tckt",
    "doc",
    "prcdrRef",
    "trnsprtTp",
    "othrTrnsprtTp",
    "cmmdtyCd",
    "crrier",
    "routeNb",
    "svcClss",
    "dprture",
    "arrvl",
    "drtn",
    "stopOverInd",
    "nonDrctRouteCd",
    "fairBsisCd",
    "insrncInd",
    "tripLegAmt",
    "cdtRsnCd",
    "prcdrId",
    "lltyPrgrmm",
    "addtlData"
})
public class TripLeg1 {

    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "Tckt")
    protected Ticket1 tckt;
    @XmlElement(name = "Doc")
    protected List<DocumentReference1> doc;
    @XmlElement(name = "PrcdrRef")
    protected String prcdrRef;
    @XmlElement(name = "TrnsprtTp")
    @XmlSchemaType(name = "string")
    protected TransportType1Code trnsprtTp;
    @XmlElement(name = "OthrTrnsprtTp")
    protected String othrTrnsprtTp;
    @XmlElement(name = "CmmdtyCd")
    protected String cmmdtyCd;
    @XmlElement(name = "Crrier")
    protected CarrierIdentification1 crrier;
    @XmlElement(name = "RouteNb")
    protected String routeNb;
    @XmlElement(name = "SvcClss")
    protected String svcClss;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "Arrvl")
    protected DepartureOrArrival1 arrvl;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "StopOverInd")
    protected Boolean stopOverInd;
    @XmlElement(name = "NonDrctRouteCd")
    protected String nonDrctRouteCd;
    @XmlElement(name = "FairBsisCd")
    protected String fairBsisCd;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "TripLegAmt")
    protected List<AmountDetails1> tripLegAmt;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "PrcdrId")
    protected String prcdrId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the tckt property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket1 }
     *     
     */
    public Ticket1 getTckt() {
        return tckt;
    }

    /**
     * Sets the value of the tckt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket1 }
     *     
     */
    public TripLeg1 setTckt(Ticket1 value) {
        this.tckt = value;
        return this;
    }

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReference1 }
     * 
     * 
     */
    public List<DocumentReference1> getDoc() {
        if (doc == null) {
            doc = new ArrayList<DocumentReference1>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the prcdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcdrRef() {
        return prcdrRef;
    }

    /**
     * Sets the value of the prcdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setPrcdrRef(String value) {
        this.prcdrRef = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransportType1Code }
     *     
     */
    public TransportType1Code getTrnsprtTp() {
        return trnsprtTp;
    }

    /**
     * Sets the value of the trnsprtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportType1Code }
     *     
     */
    public TripLeg1 setTrnsprtTp(TransportType1Code value) {
        this.trnsprtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrTrnsprtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTrnsprtTp() {
        return othrTrnsprtTp;
    }

    /**
     * Sets the value of the othrTrnsprtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setOthrTrnsprtTp(String value) {
        this.othrTrnsprtTp = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmdtyCd() {
        return cmmdtyCd;
    }

    /**
     * Sets the value of the cmmdtyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setCmmdtyCd(String value) {
        this.cmmdtyCd = value;
        return this;
    }

    /**
     * Gets the value of the crrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierIdentification1 }
     *     
     */
    public CarrierIdentification1 getCrrier() {
        return crrier;
    }

    /**
     * Sets the value of the crrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierIdentification1 }
     *     
     */
    public TripLeg1 setCrrier(CarrierIdentification1 value) {
        this.crrier = value;
        return this;
    }

    /**
     * Gets the value of the routeNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNb() {
        return routeNb;
    }

    /**
     * Sets the value of the routeNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setRouteNb(String value) {
        this.routeNb = value;
        return this;
    }

    /**
     * Gets the value of the svcClss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcClss() {
        return svcClss;
    }

    /**
     * Sets the value of the svcClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setSvcClss(String value) {
        this.svcClss = value;
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
    public TripLeg1 setDprture(DepartureOrArrival1 value) {
        this.dprture = value;
        return this;
    }

    /**
     * Gets the value of the arrvl property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public DepartureOrArrival1 getArrvl() {
        return arrvl;
    }

    /**
     * Sets the value of the arrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public TripLeg1 setArrvl(DepartureOrArrival1 value) {
        this.arrvl = value;
        return this;
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
    public TripLeg1 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the stopOverInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopOverInd() {
        return stopOverInd;
    }

    /**
     * Sets the value of the stopOverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripLeg1 setStopOverInd(Boolean value) {
        this.stopOverInd = value;
        return this;
    }

    /**
     * Gets the value of the nonDrctRouteCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDrctRouteCd() {
        return nonDrctRouteCd;
    }

    /**
     * Sets the value of the nonDrctRouteCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setNonDrctRouteCd(String value) {
        this.nonDrctRouteCd = value;
        return this;
    }

    /**
     * Gets the value of the fairBsisCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFairBsisCd() {
        return fairBsisCd;
    }

    /**
     * Sets the value of the fairBsisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setFairBsisCd(String value) {
        this.fairBsisCd = value;
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
    public TripLeg1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
        return this;
    }

    /**
     * Gets the value of the tripLegAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripLegAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripLegAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetails1 }
     * 
     * 
     */
    public List<AmountDetails1> getTripLegAmt() {
        if (tripLegAmt == null) {
            tripLegAmt = new ArrayList<AmountDetails1>();
        }
        return this.tripLegAmt;
    }

    /**
     * Gets the value of the cdtRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRsnCd() {
        return cdtRsnCd;
    }

    /**
     * Sets the value of the cdtRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setCdtRsnCd(String value) {
        this.cdtRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the prcdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcdrId() {
        return prcdrId;
    }

    /**
     * Sets the value of the prcdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg1 setPrcdrId(String value) {
        this.prcdrId = value;
        return this;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public LoyaltyProgramme2 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public TripLeg1 setLltyPrgrmm(LoyaltyProgramme2 value) {
        this.lltyPrgrmm = value;
        return this;
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
    public TripLeg1 setAddtlData(String value) {
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
     * Adds a new item to the doc list.
     * @see #getDoc()
     * 
     */
    public TripLeg1 addDoc(DocumentReference1 doc) {
        getDoc().add(doc);
        return this;
    }

    /**
     * Adds a new item to the tripLegAmt list.
     * @see #getTripLegAmt()
     * 
     */
    public TripLeg1 addTripLegAmt(AmountDetails1 tripLegAmt) {
        getTripLegAmt().add(tripLegAmt);
        return this;
    }

}
