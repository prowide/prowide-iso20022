
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
 * Data related to the confirmed fraudulent transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudulentTransactionData4", propOrder = {
    "authstn",
    "authstnNtty",
    "msgRsn",
    "altrnMsgRsn",
    "presntmntCycl",
    "dsptCond",
    "agtDsptBndlCaseRef",
    "agtDsptCaseRef",
    "acqrrDsptCaseRef",
    "issrDsptCaseRef",
    "frdlntMsg"
})
public class FraudulentTransactionData4 {

    @XmlElement(name = "Authstn")
    protected Boolean authstn;
    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code authstnNtty;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "AgtDsptBndlCaseRef")
    protected String agtDsptBndlCaseRef;
    @XmlElement(name = "AgtDsptCaseRef")
    protected String agtDsptCaseRef;
    @XmlElement(name = "AcqrrDsptCaseRef")
    protected String acqrrDsptCaseRef;
    @XmlElement(name = "IssrDsptCaseRef")
    protected String issrDsptCaseRef;
    @XmlElement(name = "FrdlntMsg")
    protected byte[] frdlntMsg;

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FraudulentTransactionData4 setAuthstn(Boolean value) {
        this.authstn = value;
        return this;
    }

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public FraudulentTransactionData4 setAuthstnNtty(ATICAPartyType1Code value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgRsn property.
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrnMsgRsn property.
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the presntmntCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Sets the value of the presntmntCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setPresntmntCycl(String value) {
        this.presntmntCycl = value;
        return this;
    }

    /**
     * Gets the value of the dsptCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Sets the value of the dsptCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setDsptCond(String value) {
        this.dsptCond = value;
        return this;
    }

    /**
     * Gets the value of the agtDsptBndlCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtDsptBndlCaseRef() {
        return agtDsptBndlCaseRef;
    }

    /**
     * Sets the value of the agtDsptBndlCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setAgtDsptBndlCaseRef(String value) {
        this.agtDsptBndlCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the agtDsptCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtDsptCaseRef() {
        return agtDsptCaseRef;
    }

    /**
     * Sets the value of the agtDsptCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setAgtDsptCaseRef(String value) {
        this.agtDsptCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the acqrrDsptCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrDsptCaseRef() {
        return acqrrDsptCaseRef;
    }

    /**
     * Sets the value of the acqrrDsptCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setAcqrrDsptCaseRef(String value) {
        this.acqrrDsptCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the issrDsptCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDsptCaseRef() {
        return issrDsptCaseRef;
    }

    /**
     * Sets the value of the issrDsptCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudulentTransactionData4 setIssrDsptCaseRef(String value) {
        this.issrDsptCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the frdlntMsg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdlntMsg() {
        return frdlntMsg;
    }

    /**
     * Sets the value of the frdlntMsg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public FraudulentTransactionData4 setFrdlntMsg(byte[] value) {
        this.frdlntMsg = value;
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
     * Adds a new item to the msgRsn list.
     * @see #getMsgRsn()
     * 
     */
    public FraudulentTransactionData4 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public FraudulentTransactionData4 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

}
