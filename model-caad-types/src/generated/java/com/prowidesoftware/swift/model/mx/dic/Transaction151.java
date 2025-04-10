
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
@XmlType(name = "Transaction151", propOrder = {
    "btchMgmtTp",
    "othrBtchMgmtTp",
    "txId",
    "addtlFee",
    "colltnId",
    "btchId",
    "colltnSz",
    "orgnlColltnId",
    "orgnlBtchId",
    "nbOfBtchsInColltn",
    "nbOfMsgs",
    "rmngMsgsInColltn",
    "msgSeqNb",
    "colltnIdList",
    "btchIdList",
    "chckptId",
    "colltnChcksm",
    "btchChcksm",
    "reqAck",
    "msgsBfrAck",
    "postvAck",
    "addtlData",
    "crrctn",
    "conttnInd"
})
public class Transaction151 {

    @XmlElement(name = "BtchMgmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected BatchManagementType2Code btchMgmtTp;
    @XmlElement(name = "OthrBtchMgmtTp")
    protected String othrBtchMgmtTp;
    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
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
    @XmlElement(name = "ColltnIdList")
    protected List<String> colltnIdList;
    @XmlElement(name = "BtchIdList")
    protected List<String> btchIdList;
    @XmlElement(name = "ChckptId")
    protected String chckptId;
    @XmlElement(name = "ColltnChcksm")
    protected byte[] colltnChcksm;
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
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;

    /**
     * Gets the value of the btchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public BatchManagementType2Code getBtchMgmtTp() {
        return btchMgmtTp;
    }

    /**
     * Sets the value of the btchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public Transaction151 setBtchMgmtTp(BatchManagementType2Code value) {
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
    public Transaction151 setOthrBtchMgmtTp(String value) {
        this.othrBtchMgmtTp = value;
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
    public Transaction151 setTxId(TransactionIdentification12 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
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
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
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
    public Transaction151 setColltnId(String value) {
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
    public Transaction151 setBtchId(String value) {
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
    public Transaction151 setColltnSz(BigDecimal value) {
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
    public Transaction151 setOrgnlColltnId(String value) {
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
    public Transaction151 setOrgnlBtchId(String value) {
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
    public Transaction151 setNbOfBtchsInColltn(BigDecimal value) {
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
    public Transaction151 setNbOfMsgs(BigDecimal value) {
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
    public Transaction151 setRmngMsgsInColltn(BigDecimal value) {
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
    public Transaction151 setMsgSeqNb(String value) {
        this.msgSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the colltnIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the colltnIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColltnIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the colltnIdList property.
     */
    public List<String> getColltnIdList() {
        if (colltnIdList == null) {
            colltnIdList = new ArrayList<>();
        }
        return this.colltnIdList;
    }

    /**
     * Gets the value of the btchIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the btchIdList property.
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
     * @return
     *     The value of the btchIdList property.
     */
    public List<String> getBtchIdList() {
        if (btchIdList == null) {
            btchIdList = new ArrayList<>();
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
    public Transaction151 setChckptId(String value) {
        this.chckptId = value;
        return this;
    }

    /**
     * Gets the value of the colltnChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getColltnChcksm() {
        return colltnChcksm;
    }

    /**
     * Sets the value of the colltnChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Transaction151 setColltnChcksm(byte[] value) {
        this.colltnChcksm = value;
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
    public Transaction151 setBtchChcksm(byte[] value) {
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
    public Transaction151 setReqAck(Boolean value) {
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
    public Transaction151 setMsgsBfrAck(BigDecimal value) {
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
    public Transaction151 setPostvAck(Boolean value) {
        this.postvAck = value;
        return this;
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

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public Transaction151 setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the conttnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttnInd() {
        return conttnInd;
    }

    /**
     * Sets the value of the conttnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transaction151 setConttnInd(Boolean value) {
        this.conttnInd = value;
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
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction151 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the colltnIdList list.
     * @see #getColltnIdList()
     * 
     */
    public Transaction151 addColltnIdList(String colltnIdList) {
        getColltnIdList().add(colltnIdList);
        return this;
    }

    /**
     * Adds a new item to the btchIdList list.
     * @see #getBtchIdList()
     * 
     */
    public Transaction151 addBtchIdList(String btchIdList) {
        getBtchIdList().add(btchIdList);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction151 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
