
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
 * Contains transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction85", propOrder = {
    "txTp",
    "txSubTp",
    "addtlSvc",
    "txAttr",
    "othrTxAttr",
    "msgRsn",
    "altrnMsgRsn",
    "preAuthstnTmLmt",
    "assoctdDataRef",
    "spclPrgrmmQlfctn",
    "txId",
    "dsptData",
    "txAmts",
    "addtlAmts",
    "addtlFees",
    "orgnlAddtlFees",
    "dpstDtls",
    "fndsSvcs",
    "acctFr",
    "acctTo",
    "txDesc",
    "addtlData"
})
public class Transaction85 {

    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService1> addtlSvc;
    @XmlElement(name = "TxAttr")
    @XmlSchemaType(name = "string")
    protected TransactionAttribute1Code txAttr;
    @XmlElement(name = "OthrTxAttr")
    protected String othrTxAttr;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "PreAuthstnTmLmt")
    protected String preAuthstnTmLmt;
    @XmlElement(name = "AssoctdDataRef")
    protected String assoctdDataRef;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId")
    protected TransactionIdentification11 txId;
    @XmlElement(name = "DsptData")
    protected List<DisputeData1> dsptData;
    @XmlElement(name = "TxAmts")
    protected TransactionAmounts1 txAmts;
    @XmlElement(name = "AddtlAmts")
    protected List<AdditionalAmounts1> addtlAmts;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
    @XmlElement(name = "OrgnlAddtlFees")
    protected List<AdditionalFee1> orgnlAddtlFees;
    @XmlElement(name = "DpstDtls")
    protected List<DepositDetails1> dpstDtls;
    @XmlElement(name = "FndsSvcs")
    protected FundingService1 fndsSvcs;
    @XmlElement(name = "AcctFr")
    protected AccountDetails2 acctFr;
    @XmlElement(name = "AcctTo")
    protected AccountDetails2 acctTo;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setTxTp(String value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the txSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSubTp() {
        return txSubTp;
    }

    /**
     * Sets the value of the txSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setTxSubTp(String value) {
        this.txSubTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalService1 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService1> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the txAttr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAttribute1Code }
     *     
     */
    public TransactionAttribute1Code getTxAttr() {
        return txAttr;
    }

    /**
     * Sets the value of the txAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAttribute1Code }
     *     
     */
    public Transaction85 setTxAttr(TransactionAttribute1Code value) {
        this.txAttr = value;
        return this;
    }

    /**
     * Gets the value of the othrTxAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTxAttr() {
        return othrTxAttr;
    }

    /**
     * Sets the value of the othrTxAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setOthrTxAttr(String value) {
        this.othrTxAttr = value;
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
     * Gets the value of the preAuthstnTmLmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAuthstnTmLmt() {
        return preAuthstnTmLmt;
    }

    /**
     * Sets the value of the preAuthstnTmLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setPreAuthstnTmLmt(String value) {
        this.preAuthstnTmLmt = value;
        return this;
    }

    /**
     * Gets the value of the assoctdDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssoctdDataRef() {
        return assoctdDataRef;
    }

    /**
     * Sets the value of the assoctdDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setAssoctdDataRef(String value) {
        this.assoctdDataRef = value;
        return this;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spclPrgrmmQlfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclPrgrmmQlfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeQualification1 }
     * 
     * 
     * @return
     *     The value of the spclPrgrmmQlfctn property.
     */
    public List<SpecialProgrammeQualification1> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification11 }
     *     
     */
    public TransactionIdentification11 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification11 }
     *     
     */
    public Transaction85 setTxId(TransactionIdentification11 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the dsptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeData1 }
     * 
     * 
     * @return
     *     The value of the dsptData property.
     */
    public List<DisputeData1> getDsptData() {
        if (dsptData == null) {
            dsptData = new ArrayList<>();
        }
        return this.dsptData;
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
    public Transaction85 setTxAmts(TransactionAmounts1 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts1 }
     * 
     * 
     * @return
     *     The value of the addtlAmts property.
     */
    public List<AdditionalAmounts1> getAddtlAmts() {
        if (addtlAmts == null) {
            addtlAmts = new ArrayList<>();
        }
        return this.addtlAmts;
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
     * Gets the value of the orgnlAddtlFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlAddtlFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlAddtlFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee1 }
     * 
     * 
     * @return
     *     The value of the orgnlAddtlFees property.
     */
    public List<AdditionalFee1> getOrgnlAddtlFees() {
        if (orgnlAddtlFees == null) {
            orgnlAddtlFees = new ArrayList<>();
        }
        return this.orgnlAddtlFees;
    }

    /**
     * Gets the value of the dpstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositDetails1 }
     * 
     * 
     * @return
     *     The value of the dpstDtls property.
     */
    public List<DepositDetails1> getDpstDtls() {
        if (dpstDtls == null) {
            dpstDtls = new ArrayList<>();
        }
        return this.dpstDtls;
    }

    /**
     * Gets the value of the fndsSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link FundingService1 }
     *     
     */
    public FundingService1 getFndsSvcs() {
        return fndsSvcs;
    }

    /**
     * Sets the value of the fndsSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingService1 }
     *     
     */
    public Transaction85 setFndsSvcs(FundingService1 value) {
        this.fndsSvcs = value;
        return this;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails2 }
     *     
     */
    public AccountDetails2 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails2 }
     *     
     */
    public Transaction85 setAcctFr(AccountDetails2 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails2 }
     *     
     */
    public AccountDetails2 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails2 }
     *     
     */
    public Transaction85 setAcctTo(AccountDetails2 value) {
        this.acctTo = value;
        return this;
    }

    /**
     * Gets the value of the txDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDesc() {
        return txDesc;
    }

    /**
     * Sets the value of the txDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction85 setTxDesc(String value) {
        this.txDesc = value;
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
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public Transaction85 addAddtlSvc(AdditionalService1 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the msgRsn list.
     * @see #getMsgRsn()
     * 
     */
    public Transaction85 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public Transaction85 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public Transaction85 addSpclPrgrmmQlfctn(SpecialProgrammeQualification1 spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the dsptData list.
     * @see #getDsptData()
     * 
     */
    public Transaction85 addDsptData(DisputeData1 dsptData) {
        getDsptData().add(dsptData);
        return this;
    }

    /**
     * Adds a new item to the addtlAmts list.
     * @see #getAddtlAmts()
     * 
     */
    public Transaction85 addAddtlAmts(AdditionalAmounts1 addtlAmts) {
        getAddtlAmts().add(addtlAmts);
        return this;
    }

    /**
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction85 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the orgnlAddtlFees list.
     * @see #getOrgnlAddtlFees()
     * 
     */
    public Transaction85 addOrgnlAddtlFees(AdditionalFee1 orgnlAddtlFees) {
        getOrgnlAddtlFees().add(orgnlAddtlFees);
        return this;
    }

    /**
     * Adds a new item to the dpstDtls list.
     * @see #getDpstDtls()
     * 
     */
    public Transaction85 addDpstDtls(DepositDetails1 dpstDtls) {
        getDpstDtls().add(dpstDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction85 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
