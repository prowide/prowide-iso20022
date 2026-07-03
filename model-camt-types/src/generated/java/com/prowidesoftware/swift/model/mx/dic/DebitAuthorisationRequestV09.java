
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
 * The DebitAuthorisationRequest message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.
 * Usage
 * The DebitAuthorisationRequest message must be answered with a DebitAuthorisationResponse message.
 * The DebitAuthorisationRequest message can be used to request debit authorisation in a:
 * - request to modify payment case (in the case of a lower final amount or change of creditor);
 * - request to cancel payment case (full amount);
 * - unable to apply case (the creditor whose account has been credited is not the intended beneficiary);
 * - claim non receipt case (the creditor whose account has been credited is not the intended beneficiary).
 * The DebitAuthorisationRequest message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple DebitAuthorisationRequest messages must be sent.
 * The DebitAuthorisationRequest must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a RequestToModifyPayment or CustomerPaymentCancellationRequest or FIToFIPaymentCancellationRequest message between subsequent agents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationRequestV09", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "dtl",
    "splmtryData"
})
public class DebitAuthorisationRequestV09 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction7Choice undrlyg;
    @XmlElement(name = "Dtl", required = true)
    protected DebitAuthorisation2 dtl;
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
    public DebitAuthorisationRequestV09 setAssgnmt(CaseAssignment5 value) {
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
    public DebitAuthorisationRequestV09 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public UnderlyingTransaction7Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public DebitAuthorisationRequestV09 setUndrlyg(UnderlyingTransaction7Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisation2 }
     *     
     */
    public DebitAuthorisation2 getDtl() {
        return dtl;
    }

    /**
     * Sets the value of the dtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisation2 }
     *     
     */
    public DebitAuthorisationRequestV09 setDtl(DebitAuthorisation2 value) {
        this.dtl = value;
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
    public DebitAuthorisationRequestV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
