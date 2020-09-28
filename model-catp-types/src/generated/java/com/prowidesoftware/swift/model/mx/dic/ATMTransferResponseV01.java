
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
 * The ATMTransferResponse message is sent by an acquirer or its agent to inform the ATM of the approval or decline of the transfer transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransferResponseV01", propOrder = {
    "hdr",
    "prtctdATMTrfRspn",
    "atmTrfRspn",
    "sctyTrlr"
})
public class ATMTransferResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMTrfRspn")
    protected ContentInformationType10 prtctdATMTrfRspn;
    @XmlElement(name = "ATMTrfRspn")
    protected ATMTransferResponse1 atmTrfRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header31 }
     *     
     */
    public Header31 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header31 }
     *     
     */
    public ATMTransferResponseV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMTrfRspn() {
        return prtctdATMTrfRspn;
    }

    /**
     * Sets the value of the prtctdATMTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransferResponseV01 setPrtctdATMTrfRspn(ContentInformationType10 value) {
        this.prtctdATMTrfRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public ATMTransferResponse1 getATMTrfRspn() {
        return atmTrfRspn;
    }

    /**
     * Sets the value of the atmTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public ATMTransferResponseV01 setATMTrfRspn(ATMTransferResponse1 value) {
        this.atmTrfRspn = value;
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
    public ATMTransferResponseV01 setSctyTrlr(ContentInformationType15 value) {
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
