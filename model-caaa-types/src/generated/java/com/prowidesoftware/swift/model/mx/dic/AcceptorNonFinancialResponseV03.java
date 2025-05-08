
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
 * The AcceptorNonFinancialResponse message is sent by the Acquirer (or its Agent) to the POI to provide addintional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorNonFinancialResponseV03", propOrder = {
    "hdr",
    "nonFinRspn",
    "sctyTrlr"
})
public class AcceptorNonFinancialResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header70 hdr;
    @XmlElement(name = "NonFinRspn", required = true)
    protected NonFinancialResponseComponent3 nonFinRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType36 sctyTrlr;

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
    public AcceptorNonFinancialResponseV03 setHdr(Header70 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the nonFinRspn property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialResponseComponent3 }
     *     
     */
    public NonFinancialResponseComponent3 getNonFinRspn() {
        return nonFinRspn;
    }

    /**
     * Sets the value of the nonFinRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialResponseComponent3 }
     *     
     */
    public AcceptorNonFinancialResponseV03 setNonFinRspn(NonFinancialResponseComponent3 value) {
        this.nonFinRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType36 }
     *     
     */
    public ContentInformationType36 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType36 }
     *     
     */
    public AcceptorNonFinancialResponseV03 setSctyTrlr(ContentInformationType36 value) {
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
