
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
@XmlType(name = "DebitAuthorisationRequestV04", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "dtl",
    "splmtryData"
})
public class DebitAuthorisationRequestV04 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment3 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case3 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction2Choice undrlyg;
    @XmlElement(name = "Dtl", required = true)
    protected DebitAuthorisation1 dtl;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment3 }
     *     
     */
    public CaseAssignment3 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment3 }
     *     
     */
    public DebitAuthorisationRequestV04 setAssgnmt(CaseAssignment3 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case3 }
     *     
     */
    public Case3 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case3 }
     *     
     */
    public DebitAuthorisationRequestV04 setCase(Case3 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction2Choice }
     *     
     */
    public UnderlyingTransaction2Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction2Choice }
     *     
     */
    public DebitAuthorisationRequestV04 setUndrlyg(UnderlyingTransaction2Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisation1 }
     *     
     */
    public DebitAuthorisation1 getDtl() {
        return dtl;
    }

    /**
     * Sets the value of the dtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisation1 }
     *     
     */
    public DebitAuthorisationRequestV04 setDtl(DebitAuthorisation1 value) {
        this.dtl = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DebitAuthorisationRequestV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
