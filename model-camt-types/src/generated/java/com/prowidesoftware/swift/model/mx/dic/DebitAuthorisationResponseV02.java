
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
 * The Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.
 * Usage
 * The Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.
 * The Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.
 * The Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.
 * The Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationResponseV02", propOrder = {
    "assgnmt",
    "_case",
    "conf"
})
public class DebitAuthorisationResponseV02 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "Conf", required = true)
    protected DebitAuthorisationConfirmation2 conf;

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
    public DebitAuthorisationResponseV02 setAssgnmt(CaseAssignment2 value) {
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
    public DebitAuthorisationResponseV02 setCase(Case2 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationConfirmation2 }
     *     
     */
    public DebitAuthorisationConfirmation2 getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationConfirmation2 }
     *     
     */
    public DebitAuthorisationResponseV02 setConf(DebitAuthorisationConfirmation2 value) {
        this.conf = value;
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
