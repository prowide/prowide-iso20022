
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
 * The PaymentCancellationRequest message is sent by the initiating party or any agent, to the next party in the payment chain. It is used to request the cancellation of an instruction previously sent.
 * Usage
 * The PaymentCancellationRequest message is exchanged between non-financial institution customers and agents to request the cancellation of a payment initiation message previously sent (i.e. the CustomerCreditTransferInitiation message and the CustomerDirectDebitInitiation messages).
 * The PaymentCancellationRequest message can be used to request the cancellation of single instructions or multiple instructions, from one or multiple files.
 * The PaymentCancellationRequest message can be used in domestic and cross-border scenarios.
 * The PaymentCancellationRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.
 * The PaymentCancellationRequest message exchanged between non-financial institution customers and agents is identified in the schema as follows: urn:iso:std:iso:20022:tech:xsd:pain.006.001.01.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pain.006.001.01", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "txInf"
})
public class Pain00600101 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader7 grpHdr;
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation4 orgnlGrpInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransactionInformation3> txInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader7 }
     *     
     */
    public GroupHeader7 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader7 }
     *     
     */
    public Pain00600101 setGrpHdr(GroupHeader7 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation4 }
     *     
     */
    public OriginalGroupInformation4 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation4 }
     *     
     */
    public Pain00600101 setOrgnlGrpInf(OriginalGroupInformation4 value) {
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
     * {@link PaymentTransactionInformation3 }
     * 
     * 
     */
    public List<PaymentTransactionInformation3> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<PaymentTransactionInformation3>();
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
    public Pain00600101 addTxInf(PaymentTransactionInformation3 txInf) {
        getTxInf().add(txInf);
        return this;
    }

}
