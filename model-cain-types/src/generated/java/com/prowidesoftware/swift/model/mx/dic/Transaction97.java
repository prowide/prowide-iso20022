
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
 * Contains transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction97", propOrder = {
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "txAmts",
    "dsptData",
    "addtlFees",
    "addtlInf",
    "addtlData"
})
public class Transaction97 {

    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification10 txId;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts1 txAmts;
    @XmlElement(name = "DsptData", required = true)
    protected DisputeData1 dsptData;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation20 addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgRsn property.
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
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<String>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrnMsgRsn property.
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
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<String>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public TransactionIdentification10 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public Transaction97 setTxId(TransactionIdentification10 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts1 }
     *     
     */
    public TransactionAmounts1 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts1 }
     *     
     */
    public Transaction97 setTxAmts(TransactionAmounts1 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the dsptData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeData1 }
     *     
     */
    public DisputeData1 getDsptData() {
        return dsptData;
    }

    /**
     * Sets the value of the dsptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeData1 }
     *     
     */
    public Transaction97 setDsptData(DisputeData1 value) {
        this.dsptData = value;
        return this;
    }

    /**
     * Gets the value of the addtlFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee1 }
     * 
     * 
     */
    public List<AdditionalFee1> getAddtlFees() {
        if (addtlFees == null) {
            addtlFees = new ArrayList<AdditionalFee1>();
        }
        return this.addtlFees;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation20 }
     *     
     */
    public AdditionalInformation20 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation20 }
     *     
     */
    public Transaction97 setAddtlInf(AdditionalInformation20 value) {
        this.addtlInf = value;
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
     * Adds a new item to the msgRsn list.
     * @see #getMsgRsn()
     * 
     */
    public Transaction97 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public Transaction97 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction97 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction97 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
