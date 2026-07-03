
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
 * The TransactionAdviceResponse message is sent by the POI to acknowledge the Acquirer (or its agent) about the notification of the transaction advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAdviceResponseV01", propOrder = {
    "hdr",
    "txAdvcRspn",
    "sctyTrlr"
})
public class TransactionAdviceResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header58 hdr;
    @XmlElement(name = "TxAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponse8 txAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType24 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header58 }
     *     
     */
    public Header58 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header58 }
     *     
     */
    public TransactionAdviceResponseV01 setHdr(Header58 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse8 }
     *     
     */
    public AcceptorCompletionAdviceResponse8 getTxAdvcRspn() {
        return txAdvcRspn;
    }

    /**
     * Sets the value of the txAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse8 }
     *     
     */
    public TransactionAdviceResponseV01 setTxAdvcRspn(AcceptorCompletionAdviceResponse8 value) {
        this.txAdvcRspn = value;
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
    public TransactionAdviceResponseV01 setSctyTrlr(ContentInformationType24 value) {
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
