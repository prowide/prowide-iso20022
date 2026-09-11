
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "TripLeg4", propOrder = {
    "seqNb",
    "tcktNb",
    "tcktIssr",
    "tcktIsseDt",
    "tcktIsseLctn",
    "cnjnctnTcktNb",
    "rstrctdTckt",
    "opnTckt",
    "tcktRstrctns",
    "xchgdTckt",
    "xchgdTcktNb",
    "rcrdLctrNb",
    "rsvatnSys",
    "rsvatnNb",
    "orgnlRsvatnSys",
    "orgnlRsvatnNb",
    "doc",
    "trnsprtTp",
    "cmmdtyCd",
    "crrierNm",
    "crrierCd",
    "iataCd",
    "routeNb",
    "svcClss",
    "dprture",
    "arrvl",
    "drtn",
    "stopOver",
    "nonDrctRouteCd",
    "fairBsisCd",
    "insrnc",
    "amt",
    "cdtRsnCd",
    "prcdrId",
    "lltyPrgrmm",
    "prvtData",
    "ntlData"
})
public class TripLeg4 {

    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "TcktNb")
    protected String tcktNb;
    @XmlElement(name = "TcktIssr")
    protected String tcktIssr;
    @XmlElement(name = "TcktIsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tcktIsseDt;
    @XmlElement(name = "TcktIsseLctn")
    protected String tcktIsseLctn;
    @XmlElement(name = "CnjnctnTcktNb")
    protected String cnjnctnTcktNb;
    @XmlElement(name = "RstrctdTckt")
    protected Boolean rstrctdTckt;
    @XmlElement(name = "OpnTckt")
    protected Boolean opnTckt;
    @XmlElement(name = "TcktRstrctns")
    protected String tcktRstrctns;
    @XmlElement(name = "XchgdTckt")
    protected Boolean xchgdTckt;
    @XmlElement(name = "XchgdTcktNb")
    protected String xchgdTcktNb;
    @XmlElement(name = "RcrdLctrNb")
    protected String rcrdLctrNb;
    @XmlElement(name = "RsvatnSys")
    protected String rsvatnSys;
    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "OrgnlRsvatnSys")
    protected String orgnlRsvatnSys;
    @XmlElement(name = "OrgnlRsvatnNb")
    protected String orgnlRsvatnNb;
    @XmlElement(name = "Doc")
    protected ATICALaxProcessing doc;
    @XmlElement(name = "TrnsprtTp")
    @XmlSchemaType(name = "string")
    protected TransportType2Code trnsprtTp;
    @XmlElement(name = "CmmdtyCd")
    protected String cmmdtyCd;
    @XmlElement(name = "CrrierNm")
    protected String crrierNm;
    @XmlElement(name = "CrrierCd")
    protected String crrierCd;
    @XmlElement(name = "IATACd")
    protected String iataCd;
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
    @XmlElement(name = "StopOver")
    protected Boolean stopOver;
    @XmlElement(name = "NonDrctRouteCd")
    protected String nonDrctRouteCd;
    @XmlElement(name = "FairBsisCd")
    protected String fairBsisCd;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "Amt")
    protected List<AmountAndTax1> amt;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "PrcdrId")
    protected String prcdrId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme4 lltyPrgrmm;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public TripLeg4 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the tcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktNb() {
        return tcktNb;
    }

    /**
     * Sets the value of the tcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setTcktNb(String value) {
        this.tcktNb = value;
        return this;
    }

    /**
     * Gets the value of the tcktIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktIssr() {
        return tcktIssr;
    }

    /**
     * Sets the value of the tcktIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setTcktIssr(String value) {
        this.tcktIssr = value;
        return this;
    }

    /**
     * Gets the value of the tcktIsseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTcktIsseDt() {
        return tcktIsseDt;
    }

    /**
     * Sets the value of the tcktIsseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setTcktIsseDt(LocalDate value) {
        this.tcktIsseDt = value;
        return this;
    }

    /**
     * Gets the value of the tcktIsseLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktIsseLctn() {
        return tcktIsseLctn;
    }

    /**
     * Sets the value of the tcktIsseLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setTcktIsseLctn(String value) {
        this.tcktIsseLctn = value;
        return this;
    }

    /**
     * Gets the value of the cnjnctnTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnjnctnTcktNb() {
        return cnjnctnTcktNb;
    }

    /**
     * Sets the value of the cnjnctnTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setCnjnctnTcktNb(String value) {
        this.cnjnctnTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the rstrctdTckt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdTckt() {
        return rstrctdTckt;
    }

    /**
     * Sets the value of the rstrctdTckt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripLeg4 setRstrctdTckt(Boolean value) {
        this.rstrctdTckt = value;
        return this;
    }

    /**
     * Gets the value of the opnTckt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnTckt() {
        return opnTckt;
    }

    /**
     * Sets the value of the opnTckt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripLeg4 setOpnTckt(Boolean value) {
        this.opnTckt = value;
        return this;
    }

    /**
     * Gets the value of the tcktRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktRstrctns() {
        return tcktRstrctns;
    }

    /**
     * Sets the value of the tcktRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setTcktRstrctns(String value) {
        this.tcktRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the xchgdTckt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgdTckt() {
        return xchgdTckt;
    }

    /**
     * Sets the value of the xchgdTckt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripLeg4 setXchgdTckt(Boolean value) {
        this.xchgdTckt = value;
        return this;
    }

    /**
     * Gets the value of the xchgdTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgdTcktNb() {
        return xchgdTcktNb;
    }

    /**
     * Sets the value of the xchgdTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setXchgdTcktNb(String value) {
        this.xchgdTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the rcrdLctrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrdLctrNb() {
        return rcrdLctrNb;
    }

    /**
     * Sets the value of the rcrdLctrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setRcrdLctrNb(String value) {
        this.rcrdLctrNb = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnSys() {
        return rsvatnSys;
    }

    /**
     * Sets the value of the rsvatnSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setRsvatnSys(String value) {
        this.rsvatnSys = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnNb() {
        return rsvatnNb;
    }

    /**
     * Sets the value of the rsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setRsvatnNb(String value) {
        this.rsvatnNb = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRsvatnSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRsvatnSys() {
        return orgnlRsvatnSys;
    }

    /**
     * Sets the value of the orgnlRsvatnSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setOrgnlRsvatnSys(String value) {
        this.orgnlRsvatnSys = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRsvatnNb() {
        return orgnlRsvatnNb;
    }

    /**
     * Sets the value of the orgnlRsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setOrgnlRsvatnNb(String value) {
        this.orgnlRsvatnNb = value;
        return this;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public ATICALaxProcessing getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public TripLeg4 setDoc(ATICALaxProcessing value) {
        this.doc = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransportType2Code }
     *     
     */
    public TransportType2Code getTrnsprtTp() {
        return trnsprtTp;
    }

    /**
     * Sets the value of the trnsprtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportType2Code }
     *     
     */
    public TripLeg4 setTrnsprtTp(TransportType2Code value) {
        this.trnsprtTp = value;
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
    public TripLeg4 setCmmdtyCd(String value) {
        this.cmmdtyCd = value;
        return this;
    }

    /**
     * Gets the value of the crrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierNm() {
        return crrierNm;
    }

    /**
     * Sets the value of the crrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setCrrierNm(String value) {
        this.crrierNm = value;
        return this;
    }

    /**
     * Gets the value of the crrierCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierCd() {
        return crrierCd;
    }

    /**
     * Sets the value of the crrierCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setCrrierCd(String value) {
        this.crrierCd = value;
        return this;
    }

    /**
     * Gets the value of the iataCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACd() {
        return iataCd;
    }

    /**
     * Sets the value of the iataCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripLeg4 setIATACd(String value) {
        this.iataCd = value;
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
    public TripLeg4 setRouteNb(String value) {
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
    public TripLeg4 setSvcClss(String value) {
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
    public TripLeg4 setDprture(DepartureOrArrival1 value) {
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
    public TripLeg4 setArrvl(DepartureOrArrival1 value) {
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
    public TripLeg4 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the stopOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopOver() {
        return stopOver;
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripLeg4 setStopOver(Boolean value) {
        this.stopOver = value;
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
    public TripLeg4 setNonDrctRouteCd(String value) {
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
    public TripLeg4 setFairBsisCd(String value) {
        this.fairBsisCd = value;
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
    public TripLeg4 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndTax1 }
     * 
     * 
     * @return
     *     The value of the amt property.
     */
    public List<AmountAndTax1> getAmt() {
        if (amt == null) {
            amt = new ArrayList<>();
        }
        return this.amt;
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
    public TripLeg4 setCdtRsnCd(String value) {
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
    public TripLeg4 setPrcdrId(String value) {
        this.prcdrId = value;
        return this;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramme4 }
     *     
     */
    public LoyaltyProgramme4 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme4 }
     *     
     */
    public TripLeg4 setLltyPrgrmm(LoyaltyProgramme4 value) {
        this.lltyPrgrmm = value;
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
     * Adds a new item to the amt list.
     * @see #getAmt()
     * 
     */
    public TripLeg4 addAmt(AmountAndTax1 amt) {
        getAmt().add(amt);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public TripLeg4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public TripLeg4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
