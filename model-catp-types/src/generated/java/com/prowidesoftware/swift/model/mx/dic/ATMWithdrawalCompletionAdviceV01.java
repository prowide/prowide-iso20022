
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
 * The ATMWithdrawalCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a withdrawal transaction at an ATM.
 * If the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMWithdrawalCompletionAdviceV01", propOrder = {
    "hdr",
    "prtctdATMWdrwlCmpltnAdvc",
    "atmWdrwlCmpltnAdvc",
    "sctyTrlr"
})
public class ATMWithdrawalCompletionAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header21 hdr;
    @XmlElement(name = "PrtctdATMWdrwlCmpltnAdvc")
    protected ContentInformationType10 prtctdATMWdrwlCmpltnAdvc;
    @XmlElement(name = "ATMWdrwlCmpltnAdvc")
    protected ATMWithdrawalCompletionAdvice1 atmWdrwlCmpltnAdvc;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header21 }
     *     
     */
    public Header21 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header21 }
     *     
     */
    public ATMWithdrawalCompletionAdviceV01 setHdr(Header21 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMWdrwlCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMWdrwlCmpltnAdvc() {
        return prtctdATMWdrwlCmpltnAdvc;
    }

    /**
     * Sets the value of the prtctdATMWdrwlCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMWithdrawalCompletionAdviceV01 setPrtctdATMWdrwlCmpltnAdvc(ContentInformationType10 value) {
        this.prtctdATMWdrwlCmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the atmWdrwlCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalCompletionAdvice1 }
     *     
     */
    public ATMWithdrawalCompletionAdvice1 getATMWdrwlCmpltnAdvc() {
        return atmWdrwlCmpltnAdvc;
    }

    /**
     * Sets the value of the atmWdrwlCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalCompletionAdvice1 }
     *     
     */
    public ATMWithdrawalCompletionAdviceV01 setATMWdrwlCmpltnAdvc(ATMWithdrawalCompletionAdvice1 value) {
        this.atmWdrwlCmpltnAdvc = value;
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
    public ATMWithdrawalCompletionAdviceV01 setSctyTrlr(ContentInformationType15 value) {
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
