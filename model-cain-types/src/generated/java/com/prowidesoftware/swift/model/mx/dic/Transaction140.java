
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
 * Inquiry transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction140", propOrder = {
    "txTp",
    "txSubTp",
    "addtlSvc",
    "spclPrgrmmQlfctn",
    "txId",
    "rcncltnAmt",
    "addtlAmt",
    "addtlFee",
    "acctBal",
    "acctFr",
    "txDesc",
    "addtlData"
})
public class Transaction140 {

    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification18 txId;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalance2> acctBal;
    @XmlElement(name = "AcctFr")
    protected AccountDetails3 acctFr;
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
    public Transaction140 setTxTp(String value) {
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
    public Transaction140 setTxSubTp(String value) {
        this.txSubTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSvc property.
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
     * {@link AdditionalService2 }
     * 
     * 
     */
    public List<AdditionalService2> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<AdditionalService2>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spclPrgrmmQlfctn property.
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
     */
    public List<SpecialProgrammeQualification1> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<SpecialProgrammeQualification1>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification18 }
     *     
     */
    public TransactionIdentification18 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification18 }
     *     
     */
    public Transaction140 setTxId(TransactionIdentification18 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public Transaction140 setRcncltnAmt(Amount15 value) {
        this.rcncltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts3 }
     * 
     * 
     */
    public List<AdditionalAmounts3> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<AdditionalAmounts3>();
        }
        return this.addtlAmt;
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
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalance2 }
     * 
     * 
     */
    public List<AccountBalance2> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AccountBalance2>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails3 }
     *     
     */
    public AccountDetails3 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails3 }
     *     
     */
    public Transaction140 setAcctFr(AccountDetails3 value) {
        this.acctFr = value;
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
    public Transaction140 setTxDesc(String value) {
        this.txDesc = value;
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
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public Transaction140 addAddtlSvc(AdditionalService2 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public Transaction140 addSpclPrgrmmQlfctn(SpecialProgrammeQualification1 spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public Transaction140 addAddtlAmt(AdditionalAmounts3 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction140 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the acctBal list.
     * @see #getAcctBal()
     * 
     */
    public Transaction140 addAcctBal(AccountBalance2 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction140 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
