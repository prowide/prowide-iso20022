
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
 * The AcquirerFinancialResponse message is sent by an issuer or an agent to answer to an AcquirerFinancialInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerFinancialResponse", propOrder = {
    "hdr",
    "finRspn",
    "sctyTrlr"
})
public class AcquirerFinancialResponse {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "FinRspn", required = true)
    protected AcquirerFinancialResponse1 finRspn;
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
    public AcquirerFinancialResponse setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the finRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerFinancialResponse1 }
     *     
     */
    public AcquirerFinancialResponse1 getFinRspn() {
        return finRspn;
    }

    /**
     * Sets the value of the finRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerFinancialResponse1 }
     *     
     */
    public AcquirerFinancialResponse setFinRspn(AcquirerFinancialResponse1 value) {
        this.finRspn = value;
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
    public AcquirerFinancialResponse setSctyTrlr(ContentInformationType15 value) {
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
