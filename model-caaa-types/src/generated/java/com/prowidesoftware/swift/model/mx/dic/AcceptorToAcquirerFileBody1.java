
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
 * AcceptorToAcquirerFileBody1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorToAcquirerFileBody1", propOrder = {
    "cmpltnAdvc",
    "cxlAdvc",
    "btchTrf"
})
public class AcceptorToAcquirerFileBody1 {

    @XmlElement(name = "CmpltnAdvc")
    protected AcceptorCompletionAdvice13 cmpltnAdvc;
    @XmlElement(name = "CxlAdvc")
    protected AcceptorCancellationAdvice13 cxlAdvc;
    @XmlElement(name = "BtchTrf")
    protected CardPaymentBatchTransfer12 btchTrf;

    /**
     * Gets the value of the cmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice13 }
     *     
     */
    public AcceptorCompletionAdvice13 getCmpltnAdvc() {
        return cmpltnAdvc;
    }

    /**
     * Sets the value of the cmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice13 }
     *     
     */
    public AcceptorToAcquirerFileBody1 setCmpltnAdvc(AcceptorCompletionAdvice13 value) {
        this.cmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdvice13 }
     *     
     */
    public AcceptorCancellationAdvice13 getCxlAdvc() {
        return cxlAdvc;
    }

    /**
     * Sets the value of the cxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdvice13 }
     *     
     */
    public AcceptorToAcquirerFileBody1 setCxlAdvc(AcceptorCancellationAdvice13 value) {
        this.cxlAdvc = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransfer12 }
     *     
     */
    public CardPaymentBatchTransfer12 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransfer12 }
     *     
     */
    public AcceptorToAcquirerFileBody1 setBtchTrf(CardPaymentBatchTransfer12 value) {
        this.btchTrf = value;
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
