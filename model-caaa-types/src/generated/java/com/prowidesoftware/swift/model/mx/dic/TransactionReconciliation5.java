
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
 * Reconciliation transaction between an acceptor and an acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReconciliation5", propOrder = {
    "clsPrd",
    "rcncltnTxId",
    "rcncltnId",
    "txTtls",
    "addtlTxData"
})
public class TransactionReconciliation5 {

    @XmlElement(name = "ClsPrd")
    protected Boolean clsPrd;
    @XmlElement(name = "RcncltnTxId", required = true)
    protected TransactionIdentifier1 rcncltnTxId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "TxTtls")
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "AddtlTxData")
    protected String addtlTxData;

    /**
     * Gets the value of the clsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsPrd() {
        return clsPrd;
    }

    /**
     * Sets the value of the clsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionReconciliation5 setClsPrd(Boolean value) {
        this.clsPrd = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getRcncltnTxId() {
        return rcncltnTxId;
    }

    /**
     * Sets the value of the rcncltnTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionReconciliation5 setRcncltnTxId(TransactionIdentifier1 value) {
        this.rcncltnTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionReconciliation5 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals12 }
     * 
     * 
     */
    public List<TransactionTotals12> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals12>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the addtlTxData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxData() {
        return addtlTxData;
    }

    /**
     * Sets the value of the addtlTxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionReconciliation5 setAddtlTxData(String value) {
        this.addtlTxData = value;
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
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public TransactionReconciliation5 addTxTtls(TransactionTotals12 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

}
