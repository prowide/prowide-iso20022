
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
 * The AcquirerReversalResponse message is sent by an issuer or an agent to answer to an AcquirerReversalInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerReversalResponse", propOrder = {
    "hdr",
    "rvslRspn",
    "sctyTrlr"
})
public class AcquirerReversalResponse {

    @XmlElement(name = "Hdr", required = true)
    protected Header18 hdr;
    @XmlElement(name = "RvslRspn", required = true)
    protected AcquirerReversalResponse1 rvslRspn;
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
    public AcquirerReversalResponse setHdr(Header18 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerReversalResponse1 }
     *     
     */
    public AcquirerReversalResponse1 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerReversalResponse1 }
     *     
     */
    public AcquirerReversalResponse setRvslRspn(AcquirerReversalResponse1 value) {
        this.rvslRspn = value;
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
    public AcquirerReversalResponse setSctyTrlr(ContentInformationType15 value) {
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
