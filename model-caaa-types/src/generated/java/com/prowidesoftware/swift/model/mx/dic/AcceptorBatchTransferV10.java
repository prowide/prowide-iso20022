
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
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer the financial data of a collection of transactions to the acquirer (or its agent).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorBatchTransferV10", propOrder = {
    "hdr",
    "btchTrf",
    "sctyTrlr"
})
public class AcceptorBatchTransferV10 {

    @XmlElement(name = "Hdr", required = true)
    protected Header56 hdr;
    @XmlElement(name = "BtchTrf", required = true)
    protected CardPaymentBatchTransfer9 btchTrf;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType27 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header56 }
     *     
     */
    public Header56 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header56 }
     *     
     */
    public AcceptorBatchTransferV10 setHdr(Header56 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransfer9 }
     *     
     */
    public CardPaymentBatchTransfer9 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransfer9 }
     *     
     */
    public AcceptorBatchTransferV10 setBtchTrf(CardPaymentBatchTransfer9 value) {
        this.btchTrf = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType27 }
     *     
     */
    public ContentInformationType27 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType27 }
     *     
     */
    public AcceptorBatchTransferV10 setSctyTrlr(ContentInformationType27 value) {
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
