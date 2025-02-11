
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
 * The AcquirerReversalInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the reversal of a card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerReversalInitiation", propOrder = {
    "hdr",
    "rvslInitn",
    "sctyTrlr"
})
public class AcquirerReversalInitiation {

    @XmlElement(name = "Hdr", required = true)
    protected Header18 hdr;
    @XmlElement(name = "RvslInitn", required = true)
    protected AcquirerReversalInitiation1 rvslInitn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header18 }
     *     
     */
    public Header18 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header18 }
     *     
     */
    public AcquirerReversalInitiation setHdr(Header18 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rvslInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerReversalInitiation1 }
     *     
     */
    public AcquirerReversalInitiation1 getRvslInitn() {
        return rvslInitn;
    }

    /**
     * Sets the value of the rvslInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerReversalInitiation1 }
     *     
     */
    public AcquirerReversalInitiation setRvslInitn(AcquirerReversalInitiation1 value) {
        this.rvslInitn = value;
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
    public AcquirerReversalInitiation setSctyTrlr(ContentInformationType15 value) {
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
