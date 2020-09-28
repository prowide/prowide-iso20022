
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
 * The ATMWithdrawalResponse message is sent by an acquirer or its agent to an ATM in response to the ATMWithdrawalRequest to inform the ATM of the approval or decline of the withdrawal transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMWithdrawalResponseV02", propOrder = {
    "hdr",
    "prtctdATMWdrwlRspn",
    "atmWdrwlRspn",
    "sctyTrlr"
})
public class ATMWithdrawalResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMWdrwlRspn")
    protected ContentInformationType10 prtctdATMWdrwlRspn;
    @XmlElement(name = "ATMWdrwlRspn")
    protected ATMWithdrawalResponse2 atmWdrwlRspn;
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
    public ATMWithdrawalResponseV02 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMWdrwlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMWdrwlRspn() {
        return prtctdATMWdrwlRspn;
    }

    /**
     * Sets the value of the prtctdATMWdrwlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMWithdrawalResponseV02 setPrtctdATMWdrwlRspn(ContentInformationType10 value) {
        this.prtctdATMWdrwlRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmWdrwlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalResponse2 }
     *     
     */
    public ATMWithdrawalResponse2 getATMWdrwlRspn() {
        return atmWdrwlRspn;
    }

    /**
     * Sets the value of the atmWdrwlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalResponse2 }
     *     
     */
    public ATMWithdrawalResponseV02 setATMWdrwlRspn(ATMWithdrawalResponse2 value) {
        this.atmWdrwlRspn = value;
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
    public ATMWithdrawalResponseV02 setSctyTrlr(ContentInformationType15 value) {
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
