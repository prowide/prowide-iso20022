
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
 * Scope
 * The AcceptorReconciliationRequest message is sent by the card acceptor to the acquirer or an agent to communicate the totals of the card payment transaction for a reconciliation period. An agent never forwards the message.
 * Usage
 * The AcceptorReconciliationRequest message is used to ensure that the debits and credits correspond to the balances computed by the acquirer or its agent for the same reconciliation period.
 * The AcceptorReconciliationRequest message is also used to close a reconciliation period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorReconciliationRequestV01", propOrder = {
    "hdr",
    "rcncltnReq",
    "sctyTrlr"
})
public class AcceptorReconciliationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "RcncltnReq", required = true)
    protected AcceptorReconciliationRequest1 rcncltnReq;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType3 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header1 }
     *     
     */
    public Header1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header1 }
     *     
     */
    public AcceptorReconciliationRequestV01 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationRequest1 }
     *     
     */
    public AcceptorReconciliationRequest1 getRcncltnReq() {
        return rcncltnReq;
    }

    /**
     * Sets the value of the rcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationRequest1 }
     *     
     */
    public AcceptorReconciliationRequestV01 setRcncltnReq(AcceptorReconciliationRequest1 value) {
        this.rcncltnReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType3 }
     *     
     */
    public ContentInformationType3 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType3 }
     *     
     */
    public AcceptorReconciliationRequestV01 setSctyTrlr(ContentInformationType3 value) {
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
