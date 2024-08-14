
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
 * The TransactionAdvice message is sent by the Acquirer (or Agent) to provide to the POI the outcome of a transaction processed outside of this protocol. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAdviceV01", propOrder = {
    "hdr",
    "txAdvc",
    "sctyTrlr"
})
public class TransactionAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header58 hdr;
    @XmlElement(name = "TxAdvc", required = true)
    protected AcceptorCompletionAdvice9 txAdvc;
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
    public TransactionAdviceV01 setHdr(Header58 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdvice9 }
     *     
     */
    public AcceptorCompletionAdvice9 getTxAdvc() {
        return txAdvc;
    }

    /**
     * Sets the value of the txAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdvice9 }
     *     
     */
    public TransactionAdviceV01 setTxAdvc(AcceptorCompletionAdvice9 value) {
        this.txAdvc = value;
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
    public TransactionAdviceV01 setSctyTrlr(ContentInformationType24 value) {
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
