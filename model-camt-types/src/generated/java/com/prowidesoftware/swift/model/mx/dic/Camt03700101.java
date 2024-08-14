
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
 * The Debit Authorisation Request message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.
 * Usage
 * The Debit Authorisation Request message must be answered with a Debit Authorisation Response message.
 * The Debit Authorisation Request message can be used to request debit authorisation in a:
 * - request to modify payment case (in the case of a lower final amount or change of creditor)
 * - request to cancel payment case (full amount)
 * - unable to apply case (the creditor whose account has been credited is not the intended beneficiary)
 * - claim non receipt case (the creditor whose account has been credited is not the intended beneficiary)
 * The Debit Authorisation Request message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple Debit Authorisation Request messages must be sent.
 * The Debit Authorisation Request must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a Request To Modify Payment or Request To Cancel Payment message between subsequent agents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.037.001.01", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "dtl"
})
public class Camt03700101 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected PaymentInstructionExtract undrlyg;
    @XmlElement(name = "Dtl", required = true)
    protected DebitAuthorisationDetails dtl;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt03700101 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public Camt03700101 setCase(Case value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionExtract }
     *     
     */
    public PaymentInstructionExtract getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionExtract }
     *     
     */
    public Camt03700101 setUndrlyg(PaymentInstructionExtract value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationDetails }
     *     
     */
    public DebitAuthorisationDetails getDtl() {
        return dtl;
    }

    /**
     * Sets the value of the dtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationDetails }
     *     
     */
    public Camt03700101 setDtl(DebitAuthorisationDetails value) {
        this.dtl = value;
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
