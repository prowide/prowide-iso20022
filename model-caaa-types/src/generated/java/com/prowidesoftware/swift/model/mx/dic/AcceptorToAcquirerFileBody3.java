
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
 * Messages that can be exchanged between an acceptor and an acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorToAcquirerFileBody3", propOrder = {
    "cmpltnAdvc",
    "cxlAdvc",
    "btchTrf"
})
public class AcceptorToAcquirerFileBody3 {

    @XmlElement(name = "CmpltnAdvc")
    protected AcceptorCompletionAdvice15 cmpltnAdvc;
    @XmlElement(name = "CxlAdvc")
    protected AcceptorCancellationAdvice15 cxlAdvc;
    @XmlElement(name = "BtchTrf")
    protected CardPaymentBatchTransfer14 btchTrf;

    /**
     * Gets the value of the cmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice15 }
     *     
     */
    public AcceptorCompletionAdvice15 getCmpltnAdvc() {
        return cmpltnAdvc;
    }

    /**
     * Sets the value of the cmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice15 }
     *     
     */
    public AcceptorToAcquirerFileBody3 setCmpltnAdvc(AcceptorCompletionAdvice15 value) {
        this.cmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdvice15 }
     *     
     */
    public AcceptorCancellationAdvice15 getCxlAdvc() {
        return cxlAdvc;
    }

    /**
     * Sets the value of the cxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdvice15 }
     *     
     */
    public AcceptorToAcquirerFileBody3 setCxlAdvc(AcceptorCancellationAdvice15 value) {
        this.cxlAdvc = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransfer14 }
     *     
     */
    public CardPaymentBatchTransfer14 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransfer14 }
     *     
     */
    public AcceptorToAcquirerFileBody3 setBtchTrf(CardPaymentBatchTransfer14 value) {
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
