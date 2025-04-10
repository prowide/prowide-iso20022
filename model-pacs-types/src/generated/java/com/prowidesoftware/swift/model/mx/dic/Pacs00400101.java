
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.
 * Usage
 * The PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).
 * The PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through an Advice of Credit/Debit message and/or Statement message.
 * The PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.
 * The PaymentReturn message can be used in domestic and cross-border scenarios.
 * The PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction..
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacs.004.001.01", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "txInf"
})
public class Pacs00400101 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader6 grpHdr;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation2 orgnlGrpInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransactionInformation2> txInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader6 }
     *     
     */
    public GroupHeader6 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader6 }
     *     
     */
    public Pacs00400101 setGrpHdr(GroupHeader6 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation2 }
     *     
     */
    public OriginalGroupInformation2 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation2 }
     *     
     */
    public Pacs00400101 setOrgnlGrpInf(OriginalGroupInformation2 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInf property.
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
     * {@link PaymentTransactionInformation2 }
     * 
     * 
     */
    public List<PaymentTransactionInformation2> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<PaymentTransactionInformation2>();
        }
        return this.txInf;
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
    public Pacs00400101 addTxInf(PaymentTransactionInformation2 txInf) {
        getTxInf().add(txInf);
        return this;
    }

}
