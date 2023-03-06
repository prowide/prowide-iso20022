
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
 * Reconciliation transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction135", propOrder = {
    "rcncltnFctn",
    "rcncltnActvtyTp",
    "othrRcncltnActvtyTp",
    "rcncltnTp",
    "othrRcncltnTp",
    "txId",
    "reqdCcy",
    "rcncltnTtls",
    "addtlFee",
    "addtlData"
})
public class Transaction135 {

    @XmlElement(name = "RcncltnFctn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationFunction1Code rcncltnFctn;
    @XmlElement(name = "RcncltnActvtyTp")
    @XmlSchemaType(name = "string")
    protected ReconciliationActivityType1Code rcncltnActvtyTp;
    @XmlElement(name = "OthrRcncltnActvtyTp")
    protected String othrRcncltnActvtyTp;
    @XmlElement(name = "RcncltnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType4Code rcncltnTp;
    @XmlElement(name = "OthrRcncltnTp")
    protected String othrRcncltnTp;
    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "ReqdCcy")
    protected List<String> reqdCcy;
    @XmlElement(name = "RcncltnTtls")
    protected List<TransactionTotals13> rcncltnTtls;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the rcncltnFctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFunction1Code }
     *     
     */
    public ReconciliationFunction1Code getRcncltnFctn() {
        return rcncltnFctn;
    }

    /**
     * Sets the value of the rcncltnFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFunction1Code }
     *     
     */
    public Transaction135 setRcncltnFctn(ReconciliationFunction1Code value) {
        this.rcncltnFctn = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnActvtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationActivityType1Code }
     *     
     */
    public ReconciliationActivityType1Code getRcncltnActvtyTp() {
        return rcncltnActvtyTp;
    }

    /**
     * Sets the value of the rcncltnActvtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationActivityType1Code }
     *     
     */
    public Transaction135 setRcncltnActvtyTp(ReconciliationActivityType1Code value) {
        this.rcncltnActvtyTp = value;
        return this;
    }

    /**
     * Gets the value of the othrRcncltnActvtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcncltnActvtyTp() {
        return othrRcncltnActvtyTp;
    }

    /**
     * Sets the value of the othrRcncltnActvtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction135 setOthrRcncltnActvtyTp(String value) {
        this.othrRcncltnActvtyTp = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType4Code }
     *     
     */
    public CardServiceType4Code getRcncltnTp() {
        return rcncltnTp;
    }

    /**
     * Sets the value of the rcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType4Code }
     *     
     */
    public Transaction135 setRcncltnTp(CardServiceType4Code value) {
        this.rcncltnTp = value;
        return this;
    }

    /**
     * Gets the value of the othrRcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcncltnTp() {
        return othrRcncltnTp;
    }

    /**
     * Sets the value of the othrRcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction135 setOthrRcncltnTp(String value) {
        this.othrRcncltnTp = value;
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
    public Transaction135 setTxId(TransactionIdentification12 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the reqdCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReqdCcy() {
        if (reqdCcy == null) {
            reqdCcy = new ArrayList<String>();
        }
        return this.reqdCcy;
    }

    /**
     * Gets the value of the rcncltnTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcncltnTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals13 }
     * 
     * 
     */
    public List<TransactionTotals13> getRcncltnTtls() {
        if (rcncltnTtls == null) {
            rcncltnTtls = new ArrayList<TransactionTotals13>();
        }
        return this.rcncltnTtls;
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
     * Adds a new item to the reqdCcy list.
     * @see #getReqdCcy()
     * 
     */
    public Transaction135 addReqdCcy(String reqdCcy) {
        getReqdCcy().add(reqdCcy);
        return this;
    }

    /**
     * Adds a new item to the rcncltnTtls list.
     * @see #getRcncltnTtls()
     * 
     */
    public Transaction135 addRcncltnTtls(TransactionTotals13 rcncltnTtls) {
        getRcncltnTtls().add(rcncltnTtls);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction135 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction135 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
