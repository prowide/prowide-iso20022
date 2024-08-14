
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
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to inform the acceptor (or its agent) of the transfer in a previous AcceptorBatchTransfer of a collection of transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorBatchTransferResponseV06", propOrder = {
    "hdr",
    "btchTrfRspn",
    "sctyTrlr"
})
public class AcceptorBatchTransferResponseV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header25 hdr;
    @XmlElement(name = "BtchTrfRspn", required = true)
    protected CardPaymentBatchTransferResponse5 btchTrfRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType12 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header25 }
     *     
     */
    public Header25 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header25 }
     *     
     */
    public AcceptorBatchTransferResponseV06 setHdr(Header25 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransferResponse5 }
     *     
     */
    public CardPaymentBatchTransferResponse5 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Sets the value of the btchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransferResponse5 }
     *     
     */
    public AcceptorBatchTransferResponseV06 setBtchTrfRspn(CardPaymentBatchTransferResponse5 value) {
        this.btchTrfRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ContentInformationType12 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType12 }
     *     
     */
    public AcceptorBatchTransferResponseV06 setSctyTrlr(ContentInformationType12 value) {
        this.sctyTrlr = value;
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
