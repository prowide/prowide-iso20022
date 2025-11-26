
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
 * The ATMReconciliationAdvice message is sent by an ATM to an acquirer or its agent to send all the counters of the ATM. It can be sent by an operator function or as a response of a command sent by an agent or a server.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationAdviceV03", propOrder = {
    "hdr",
    "prtctdATMRcncltnAdvc",
    "atmRcncltnAdvc",
    "sctyTrlr"
})
public class ATMReconciliationAdviceV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMRcncltnAdvc")
    protected ContentInformationType10 prtctdATMRcncltnAdvc;
    @XmlElement(name = "ATMRcncltnAdvc")
    protected ATMReconciliationAdvice3 atmRcncltnAdvc;
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
    public ATMReconciliationAdviceV03 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMRcncltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMRcncltnAdvc() {
        return prtctdATMRcncltnAdvc;
    }

    /**
     * Sets the value of the prtctdATMRcncltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMReconciliationAdviceV03 setPrtctdATMRcncltnAdvc(ContentInformationType10 value) {
        this.prtctdATMRcncltnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the atmRcncltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationAdvice3 }
     *     
     */
    public ATMReconciliationAdvice3 getATMRcncltnAdvc() {
        return atmRcncltnAdvc;
    }

    /**
     * Sets the value of the atmRcncltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationAdvice3 }
     *     
     */
    public ATMReconciliationAdviceV03 setATMRcncltnAdvc(ATMReconciliationAdvice3 value) {
        this.atmRcncltnAdvc = value;
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
    public ATMReconciliationAdviceV03 setSctyTrlr(ContentInformationType15 value) {
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
