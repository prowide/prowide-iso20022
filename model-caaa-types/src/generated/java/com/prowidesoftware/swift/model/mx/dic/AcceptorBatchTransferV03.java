
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
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer the  financial data of a collection of transactions to the acquirer (or its agent).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorBatchTransferV03", propOrder = {
    "hdr",
    "btchTrf",
    "sctyTrlr"
})
public class AcceptorBatchTransferV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header3 hdr;
    @XmlElement(name = "BtchTrf", required = true)
    protected CardPaymentBatchTransfer2 btchTrf;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType9 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header3 }
     *     
     */
    public Header3 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header3 }
     *     
     */
    public AcceptorBatchTransferV03 setHdr(Header3 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransfer2 }
     *     
     */
    public CardPaymentBatchTransfer2 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransfer2 }
     *     
     */
    public AcceptorBatchTransferV03 setBtchTrf(CardPaymentBatchTransfer2 value) {
        this.btchTrf = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType9 }
     *     
     */
    public ContentInformationType9 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType9 }
     *     
     */
    public AcceptorBatchTransferV03 setSctyTrlr(ContentInformationType9 value) {
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
