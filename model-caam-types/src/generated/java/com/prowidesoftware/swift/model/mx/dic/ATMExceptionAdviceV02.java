
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
 * The ATMExceptionAdvice message is sent by an ATM to an acquirer or its agent to inform of that an exception occurred outside a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAdviceV02", propOrder = {
    "hdr",
    "prtctdATMXcptnAdvc",
    "atmXcptnAdvc",
    "sctyTrlr"
})
public class ATMExceptionAdviceV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMXcptnAdvc")
    protected ContentInformationType10 prtctdATMXcptnAdvc;
    @XmlElement(name = "ATMXcptnAdvc")
    protected ATMExceptionAdvice2 atmXcptnAdvc;
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
    public ATMExceptionAdviceV02 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMXcptnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMXcptnAdvc() {
        return prtctdATMXcptnAdvc;
    }

    /**
     * Sets the value of the prtctdATMXcptnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMExceptionAdviceV02 setPrtctdATMXcptnAdvc(ContentInformationType10 value) {
        this.prtctdATMXcptnAdvc = value;
        return this;
    }

    /**
     * Gets the value of the atmXcptnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMExceptionAdvice2 }
     *     
     */
    public ATMExceptionAdvice2 getATMXcptnAdvc() {
        return atmXcptnAdvc;
    }

    /**
     * Sets the value of the atmXcptnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMExceptionAdvice2 }
     *     
     */
    public ATMExceptionAdviceV02 setATMXcptnAdvc(ATMExceptionAdvice2 value) {
        this.atmXcptnAdvc = value;
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
    public ATMExceptionAdviceV02 setSctyTrlr(ContentInformationType15 value) {
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
