
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
 * Data related to the confirmed fraudulent transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudulentTransactionData1", propOrder = {
    "authstnSts",
    "dsptDtls",
    "msgRsn",
    "altrnMsgRsn",
    "frdlntMsg"
})
public class FraudulentTransactionData1 {

    @XmlElement(name = "AuthstnSts")
    protected AuthorisationStatus1 authstnSts;
    @XmlElement(name = "DsptDtls")
    protected DisputeData2 dsptDtls;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "FrdlntMsg")
    protected byte[] frdlntMsg;

    /**
     * Gets the value of the authstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationStatus1 }
     *     
     */
    public AuthorisationStatus1 getAuthstnSts() {
        return authstnSts;
    }

    /**
     * Sets the value of the authstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationStatus1 }
     *     
     */
    public FraudulentTransactionData1 setAuthstnSts(AuthorisationStatus1 value) {
        this.authstnSts = value;
        return this;
    }

    /**
     * Gets the value of the dsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeData2 }
     *     
     */
    public DisputeData2 getDsptDtls() {
        return dsptDtls;
    }

    /**
     * Sets the value of the dsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeData2 }
     *     
     */
    public FraudulentTransactionData1 setDsptDtls(DisputeData2 value) {
        this.dsptDtls = value;
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
    public FraudulentTransactionData1 setFrdlntMsg(byte[] value) {
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
    public FraudulentTransactionData1 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public FraudulentTransactionData1 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

}
