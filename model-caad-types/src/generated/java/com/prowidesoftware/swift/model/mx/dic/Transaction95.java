
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Batch management transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction95", propOrder = {
    "btchMgmtTp",
    "othrBtchMgmtTp",
    "txId",
    "addtlFees",
    "colltnId",
    "btchId",
    "colltnSz",
    "orgnlColltnId",
    "orgnlBtchId",
    "nbOfBtchsInColltn",
    "nbOfMsgs",
    "rmngMsgsInColltn",
    "msgSeqNb",
    "btchIdList",
    "chckptId",
    "btchChcksm",
    "reqAck",
    "msgsBfrAck",
    "postvAck",
    "addtlData"
})
public class Transaction95 {

    @XmlElement(name = "BtchMgmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected BatchManagementType1Code btchMgmtTp;
    @XmlElement(name = "OthrBtchMgmtTp")
    protected String othrBtchMgmtTp;
    @XmlElement(name = "TxId")
    protected TransactionIdentification10 txId;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "ColltnSz")
    protected BigDecimal colltnSz;
    @XmlElement(name = "OrgnlColltnId")
    protected String orgnlColltnId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfBtchsInColltn")
    protected BigDecimal nbOfBtchsInColltn;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "RmngMsgsInColltn")
    protected BigDecimal rmngMsgsInColltn;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "BtchIdList")
    protected List<String> btchIdList;
    @XmlElement(name = "ChckptId")
    protected String chckptId;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "MsgsBfrAck")
    protected BigDecimal msgsBfrAck;
    @XmlElement(name = "PostvAck")
    protected Boolean postvAck;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the btchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementType1Code }
     *     
     */
    public BatchManagementType1Code getBtchMgmtTp() {
        return btchMgmtTp;
    }

    /**
     * Sets the value of the btchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementType1Code }
     *     
     */
    public Transaction95 setBtchMgmtTp(BatchManagementType1Code value) {
        this.btchMgmtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrBtchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrBtchMgmtTp() {
        return othrBtchMgmtTp;
    }

    /**
     * Sets the value of the othrBtchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setOthrBtchMgmtTp(String value) {
        this.othrBtchMgmtTp = value;
        return this;
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
    public Transaction95 setTxId(TransactionIdentification10 value) {
        this.txId = value;
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
     * Gets the value of the colltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Sets the value of the colltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setColltnId(String value) {
        this.colltnId = value;
        return this;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setBtchId(String value) {
        this.btchId = value;
        return this;
    }

    /**
     * Gets the value of the colltnSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColltnSz() {
        return colltnSz;
    }

    /**
     * Sets the value of the colltnSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction95 setColltnSz(BigDecimal value) {
        this.colltnSz = value;
        return this;
    }

    /**
     * Gets the value of the orgnlColltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlColltnId() {
        return orgnlColltnId;
    }

    /**
     * Sets the value of the orgnlColltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setOrgnlColltnId(String value) {
        this.orgnlColltnId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlBtchId() {
        return orgnlBtchId;
    }

    /**
     * Sets the value of the orgnlBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setOrgnlBtchId(String value) {
        this.orgnlBtchId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfBtchsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfBtchsInColltn() {
        return nbOfBtchsInColltn;
    }

    /**
     * Sets the value of the nbOfBtchsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction95 setNbOfBtchsInColltn(BigDecimal value) {
        this.nbOfBtchsInColltn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction95 setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the rmngMsgsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngMsgsInColltn() {
        return rmngMsgsInColltn;
    }

    /**
     * Sets the value of the rmngMsgsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction95 setRmngMsgsInColltn(BigDecimal value) {
        this.rmngMsgsInColltn = value;
        return this;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setMsgSeqNb(String value) {
        this.msgSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the btchIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btchIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBtchIdList() {
        if (btchIdList == null) {
            btchIdList = new ArrayList<String>();
        }
        return this.btchIdList;
    }

    /**
     * Gets the value of the chckptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckptId() {
        return chckptId;
    }

    /**
     * Sets the value of the chckptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction95 setChckptId(String value) {
        this.chckptId = value;
        return this;
    }

    /**
     * Gets the value of the btchChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBtchChcksm() {
        return btchChcksm;
    }

    /**
     * Sets the value of the btchChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Transaction95 setBtchChcksm(byte[] value) {
        this.btchChcksm = value;
        return this;
    }

    /**
     * Gets the value of the reqAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAck() {
        return reqAck;
    }

    /**
     * Sets the value of the reqAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transaction95 setReqAck(Boolean value) {
        this.reqAck = value;
        return this;
    }

    /**
     * Gets the value of the msgsBfrAck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgsBfrAck() {
        return msgsBfrAck;
    }

    /**
     * Sets the value of the msgsBfrAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction95 setMsgsBfrAck(BigDecimal value) {
        this.msgsBfrAck = value;
        return this;
    }

    /**
     * Gets the value of the postvAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostvAck() {
        return postvAck;
    }

    /**
     * Sets the value of the postvAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transaction95 setPostvAck(Boolean value) {
        this.postvAck = value;
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
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction95 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the btchIdList list.
     * @see #getBtchIdList()
     * 
     */
    public Transaction95 addBtchIdList(String btchIdList) {
        getBtchIdList().add(btchIdList);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction95 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
