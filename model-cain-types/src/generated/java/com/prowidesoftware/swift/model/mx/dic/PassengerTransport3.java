
package com.prowidesoftware.swift.model.mx.dic;

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
 * Passenger ticket information for the cardholder. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTransport3", propOrder = {
    "docNb",
    "rsvatnSys",
    "rsvatnNb",
    "orgnlRsvatnSys",
    "orgnlRsvatnNb",
    "trvlAuthstnCd",
    "tcktIssr",
    "opnTckt",
    "cstmrRef",
    "pssngr",
    "dprture",
    "drtn",
    "insrnc",
    "ttlAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "tripLeg",
    "ancllryPurchs",
    "hirdVhclDtls",
    "addtlData"
})
public class PassengerTransport3 {

    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "RsvatnSys")
    protected String rsvatnSys;
    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "OrgnlRsvatnSys")
    protected String orgnlRsvatnSys;
    @XmlElement(name = "OrgnlRsvatnNb")
    protected String orgnlRsvatnNb;
    @XmlElement(name = "TrvlAuthstnCd")
    protected String trvlAuthstnCd;
    @XmlElement(name = "TcktIssr")
    protected String tcktIssr;
    @XmlElement(name = "OpnTckt")
    protected Boolean opnTckt;
    @XmlElement(name = "CstmrRef")
    protected List<CustomerReference1> cstmrRef;
    @XmlElement(name = "Pssngr")
    protected List<Customer9> pssngr;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "TtlAmt")
    protected List<AmountDetails3> ttlAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme4 lltyPrgrmm;
    @XmlElement(name = "TripLeg")
    protected List<TripLeg3> tripLeg;
    @XmlElement(name = "AncllryPurchs")
    protected List<AncillaryPurchase3> ancllryPurchs;
    @XmlElement(name = "HirdVhclDtls")
    protected List<HiredVehicle3> hirdVhclDtls;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PassengerTransport3 setDocNb(String value) {
        this.docNb = value;
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
    public PassengerTransport3 setRsvatnSys(String value) {
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
    public PassengerTransport3 setRsvatnNb(String value) {
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
    public PassengerTransport3 setOrgnlRsvatnSys(String value) {
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
    public PassengerTransport3 setOrgnlRsvatnNb(String value) {
        this.orgnlRsvatnNb = value;
        return this;
    }

    /**
     * Gets the value of the trvlAuthstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrvlAuthstnCd() {
        return trvlAuthstnCd;
    }

    /**
     * Sets the value of the trvlAuthstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PassengerTransport3 setTrvlAuthstnCd(String value) {
        this.trvlAuthstnCd = value;
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
    public PassengerTransport3 setTcktIssr(String value) {
        this.tcktIssr = value;
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
    public PassengerTransport3 setOpnTckt(Boolean value) {
        this.opnTckt = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference1 }
     * 
     * 
     */
    public List<CustomerReference1> getCstmrRef() {
        if (cstmrRef == null) {
            cstmrRef = new ArrayList<CustomerReference1>();
        }
        return this.cstmrRef;
    }

    /**
     * Gets the value of the pssngr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pssngr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPssngr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer9 }
     * 
     * 
     */
    public List<Customer9> getPssngr() {
        if (pssngr == null) {
            pssngr = new ArrayList<Customer9>();
        }
        return this.pssngr;
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
    public PassengerTransport3 setDprture(DepartureOrArrival1 value) {
        this.dprture = value;
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
    public PassengerTransport3 setDrtn(String value) {
        this.drtn = value;
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
    public PassengerTransport3 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetails3 }
     * 
     * 
     */
    public List<AmountDetails3> getTtlAmt() {
        if (ttlAmt == null) {
            ttlAmt = new ArrayList<AmountDetails3>();
        }
        return this.ttlAmt;
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
    public PassengerTransport3 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
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
    public PassengerTransport3 setLltyPrgrmm(LoyaltyProgramme4 value) {
        this.lltyPrgrmm = value;
        return this;
    }

    /**
     * Gets the value of the tripLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripLeg3 }
     * 
     * 
     */
    public List<TripLeg3> getTripLeg() {
        if (tripLeg == null) {
            tripLeg = new ArrayList<TripLeg3>();
        }
        return this.tripLeg;
    }

    /**
     * Gets the value of the ancllryPurchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancllryPurchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncllryPurchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryPurchase3 }
     * 
     * 
     */
    public List<AncillaryPurchase3> getAncllryPurchs() {
        if (ancllryPurchs == null) {
            ancllryPurchs = new ArrayList<AncillaryPurchase3>();
        }
        return this.ancllryPurchs;
    }

    /**
     * Gets the value of the hirdVhclDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hirdVhclDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHirdVhclDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HiredVehicle3 }
     * 
     * 
     */
    public List<HiredVehicle3> getHirdVhclDtls() {
        if (hirdVhclDtls == null) {
            hirdVhclDtls = new ArrayList<HiredVehicle3>();
        }
        return this.hirdVhclDtls;
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
     * Adds a new item to the cstmrRef list.
     * @see #getCstmrRef()
     * 
     */
    public PassengerTransport3 addCstmrRef(CustomerReference1 cstmrRef) {
        getCstmrRef().add(cstmrRef);
        return this;
    }

    /**
     * Adds a new item to the pssngr list.
     * @see #getPssngr()
     * 
     */
    public PassengerTransport3 addPssngr(Customer9 pssngr) {
        getPssngr().add(pssngr);
        return this;
    }

    /**
     * Adds a new item to the ttlAmt list.
     * @see #getTtlAmt()
     * 
     */
    public PassengerTransport3 addTtlAmt(AmountDetails3 ttlAmt) {
        getTtlAmt().add(ttlAmt);
        return this;
    }

    /**
     * Adds a new item to the tripLeg list.
     * @see #getTripLeg()
     * 
     */
    public PassengerTransport3 addTripLeg(TripLeg3 tripLeg) {
        getTripLeg().add(tripLeg);
        return this;
    }

    /**
     * Adds a new item to the ancllryPurchs list.
     * @see #getAncllryPurchs()
     * 
     */
    public PassengerTransport3 addAncllryPurchs(AncillaryPurchase3 ancllryPurchs) {
        getAncllryPurchs().add(ancllryPurchs);
        return this;
    }

    /**
     * Adds a new item to the hirdVhclDtls list.
     * @see #getHirdVhclDtls()
     * 
     */
    public PassengerTransport3 addHirdVhclDtls(HiredVehicle3 hirdVhclDtls) {
        getHirdVhclDtls().add(hirdVhclDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public PassengerTransport3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
