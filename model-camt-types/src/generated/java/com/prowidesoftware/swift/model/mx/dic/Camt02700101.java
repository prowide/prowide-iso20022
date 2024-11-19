
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
 * The Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.
 * This message allows to initiate an investigation in case the beneficiary of a payment has not received an expected payment.
 * Usage
 * Note 1: Although there are cases where a creditor would contact the creditor's bank when claiming non-receipt, the activity only retained the scenario where the beneficiary claims non-receipt with its debtor, the debtor in its turn contacting the first agent. Therefore the investigation follows the same route as the original instruction.
 * Note 2: This message is also used to report a missing cover. The rationale behind this is that the beneficiary of the cover (receiver of the payment instruction) missing the cover would be in the very same position as a beneficiary expecting a credit to its account and would therefore trigger the same processes.
 * In case of a Missing cover, the case will be assigned to the sender of the payment instruction, before following the route of the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.027.001.01", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "mssngCover"
})
public class Camt02700101 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected PaymentInstructionExtract undrlyg;
    @XmlElement(name = "MssngCover")
    protected MissingCover mssngCover;

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
    public Camt02700101 setAssgnmt(CaseAssignment value) {
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
    public Camt02700101 setCase(Case value) {
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
    public Camt02700101 setUndrlyg(PaymentInstructionExtract value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the mssngCover property.
     * 
     * @return
     *     possible object is
     *     {@link MissingCover }
     *     
     */
    public MissingCover getMssngCover() {
        return mssngCover;
    }

    /**
     * Sets the value of the mssngCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingCover }
     *     
     */
    public Camt02700101 setMssngCover(MissingCover value) {
        this.mssngCover = value;
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
