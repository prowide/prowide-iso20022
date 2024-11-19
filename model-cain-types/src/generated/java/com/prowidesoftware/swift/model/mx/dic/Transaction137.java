
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
@XmlType(name = "Transaction137", propOrder = {
    "txTp",
    "txSubTp",
    "txAttr",
    "othrTxAttr",
    "addtlSvc",
    "spclPrgrmmQlfctn",
    "txId",
    "txAmts",
    "addtlAmt",
    "addtlFee",
    "orgnlAddtlFee",
    "acctFr",
    "acctTo",
    "txDesc",
    "addtlData"
})
public class Transaction137 {

    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "TxAttr")
    @XmlSchemaType(name = "string")
    protected TransactionAttribute2Code txAttr;
    @XmlElement(name = "OthrTxAttr")
    protected String othrTxAttr;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification51 txId;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts2 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "OrgnlAddtlFee")
    protected List<AdditionalFee2> orgnlAddtlFee;
    @XmlElement(name = "AcctFr")
    protected AccountDetails3 acctFr;
    @XmlElement(name = "AcctTo")
    protected AccountDetails3 acctTo;
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
    public Transaction137 setTxTp(String value) {
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
    public Transaction137 setTxSubTp(String value) {
        this.txSubTp = value;
        return this;
    }

    /**
     * Gets the value of the txAttr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAttribute2Code }
     *     
     */
    public TransactionAttribute2Code getTxAttr() {
        return txAttr;
    }

    /**
     * Sets the value of the txAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAttribute2Code }
     *     
     */
    public Transaction137 setTxAttr(TransactionAttribute2Code value) {
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
    public Transaction137 setOthrTxAttr(String value) {
        this.othrTxAttr = value;
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
     * {@link AdditionalService2 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService2> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
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
     *     {@link TransactionIdentification51 }
     *     
     */
    public TransactionIdentification51 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification51 }
     *     
     */
    public Transaction137 setTxId(TransactionIdentification51 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public TransactionAmounts2 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public Transaction137 setTxAmts(TransactionAmounts2 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
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
     * @return
     *     The value of the addtlAmt property.
     */
    public List<AdditionalAmounts3> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
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
     * Gets the value of the orgnlAddtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlAddtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     * @return
     *     The value of the orgnlAddtlFee property.
     */
    public List<AdditionalFee2> getOrgnlAddtlFee() {
        if (orgnlAddtlFee == null) {
            orgnlAddtlFee = new ArrayList<>();
        }
        return this.orgnlAddtlFee;
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
    public Transaction137 setAcctFr(AccountDetails3 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails3 }
     *     
     */
    public AccountDetails3 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails3 }
     *     
     */
    public Transaction137 setAcctTo(AccountDetails3 value) {
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
    public Transaction137 setTxDesc(String value) {
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
    public Transaction137 addAddtlSvc(AdditionalService2 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public Transaction137 addSpclPrgrmmQlfctn(SpecialProgrammeQualification1 spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public Transaction137 addAddtlAmt(AdditionalAmounts3 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction137 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the orgnlAddtlFee list.
     * @see #getOrgnlAddtlFee()
     * 
     */
    public Transaction137 addOrgnlAddtlFee(AdditionalFee2 orgnlAddtlFee) {
        getOrgnlAddtlFee().add(orgnlAddtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction137 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
