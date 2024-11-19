
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
 * AcquirerToAcceptorFileBody1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerToAcceptorFileBody1", propOrder = {
    "cmpltnAdvcRspn",
    "cxlRspn",
    "btchTrfRspn"
})
public class AcquirerToAcceptorFileBody1 {

    @XmlElement(name = "CmpltnAdvcRspn")
    protected AcceptorCompletionAdviceResponse12 cmpltnAdvcRspn;
    @XmlElement(name = "CxlRspn")
    protected AcceptorCancellationAdviceResponse12 cxlRspn;
    @XmlElement(name = "BtchTrfRspn")
    protected CardPaymentBatchTransferResponse11 btchTrfRspn;

    /**
     * Gets the value of the cmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse12 }
     *     
     */
    public AcceptorCompletionAdviceResponse12 getCmpltnAdvcRspn() {
        return cmpltnAdvcRspn;
    }

    /**
     * Sets the value of the cmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse12 }
     *     
     */
    public AcquirerToAcceptorFileBody1 setCmpltnAdvcRspn(AcceptorCompletionAdviceResponse12 value) {
        this.cmpltnAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse12 }
     *     
     */
    public AcceptorCancellationAdviceResponse12 getCxlRspn() {
        return cxlRspn;
    }

    /**
     * Sets the value of the cxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse12 }
     *     
     */
    public AcquirerToAcceptorFileBody1 setCxlRspn(AcceptorCancellationAdviceResponse12 value) {
        this.cxlRspn = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransferResponse11 }
     *     
     */
    public CardPaymentBatchTransferResponse11 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Sets the value of the btchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransferResponse11 }
     *     
     */
    public AcquirerToAcceptorFileBody1 setBtchTrfRspn(CardPaymentBatchTransferResponse11 value) {
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
