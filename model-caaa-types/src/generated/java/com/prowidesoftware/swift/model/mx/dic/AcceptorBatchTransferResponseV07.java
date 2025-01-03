
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
@XmlType(name = "AcceptorBatchTransferResponseV07", propOrder = {
    "hdr",
    "btchTrfRspn",
    "sctyTrlr"
})
public class AcceptorBatchTransferResponseV07 {

    @XmlElement(name = "Hdr", required = true)
    protected Header25 hdr;
    @XmlElement(name = "BtchTrfRspn", required = true)
    protected CardPaymentBatchTransferResponse6 btchTrfRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType16 sctyTrlr;

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
    public AcceptorBatchTransferResponseV07 setHdr(Header25 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransferResponse6 }
     *     
     */
    public CardPaymentBatchTransferResponse6 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Sets the value of the btchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransferResponse6 }
     *     
     */
    public AcceptorBatchTransferResponseV07 setBtchTrfRspn(CardPaymentBatchTransferResponse6 value) {
        this.btchTrfRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType16 }
     *     
     */
    public ContentInformationType16 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType16 }
     *     
     */
    public AcceptorBatchTransferResponseV07 setSctyTrlr(ContentInformationType16 value) {
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
