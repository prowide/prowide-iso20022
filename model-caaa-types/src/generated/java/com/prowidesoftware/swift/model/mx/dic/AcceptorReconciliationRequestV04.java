
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
 * The AcceptorReconciliationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to ensure that the debits and credits performed by the acceptor matches the computed balances of the acquirer for the debits and credits performed during the same reconciliation period.
 * If the acceptor or the acquirer notices a difference in totals, the discrepancy will be resolved by other means, outside the scope of the protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorReconciliationRequestV04", propOrder = {
    "hdr",
    "rcncltnReq",
    "sctyTrlr"
})
public class AcceptorReconciliationRequestV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header10 hdr;
    @XmlElement(name = "RcncltnReq", required = true)
    protected AcceptorReconciliationRequest4 rcncltnReq;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType11 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header10 }
     *     
     */
    public Header10 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header10 }
     *     
     */
    public AcceptorReconciliationRequestV04 setHdr(Header10 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationRequest4 }
     *     
     */
    public AcceptorReconciliationRequest4 getRcncltnReq() {
        return rcncltnReq;
    }

    /**
     * Sets the value of the rcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationRequest4 }
     *     
     */
    public AcceptorReconciliationRequestV04 setRcncltnReq(AcceptorReconciliationRequest4 value) {
        this.rcncltnReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType11 }
     *     
     */
    public ContentInformationType11 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType11 }
     *     
     */
    public AcceptorReconciliationRequestV04 setSctyTrlr(ContentInformationType11 value) {
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
