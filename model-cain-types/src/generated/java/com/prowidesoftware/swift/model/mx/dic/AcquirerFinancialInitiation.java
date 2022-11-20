
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
 * The AcquirerFinancialInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the approval and the clearing of a card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerFinancialInitiation", propOrder = {
    "hdr",
    "finInitn",
    "sctyTrlr"
})
public class AcquirerFinancialInitiation {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "FinInitn", required = true)
    protected AcquirerFinancialInitiation1 finInitn;
    @XmlElement(name = "SctyTrlr", required = true)
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
    public AcquirerFinancialInitiation setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the finInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerFinancialInitiation1 }
     *     
     */
    public AcquirerFinancialInitiation1 getFinInitn() {
        return finInitn;
    }

    /**
     * Sets the value of the finInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerFinancialInitiation1 }
     *     
     */
    public AcquirerFinancialInitiation setFinInitn(AcquirerFinancialInitiation1 value) {
        this.finInitn = value;
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
    public AcquirerFinancialInitiation setSctyTrlr(ContentInformationType15 value) {
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
