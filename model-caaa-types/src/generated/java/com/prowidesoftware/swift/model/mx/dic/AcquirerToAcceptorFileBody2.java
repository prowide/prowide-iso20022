
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
 * Messages that can be exchanged between an acquirer and an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerToAcceptorFileBody2", propOrder = {
    "cmpltnAdvcRspn",
    "cxlRspn",
    "btchTrfRspn"
})
public class AcquirerToAcceptorFileBody2 {

    @XmlElement(name = "CmpltnAdvcRspn")
    protected AcceptorCompletionAdviceResponse13 cmpltnAdvcRspn;
    @XmlElement(name = "CxlRspn")
    protected AcceptorCancellationAdviceResponse13 cxlRspn;
    @XmlElement(name = "BtchTrfRspn")
    protected CardPaymentBatchTransferResponse12 btchTrfRspn;

    /**
     * Gets the value of the cmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse13 }
     *     
     */
    public AcceptorCompletionAdviceResponse13 getCmpltnAdvcRspn() {
        return cmpltnAdvcRspn;
    }

    /**
     * Sets the value of the cmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse13 }
     *     
     */
    public AcquirerToAcceptorFileBody2 setCmpltnAdvcRspn(AcceptorCompletionAdviceResponse13 value) {
        this.cmpltnAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse13 }
     *     
     */
    public AcceptorCancellationAdviceResponse13 getCxlRspn() {
        return cxlRspn;
    }

    /**
     * Sets the value of the cxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse13 }
     *     
     */
    public AcquirerToAcceptorFileBody2 setCxlRspn(AcceptorCancellationAdviceResponse13 value) {
        this.cxlRspn = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransferResponse12 }
     *     
     */
    public CardPaymentBatchTransferResponse12 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Sets the value of the btchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransferResponse12 }
     *     
     */
    public AcquirerToAcceptorFileBody2 setBtchTrfRspn(CardPaymentBatchTransferResponse12 value) {
        this.btchTrfRspn = value;
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
