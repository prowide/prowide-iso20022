
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a list of pending statuses, final statuses or all statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCodeSearch2Choice", propOrder = {
    "pdgSts",
    "fnlSts",
    "pdgAndFnlSts"
})
public class PaymentStatusCodeSearch2Choice {

    @XmlElement(name = "PdgSts")
    @XmlSchemaType(name = "string")
    protected PendingStatus4Code pdgSts;
    @XmlElement(name = "FnlSts")
    @XmlSchemaType(name = "string")
    protected FinalStatusCode fnlSts;
    @XmlElement(name = "PdgAndFnlSts")
    @XmlSchemaType(name = "string")
    protected CashPaymentStatus2Code pdgAndFnlSts;

    /**
     * Gets the value of the pdgSts property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PendingStatus4Code getPdgSts() {
        return pdgSts;
    }

    /**
     * Sets the value of the pdgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PaymentStatusCodeSearch2Choice setPdgSts(PendingStatus4Code value) {
        this.pdgSts = value;
        return this;
    }

    /**
     * Gets the value of the fnlSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinalStatusCode }
     *     
     */
    public FinalStatusCode getFnlSts() {
        return fnlSts;
    }

    /**
     * Sets the value of the fnlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalStatusCode }
     *     
     */
    public PaymentStatusCodeSearch2Choice setFnlSts(FinalStatusCode value) {
        this.fnlSts = value;
        return this;
    }

    /**
     * Gets the value of the pdgAndFnlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CashPaymentStatus2Code }
     *     
     */
    public CashPaymentStatus2Code getPdgAndFnlSts() {
        return pdgAndFnlSts;
    }

    /**
     * Sets the value of the pdgAndFnlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPaymentStatus2Code }
     *     
     */
    public PaymentStatusCodeSearch2Choice setPdgAndFnlSts(CashPaymentStatus2Code value) {
        this.pdgAndFnlSts = value;
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
