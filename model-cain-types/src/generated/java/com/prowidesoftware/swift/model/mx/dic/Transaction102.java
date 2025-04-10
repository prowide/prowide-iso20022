
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
 * Amendment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction102", propOrder = {
    "amddData",
    "txId",
    "orgnlMsg",
    "msgAmdd",
    "addtlData"
})
public class Transaction102 {

    @XmlElement(name = "AmddData", required = true)
    protected List<DetailedError1> amddData;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification10 txId;
    @XmlElement(name = "OrgnlMsg")
    protected byte[] orgnlMsg;
    @XmlElement(name = "MsgAmdd")
    protected byte[] msgAmdd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the amddData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amddData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmddData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedError1 }
     * 
     * 
     */
    public List<DetailedError1> getAmddData() {
        if (amddData == null) {
            amddData = new ArrayList<DetailedError1>();
        }
        return this.amddData;
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
    public Transaction102 setTxId(TransactionIdentification10 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrgnlMsg() {
        return orgnlMsg;
    }

    /**
     * Sets the value of the orgnlMsg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Transaction102 setOrgnlMsg(byte[] value) {
        this.orgnlMsg = value;
        return this;
    }

    /**
     * Gets the value of the msgAmdd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgAmdd() {
        return msgAmdd;
    }

    /**
     * Sets the value of the msgAmdd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Transaction102 setMsgAmdd(byte[] value) {
        this.msgAmdd = value;
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
     * Adds a new item to the amddData list.
     * @see #getAmddData()
     * 
     */
    public Transaction102 addAmddData(DetailedError1 amddData) {
        getAmddData().add(amddData);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction102 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
