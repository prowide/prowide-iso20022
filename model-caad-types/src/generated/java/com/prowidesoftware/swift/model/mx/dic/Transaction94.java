
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
@XmlType(name = "Transaction94", propOrder = {
    "rcncltnFctn",
    "rcncltnTp",
    "othrRcncltnTp",
    "txId",
    "reqdCcy",
    "rcncltnTtls",
    "addtlFees",
    "addtlData"
})
public class Transaction94 {

    @XmlElement(name = "RcncltnFctn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationFunction1Code rcncltnFctn;
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
    protected List<TransactionTotals11> rcncltnTtls;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
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
    public Transaction94 setRcncltnFctn(ReconciliationFunction1Code value) {
        this.rcncltnFctn = value;
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
    public Transaction94 setRcncltnTp(CardServiceType4Code value) {
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
    public Transaction94 setOthrRcncltnTp(String value) {
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
    public Transaction94 setTxId(TransactionIdentification12 value) {
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
     * {@link TransactionTotals11 }
     * 
     * 
     */
    public List<TransactionTotals11> getRcncltnTtls() {
        if (rcncltnTtls == null) {
            rcncltnTtls = new ArrayList<TransactionTotals11>();
        }
        return this.rcncltnTtls;
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
    public Transaction94 addReqdCcy(String reqdCcy) {
        getReqdCcy().add(reqdCcy);
        return this;
    }

    /**
     * Adds a new item to the rcncltnTtls list.
     * @see #getRcncltnTtls()
     * 
     */
    public Transaction94 addRcncltnTtls(TransactionTotals11 rcncltnTtls) {
        getRcncltnTtls().add(rcncltnTtls);
        return this;
    }

    /**
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction94 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction94 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
