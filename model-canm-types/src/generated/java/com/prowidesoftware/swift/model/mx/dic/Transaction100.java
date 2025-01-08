
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
 * Key exchange activity transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction100", propOrder = {
    "keyXchgFctn",
    "othrKeyXchgFctn",
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "keyXchgTp",
    "othrKeyXchgTp",
    "keyXchgData",
    "addtlFees",
    "addtlData"
})
public class Transaction100 {

    @XmlElement(name = "KeyXchgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType5Code keyXchgFctn;
    @XmlElement(name = "OthrKeyXchgFctn")
    protected String othrKeyXchgFctn;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected String altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "KeyXchgTp")
    @XmlSchemaType(name = "string")
    protected KeyType1Code keyXchgTp;
    @XmlElement(name = "OthrKeyXchgTp")
    protected String othrKeyXchgTp;
    @XmlElement(name = "KeyXchgData")
    protected KeyExchangeData1 keyXchgData;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
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
    public Transaction100 setKeyXchgFctn(CardServiceType5Code value) {
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
    public Transaction100 setOthrKeyXchgFctn(String value) {
        this.othrKeyXchgFctn = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrnMsgRsn() {
        return altrnMsgRsn;
    }

    /**
     * Sets the value of the altrnMsgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction100 setAltrnMsgRsn(String value) {
        this.altrnMsgRsn = value;
        return this;
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
    public Transaction100 setTxId(TransactionIdentification12 value) {
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
    public Transaction100 setKeyXchgTp(KeyType1Code value) {
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
    public Transaction100 setOthrKeyXchgTp(String value) {
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
    public Transaction100 setKeyXchgData(KeyExchangeData1 value) {
        this.keyXchgData = value;
        return this;
    }

    /**
     * Gets the value of the addtlFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFees property.
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
     * @return
     *     The value of the addtlFees property.
     */
    public List<AdditionalFee1> getAddtlFees() {
        if (addtlFees == null) {
            addtlFees = new ArrayList<>();
        }
        return this.addtlFees;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
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
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
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
    public Transaction100 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction100 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction100 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
