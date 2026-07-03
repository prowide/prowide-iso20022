
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "DebitAuthorisationRequestV03", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "dtl"
})
public class DebitAuthorisationRequestV03 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction1Choice undrlyg;
    @XmlElement(name = "Dtl", required = true)
    protected DebitAuthorisationDetails3 dtl;

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
    public DebitAuthorisationRequestV03 setAssgnmt(CaseAssignment2 value) {
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
    public DebitAuthorisationRequestV03 setCase(Case2 value) {
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
    public DebitAuthorisationRequestV03 setUndrlyg(UnderlyingTransaction1Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationDetails3 }
     *     
     */
    public DebitAuthorisationDetails3 getDtl() {
        return dtl;
    }

    /**
     * Sets the value of the dtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationDetails3 }
     *     
     */
    public DebitAuthorisationRequestV03 setDtl(DebitAuthorisationDetails3 value) {
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
