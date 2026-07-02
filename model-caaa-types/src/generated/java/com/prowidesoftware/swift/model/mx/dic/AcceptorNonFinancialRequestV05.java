
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
 * The AcceptorNonFinancialRequest message is sent by the POI to receive additional information from the Acquirer (or its agent).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorNonFinancialRequestV05", propOrder = {
    "hdr",
    "nonFinReq",
    "sctyTrlr"
})
public class AcceptorNonFinancialRequestV05 {

    @XmlElement(name = "Hdr", required = true)
    protected Header70 hdr;
    @XmlElement(name = "NonFinReq", required = true)
    protected NonFinancialRequestComponent5 nonFinReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType37 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header70 }
     *     
     */
    public Header70 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header70 }
     *     
     */
    public AcceptorNonFinancialRequestV05 setHdr(Header70 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the nonFinReq property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialRequestComponent5 }
     *     
     */
    public NonFinancialRequestComponent5 getNonFinReq() {
        return nonFinReq;
    }

    /**
     * Sets the value of the nonFinReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialRequestComponent5 }
     *     
     */
    public AcceptorNonFinancialRequestV05 setNonFinReq(NonFinancialRequestComponent5 value) {
        this.nonFinReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType37 }
     *     
     */
    public ContentInformationType37 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType37 }
     *     
     */
    public AcceptorNonFinancialRequestV05 setSctyTrlr(ContentInformationType37 value) {
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
