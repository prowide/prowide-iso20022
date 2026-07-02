
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
 * The ReconciliationInitiation message is sent by an acquirer or an agent to an issuer or an agent, to initiate an exchange of totals to be reconciled for debits, credits, chargebacks and other transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationInitiation", propOrder = {
    "hdr",
    "rcncltnInitn",
    "sctyTrlr"
})
public class ReconciliationInitiation {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "RcncltnInitn", required = true)
    protected AcquirerReconciliationInitiation1 rcncltnInitn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header17 }
     *     
     */
    public Header17 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header17 }
     *     
     */
    public ReconciliationInitiation setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerReconciliationInitiation1 }
     *     
     */
    public AcquirerReconciliationInitiation1 getRcncltnInitn() {
        return rcncltnInitn;
    }

    /**
     * Sets the value of the rcncltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerReconciliationInitiation1 }
     *     
     */
    public ReconciliationInitiation setRcncltnInitn(AcquirerReconciliationInitiation1 value) {
        this.rcncltnInitn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ReconciliationInitiation setSctyTrlr(ContentInformationType15 value) {
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
