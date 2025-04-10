
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
 * The BankServicesBillingStatement message is used to send from a Financial Institution (FI) to its wholesale customers (corporations, governments, institutions, etc.), information describing the FI’s billing of services rendered in the form of an electronic statement in a standardised format. The BankServicesBillingStatement is a periodic (usually end of month) recounting of all service chargeable events that occurred during a reporting cycle, typically a calendar month, along with detailed tax and currency translation information. Account balance information, although strongly recommended, is not required.
 * Usage
 * The BankServicesBillingStatement message is designed to provide details related to invoices (or an advice of debit) which a financial institution may supply to its customers. The BankServicesBillingStatement is not expressly designed to be an invoice, nor to replace invoices currently in use. The message may be used as an invoice by agreement between the sender and the receiver. No regulatory or legislative requirements were considered when creating this message standard. Users of the BankServicesBillingStatement message are cautioned to be aware of any regulatory or legal requirement for invoices before replacing existing invoices.
 * The BankServicesBillingStatement message can supply the detail supporting separate invoices or debits but it is not the invoice or advice of debit of record. The BankServicesBillingStatement message must accurately reflect all the charge and tax related events that occurred during the calendar month and how the FI and taxing authorities were compensated for these events. The BankServicesBillingStatement does not ask the financial institution to revise its established pricing and billing procedures. 
 * How, when and what the customer is actually charged for remains in place. The BankServicesBillingStatement message asks the financial institution to aggregate and report what actually happened during the calendar month.
 * The BankServicesBillingStatement message is intended for use with the ISO 20022 Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankServicesBillingStatementV02", propOrder = {
    "rptHdr",
    "bllgStmtGrp"
})
public class BankServicesBillingStatementV02 {

    @XmlElement(name = "RptHdr", required = true)
    protected ReportHeader3 rptHdr;
    @XmlElement(name = "BllgStmtGrp", required = true)
    protected List<StatementGroup2> bllgStmtGrp;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader3 }
     *     
     */
    public ReportHeader3 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader3 }
     *     
     */
    public BankServicesBillingStatementV02 setRptHdr(ReportHeader3 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgStmtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgStmtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgStmtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementGroup2 }
     * 
     * 
     * @return
     *     The value of the bllgStmtGrp property.
     */
    public List<StatementGroup2> getBllgStmtGrp() {
        if (bllgStmtGrp == null) {
            bllgStmtGrp = new ArrayList<>();
        }
        return this.bllgStmtGrp;
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
     * Adds a new item to the bllgStmtGrp list.
     * @see #getBllgStmtGrp()
     * 
     */
    public BankServicesBillingStatementV02 addBllgStmtGrp(StatementGroup2 bllgStmtGrp) {
        getBllgStmtGrp().add(bllgStmtGrp);
        return this;
    }

}
