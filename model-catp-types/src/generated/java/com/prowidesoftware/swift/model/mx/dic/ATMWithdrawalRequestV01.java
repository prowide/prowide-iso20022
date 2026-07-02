
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
 * The ATMWithdrawalRequest message is sent by an ATM to an acquirer or its agent to request the approval of a withdrawal transaction at an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMWithdrawalRequestV01", propOrder = {
    "hdr",
    "prtctdATMWdrwlReq",
    "atmWdrwlReq",
    "sctyTrlr"
})
public class ATMWithdrawalRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMWdrwlReq")
    protected ContentInformationType10 prtctdATMWdrwlReq;
    @XmlElement(name = "ATMWdrwlReq")
    protected ATMWithdrawalRequest1 atmWdrwlReq;
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
    public ATMWithdrawalRequestV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMWdrwlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMWdrwlReq() {
        return prtctdATMWdrwlReq;
    }

    /**
     * Sets the value of the prtctdATMWdrwlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMWithdrawalRequestV01 setPrtctdATMWdrwlReq(ContentInformationType10 value) {
        this.prtctdATMWdrwlReq = value;
        return this;
    }

    /**
     * Gets the value of the atmWdrwlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalRequest1 }
     *     
     */
    public ATMWithdrawalRequest1 getATMWdrwlReq() {
        return atmWdrwlReq;
    }

    /**
     * Sets the value of the atmWdrwlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalRequest1 }
     *     
     */
    public ATMWithdrawalRequestV01 setATMWdrwlReq(ATMWithdrawalRequest1 value) {
        this.atmWdrwlReq = value;
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
    public ATMWithdrawalRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
