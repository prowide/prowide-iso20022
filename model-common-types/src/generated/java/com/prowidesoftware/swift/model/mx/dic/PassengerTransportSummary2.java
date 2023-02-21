
package com.prowidesoftware.swift.model.mx.dic;

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
 * Passenger ticket summary information for the cardholder. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTransportSummary2", propOrder = {
    "docNb",
    "rsvatn",
    "trvlAuthstnCd",
    "tcktIssr",
    "opnTcktInd",
    "cstmrRef",
    "pssngr",
    "dprture",
    "drtn",
    "insrncInd",
    "ttlAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "addtlData"
})
public class PassengerTransportSummary2 {

    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "Rsvatn")
    protected ReservationDetails3 rsvatn;
    @XmlElement(name = "TrvlAuthstnCd")
    protected String trvlAuthstnCd;
    @XmlElement(name = "TcktIssr")
    protected String tcktIssr;
    @XmlElement(name = "OpnTcktInd")
    protected Boolean opnTcktInd;
    @XmlElement(name = "CstmrRef")
    protected List<CustomerReference1> cstmrRef;
    @XmlElement(name = "Pssngr")
    protected List<Customer8> pssngr;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "TtlAmt")
    protected List<AmountDetails2> ttlAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

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
    public PassengerTransportSummary2 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails3 }
     *     
     */
    public ReservationDetails3 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails3 }
     *     
     */
    public PassengerTransportSummary2 setRsvatn(ReservationDetails3 value) {
        this.rsvatn = value;
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
    public PassengerTransportSummary2 setTrvlAuthstnCd(String value) {
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
    public PassengerTransportSummary2 setTcktIssr(String value) {
        this.tcktIssr = value;
        return this;
    }

    /**
     * Gets the value of the opnTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnTcktInd() {
        return opnTcktInd;
    }

    /**
     * Sets the value of the opnTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PassengerTransportSummary2 setOpnTcktInd(Boolean value) {
        this.opnTcktInd = value;
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
     * {@link Customer8 }
     * 
     * 
     */
    public List<Customer8> getPssngr() {
        if (pssngr == null) {
            pssngr = new ArrayList<Customer8>();
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
    public PassengerTransportSummary2 setDprture(DepartureOrArrival1 value) {
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
    public PassengerTransportSummary2 setDrtn(String value) {
        this.drtn = value;
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
    public PassengerTransportSummary2 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
     * {@link AmountDetails2 }
     * 
     * 
     */
    public List<AmountDetails2> getTtlAmt() {
        if (ttlAmt == null) {
            ttlAmt = new ArrayList<AmountDetails2>();
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
    public PassengerTransportSummary2 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
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
    public PassengerTransportSummary2 setLltyPrgrmm(LoyaltyProgramme2 value) {
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
    public PassengerTransportSummary2 setAddtlData(String value) {
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
     * Adds a new item to the cstmrRef list.
     * @see #getCstmrRef()
     * 
     */
    public PassengerTransportSummary2 addCstmrRef(CustomerReference1 cstmrRef) {
        getCstmrRef().add(cstmrRef);
        return this;
    }

    /**
     * Adds a new item to the pssngr list.
     * @see #getPssngr()
     * 
     */
    public PassengerTransportSummary2 addPssngr(Customer8 pssngr) {
        getPssngr().add(pssngr);
        return this;
    }

    /**
     * Adds a new item to the ttlAmt list.
     * @see #getTtlAmt()
     * 
     */
    public PassengerTransportSummary2 addTtlAmt(AmountDetails2 ttlAmt) {
        getTtlAmt().add(ttlAmt);
        return this;
    }

}
