
package com.prowidesoftware.swift.model.mx.dic;

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
 * The Additional Payment Information message is sent by an account servicing institution to an account owner.
 * This message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.
 * Usage
 * The Additional Payment Information message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.
 * The Additional Payment Information message covers one and only one original payment instruction. If several payment instructions need further details, multiple Additional Payment Information messages must be used, one for each of the payment instructions.
 * The AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.
 * - A Claim Non Receipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The Additional Payment Information can be used to provide the missing information.
 * - A Request To Modify Payment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this Additional Payment Information message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.
 * The Additional Payment Information message cannot be used to trigger a request for modification of a payment instruction activity. A Request To Modify Payment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an Additional Payment Information but instead a Request To Modify Payment message.
 * It is assumed that when an account servicing institution sends out an Additional Payment Information message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a Resolution Of Investigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalPaymentInformationV03", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "inf"
})
public class AdditionalPaymentInformationV03 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction1Choice undrlyg;
    @XmlElement(name = "Inf", required = true)
    protected PaymentComplementaryInformation2 inf;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseAssignment2 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment2 }
     *     
     */
    public AdditionalPaymentInformationV03 setAssgnmt(CaseAssignment2 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public AdditionalPaymentInformationV03 setCase(Case2 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction1Choice }
     *     
     */
    public UnderlyingTransaction1Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction1Choice }
     *     
     */
    public AdditionalPaymentInformationV03 setUndrlyg(UnderlyingTransaction1Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentComplementaryInformation2 }
     *     
     */
    public PaymentComplementaryInformation2 getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentComplementaryInformation2 }
     *     
     */
    public AdditionalPaymentInformationV03 setInf(PaymentComplementaryInformation2 value) {
        this.inf = value;
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

}
