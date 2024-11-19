
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
@XmlType(name = "AcceptorBatchTransferV09", propOrder = {
    "hdr",
    "btchTrf",
    "sctyTrlr"
})
public class AcceptorBatchTransferV09 {

    @XmlElement(name = "Hdr", required = true)
    protected Header56 hdr;
    @XmlElement(name = "BtchTrf", required = true)
    protected CardPaymentBatchTransfer8 btchTrf;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType24 sctyTrlr;

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
    public AcceptorBatchTransferV09 setHdr(Header56 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransfer8 }
     *     
     */
    public CardPaymentBatchTransfer8 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransfer8 }
     *     
     */
    public AcceptorBatchTransferV09 setBtchTrf(CardPaymentBatchTransfer8 value) {
        this.btchTrf = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType24 }
     *     
     */
    public ContentInformationType24 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType24 }
     *     
     */
    public AcceptorBatchTransferV09 setSctyTrlr(ContentInformationType24 value) {
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
