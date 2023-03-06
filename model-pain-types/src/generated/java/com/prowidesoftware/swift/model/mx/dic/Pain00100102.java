
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
 * The CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.
 * Usage
 * The CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.
 * The CustomerCreditTransferInitiation message is used to exchange:
 * - One or more instances of a credit transfer initiation;
 * - Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;
 * - Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.
 * The message can be used in a direct or a relay scenario:
 * - In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.
 * - In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.
 * The CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.
 * The CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead.
 * If it is agreed to include the payment information related to the debit side only once (i.e. Grouped mode), the PaymentInformation block will be present only once.
 * If it is agreed to repeat the payment information related to the debit side (i.e. Single mode), the PaymentInformation block must be present once per occurrence of the CreditTransferTransactionInformation block.
 * The CustomerCreditTransferInitiation message also allows for a Mixed mode where the PaymentInformation block can be repeated and each PaymentInformation block can contain one or several CreditTransferTransactionInformation block(s).
 * Single
 * When grouping is set to Single, information for each individual instruction is included separately. This means the
 * PaymentInformation block is repeated, and present for each occurrence of the CreditTransferTransactionInformation block.
 * Grouped
 * When grouping is set to Grouped, the PaymentInformation block will be present once and the CreditTransferTransactionInformation block will be repeated.
 * Mixed
 * When grouping is set to Mixed, the PaymentInformation block may be present once or may be repeated. Each sequence
 * of the PaymentInformation block may contain one or several CreditTransferTransactionInformation block(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pain.001.001.02", propOrder = {
    "grpHdr",
    "pmtInf"
})
public class Pain00100102 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstructionInformation1> pmtInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public Pain00100102 setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstructionInformation1 }
     * 
     * 
     */
    public List<PaymentInstructionInformation1> getPmtInf() {
        if (pmtInf == null) {
            pmtInf = new ArrayList<PaymentInstructionInformation1>();
        }
        return this.pmtInf;
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
     * Adds a new item to the pmtInf list.
     * @see #getPmtInf()
     * 
     */
    public Pain00100102 addPmtInf(PaymentInstructionInformation1 pmtInf) {
        getPmtInf().add(pmtInf);
        return this;
    }

}
