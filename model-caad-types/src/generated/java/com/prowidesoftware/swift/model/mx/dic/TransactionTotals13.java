
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
 * Totals of the reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals13", propOrder = {
    "rcncltn",
    "finRcncltn",
    "msgRcncltn",
    "addtlFeeRcncltn",
    "ccy",
    "netAmtRcncltn"
})
public class TransactionTotals13 {

    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "FinRcncltn")
    protected List<FinancialReconciliation2> finRcncltn;
    @XmlElement(name = "MsgRcncltn")
    protected List<MessageReconciliation3> msgRcncltn;
    @XmlElement(name = "AddtlFeeRcncltn")
    protected List<AdditionalFeeReconciliation2> addtlFeeRcncltn;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "NetAmtRcncltn")
    protected Amount16 netAmtRcncltn;

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public TransactionTotals13 setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the finRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialReconciliation2 }
     * 
     * 
     */
    public List<FinancialReconciliation2> getFinRcncltn() {
        if (finRcncltn == null) {
            finRcncltn = new ArrayList<FinancialReconciliation2>();
        }
        return this.finRcncltn;
    }

    /**
     * Gets the value of the msgRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageReconciliation3 }
     * 
     * 
     */
    public List<MessageReconciliation3> getMsgRcncltn() {
        if (msgRcncltn == null) {
            msgRcncltn = new ArrayList<MessageReconciliation3>();
        }
        return this.msgRcncltn;
    }

    /**
     * Gets the value of the addtlFeeRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFeeRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFeeRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFeeReconciliation2 }
     * 
     * 
     */
    public List<AdditionalFeeReconciliation2> getAddtlFeeRcncltn() {
        if (addtlFeeRcncltn == null) {
            addtlFeeRcncltn = new ArrayList<AdditionalFeeReconciliation2>();
        }
        return this.addtlFeeRcncltn;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals13 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the netAmtRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Amount16 }
     *     
     */
    public Amount16 getNetAmtRcncltn() {
        return netAmtRcncltn;
    }

    /**
     * Sets the value of the netAmtRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount16 }
     *     
     */
    public TransactionTotals13 setNetAmtRcncltn(Amount16 value) {
        this.netAmtRcncltn = value;
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
     * Adds a new item to the finRcncltn list.
     * @see #getFinRcncltn()
     * 
     */
    public TransactionTotals13 addFinRcncltn(FinancialReconciliation2 finRcncltn) {
        getFinRcncltn().add(finRcncltn);
        return this;
    }

    /**
     * Adds a new item to the msgRcncltn list.
     * @see #getMsgRcncltn()
     * 
     */
    public TransactionTotals13 addMsgRcncltn(MessageReconciliation3 msgRcncltn) {
        getMsgRcncltn().add(msgRcncltn);
        return this;
    }

    /**
     * Adds a new item to the addtlFeeRcncltn list.
     * @see #getAddtlFeeRcncltn()
     * 
     */
    public TransactionTotals13 addAddtlFeeRcncltn(AdditionalFeeReconciliation2 addtlFeeRcncltn) {
        getAddtlFeeRcncltn().add(addtlFeeRcncltn);
        return this;
    }

}
