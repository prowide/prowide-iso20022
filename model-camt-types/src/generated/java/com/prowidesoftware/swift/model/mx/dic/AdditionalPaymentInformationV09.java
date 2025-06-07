
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
 * The AdditionalPaymentInformation message is sent by an account servicing institution to an account owner.
 * This message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.
 * Usage
 * The AdditionalPaymentInformation message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.
 * The AdditionalPaymentInformation message covers one and only one original payment instruction. If several payment instructions need further details, multiple AdditionalPaymentInformation messages must be used, one for each of the payment instructions.
 * The AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.
 * - A ClaimNonReceipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The AdditionalPaymentInformation can be used to provide the missing information;
 * - A RequestToModifyPayment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this AdditionalPaymentInformation message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.
 * The AdditionalPayment Information message cannot be used to trigger a request for modification of a payment instruction activity. A RequestToModifyPayment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an AdditionalPaymentInformation but instead a RequestToModifyPayment message.
 * It is assumed that when an account servicing institution sends out an AdditionalPaymentInformation message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a ResolutionOfInvestigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalPaymentInformationV09", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "inf",
    "splmtryData"
})
public class AdditionalPaymentInformationV09 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction5Choice undrlyg;
    @XmlElement(name = "Inf", required = true)
    protected PaymentComplementaryInformation8 inf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public AdditionalPaymentInformationV09 setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public AdditionalPaymentInformationV09 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public UnderlyingTransaction5Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public AdditionalPaymentInformationV09 setUndrlyg(UnderlyingTransaction5Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentComplementaryInformation8 }
     *     
     */
    public PaymentComplementaryInformation8 getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentComplementaryInformation8 }
     *     
     */
    public AdditionalPaymentInformationV09 setInf(PaymentComplementaryInformation8 value) {
        this.inf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AdditionalPaymentInformationV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
