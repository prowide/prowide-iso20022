
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
 * The HostToATMAcknowledgement message is sent by an ATM to a host to acknowledge the receipt of a HostToATMRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostToATMAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdHstToATMAck",
    "hstToATMAck",
    "sctyTrlr"
})
public class HostToATMAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdHstToATMAck")
    protected ContentInformationType10 prtctdHstToATMAck;
    @XmlElement(name = "HstToATMAck")
    protected HostToATMAcknowledgement1 hstToATMAck;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header20 }
     *     
     */
    public Header20 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header20 }
     *     
     */
    public HostToATMAcknowledgementV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdHstToATMAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdHstToATMAck() {
        return prtctdHstToATMAck;
    }

    /**
     * Sets the value of the prtctdHstToATMAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public HostToATMAcknowledgementV01 setPrtctdHstToATMAck(ContentInformationType10 value) {
        this.prtctdHstToATMAck = value;
        return this;
    }

    /**
     * Gets the value of the hstToATMAck property.
     * 
     * @return
     *     possible object is
     *     {@link HostToATMAcknowledgement1 }
     *     
     */
    public HostToATMAcknowledgement1 getHstToATMAck() {
        return hstToATMAck;
    }

    /**
     * Sets the value of the hstToATMAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToATMAcknowledgement1 }
     *     
     */
    public HostToATMAcknowledgementV01 setHstToATMAck(HostToATMAcknowledgement1 value) {
        this.hstToATMAck = value;
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
    public HostToATMAcknowledgementV01 setSctyTrlr(ContentInformationType15 value) {
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
