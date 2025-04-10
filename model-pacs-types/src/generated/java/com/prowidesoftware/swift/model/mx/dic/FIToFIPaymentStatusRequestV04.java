
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
 * The FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to request a FIToFIPaymentStatusReport message containing information on the status of a previously sent instruction. 
 * Usage
 * The FIToFIPaymentStatusRequest message is exchanged between agents to request status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.
 * The FIToFIPaymentStatusRequest message can be used to request information about the status (such as rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).
 * The FIToFIPaymentStatusRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.
 * The FIToFIPaymentStatusRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIToFIPaymentStatusRequestV04", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "txInf",
    "splmtryData"
})
public class FIToFIPaymentStatusRequestV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader91 grpHdr;
    @XmlElement(name = "OrgnlGrpInf")
    protected List<OriginalGroupInformation27> orgnlGrpInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction121> txInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader91 }
     *     
     */
    public GroupHeader91 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader91 }
     *     
     */
    public FIToFIPaymentStatusRequestV04 setGrpHdr(GroupHeader91 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlGrpInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlGrpInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalGroupInformation27 }
     * 
     * 
     * @return
     *     The value of the orgnlGrpInf property.
     */
    public List<OriginalGroupInformation27> getOrgnlGrpInf() {
        if (orgnlGrpInf == null) {
            orgnlGrpInf = new ArrayList<>();
        }
        return this.orgnlGrpInf;
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
     * {@link PaymentTransaction121 }
     * 
     * 
     * @return
     *     The value of the txInf property.
     */
    public List<PaymentTransaction121> getTxInf() {
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
     * Adds a new item to the orgnlGrpInf list.
     * @see #getOrgnlGrpInf()
     * 
     */
    public FIToFIPaymentStatusRequestV04 addOrgnlGrpInf(OriginalGroupInformation27 orgnlGrpInf) {
        getOrgnlGrpInf().add(orgnlGrpInf);
        return this;
    }

    /**
     * Adds a new item to the txInf list.
     * @see #getTxInf()
     * 
     */
    public FIToFIPaymentStatusRequestV04 addTxInf(PaymentTransaction121 txInf) {
        getTxInf().add(txInf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FIToFIPaymentStatusRequestV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
