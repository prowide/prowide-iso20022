
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
 * The ATMDepositCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a deposit transaction at an ATM.
 * If the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice.
 * This message can be used each time a bundle is put in the ATM safe and/or at the end of a multi bundle deposit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositCompletionAdviceV01", propOrder = {
    "hdr",
    "prtctdATMDpstCmpltnAdvc",
    "atmDpstCmpltnAdvc",
    "sctyTrlr"
})
public class ATMDepositCompletionAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMDpstCmpltnAdvc")
    protected ContentInformationType10 prtctdATMDpstCmpltnAdvc;
    @XmlElement(name = "ATMDpstCmpltnAdvc")
    protected ATMDepositCompletionAdvice1 atmDpstCmpltnAdvc;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header32 }
     *     
     */
    public Header32 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header32 }
     *     
     */
    public ATMDepositCompletionAdviceV01 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDpstCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDpstCmpltnAdvc() {
        return prtctdATMDpstCmpltnAdvc;
    }

    /**
     * Sets the value of the prtctdATMDpstCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDepositCompletionAdviceV01 setPrtctdATMDpstCmpltnAdvc(ContentInformationType10 value) {
        this.prtctdATMDpstCmpltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the atmDpstCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDepositCompletionAdvice1 }
     *     
     */
    public ATMDepositCompletionAdvice1 getATMDpstCmpltnAdvc() {
        return atmDpstCmpltnAdvc;
    }

    /**
     * Sets the value of the atmDpstCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDepositCompletionAdvice1 }
     *     
     */
    public ATMDepositCompletionAdviceV01 setATMDpstCmpltnAdvc(ATMDepositCompletionAdvice1 value) {
        this.atmDpstCmpltnAdvc = value;
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
    public ATMDepositCompletionAdviceV01 setSctyTrlr(ContentInformationType15 value) {
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
