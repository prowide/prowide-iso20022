
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
 * Scope
 * The PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.
 * Usage
 * The PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (that is FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).
 * The PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').
 * The PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.
 * The PaymentReturn message can be used in domestic and cross-border scenarios.
 * The PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnV09", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "txInf",
    "splmtryData"
})
public class PaymentReturnV09 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader90 grpHdr;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupHeader18 orgnlGrpInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction112> txInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader90 }
     *     
     */
    public GroupHeader90 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader90 }
     *     
     */
    public PaymentReturnV09 setGrpHdr(GroupHeader90 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader18 }
     *     
     */
    public OriginalGroupHeader18 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader18 }
     *     
     */
    public PaymentReturnV09 setOrgnlGrpInf(OriginalGroupHeader18 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction112 }
     * 
     * 
     * @return
     *     The value of the txInf property.
     */
    public List<PaymentTransaction112> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<>();
        }
        return this.txInf;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the txInf list.
     * @see #getTxInf()
     * 
     */
    public PaymentReturnV09 addTxInf(PaymentTransaction112 txInf) {
        getTxInf().add(txInf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentReturnV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
