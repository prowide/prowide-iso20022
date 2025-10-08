
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "TripLeg3", propOrder = {
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
    "othrTrnsprtTp",
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
    "addtlData"
})
public class TripLeg3 {

    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "TcktNb")
    protected String tcktNb;
    @XmlElement(name = "TcktIssr")
    protected String tcktIssr;
    @XmlElement(name = "TcktIsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tcktIsseDt;
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
    protected List<DocumentReference1> doc;
    @XmlElement(name = "TrnsprtTp")
    @XmlSchemaType(name = "string")
    protected TransportType1Code trnsprtTp;
    @XmlElement(name = "OthrTrnsprtTp")
    protected String othrTrnsprtTp;
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
    protected List<AmountDetails3> amt;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "PrcdrId")
    protected String prcdrId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme4 lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public TripLeg3 setSeqNb(String value) {
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
    public TripLeg3 setTcktNb(String value) {
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
    public TripLeg3 setTcktIssr(String value) {
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
    public XMLGregorianCalendar getTcktIsseDt() {
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
    public TripLeg3 setTcktIsseDt(XMLGregorianCalendar value) {
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
    public TripLeg3 setTcktIsseLctn(String value) {
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
    public TripLeg3 setCnjnctnTcktNb(String value) {
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
    public TripLeg3 setRstrctdTckt(Boolean value) {
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
    public TripLeg3 setOpnTckt(Boolean value) {
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
    public TripLeg3 setTcktRstrctns(String value) {
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
    public TripLeg3 setXchgdTckt(Boolean value) {
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
    public TripLeg3 setXchgdTcktNb(String value) {
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
    public TripLeg3 setRcrdLctrNb(String value) {
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
    public TripLeg3 setRsvatnSys(String value) {
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
    public TripLeg3 setRsvatnNb(String value) {
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
    public TripLeg3 setOrgnlRsvatnSys(String value) {
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
    public TripLeg3 setOrgnlRsvatnNb(String value) {
        this.orgnlRsvatnNb = value;
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
    public TripLeg3 setTrnsprtTp(TransportType1Code value) {
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
    public TripLeg3 setOthrTrnsprtTp(String value) {
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
    public TripLeg3 setCmmdtyCd(String value) {
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
    public TripLeg3 setCrrierNm(String value) {
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
    public TripLeg3 setCrrierCd(String value) {
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
    public TripLeg3 setIATACd(String value) {
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
    public TripLeg3 setRouteNb(String value) {
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
    public TripLeg3 setSvcClss(String value) {
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
    public TripLeg3 setDprture(DepartureOrArrival1 value) {
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
    public TripLeg3 setArrvl(DepartureOrArrival1 value) {
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
    public TripLeg3 setDrtn(String value) {
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
    public TripLeg3 setStopOver(Boolean value) {
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
    public TripLeg3 setNonDrctRouteCd(String value) {
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
    public TripLeg3 setFairBsisCd(String value) {
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
    public TripLeg3 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amt property.
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
     * {@link AmountDetails3 }
     * 
     * 
     */
    public List<AmountDetails3> getAmt() {
        if (amt == null) {
            amt = new ArrayList<AmountDetails3>();
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
    public TripLeg3 setCdtRsnCd(String value) {
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
    public TripLeg3 setPrcdrId(String value) {
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
    public TripLeg3 setLltyPrgrmm(LoyaltyProgramme4 value) {
        this.lltyPrgrmm = value;
        return this;
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
    public TripLeg3 addDoc(DocumentReference1 doc) {
        getDoc().add(doc);
        return this;
    }

    /**
     * Adds a new item to the amt list.
     * @see #getAmt()
     * 
     */
    public TripLeg3 addAmt(AmountDetails3 amt) {
        getAmt().add(amt);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public TripLeg3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
