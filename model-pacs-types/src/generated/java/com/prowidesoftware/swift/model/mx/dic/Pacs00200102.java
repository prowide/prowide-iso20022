
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
 * The PaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.
 * Usage
 * The PaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.
 * The PaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (e.g. PaymentCancellationRequest).
 * The PaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.
 * The PaymentStatusReport message can be used in domestic and cross-border scenarios.
 * The PaymentStatusReport message exchanged between agents is identified in the schema as follows: 
 * urn:iso:std:iso:20022:tech:xsd:pacs.002.001.02.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacs.002.001.02", propOrder = {
    "grpHdr",
    "orgnlGrpInfAndSts",
    "txInfAndSts"
})
public class Pacs00200102 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader5 grpHdr;
    @XmlElement(name = "OrgnlGrpInfAndSts", required = true)
    protected OriginalGroupInformation1 orgnlGrpInfAndSts;
    @XmlElement(name = "TxInfAndSts")
    protected List<PaymentTransactionInformation1> txInfAndSts;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader5 }
     *     
     */
    public GroupHeader5 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader5 }
     *     
     */
    public Pacs00200102 setGrpHdr(GroupHeader5 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation1 }
     *     
     */
    public OriginalGroupInformation1 getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation1 }
     *     
     */
    public Pacs00200102 setOrgnlGrpInfAndSts(OriginalGroupInformation1 value) {
        this.orgnlGrpInfAndSts = value;
        return this;
    }

    /**
     * Gets the value of the txInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransactionInformation1 }
     * 
     * 
     * @return
     *     The value of the txInfAndSts property.
     */
    public List<PaymentTransactionInformation1> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<>();
        }
        return this.txInfAndSts;
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
     * Adds a new item to the txInfAndSts list.
     * @see #getTxInfAndSts()
     * 
     */
    public Pacs00200102 addTxInfAndSts(PaymentTransactionInformation1 txInfAndSts) {
        getTxInfAndSts().add(txInfAndSts);
        return this;
    }

}
