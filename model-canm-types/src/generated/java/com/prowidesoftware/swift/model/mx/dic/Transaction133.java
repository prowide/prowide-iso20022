
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Key exchange activity transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction133", propOrder = {
    "keyXchgFctn",
    "othrKeyXchgFctn",
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "keyXchgTp",
    "othrKeyXchgTp",
    "keyXchgData",
    "addtlFee",
    "addtlData"
})
public class Transaction133 {

    @XmlElement(name = "KeyXchgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType5Code keyXchgFctn;
    @XmlElement(name = "OthrKeyXchgFctn")
    protected String othrKeyXchgFctn;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "KeyXchgTp")
    @XmlSchemaType(name = "string")
    protected KeyType1Code keyXchgTp;
    @XmlElement(name = "OthrKeyXchgTp")
    protected String othrKeyXchgTp;
    @XmlElement(name = "KeyXchgData")
    protected KeyExchangeData1 keyXchgData;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the keyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType5Code }
     *     
     */
    public CardServiceType5Code getKeyXchgFctn() {
        return keyXchgFctn;
    }

    /**
     * Sets the value of the keyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType5Code }
     *     
     */
    public Transaction133 setKeyXchgFctn(CardServiceType5Code value) {
        this.keyXchgFctn = value;
        return this;
    }

    /**
     * Gets the value of the othrKeyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgFctn() {
        return othrKeyXchgFctn;
    }

    /**
     * Sets the value of the othrKeyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction133 setOthrKeyXchgFctn(String value) {
        this.othrKeyXchgFctn = value;
        return this;
    }

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
     *     {@link TransactionIdentification12 }
     *     
     */
    public TransactionIdentification12 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public Transaction133 setTxId(TransactionIdentification12 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType1Code }
     *     
     */
    public KeyType1Code getKeyXchgTp() {
        return keyXchgTp;
    }

    /**
     * Sets the value of the keyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType1Code }
     *     
     */
    public Transaction133 setKeyXchgTp(KeyType1Code value) {
        this.keyXchgTp = value;
        return this;
    }

    /**
     * Gets the value of the othrKeyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgTp() {
        return othrKeyXchgTp;
    }

    /**
     * Sets the value of the othrKeyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction133 setOthrKeyXchgTp(String value) {
        this.othrKeyXchgTp = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgData property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public KeyExchangeData1 getKeyXchgData() {
        return keyXchgData;
    }

    /**
     * Sets the value of the keyXchgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public Transaction133 setKeyXchgData(KeyExchangeData1 value) {
        this.keyXchgData = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<AdditionalFee2>();
        }
        return this.addtlFee;
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
    public Transaction133 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public Transaction133 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction133 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction133 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
