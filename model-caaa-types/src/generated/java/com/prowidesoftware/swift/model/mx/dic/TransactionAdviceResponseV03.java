
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
 * The TransactionAdviceResponse message is sent by the POI to acknowledge the Acquirer (or its agent) about the notification of the transaction advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAdviceResponseV03", propOrder = {
    "hdr",
    "txAdvcRspn",
    "sctyTrlr"
})
public class TransactionAdviceResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "TxAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponse10 txAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType31 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header59 }
     *     
     */
    public Header59 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header59 }
     *     
     */
    public TransactionAdviceResponseV03 setHdr(Header59 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse10 }
     *     
     */
    public AcceptorCompletionAdviceResponse10 getTxAdvcRspn() {
        return txAdvcRspn;
    }

    /**
     * Sets the value of the txAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse10 }
     *     
     */
    public TransactionAdviceResponseV03 setTxAdvcRspn(AcceptorCompletionAdviceResponse10 value) {
        this.txAdvcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType31 }
     *     
     */
    public ContentInformationType31 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType31 }
     *     
     */
    public TransactionAdviceResponseV03 setSctyTrlr(ContentInformationType31 value) {
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
