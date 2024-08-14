
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
 * The ATMCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a transaction performed on the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCompletionAdviceV01", propOrder = {
    "hdr",
    "prtctdATMCmpltnAdvc",
    "atmCmpltnAdvc",
    "sctyTrlr"
})
public class ATMCompletionAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header21 hdr;
    @XmlElement(name = "PrtctdATMCmpltnAdvc")
    protected ContentInformationType10 prtctdATMCmpltnAdvc;
    @XmlElement(name = "ATMCmpltnAdvc")
    protected ATMCompletionAdvice1 atmCmpltnAdvc;
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
    public ATMCompletionAdviceV01 setHdr(Header21 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMCmpltnAdvc() {
        return prtctdATMCmpltnAdvc;
    }

    /**
     * Sets the value of the prtctdATMCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMCompletionAdviceV01 setPrtctdATMCmpltnAdvc(ContentInformationType10 value) {
        this.prtctdATMCmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the atmCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCompletionAdvice1 }
     *     
     */
    public ATMCompletionAdvice1 getATMCmpltnAdvc() {
        return atmCmpltnAdvc;
    }

    /**
     * Sets the value of the atmCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCompletionAdvice1 }
     *     
     */
    public ATMCompletionAdviceV01 setATMCmpltnAdvc(ATMCompletionAdvice1 value) {
        this.atmCmpltnAdvc = value;
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
    public ATMCompletionAdviceV01 setSctyTrlr(ContentInformationType15 value) {
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
