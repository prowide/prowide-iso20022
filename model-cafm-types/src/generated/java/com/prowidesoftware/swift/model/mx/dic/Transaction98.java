
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
 * Details of transaction for a file action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction98", propOrder = {
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "fileActnScp",
    "fileActnTp",
    "othrFileActnTp",
    "fileActnDtls",
    "addtlFees",
    "addtlData"
})
public class Transaction98 {

    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification10 txId;
    @XmlElement(name = "FileActnScp", required = true)
    @XmlSchemaType(name = "string")
    protected FileActionScope1Code fileActnScp;
    @XmlElement(name = "FileActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected FileActionType1Code fileActnTp;
    @XmlElement(name = "OthrFileActnTp")
    protected String othrFileActnTp;
    @XmlElement(name = "FileActnDtls", required = true)
    protected FileActionDetails1 fileActnDtls;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public Transaction98 setTxId(TransactionIdentification10 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the fileActnScp property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionScope1Code }
     *     
     */
    public FileActionScope1Code getFileActnScp() {
        return fileActnScp;
    }

    /**
     * Sets the value of the fileActnScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionScope1Code }
     *     
     */
    public Transaction98 setFileActnScp(FileActionScope1Code value) {
        this.fileActnScp = value;
        return this;
    }

    /**
     * Gets the value of the fileActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionType1Code }
     *     
     */
    public FileActionType1Code getFileActnTp() {
        return fileActnTp;
    }

    /**
     * Sets the value of the fileActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionType1Code }
     *     
     */
    public Transaction98 setFileActnTp(FileActionType1Code value) {
        this.fileActnTp = value;
        return this;
    }

    /**
     * Gets the value of the othrFileActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFileActnTp() {
        return othrFileActnTp;
    }

    /**
     * Sets the value of the othrFileActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction98 setOthrFileActnTp(String value) {
        this.othrFileActnTp = value;
        return this;
    }

    /**
     * Gets the value of the fileActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionDetails1 }
     *     
     */
    public FileActionDetails1 getFileActnDtls() {
        return fileActnDtls;
    }

    /**
     * Sets the value of the fileActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionDetails1 }
     *     
     */
    public Transaction98 setFileActnDtls(FileActionDetails1 value) {
        this.fileActnDtls = value;
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
    public Transaction98 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public Transaction98 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction98 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction98 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
